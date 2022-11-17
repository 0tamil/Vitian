package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class c extends a0.a {
    private final int a;
    private final String b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1526d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1527e;

    /* renamed from: f  reason: collision with root package name */
    private final long f1528f;

    /* renamed from: g  reason: collision with root package name */
    private final long f1529g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1530h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.a.AbstractC0034a {
        private Integer a;
        private String b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1531d;

        /* renamed from: e  reason: collision with root package name */
        private Long f1532e;

        /* renamed from: f  reason: collision with root package name */
        private Long f1533f;

        /* renamed from: g  reason: collision with root package name */
        private Long f1534g;

        /* renamed from: h  reason: collision with root package name */
        private String f1535h;

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.f1531d == null) {
                str = str + " importance";
            }
            if (this.f1532e == null) {
                str = str + " pss";
            }
            if (this.f1533f == null) {
                str = str + " rss";
            }
            if (this.f1534g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.a.intValue(), this.b, this.c.intValue(), this.f1531d.intValue(), this.f1532e.longValue(), this.f1533f.longValue(), this.f1534g.longValue(), this.f1535h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a b(int i2) {
            this.f1531d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a c(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a e(long j2) {
            this.f1532e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a f(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a g(long j2) {
            this.f1533f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a h(long j2) {
            this.f1534g = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.a.AbstractC0034a
        public a0.a.AbstractC0034a i(String str) {
            this.f1535h = str;
            return this;
        }
    }

    private c(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f1526d = i4;
        this.f1527e = j2;
        this.f1528f = j3;
        this.f1529g = j4;
        this.f1530h = str2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public int b() {
        return this.f1526d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public long e() {
        return this.f1527e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.a == aVar.c() && this.b.equals(aVar.d()) && this.c == aVar.f() && this.f1526d == aVar.b() && this.f1527e == aVar.e() && this.f1528f == aVar.g() && this.f1529g == aVar.h()) {
            String str = this.f1530h;
            String i2 = aVar.i();
            if (str == null) {
                if (i2 == null) {
                    return true;
                }
            } else if (str.equals(i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public int f() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public long g() {
        return this.f1528f;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public long h() {
        return this.f1529g;
    }

    public int hashCode() {
        long j2 = this.f1527e;
        long j3 = this.f1528f;
        long j4 = this.f1529g;
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.f1526d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.f1530h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.a
    public String i() {
        return this.f1530h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.f1526d + ", pss=" + this.f1527e + ", rss=" + this.f1528f + ", timestamp=" + this.f1529g + ", traceFile=" + this.f1530h + "}";
    }
}
