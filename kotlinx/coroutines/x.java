package kotlinx.coroutines;

import j.r;
import j.x.c.l;
import j.x.d.e;
import j.x.d.i;
/* loaded from: classes.dex */
final class x {
    public final Object a;
    public final k b;
    public final l<Throwable, r> c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3938d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f3939e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, k kVar, l<? super Throwable, r> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.f3938d = obj2;
        this.f3939e = th;
    }

    public /* synthetic */ x(Object obj, k kVar, l lVar, Object obj2, Throwable th, int i2, e eVar) {
        this(obj, (i2 & 2) != 0 ? null : kVar, (i2 & 4) != 0 ? null : lVar, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ x b(x xVar, Object obj, k kVar, l lVar, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = xVar.a;
        }
        if ((i2 & 2) != 0) {
            kVar = xVar.b;
        }
        k kVar2 = kVar;
        l<Throwable, r> lVar2 = lVar;
        if ((i2 & 4) != 0) {
            lVar2 = xVar.c;
        }
        l lVar3 = lVar2;
        if ((i2 & 8) != 0) {
            obj2 = xVar.f3938d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = xVar.f3939e;
        }
        return xVar.a(obj, kVar2, lVar3, obj4, th);
    }

    public final x a(Object obj, k kVar, l<? super Throwable, r> lVar, Object obj2, Throwable th) {
        return new x(obj, kVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f3939e != null;
    }

    public final void d(n<?> nVar, Throwable th) {
        k kVar = this.b;
        if (kVar != null) {
            nVar.n(kVar, th);
        }
        l<Throwable, r> lVar = this.c;
        if (lVar != null) {
            nVar.o(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return i.a(this.a, xVar.a) && i.a(this.b, xVar.b) && i.a(this.c, xVar.c) && i.a(this.f3938d, xVar.f3938d) && i.a(this.f3939e, xVar.f3939e);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l<Throwable, r> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f3938d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3939e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f3938d + ", cancelCause=" + this.f3939e + ')';
    }
}
