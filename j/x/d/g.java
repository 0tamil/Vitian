package j.x.d;

import j.a0.b;
import j.a0.e;
/* loaded from: classes.dex */
public class g extends a implements f, e {
    private final int arity;
    private final int flags;

    public g(int i2) {
        this(i2, a.NO_RECEIVER, null, null, null, 0);
    }

    public g(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = i3 >> 1;
    }

    @Override // j.x.d.a
    protected b computeReflected() {
        l.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        } else if (obj instanceof e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // j.x.d.f
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j.x.d.a
    public e getReflected() {
        return (e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // j.a0.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // j.a0.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // j.a0.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // j.a0.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // j.x.d.a, j.a0.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
