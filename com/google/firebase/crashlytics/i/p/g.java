package com.google.firebase.crashlytics.i.p;

import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.v;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private final v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(v vVar) {
        this.a = vVar;
    }

    private static h a(int i2) {
        if (i2 == 3) {
            return new l();
        }
        f f2 = f.f();
        f2.d("Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
