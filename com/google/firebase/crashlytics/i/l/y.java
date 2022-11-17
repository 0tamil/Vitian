package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.c0;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends c0.b {
    private final int a;
    private final String b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final long f1605d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1606e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1607f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1608g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1609h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1610i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        Objects.requireNonNull(str, "Null model");
        this.b = str;
        this.c = i3;
        this.f1605d = j2;
        this.f1606e = j3;
        this.f1607f = z;
        this.f1608g = i4;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f1609h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f1610i = str3;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public int a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public int b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public long d() {
        return this.f1606e;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public boolean e() {
        return this.f1607f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        return this.a == bVar.a() && this.b.equals(bVar.g()) && this.c == bVar.b() && this.f1605d == bVar.j() && this.f1606e == bVar.d() && this.f1607f == bVar.e() && this.f1608g == bVar.i() && this.f1609h.equals(bVar.f()) && this.f1610i.equals(bVar.h());
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public String f() {
        return this.f1609h;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public String g() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public String h() {
        return this.f1610i;
    }

    public int hashCode() {
        long j2 = this.f1605d;
        long j3 = this.f1606e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f1607f ? 1231 : 1237)) * 1000003) ^ this.f1608g) * 1000003) ^ this.f1609h.hashCode()) * 1000003) ^ this.f1610i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public int i() {
        return this.f1608g;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.b
    public long j() {
        return this.f1605d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.a + ", model=" + this.b + ", availableProcessors=" + this.c + ", totalRam=" + this.f1605d + ", diskSpace=" + this.f1606e + ", isEmulator=" + this.f1607f + ", state=" + this.f1608g + ", manufacturer=" + this.f1609h + ", modelClass=" + this.f1610i + "}";
    }
}
