package k.a.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import k.a.a.b;
import k.a.a.f;
import k.a.a.w.a;
import k.a.a.x.i;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class q extends a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final q f3595h;

    /* renamed from: i  reason: collision with root package name */
    public static final q f3596i;

    /* renamed from: j  reason: collision with root package name */
    public static final q f3597j;

    /* renamed from: k  reason: collision with root package name */
    public static final q f3598k;
    private static final AtomicReference<q[]> l;

    /* renamed from: e  reason: collision with root package name */
    private final int f3599e;

    /* renamed from: f  reason: collision with root package name */
    private final transient f f3600f;

    /* renamed from: g  reason: collision with root package name */
    private final transient String f3601g;

    static {
        q qVar = new q(-1, f.Y(1868, 9, 8), "Meiji");
        f3595h = qVar;
        q qVar2 = new q(0, f.Y(1912, 7, 30), "Taisho");
        f3596i = qVar2;
        q qVar3 = new q(1, f.Y(1926, 12, 25), "Showa");
        f3597j = qVar3;
        q qVar4 = new q(2, f.Y(1989, 1, 8), "Heisei");
        f3598k = qVar4;
        l = new AtomicReference<>(new q[]{qVar, qVar2, qVar3, qVar4});
    }

    private q(int i2, f fVar, String str) {
        this.f3599e = i2;
        this.f3600f = fVar;
        this.f3601g = str;
    }

    private Object readResolve() {
        try {
            return v(this.f3599e);
        } catch (b e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q u(f fVar) {
        if (!fVar.y(f3595h.f3600f)) {
            q[] qVarArr = l.get();
            for (int length = qVarArr.length - 1; length >= 0; length--) {
                q qVar = qVarArr[length];
                if (fVar.compareTo(qVar.f3600f) >= 0) {
                    return qVar;
                }
            }
            return null;
        }
        throw new b("Date too early: " + fVar);
    }

    public static q v(int i2) {
        q[] qVarArr = l.get();
        if (i2 >= f3595h.f3599e && i2 <= qVarArr[qVarArr.length - 1].f3599e) {
            return qVarArr[w(i2)];
        }
        throw new b("japaneseEra is invalid");
    }

    private static int w(int i2) {
        return i2 + 1;
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q x(DataInput dataInput) {
        return v(dataInput.readByte());
    }

    public static q[] z() {
        q[] qVarArr = l.get();
        return (q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        k.a.a.x.a aVar = k.a.a.x.a.ERA;
        return iVar == aVar ? o.f3587h.B(aVar) : super.c(iVar);
    }

    @Override // k.a.a.u.i
    public int getValue() {
        return this.f3599e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f t() {
        int w = w(this.f3599e);
        q[] z = z();
        return w >= z.length + (-1) ? f.f3510i : z[w + 1].y().W(1L);
    }

    public String toString() {
        return this.f3601g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f y() {
        return this.f3600f;
    }
}
