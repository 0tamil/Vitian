package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class j extends a0.e.c {
    private final int a;
    private final String b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final long f1560d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1561e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1562f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1563g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1564h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1565i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.c.a {
        private Integer a;
        private String b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Long f1566d;

        /* renamed from: e  reason: collision with root package name */
        private Long f1567e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f1568f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f1569g;

        /* renamed from: h  reason: collision with root package name */
        private String f1570h;

        /* renamed from: i  reason: collision with root package name */
        private String f1571i;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.f1566d == null) {
                str = str + " ram";
            }
            if (this.f1567e == null) {
                str = str + " diskSpace";
            }
            if (this.f1568f == null) {
                str = str + " simulator";
            }
            if (this.f1569g == null) {
                str = str + " state";
            }
            if (this.f1570h == null) {
                str = str + " manufacturer";
            }
            if (this.f1571i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new j(this.a.intValue(), this.b, this.c.intValue(), this.f1566d.longValue(), this.f1567e.longValue(), this.f1568f.booleanValue(), this.f1569g.intValue(), this.f1570h, this.f1571i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a c(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a d(long j2) {
            this.f1567e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f1570h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f1571i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a h(long j2) {
            this.f1566d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a i(boolean z) {
            this.f1568f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.c.a
        public a0.e.c.a j(int i2) {
            this.f1569g = Integer.valueOf(i2);
            return this;
        }
    }

    private j(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f1560d = j2;
        this.f1561e = j3;
        this.f1562f = z;
        this.f1563g = i4;
        this.f1564h = str2;
        this.f1565i = str3;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public int b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public int c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public long d() {
        return this.f1561e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public String e() {
        return this.f1564h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        return this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.f1560d == cVar.h() && this.f1561e == cVar.d() && this.f1562f == cVar.j() && this.f1563g == cVar.i() && this.f1564h.equals(cVar.e()) && this.f1565i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public String g() {
        return this.f1565i;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public long h() {
        return this.f1560d;
    }

    public int hashCode() {
        long j2 = this.f1560d;
        long j3 = this.f1561e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f1562f ? 1231 : 1237)) * 1000003) ^ this.f1563g) * 1000003) ^ this.f1564h.hashCode()) * 1000003) ^ this.f1565i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public int i() {
        return this.f1563g;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.c
    public boolean j() {
        return this.f1562f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.f1560d + ", diskSpace=" + this.f1561e + ", simulator=" + this.f1562f + ", state=" + this.f1563g + ", manufacturer=" + this.f1564h + ", modelClass=" + this.f1565i + "}";
    }
}
