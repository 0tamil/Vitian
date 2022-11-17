package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.l.a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class l implements d0 {
    private final byte[] a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
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
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
}
