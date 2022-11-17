package kotlinx.coroutines;

import j.x.d.i;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class o1 extends CancellationException implements d0<o1> {

    /* renamed from: e  reason: collision with root package name */
    public final n1 f3914e;

    public o1(String str, Throwable th, n1 n1Var) {
        super(str);
        this.f3914e = n1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public o1 a() {
        if (!o0.c()) {
            return null;
        }
        String message = getMessage();
        i.b(message);
        return new o1(message, this, this.f3914e);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                if (!i.a(o1Var.getMessage(), getMessage()) || !i.a(o1Var.f3914e, this.f3914e) || !i.a(o1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (o0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        i.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f3914e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f3914e;
    }
}
