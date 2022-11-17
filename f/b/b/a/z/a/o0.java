package f.b.b.a.z.a;

import f.b.b.a.z.a.l0;
import java.util.Map;
/* loaded from: classes.dex */
class o0 implements n0 {
    private static <K, V> int i(int i2, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int i3 = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : m0Var.entrySet()) {
            i3 += l0Var.a(i2, entry.getKey(), entry.getValue());
        }
        return i3;
    }

    private static <K, V> m0<K, V> j(Object obj, Object obj2) {
        m0<K, V> m0Var = (m0) obj;
        m0<K, V> m0Var2 = (m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.j()) {
                m0Var = m0Var.m();
            }
            m0Var.l(m0Var2);
        }
        return m0Var;
    }

    @Override // f.b.b.a.z.a.n0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // f.b.b.a.z.a.n0
    public Map<?, ?> b(Object obj) {
        return (m0) obj;
    }

    @Override // f.b.b.a.z.a.n0
    public Object c(Object obj) {
        return m0.f().m();
    }

    @Override // f.b.b.a.z.a.n0
    public int d(int i2, Object obj, Object obj2) {
        return i(i2, obj, obj2);
    }

    @Override // f.b.b.a.z.a.n0
    public Map<?, ?> e(Object obj) {
        return (m0) obj;
    }

    @Override // f.b.b.a.z.a.n0
    public boolean f(Object obj) {
        return !((m0) obj).j();
    }

    @Override // f.b.b.a.z.a.n0
    public Object g(Object obj) {
        ((m0) obj).k();
        return obj;
    }

    @Override // f.b.b.a.z.a.n0
    public l0.a<?, ?> h(Object obj) {
        return ((l0) obj).c();
    }
}
