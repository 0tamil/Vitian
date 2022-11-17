package f.b.c;

import f.b.c.b0.b;
import f.b.c.b0.c;
import f.b.c.z.n.f;
import f.b.c.z.n.g;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class w<T> {

    /* loaded from: classes.dex */
    class a extends w<T> {
        a() {
        }

        @Override // f.b.c.w
        public T c(f.b.c.b0.a aVar) {
            if (aVar.G() != b.NULL) {
                return (T) w.this.c(aVar);
            }
            aVar.C();
            return null;
        }

        @Override // f.b.c.w
        public void e(c cVar, T t) {
            if (t == null) {
                cVar.t();
            } else {
                w.this.e(cVar, t);
            }
        }
    }

    public final T a(k kVar) {
        try {
            return c(new f(kVar));
        } catch (IOException e2) {
            throw new l(e2);
        }
    }

    public final w<T> b() {
        return new a();
    }

    public abstract T c(f.b.c.b0.a aVar);

    public final k d(T t) {
        try {
            g gVar = new g();
            e(gVar, t);
            return gVar.L();
        } catch (IOException e2) {
            throw new l(e2);
        }
    }

    public abstract void e(c cVar, T t);
}
