package j.x.d;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class j<R> implements f<R>, Serializable {
    private final int arity;

    public j(int i2) {
        this.arity = i2;
    }

    @Override // j.x.d.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e2 = l.e(this);
        i.c(e2, "renderLambdaToString(this)");
        return e2;
    }
}
