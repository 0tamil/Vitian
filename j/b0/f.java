package j.b0;

import j.x.d.i;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* loaded from: classes.dex */
    public static final class a implements b<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // j.b0.b
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        i.d(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> b(b<? extends T> bVar) {
        i.d(bVar, "<this>");
        return bVar instanceof j.b0.a ? bVar : new j.b0.a(bVar);
    }
}
