package f.b.b.a.z.a;

import f.b.b.a.z.a.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {
    private static boolean b = true;
    private static volatile q c;

    /* renamed from: d  reason: collision with root package name */
    static final q f2582d = new q(true);
    private final Map<a, z.e<?, ?>> a;

    /* loaded from: classes.dex */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i2) {
            this.a = obj;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    q() {
        this.a = new HashMap();
    }

    q(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static q b() {
        q qVar = c;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = c;
                if (qVar == null) {
                    qVar = b ? p.a() : f2582d;
                    c = qVar;
                }
            }
        }
        return qVar;
    }

    public <ContainingType extends s0> z.e<ContainingType, ?> a(ContainingType containingtype, int i2) {
        return (z.e<ContainingType, ?>) this.a.get(new a(containingtype, i2));
    }
}
