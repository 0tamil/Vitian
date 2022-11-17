package k.a.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import k.a.a.b;
import k.a.a.x.a;
import k.a.a.x.d;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public enum x implements i {
    BEFORE_BE,
    BE;

    public static x a(int i2) {
        if (i2 == 0) {
            return BEFORE_BE;
        }
        if (i2 == 1) {
            return BE;
        }
        throw new b("Era is not valid for ThaiBuddhistEra");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x d(DataInput dataInput) {
        return a(dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    @Override // k.a.a.x.e
    public n c(i iVar) {
        if (iVar == a.ERA) {
            return iVar.h();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.e
    public int e(i iVar) {
        return iVar == a.ERA ? getValue() : c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) k.a.a.x.b.ERAS;
        }
        if (kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d() || kVar == j.b() || kVar == j.c()) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // k.a.a.u.i
    public int getValue() {
        return ordinal();
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.ERA : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (iVar == a.ERA) {
            return getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.g(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(a.ERA, getValue());
    }
}
