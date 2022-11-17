package kotlinx.coroutines;

import j.r;
import j.x.c.l;
import j.x.d.i;
/* loaded from: classes.dex */
public final class z {
    public final Object a;
    public final l<Throwable, r> b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Object obj, l<? super Throwable, r> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i.a(this.a, zVar.a) && i.a(this.b, zVar.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
