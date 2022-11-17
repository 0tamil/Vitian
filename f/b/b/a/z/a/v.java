package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.e0;
import f.b.b.a.z.a.s0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.v.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f2611d = new v(true);
    private final k1<T, Object> a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[u1.b.values().length];
            b = iArr;
            try {
                iArr[u1.b.f2597g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[u1.b.f2598h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[u1.b.f2599i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[u1.b.f2600j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[u1.b.f2601k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[u1.b.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[u1.b.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[u1.b.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[u1.b.p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[u1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[u1.b.o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[u1.b.r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[u1.b.s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[u1.b.u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[u1.b.v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[u1.b.w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[u1.b.x.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[u1.b.t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[u1.c.values().length];
            a = iArr2;
            try {
                iArr2[u1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[u1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[u1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[u1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[u1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[u1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[u1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[u1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[u1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int b();

        boolean f();

        u1.b i();

        s0.a m(s0.a aVar, s0 s0Var);

        u1.c n();

        boolean o();
    }

    private v() {
        this.a = k1.q(16);
    }

    private v(k1<T, Object> k1Var) {
        this.a = k1Var;
        t();
    }

    private v(boolean z) {
        this(k1.q(0));
        t();
    }

    static void A(l lVar, u1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                lVar.o0(((Double) obj).doubleValue());
                return;
            case 2:
                lVar.w0(((Float) obj).floatValue());
                return;
            case 3:
                lVar.E0(((Long) obj).longValue());
                return;
            case 4:
                lVar.X0(((Long) obj).longValue());
                return;
            case 5:
                lVar.C0(((Integer) obj).intValue());
                return;
            case 6:
                lVar.u0(((Long) obj).longValue());
                return;
            case 7:
                lVar.s0(((Integer) obj).intValue());
                return;
            case 8:
                lVar.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                lVar.z0((s0) obj);
                return;
            case 10:
                lVar.G0((s0) obj);
                return;
            case 11:
                if (!(obj instanceof i)) {
                    lVar.S0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    lVar.j0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                lVar.V0(((Integer) obj).intValue());
                return;
            case 14:
                lVar.K0(((Integer) obj).intValue());
                return;
            case 15:
                lVar.M0(((Long) obj).longValue());
                return;
            case 16:
                lVar.O0(((Integer) obj).intValue());
                return;
            case 17:
                lVar.Q0(((Long) obj).longValue());
                return;
            case 18:
                lVar.q0(obj instanceof b0.c ? ((b0.c) obj).b() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        lVar.m0((i) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(u1.b bVar, int i2, Object obj) {
        int U = l.U(i2);
        if (bVar == u1.b.p) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(u1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return l.j(((Double) obj).doubleValue());
            case 2:
                return l.r(((Float) obj).floatValue());
            case 3:
                return l.y(((Long) obj).longValue());
            case 4:
                return l.Y(((Long) obj).longValue());
            case 5:
                return l.w(((Integer) obj).intValue());
            case 6:
                return l.p(((Long) obj).longValue());
            case 7:
                return l.n(((Integer) obj).intValue());
            case 8:
                return l.e(((Boolean) obj).booleanValue());
            case 9:
                return l.t((s0) obj);
            case 10:
                return obj instanceof e0 ? l.B((e0) obj) : l.G((s0) obj);
            case 11:
                return obj instanceof i ? l.h((i) obj) : l.T((String) obj);
            case 12:
                return obj instanceof i ? l.h((i) obj) : l.f((byte[]) obj);
            case 13:
                return l.W(((Integer) obj).intValue());
            case 14:
                return l.L(((Integer) obj).intValue());
            case 15:
                return l.N(((Long) obj).longValue());
            case 16:
                return l.P(((Integer) obj).intValue());
            case 17:
                return l.R(((Long) obj).longValue());
            case 18:
                return obj instanceof b0.c ? l.l(((b0.c) obj).b()) : l.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u1.b i2 = bVar.i();
        int b2 = bVar.b();
        if (!bVar.f()) {
            return d(i2, b2, obj);
        }
        int i3 = 0;
        List<Object> list = (List) obj;
        if (bVar.o()) {
            for (Object obj2 : list) {
                i3 += e(i2, obj2);
            }
            return l.U(b2) + i3 + l.J(i3);
        }
        for (Object obj3 : list) {
            i3 += d(i2, b2, obj3);
        }
        return i3;
    }

    public static <T extends b<T>> v<T> h() {
        return f2611d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.n() != u1.c.MESSAGE || key.f() || key.o()) {
            return f(key, value);
        }
        boolean z = value instanceof e0;
        int b2 = entry.getKey().b();
        return z ? l.z(b2, (e0) value) : l.D(b2, (s0) value);
    }

    static int m(u1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.c();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.n() == u1.c.MESSAGE) {
            boolean f2 = key.f();
            Object value = entry.getValue();
            if (f2) {
                for (s0 s0Var : (List) value) {
                    if (!s0Var.k()) {
                        return false;
                    }
                }
            } else if (value instanceof s0) {
                if (!((s0) value).k()) {
                    return false;
                }
            } else if (value instanceof e0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static boolean r(u1.b bVar, Object obj) {
        b0.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof b0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        Object obj;
        k1<T, Object> k1Var;
        Object i2;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).f();
        }
        if (key.f()) {
            Object i3 = i(key);
            if (i3 == null) {
                i3 = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                ((List) i3).add(c(obj2));
            }
            this.a.put(key, i3);
            return;
        }
        if (key.n() != u1.c.MESSAGE || (i2 = i(key)) == null) {
            k1Var = this.a;
            obj = c(value);
        } else {
            obj = key.m(((s0) i2).h(), (s0) value).a();
            k1Var = this.a;
        }
        k1Var.put(key, obj);
    }

    public static <T extends b<T>> v<T> w() {
        return new v<>();
    }

    private void y(u1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(l lVar, u1.b bVar, int i2, Object obj) {
        if (bVar == u1.b.p) {
            lVar.x0(i2, (s0) obj);
            return;
        }
        lVar.T0(i2, m(bVar, false));
        A(lVar, bVar, obj);
    }

    public void a(T t, Object obj) {
        List list;
        if (t.f()) {
            y(t.i(), obj);
            Object i2 = i(t);
            if (i2 == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) i2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> w = w();
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            Map.Entry<T, Object> j2 = this.a.j(i2);
            w.x(j2.getKey(), j2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            w.x(entry.getKey(), entry.getValue());
        }
        w.c = this.c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.a.equals(((v) obj).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new e0.c(this.a.h().iterator()) : this.a.h().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        return obj instanceof e0 ? ((e0) obj).f() : obj;
    }

    public int j() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.k(); i3++) {
            i2 += k(this.a.j(i3));
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            i2 += k(entry);
        }
        return i2;
    }

    public int l() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.k(); i3++) {
            Map.Entry<T, Object> j2 = this.a.j(i3);
            i2 += f(j2.getKey(), j2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            i2 += f(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            if (!q(this.a.j(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.m()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.c ? new e0.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void t() {
        if (!this.b) {
            this.a.p();
            this.b = true;
        }
    }

    public void u(v<T> vVar) {
        for (int i2 = 0; i2 < vVar.a.k(); i2++) {
            v(vVar.a.j(i2));
        }
        for (Map.Entry<T, Object> entry : vVar.a.m()) {
            v(entry);
        }
    }

    public void x(T t, Object obj) {
        if (!t.f()) {
            y(t.i(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                y(t.i(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof e0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }
}
