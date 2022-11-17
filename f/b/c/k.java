package f.b.c;

import f.b.c.b0.c;
import f.b.c.z.l;
import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes.dex */
public abstract class k {
    public h h() {
        if (l()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n i() {
        if (n()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p j() {
        if (o()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof h;
    }

    public boolean m() {
        return this instanceof m;
    }

    public boolean n() {
        return this instanceof n;
    }

    public boolean o() {
        return this instanceof p;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.C(true);
            l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
