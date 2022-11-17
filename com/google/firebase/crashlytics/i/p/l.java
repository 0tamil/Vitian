package com.google.firebase.crashlytics.i.p;

import com.google.firebase.crashlytics.i.j.v;
import com.google.firebase.crashlytics.i.p.d;
import org.json.JSONObject;
/* loaded from: classes.dex */
class l implements h {
    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(v vVar, long j2, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : vVar.a() + (j2 * 1000);
    }

    @Override // com.google.firebase.crashlytics.i.p.h
    public d a(v vVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new d(d(vVar, optInt2, jSONObject), c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
