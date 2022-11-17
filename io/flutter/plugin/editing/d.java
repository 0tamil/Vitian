package io.flutter.plugin.editing;

import h.a.b;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    private CharSequence a;
    private CharSequence b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3189d;

    /* renamed from: e  reason: collision with root package name */
    private int f3190e;

    /* renamed from: f  reason: collision with root package name */
    private int f3191f;

    /* renamed from: g  reason: collision with root package name */
    private int f3192g;

    /* renamed from: h  reason: collision with root package name */
    private int f3193h;

    public d(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        this.f3190e = i2;
        this.f3191f = i3;
        this.f3192g = i4;
        this.f3193h = i5;
        a(charSequence, "", -1, -1);
    }

    public d(CharSequence charSequence, int i2, int i3, CharSequence charSequence2, int i4, int i5, int i6, int i7) {
        this.f3190e = i4;
        this.f3191f = i5;
        this.f3192g = i6;
        this.f3193h = i7;
        a(charSequence, charSequence2.toString(), i2, i3);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i2, int i3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i2;
        this.f3189d = i3;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.a.toString());
            jSONObject.put("deltaText", this.b.toString());
            jSONObject.put("deltaStart", this.c);
            jSONObject.put("deltaEnd", this.f3189d);
            jSONObject.put("selectionBase", this.f3190e);
            jSONObject.put("selectionExtent", this.f3191f);
            jSONObject.put("composingBase", this.f3192g);
            jSONObject.put("composingExtent", this.f3193h);
        } catch (JSONException e2) {
            b.b("TextEditingDelta", "unable to create JSONObject: " + e2);
        }
        return jSONObject;
    }
}
