package f.b.c.z.n;

import f.b.c.b0.a;
import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.w;
import f.b.c.z.n.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m<T> extends w<T> {
    private final e a;
    private final w<T> b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(e eVar, w<T> wVar, Type type) {
        this.a = eVar;
        this.b = wVar;
        this.c = type;
    }

    private Type f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // f.b.c.w
    public T c(a aVar) {
        return this.b.c(aVar);
    }

    @Override // f.b.c.w
    public void e(c cVar, T t) {
        w<T> wVar = this.b;
        Type f2 = f(this.c, t);
        if (f2 != this.c) {
            wVar = this.a.j(f.b.c.a0.a.b(f2));
            if (wVar instanceof k.b) {
                w<T> wVar2 = this.b;
                if (!(wVar2 instanceof k.b)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.e(cVar, t);
    }
}
