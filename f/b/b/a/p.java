package f.b.b.a;

import f.b.b.a.a0.o;
import f.b.b.a.y.c0;
import f.b.b.a.y.i0;
import f.b.b.a.y.z;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class p<P> {
    private final ConcurrentMap<c, List<b<P>>> a = new ConcurrentHashMap();
    private b<P> b;
    private final Class<P> c;

    /* loaded from: classes.dex */
    public static final class b<P> {
        private final P a;
        private final byte[] b;
        private final z c;

        /* renamed from: d  reason: collision with root package name */
        private final i0 f2457d;

        b(P p, byte[] bArr, z zVar, i0 i0Var, int i2) {
            this.a = p;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = zVar;
            this.f2457d = i0Var;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public i0 b() {
            return this.f2457d;
        }

        public P c() {
            return this.a;
        }

        public z d() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f2458e;

        private c(byte[] bArr) {
            this.f2458e = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i2;
            int i3;
            byte[] bArr = this.f2458e;
            int length = bArr.length;
            byte[] bArr2 = cVar.f2458e;
            if (length != bArr2.length) {
                i2 = bArr.length;
                i3 = bArr2.length;
            } else {
                int i4 = 0;
                while (true) {
                    byte[] bArr3 = this.f2458e;
                    if (i4 >= bArr3.length) {
                        return 0;
                    }
                    char c = bArr3[i4];
                    byte[] bArr4 = cVar.f2458e;
                    if (c != bArr4[i4]) {
                        i2 = bArr3[i4];
                        i3 = bArr4[i4];
                        break;
                    }
                    i4++;
                }
            }
            return i2 - i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Arrays.equals(this.f2458e, ((c) obj).f2458e);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f2458e);
        }

        public String toString() {
            return o.b(this.f2458e);
        }
    }

    private p(Class<P> cls) {
        this.c = cls;
    }

    public static <P> p<P> f(Class<P> cls) {
        return new p<>(cls);
    }

    public b<P> a(P p, c0.c cVar) {
        if (cVar.V() == z.ENABLED) {
            b<P> bVar = new b<>(p, f.b.b.a.c.a(cVar), cVar.V(), cVar.U(), cVar.T());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            c cVar2 = new c(bVar.a());
            List<b<P>> put = this.a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(bVar);
                this.a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public b<P> b() {
        return this.b;
    }

    public List<b<P>> c(byte[] bArr) {
        List<b<P>> list = this.a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.c;
    }

    public List<b<P>> e() {
        return c(f.b.b.a.c.a);
    }

    public void g(b<P> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (bVar.d() != z.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!c(bVar.a()).isEmpty()) {
            this.b = bVar;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
