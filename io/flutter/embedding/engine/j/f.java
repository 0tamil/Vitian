package io.flutter.embedding.engine.j;

import android.os.Build;
import h.a.d.a.g;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.f.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    public final k a;
    private b b;
    public final k.c c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            if (f.this.b != null) {
                String str = jVar.a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.b();
                try {
                    dVar.b(f.this.b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e2) {
                    dVar.a("error", e2.getMessage(), null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public f(d dVar) {
        a aVar = new a();
        this.c = aVar;
        k kVar = new k(dVar, "flutter/localization", g.a);
        this.a = kVar;
        kVar.e(aVar);
    }

    public void b(List<Locale> list) {
        h.a.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            h.a.b.e("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.b = bVar;
    }
}
