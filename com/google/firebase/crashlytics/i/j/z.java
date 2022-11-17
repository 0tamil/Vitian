package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.l.a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class z implements d0 {
    private final File a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream c = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (c == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (c != null) {
                    c.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = c.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (c != null) {
                c.close();
            }
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.i.j.d0
    public String a() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.j.d0
    public a0.d.b b() {
        byte[] d2 = d();
        if (d2 == null) {
            return null;
        }
        a0.d.b.a a = a0.d.b.a();
        a.b(d2);
        a.c(this.b);
        return a.a();
    }

    @Override // com.google.firebase.crashlytics.i.j.d0
    public InputStream c() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
