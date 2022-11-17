package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.h;
import com.google.firebase.installations.l;
import com.google.firebase.p.k;
import com.google.firebase.q.b;
import com.google.firebase.s.i;
import f.b.a.b.b.d;
import f.b.a.b.g.a;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o0 {
    private final h a;
    private final r0 b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private final b<i> f1817d;

    /* renamed from: e  reason: collision with root package name */
    private final b<k> f1818e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.h f1819f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(h hVar, r0 r0Var, b<i> bVar, b<k> bVar2, com.google.firebase.installations.h hVar2) {
        this(hVar, r0Var, new d(hVar.j()), bVar, bVar2, hVar2);
    }

    o0(h hVar, r0 r0Var, d dVar, b<i> bVar, b<k> bVar2, com.google.firebase.installations.h hVar2) {
        this.a = hVar;
        this.b = r0Var;
        this.c = dVar;
        this.f1817d = bVar;
        this.f1818e = bVar2;
        this.f1819f = hVar2;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private f.b.a.b.g.i<String> c(f.b.a.b.g.i<Bundle> iVar) {
        return iVar.g(x.f1843e, new a() { // from class: com.google.firebase.messaging.v
            @Override // f.b.a.b.g.a
            public final Object a(f.b.a.b.g.i iVar2) {
                return o0.this.i(iVar2);
            }
        });
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.a.n().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String i(f.b.a.b.g.i iVar) {
        return f((Bundle) iVar.k(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        k.a b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.a.o().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b2 = ((l) f.b.a.b.g.l.a(this.f1819f.b(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("appid", (String) f.b.a.b.g.l.a(this.f1819f.a()));
        bundle.putString("cliv", "fcm-23.0.4");
        k a = this.f1818e.a();
        i a2 = this.f1817d.a();
        if (a != null && a2 != null && (b = a.b("fire-iid")) != k.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.a()));
            bundle.putString("Firebase-Client", a2.a());
        }
    }

    private f.b.a.b.g.i<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.c.a(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return f.b.a.b.g.l.d(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<?> b() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(k(r0.c(this.a), "*", bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<String> e() {
        return c(k(r0.c(this.a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(k(str, "/topics/" + str2, bundle));
    }
}
