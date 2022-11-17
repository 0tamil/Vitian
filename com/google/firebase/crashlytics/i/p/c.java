package com.google.firebase.crashlytics.i.p;

import android.text.TextUtils;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.q;
import com.google.firebase.crashlytics.i.m.a;
import com.google.firebase.crashlytics.i.m.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements k {
    private final String a;
    private final b b;
    private final f c;

    public c(String str, b bVar) {
        this(str, bVar, f.f());
    }

    c(String str, b bVar, f fVar) {
        if (str != null) {
            this.c = fVar;
            this.b = bVar;
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    private a b(a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", q.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f1643d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f1644e.a());
        return aVar;
    }

    private void c(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            f fVar = this.c;
            fVar.l("Failed to parse settings JSON from " + this.a, e2);
            f fVar2 = this.c;
            fVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f1647h);
        hashMap.put("display_version", jVar.f1646g);
        hashMap.put("source", Integer.toString(jVar.f1648i));
        String str = jVar.f1645f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.i.p.k
    public JSONObject a(j jVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f2 = f(jVar);
                a d2 = d(f2);
                b(d2, jVar);
                f fVar = this.c;
                fVar.b("Requesting settings from " + this.a);
                f fVar2 = this.c;
                fVar2.i("Settings query params were: " + f2);
                return g(d2.c());
            } catch (IOException e2) {
                this.c.e("Settings request failed.", e2);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    protected a d(Map<String, String> map) {
        a a = this.b.a(this.a, map);
        a.d("User-Agent", "Crashlytics Android SDK/" + q.l());
        a.d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a;
    }

    JSONObject g(com.google.firebase.crashlytics.i.m.c cVar) {
        int b = cVar.b();
        f fVar = this.c;
        fVar.i("Settings response code was: " + b);
        if (h(b)) {
            return e(cVar.a());
        }
        f fVar2 = this.c;
        fVar2.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    boolean h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }
}
