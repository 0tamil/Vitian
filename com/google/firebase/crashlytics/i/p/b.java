package com.google.firebase.crashlytics.i.p;

import com.google.firebase.crashlytics.i.j.v;
import com.google.firebase.crashlytics.i.p.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
class b implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(v vVar) {
        return new d(vVar.a() + 3600000, new d.b(8, 4), new d.a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.i.p.h
    public d a(v vVar, JSONObject jSONObject) {
        return b(vVar);
    }
}
