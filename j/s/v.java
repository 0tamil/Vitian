package j.s;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class v implements Iterator<Integer> {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
