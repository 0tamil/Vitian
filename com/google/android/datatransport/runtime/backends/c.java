package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import f.b.a.a.i.c0.a;
import java.util.Objects;
/* loaded from: classes.dex */
final class c extends h {
    private final Context a;
    private final a b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final String f995d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f995d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public Context b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public String c() {
        return this.f995d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public a d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.c.equals(hVar.d()) && this.f995d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f995d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.f995d + "}";
    }
}
