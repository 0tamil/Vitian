package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.l;
import java.util.Arrays;
/* loaded from: classes.dex */
final class f extends l {
    private final long a;
    private final Integer b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f955d;

    /* renamed from: e  reason: collision with root package name */
    private final String f956e;

    /* renamed from: f  reason: collision with root package name */
    private final long f957f;

    /* renamed from: g  reason: collision with root package name */
    private final o f958g;

    /* loaded from: classes.dex */
    static final class b extends l.a {
        private Long a;
        private Integer b;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f959d;

        /* renamed from: e  reason: collision with root package name */
        private String f960e;

        /* renamed from: f  reason: collision with root package name */
        private Long f961f;

        /* renamed from: g  reason: collision with root package name */
        private o f962g;

        @Override // com.google.android.datatransport.cct.f.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = str + " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f961f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.f959d, this.f960e, this.f961f.longValue(), this.f962g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a c(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a d(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a e(o oVar) {
            this.f962g = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a f(byte[] bArr) {
            this.f959d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a g(String str) {
            this.f960e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a h(long j2) {
            this.f961f = Long.valueOf(j2);
            return this;
        }
    }

    private f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.f955d = bArr;
        this.f956e = str;
        this.f957f = j4;
        this.f958g = oVar;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public o e() {
        return this.f958g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.c() && ((num = this.b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.c == lVar.d()) {
            if (Arrays.equals(this.f955d, lVar instanceof f ? ((f) lVar).f955d : lVar.f()) && ((str = this.f956e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f957f == lVar.h()) {
                o oVar = this.f958g;
                o e2 = lVar.e();
                if (oVar == null) {
                    if (e2 == null) {
                        return true;
                    }
                } else if (oVar.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public byte[] f() {
        return this.f955d;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public String g() {
        return this.f956e;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long h() {
        return this.f957f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i3 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f955d)) * 1000003;
        String str = this.f956e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f957f;
        int i4 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f958g;
        if (oVar != null) {
            i3 = oVar.hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.f955d) + ", sourceExtensionJsonProto3=" + this.f956e + ", timezoneOffsetSeconds=" + this.f957f + ", networkConnectionInfo=" + this.f958g + "}";
    }
}
