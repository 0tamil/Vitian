package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a<E> extends w<Object> {
    public static final x c = new C0109a();
    private final Class<E> a;
    private final w<E> b;

    /* renamed from: f.b.c.z.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0109a implements x {
        C0109a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            Type e2 = aVar.e();
            if (!(e2 instanceof GenericArrayType) && (!(e2 instanceof Class) || !((Class) e2).isArray())) {
                return null;
            }
            Type g2 = b.g(e2);
            return new a(eVar, eVar.j(f.b.c.a0.a.b(g2)), b.k(g2));
        }
    }

    public a(e eVar, w<E> wVar, Class<E> cls) {
        this.b = new m(eVar, wVar, cls);
        this.a = cls;
    }

    @Override // f.b.c.w
    public Object c(f.b.c.b0.a aVar) {
        if (aVar.G() == f.b.c.b0.b.NULL) {
            aVar.C();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.q()) {
            arrayList.add(this.b.c(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b.c.w
    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.t();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.e(cVar, Array.get(obj, i2));
        }
        cVar.i();
    }
}
