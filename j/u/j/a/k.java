package j.u.j.a;

import j.u.d;
import j.x.d.f;
import j.x.d.i;
import j.x.d.l;
/* loaded from: classes.dex */
public abstract class k extends d implements f<Object> {
    private final int arity;

    public k(int i2) {
        this(i2, null);
    }

    public k(int i2, d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }

    @Override // j.x.d.f
    public int getArity() {
        return this.arity;
    }

    @Override // j.u.j.a.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d2 = l.d(this);
        i.c(d2, "renderLambdaToString(this)");
        return d2;
    }
}
