package j.c0;

import j.b0.b;
import j.k;
import j.x.c.p;
import j.x.d.i;
import j.z.f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements b<j.z.c> {
    private final CharSequence a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final p<CharSequence, Integer, k<Integer, Integer>> f3426d;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<j.z.c> {

        /* renamed from: e  reason: collision with root package name */
        private int f3427e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f3428f;

        /* renamed from: g  reason: collision with root package name */
        private int f3429g;

        /* renamed from: h  reason: collision with root package name */
        private j.z.c f3430h;

        /* renamed from: i  reason: collision with root package name */
        private int f3431i;

        a() {
            int e2;
            e2 = f.e(c.this.b, 0, c.this.a.length());
            this.f3428f = e2;
            this.f3429g = e2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f3432j.c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void b() {
            j.z.c cVar;
            j.z.c g2;
            int i2 = 0;
            if (this.f3429g < 0) {
                this.f3427e = 0;
                this.f3430h = null;
                return;
            }
            int i3 = -1;
            if (c.this.c > 0) {
                int i4 = this.f3431i + 1;
                this.f3431i = i4;
            }
            if (this.f3429g <= c.this.a.length()) {
                k kVar = (k) c.this.f3426d.invoke(c.this.a, Integer.valueOf(this.f3429g));
                if (kVar == null) {
                    cVar = new j.z.c(this.f3428f, n.u(c.this.a));
                    this.f3430h = cVar;
                    this.f3429g = i3;
                    this.f3427e = 1;
                }
                int intValue = ((Number) kVar.a()).intValue();
                int intValue2 = ((Number) kVar.b()).intValue();
                g2 = f.g(this.f3428f, intValue);
                this.f3430h = g2;
                int i5 = intValue + intValue2;
                this.f3428f = i5;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                i3 = i5 + i2;
                this.f3429g = i3;
                this.f3427e = 1;
            }
            cVar = new j.z.c(this.f3428f, n.u(c.this.a));
            this.f3430h = cVar;
            this.f3429g = i3;
            this.f3427e = 1;
        }

        /* renamed from: c */
        public j.z.c next() {
            if (this.f3427e == -1) {
                b();
            }
            if (this.f3427e != 0) {
                j.z.c cVar = this.f3430h;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f3430h = null;
                this.f3427e = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3427e == -1) {
                b();
            }
            return this.f3427e == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, k<Integer, Integer>> pVar) {
        i.d(charSequence, "input");
        i.d(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.c = i3;
        this.f3426d = pVar;
    }

    @Override // j.b0.b
    public Iterator<j.z.c> iterator() {
        return new a();
    }
}
