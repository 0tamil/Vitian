package h.a.d.a;

import h.a.d.a.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class k {
    private final h.a.d.a.d a;
    private final String b;
    private final l c;

    /* renamed from: d  reason: collision with root package name */
    private final d.c f2885d;

    /* loaded from: classes.dex */
    private final class a implements d.a {
        private final c a;

        /* renamed from: h.a.d.a.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0121a implements d {
            final /* synthetic */ d.b a;

            C0121a(d.b bVar) {
                this.a = bVar;
            }

            @Override // h.a.d.a.k.d
            public void a(String str, String str2, Object obj) {
                this.a.a(k.this.c.f(str, str2, obj));
            }

            @Override // h.a.d.a.k.d
            public void b(Object obj) {
                this.a.a(k.this.c.a(obj));
            }

            @Override // h.a.d.a.k.d
            public void c() {
                this.a.a(null);
            }
        }

        a(c cVar) {
            this.a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // h.a.d.a.d.a
        public void a(ByteBuffer byteBuffer, d.b bVar) {
            try {
                this.a.onMethodCall(k.this.c.b(byteBuffer), new C0121a(bVar));
            } catch (RuntimeException e2) {
                h.a.b.c("MethodChannel#" + k.this.b, "Failed to handle method call", e2);
                bVar.a(k.this.c.d("error", e2.getMessage(), null, b(e2)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements d.b {
        private final d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // h.a.d.a.d.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.a.c();
                } else {
                    try {
                        this.a.b(k.this.c.c(byteBuffer));
                    } catch (e e2) {
                        this.a.a(e2.f2883e, e2.getMessage(), e2.f2884f);
                    }
                }
            } catch (RuntimeException e3) {
                h.a.b.c("MethodChannel#" + k.this.b, "Failed to handle method call result", e3);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(String str, String str2, Object obj);

        void b(Object obj);

        void c();
    }

    public k(h.a.d.a.d dVar, String str) {
        this(dVar, str, t.b);
    }

    public k(h.a.d.a.d dVar, String str, l lVar) {
        this(dVar, str, lVar, null);
    }

    public k(h.a.d.a.d dVar, String str, l lVar, d.c cVar) {
        this.a = dVar;
        this.b = str;
        this.c = lVar;
        this.f2885d = cVar;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.a.b(this.b, this.c.e(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        d.c cVar2 = this.f2885d;
        a aVar = null;
        if (cVar2 != null) {
            h.a.d.a.d dVar = this.a;
            String str = this.b;
            if (cVar != null) {
                aVar = new a(cVar);
            }
            dVar.g(str, aVar, cVar2);
            return;
        }
        h.a.d.a.d dVar2 = this.a;
        String str2 = this.b;
        if (cVar != null) {
            aVar = new a(cVar);
        }
        dVar2.d(str2, aVar);
    }
}
