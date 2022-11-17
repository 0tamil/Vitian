package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r1;
import com.google.android.gms.common.internal.s1;
import f.b.a.b.c.a;
import f.b.a.b.c.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes.dex */
abstract class t extends r1 {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public t(byte[] bArr) {
        p.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.s1
    public final int c() {
        return this.a;
    }

    abstract byte[] d();

    public final boolean equals(Object obj) {
        a w;
        if (obj != null && (obj instanceof s1)) {
            try {
                s1 s1Var = (s1) obj;
                if (s1Var.c() == this.a && (w = s1Var.w()) != null) {
                    return Arrays.equals(d(), (byte[]) b.b(w));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.s1
    public final a w() {
        return b.d(d());
    }
}
