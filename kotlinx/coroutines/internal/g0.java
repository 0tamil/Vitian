package kotlinx.coroutines.internal;

import j.u.g;
import j.x.d.i;
import kotlinx.coroutines.d2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 {
    public final g a;
    private final Object[] b;
    private final d2<Object>[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f3798d;

    public g0(g gVar, int i2) {
        this.a = gVar;
        this.b = new Object[i2];
        this.c = new d2[i2];
    }

    public final void a(d2<?> d2Var, Object obj) {
        Object[] objArr = this.b;
        int i2 = this.f3798d;
        objArr[i2] = obj;
        d2<Object>[] d2VarArr = this.c;
        this.f3798d = i2 + 1;
        d2VarArr[i2] = d2Var;
    }

    public final void b(g gVar) {
        int length = this.c.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                d2<Object> d2Var = this.c[length];
                i.b(d2Var);
                d2Var.o(gVar, this.b[length]);
                if (i2 >= 0) {
                    length = i2;
                } else {
                    return;
                }
            }
        }
    }
}
