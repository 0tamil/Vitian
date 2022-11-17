package io.flutter.embedding.engine.j;

import h.a.d.a.f;
import io.flutter.embedding.engine.f.d;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class l {
    public final h.a.d.a.b<Object> a;

    /* loaded from: classes.dex */
    public static class a {
        private final h.a.d.a.b<Object> a;
        private Map<String, Object> b = new HashMap();

        a(h.a.d.a.b<Object> bVar) {
            this.a = bVar;
        }

        public void a() {
            h.a.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.b.get("platformBrightness"));
            this.a.c(this.b);
        }

        public a b(boolean z) {
            this.b.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        public a c(b bVar) {
            this.b.put("platformBrightness", bVar.f3101e);
            return this;
        }

        public a d(float f2) {
            this.b.put("textScaleFactor", Float.valueOf(f2));
            return this;
        }

        public a e(boolean z) {
            this.b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3101e;

        b(String str) {
            this.f3101e = str;
        }
    }

    public l(d dVar) {
        this.a = new h.a.d.a.b<>(dVar, "flutter/settings", f.a);
    }

    public a a() {
        return new a(this.a);
    }
}
