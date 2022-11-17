package j.u.j.a;

import j.l;
import j.m;
import j.r;
import j.u.d;
import j.x.d.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class a implements d<Object>, e, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<r> create(d<?> dVar) {
        i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d<r> create(Object obj, d<?> dVar) {
        i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // j.u.j.a.e
    public e getCallerFrame() {
        d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    @Override // j.u.j.a.e
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.u.d
    public final void resumeWith(Object obj) {
        Object c;
        d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            d dVar2 = aVar.completion;
            i.b(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                c = j.u.i.d.c();
            } catch (Throwable th) {
                l.a aVar2 = l.f3445e;
                obj = m.a(th);
                l.a(obj);
            }
            if (obj != c) {
                l.a aVar3 = l.f3445e;
                l.a(obj);
                aVar.releaseIntercepted();
                if (dVar2 instanceof a) {
                    dVar = dVar2;
                } else {
                    dVar2.resumeWith(obj);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
