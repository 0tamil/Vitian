package k.a.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k.a.a.e;
import k.a.a.g;
import k.a.a.r;
/* loaded from: classes.dex */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f3752e;

    /* renamed from: f  reason: collision with root package name */
    private final r f3753f;

    /* renamed from: g  reason: collision with root package name */
    private final r f3754g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(long j2, r rVar, r rVar2) {
        this.f3752e = g.W(j2, 0, rVar);
        this.f3753f = rVar;
        this.f3754g = rVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(g gVar, r rVar, r rVar2) {
        this.f3752e = gVar;
        this.f3753f = rVar;
        this.f3754g = rVar2;
    }

    private int g() {
        return j().y() - k().y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d q(DataInput dataInput) {
        long b = a.b(dataInput);
        r d2 = a.d(dataInput);
        r d3 = a.d(dataInput);
        if (!d2.equals(d3)) {
            return new d(b, d2, d3);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        return h().compareTo(dVar.h());
    }

    public g c() {
        return this.f3752e.e0(g());
    }

    public g d() {
        return this.f3752e;
    }

    public k.a.a.d e() {
        return k.a.a.d.h(g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3752e.equals(dVar.f3752e) && this.f3753f.equals(dVar.f3753f) && this.f3754g.equals(dVar.f3754g);
    }

    public e h() {
        return this.f3752e.C(this.f3753f);
    }

    public int hashCode() {
        return (this.f3752e.hashCode() ^ this.f3753f.hashCode()) ^ Integer.rotateLeft(this.f3754g.hashCode(), 16);
    }

    public r j() {
        return this.f3754g;
    }

    public r k() {
        return this.f3753f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<r> l() {
        return p() ? Collections.emptyList() : Arrays.asList(k(), j());
    }

    public boolean p() {
        return j().y() > k().y();
    }

    public long r() {
        return this.f3752e.B(this.f3753f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(DataOutput dataOutput) {
        a.e(r(), dataOutput);
        a.g(this.f3753f, dataOutput);
        a.g(this.f3754g, dataOutput);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(p() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f3752e);
        sb.append(this.f3753f);
        sb.append(" to ");
        sb.append(this.f3754g);
        sb.append(']');
        return sb.toString();
    }
}
