package f.b.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: e  reason: collision with root package name */
    private final List<k> f2699e = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).f2699e.equals(this.f2699e));
    }

    public int hashCode() {
        return this.f2699e.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f2699e.iterator();
    }

    @Override // f.b.c.k
    public String k() {
        if (this.f2699e.size() == 1) {
            return this.f2699e.get(0).k();
        }
        throw new IllegalStateException();
    }

    public void p(k kVar) {
        if (kVar == null) {
            kVar = m.a;
        }
        this.f2699e.add(kVar);
    }
}
