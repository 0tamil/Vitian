package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.h;
import f.b.c.k;
import f.b.c.m;
import f.b.c.n;
import f.b.c.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g extends c {
    private static final Writer s = new a();
    private static final p t = new p("closed");
    private String q;
    private final List<k> p = new ArrayList();
    private k r = m.a;

    /* loaded from: classes.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public g() {
        super(s);
    }

    private k M() {
        List<k> list = this.p;
        return list.get(list.size() - 1);
    }

    private void N(k kVar) {
        if (this.q != null) {
            if (!kVar.m() || n()) {
                ((n) M()).p(this.q, kVar);
            }
            this.q = null;
        } else if (this.p.isEmpty()) {
            this.r = kVar;
        } else {
            k M = M();
            if (M instanceof h) {
                ((h) M).p(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // f.b.c.b0.c
    public c F(long j2) {
        N(new p(Long.valueOf(j2)));
        return this;
    }

    @Override // f.b.c.b0.c
    public c G(Boolean bool) {
        if (bool == null) {
            t();
            return this;
        }
        N(new p(bool));
        return this;
    }

    @Override // f.b.c.b0.c
    public c H(Number number) {
        if (number == null) {
            t();
            return this;
        }
        if (!q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        N(new p(number));
        return this;
    }

    @Override // f.b.c.b0.c
    public c I(String str) {
        if (str == null) {
            t();
            return this;
        }
        N(new p(str));
        return this;
    }

    @Override // f.b.c.b0.c
    public c J(boolean z) {
        N(new p(Boolean.valueOf(z)));
        return this;
    }

    public k L() {
        if (this.p.isEmpty()) {
            return this.r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.p);
    }

    @Override // f.b.c.b0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.p.isEmpty()) {
            this.p.add(t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // f.b.c.b0.c
    public c d() {
        h hVar = new h();
        N(hVar);
        this.p.add(hVar);
        return this;
    }

    @Override // f.b.c.b0.c
    public c f() {
        n nVar = new n();
        N(nVar);
        this.p.add(nVar);
        return this;
    }

    @Override // f.b.c.b0.c, java.io.Flushable
    public void flush() {
    }

    @Override // f.b.c.b0.c
    public c i() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        } else if (M() instanceof h) {
            List<k> list = this.p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // f.b.c.b0.c
    public c l() {
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        } else if (M() instanceof n) {
            List<k> list = this.p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // f.b.c.b0.c
    public c r(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        } else if (M() instanceof n) {
            this.q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // f.b.c.b0.c
    public c t() {
        N(m.a);
        return this;
    }
}
