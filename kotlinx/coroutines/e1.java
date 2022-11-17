package kotlinx.coroutines;

import j.u.b;
import j.u.g;
import j.x.c.l;
import j.x.d.e;
import j.x.d.j;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class e1 extends f0 implements Closeable {

    /* loaded from: classes.dex */
    public static final class a extends b<f0, e1> {

        /* renamed from: kotlinx.coroutines.e1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0151a extends j implements l<g.b, e1> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0151a f3774e = new C0151a();

            C0151a() {
                super(1);
            }

            /* renamed from: a */
            public final e1 invoke(g.b bVar) {
                if (bVar instanceof e1) {
                    return (e1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(f0.f3776e, C0151a.f3774e);
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    static {
        new a(null);
    }
}
