package f.b.b.a.z.a;

import f.b.b.a.z.a.a;
import f.b.b.a.z.a.a.AbstractC0100a;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.s0;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0100a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: f.b.b.a.z.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0100a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0100a<MessageType, BuilderType>> implements s0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static n1 n(s0 s0Var) {
            return new n1(s0Var);
        }

        @Override // f.b.b.a.z.a.s0.a
        public /* bridge */ /* synthetic */ s0.a d(s0 s0Var) {
            m(s0Var);
            return this;
        }

        protected abstract BuilderType l(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType m(s0 s0Var) {
            if (g().getClass().isInstance(s0Var)) {
                l((a) s0Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // f.b.b.a.z.a.s0
    public byte[] b() {
        try {
            byte[] bArr = new byte[e()];
            l d0 = l.d0(bArr);
            c(d0);
            d0.c();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(n("byte array"), e2);
        }
    }

    @Override // f.b.b.a.z.a.s0
    public i i() {
        try {
            i.g r = i.r(e());
            c(r.b());
            return r.a();
        } catch (IOException e2) {
            throw new RuntimeException(n("ByteString"), e2);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(h1 h1Var) {
        int l = l();
        if (l != -1) {
            return l;
        }
        int f2 = h1Var.f(this);
        q(f2);
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1 o() {
        return new n1(this);
    }

    void q(int i2) {
        throw new UnsupportedOperationException();
    }
}
