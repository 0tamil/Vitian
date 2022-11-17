package k.a.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k.a.a.e;
import k.a.a.f;
import k.a.a.g;
import k.a.a.r;
import k.a.a.w.d;
import k.a.a.y.f;
/* loaded from: classes.dex */
final class b extends f implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final long[] f3743e;

    /* renamed from: f  reason: collision with root package name */
    private final r[] f3744f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f3745g;

    /* renamed from: h  reason: collision with root package name */
    private final g[] f3746h;

    /* renamed from: i  reason: collision with root package name */
    private final r[] f3747i;

    /* renamed from: j  reason: collision with root package name */
    private final e[] f3748j;

    /* renamed from: k  reason: collision with root package name */
    private final ConcurrentMap<Integer, d[]> f3749k = new ConcurrentHashMap();

    private b(long[] jArr, r[] rVarArr, long[] jArr2, r[] rVarArr2, e[] eVarArr) {
        g gVar;
        this.f3743e = jArr;
        this.f3744f = rVarArr;
        this.f3745g = jArr2;
        this.f3747i = rVarArr2;
        this.f3748j = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jArr2.length) {
            int i3 = i2 + 1;
            d dVar = new d(jArr2[i2], rVarArr2[i2], rVarArr2[i3]);
            if (dVar.p()) {
                arrayList.add(dVar.d());
                gVar = dVar.c();
            } else {
                arrayList.add(dVar.c());
                gVar = dVar.d();
            }
            arrayList.add(gVar);
            i2 = i3;
        }
        this.f3746h = (g[]) arrayList.toArray(new g[arrayList.size()]);
    }

    private Object g(g gVar, d dVar) {
        g d2 = dVar.d();
        boolean p = dVar.p();
        boolean y = gVar.y(d2);
        return p ? y ? dVar.k() : gVar.y(dVar.c()) ? dVar : dVar.j() : !y ? dVar.j() : gVar.y(dVar.c()) ? dVar.k() : dVar;
    }

    private d[] h(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        d[] dVarArr = this.f3749k.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f3748j;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            dVarArr2[i3] = eVarArr[i3].b(i2);
        }
        if (i2 < 2100) {
            this.f3749k.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    private int i(long j2, r rVar) {
        return f.a0(d.e(j2 + rVar.y(), 86400L)).R();
    }

    private Object j(g gVar) {
        g[] gVarArr;
        int i2 = 0;
        if (this.f3748j.length > 0) {
            if (gVar.x(this.f3746h[gVarArr.length - 1])) {
                d[] h2 = h(gVar.S());
                Object obj = null;
                int length = h2.length;
                while (i2 < length) {
                    d dVar = h2[i2];
                    Object g2 = g(gVar, dVar);
                    if ((g2 instanceof d) || g2.equals(dVar.k())) {
                        return g2;
                    }
                    i2++;
                    obj = g2;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f3746h, gVar);
        if (binarySearch == -1) {
            return this.f3747i[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            g[] gVarArr2 = this.f3746h;
            if (binarySearch < gVarArr2.length - 1) {
                int i3 = binarySearch + 1;
                if (gVarArr2[binarySearch].equals(gVarArr2[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f3747i[(binarySearch / 2) + 1];
        }
        g[] gVarArr3 = this.f3746h;
        g gVar2 = gVarArr3[binarySearch];
        g gVar3 = gVarArr3[binarySearch + 1];
        r[] rVarArr = this.f3747i;
        int i4 = binarySearch / 2;
        r rVar = rVarArr[i4];
        r rVar2 = rVarArr[i4 + 1];
        return rVar2.y() > rVar.y() ? new d(gVar2, rVar, rVar2) : new d(gVar3, rVar, rVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a.b(dataInput);
        }
        int i3 = readInt + 1;
        r[] rVarArr = new r[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            rVarArr[i4] = a.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr2[i5] = a.b(dataInput);
        }
        int i6 = readInt2 + 1;
        r[] rVarArr2 = new r[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            rVarArr2[i7] = a.d(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i8 = 0; i8 < readByte; i8++) {
            eVarArr[i8] = e.c(dataInput);
        }
        return new b(jArr, rVarArr, jArr2, rVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // k.a.a.y.f
    public r a(e eVar) {
        long[] jArr;
        r[] rVarArr;
        long w = eVar.w();
        if (this.f3748j.length > 0) {
            if (w > this.f3745g[jArr.length - 1]) {
                d[] h2 = h(i(w, this.f3747i[rVarArr.length - 1]));
                d dVar = null;
                for (int i2 = 0; i2 < h2.length; i2++) {
                    dVar = h2[i2];
                    if (w < dVar.r()) {
                        return dVar.k();
                    }
                }
                return dVar.j();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f3745g, w);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f3747i[binarySearch + 1];
    }

    @Override // k.a.a.y.f
    public d b(g gVar) {
        Object j2 = j(gVar);
        if (j2 instanceof d) {
            return (d) j2;
        }
        return null;
    }

    @Override // k.a.a.y.f
    public List<r> c(g gVar) {
        Object j2 = j(gVar);
        return j2 instanceof d ? ((d) j2).l() : Collections.singletonList((r) j2);
    }

    @Override // k.a.a.y.f
    public boolean d() {
        return this.f3745g.length == 0;
    }

    @Override // k.a.a.y.f
    public boolean e(g gVar, r rVar) {
        return c(gVar).contains(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f3743e, bVar.f3743e) && Arrays.equals(this.f3744f, bVar.f3744f) && Arrays.equals(this.f3745g, bVar.f3745g) && Arrays.equals(this.f3747i, bVar.f3747i) && Arrays.equals(this.f3748j, bVar.f3748j);
        }
        if ((obj instanceof f.a) && d()) {
            e eVar = e.f3506g;
            if (a(eVar).equals(((f.a) obj).a(eVar))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f3743e) ^ Arrays.hashCode(this.f3744f)) ^ Arrays.hashCode(this.f3745g)) ^ Arrays.hashCode(this.f3747i)) ^ Arrays.hashCode(this.f3748j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(DataOutput dataOutput) {
        dataOutput.writeInt(this.f3743e.length);
        for (long j2 : this.f3743e) {
            a.e(j2, dataOutput);
        }
        for (r rVar : this.f3744f) {
            a.g(rVar, dataOutput);
        }
        dataOutput.writeInt(this.f3745g.length);
        for (long j3 : this.f3745g) {
            a.e(j3, dataOutput);
        }
        for (r rVar2 : this.f3747i) {
            a.g(rVar2, dataOutput);
        }
        dataOutput.writeByte(this.f3748j.length);
        for (e eVar : this.f3748j) {
            eVar.d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        r[] rVarArr = this.f3744f;
        sb.append(rVarArr[rVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
