package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.l.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest b;
        PackageInfo d2 = c.a(context).d(str, 64);
        Signature[] signatureArr = d2.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = b("SHA1")) == null) {
            return null;
        }
        return b.digest(d2.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
