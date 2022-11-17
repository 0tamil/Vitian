package com.google.firebase.installations.q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.h;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static final String[] c = {"*", "FCM", "GCM", ""};
    private final SharedPreferences a;
    private final String b;

    public b(h hVar) {
        this.a = hVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(hVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(h hVar) {
        String f2 = hVar.o().f();
        if (f2 != null) {
            return f2;
        }
        String c2 = hVar.o().c();
        if (!c2.startsWith("1:") && !c2.startsWith("2:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.a) {
            String string = this.a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e2 = e(string);
            if (e2 == null) {
                return null;
            }
            return c(e2);
        }
    }

    public String f() {
        synchronized (this.a) {
            String g2 = g();
            if (g2 != null) {
                return g2;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.a) {
            for (String str : c) {
                String string = this.a.getString(a(this.b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
