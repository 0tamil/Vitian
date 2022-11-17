package com.google.firebase.crashlytics.i.j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class e0 {
    private static void a(InputStream inputStream, File file) {
        Throwable th;
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            n.f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        n.f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file, List<d0> list) {
        for (d0 d0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = d0Var.c();
                if (inputStream != null) {
                    a(inputStream, new File(file, d0Var.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                n.f(null);
                throw th;
            }
            n.f(inputStream);
        }
    }
}
