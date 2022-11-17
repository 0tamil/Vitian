package com.google.firebase.crashlytics.i.p;
/* loaded from: classes.dex */
public class d {
    public final b a;
    public final a b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final double f1630d;

    /* renamed from: e  reason: collision with root package name */
    public final double f1631e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1632f;

    /* loaded from: classes.dex */
    public static class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public d(long j2, b bVar, a aVar, int i2, int i3, double d2, double d3, int i4) {
        this.c = j2;
        this.a = bVar;
        this.b = aVar;
        this.f1630d = d2;
        this.f1631e = d3;
        this.f1632f = i4;
    }

    public boolean a(long j2) {
        return this.c < j2;
    }
}
