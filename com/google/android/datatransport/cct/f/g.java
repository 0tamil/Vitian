package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.m;
import java.util.List;
/* loaded from: classes.dex */
final class g extends m {
    private final long a;
    private final long b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f963d;

    /* renamed from: e  reason: collision with root package name */
    private final String f964e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f965f;

    /* renamed from: g  reason: collision with root package name */
    private final p f966g;

    /* loaded from: classes.dex */
    static final class b extends m.a {
        private Long a;
        private Long b;
        private k c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f967d;

        /* renamed from: e  reason: collision with root package name */
        private String f968e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f969f;

        /* renamed from: g  reason: collision with root package name */
        private p f970g;

        @Override // com.google.android.datatransport.cct.f.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = str + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.f967d, this.f968e, this.f969f, this.f970g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a b(k kVar) {
            this.c = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a c(List<l> list) {
            this.f969f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a d(Integer num) {
            this.f967d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a e(String str) {
            this.f968e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a f(p pVar) {
            this.f970g = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a g(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a h(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private g(long j2, long j3, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.a = j2;
        this.b = j3;
        this.c = kVar;
        this.f963d = num;
        this.f964e = str;
        this.f965f = list;
        this.f966g = pVar;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public k b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public List<l> c() {
        return this.f965f;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public Integer d() {
        return this.f963d;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public String e() {
        return this.f964e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.g() && this.b == mVar.h() && ((kVar = this.c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f963d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f964e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f965f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f966g;
            p f2 = mVar.f();
            if (pVar == null) {
                if (f2 == null) {
                    return true;
                }
            } else if (pVar.equals(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public p f() {
        return this.f966g;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long g() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        k kVar = this.c;
        int i3 = 0;
        int hashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f963d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f964e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f965f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f966g;
        if (pVar != null) {
            i3 = pVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.f963d + ", logSourceName=" + this.f964e + ", logEvents=" + this.f965f + ", qosTier=" + this.f966g + "}";
    }
}
