package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.e;
import com.google.firebase.crashlytics.i.l.c0;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends c0.a {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1602d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1603e;

    /* renamed from: f  reason: collision with root package name */
    private final e f1604f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, String str2, String str3, String str4, int i2, e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f1602d = str4;
        this.f1603e = i2;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f1604f = eVar;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public String a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public int c() {
        return this.f1603e;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public e d() {
        return this.f1604f;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public String e() {
        return this.f1602d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.f()) && this.c.equals(aVar.g()) && this.f1602d.equals(aVar.e()) && this.f1603e == aVar.c() && this.f1604f.equals(aVar.d());
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.a
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f1602d.hashCode()) * 1000003) ^ this.f1603e) * 1000003) ^ this.f1604f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.f1602d + ", deliveryMechanism=" + this.f1603e + ", developmentPlatformProvider=" + this.f1604f + "}";
    }
}
