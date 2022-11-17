package h.a.d.a;

import h.a.d.a.d;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class b<T> {
    private final h.a.d.a.d a;
    private final String b;
    private final i<T> c;

    /* renamed from: d  reason: collision with root package name */
    private final d.c f2882d;

    /* renamed from: h.a.d.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private final class C0119b implements d.a {
        private final d<T> a;

        /* renamed from: h.a.d.a.b$b$a */
        /* loaded from: classes.dex */
        class a implements e<T> {
            final /* synthetic */ d.b a;

            a(d.b bVar) {
                this.a = bVar;
            }

            @Override // h.a.d.a.b.e
            public void a(T t) {
                this.a.a(b.this.c.b(t));
            }
        }

        private C0119b(d<T> dVar) {
            this.a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.a.d.a.d.a
        public void a(ByteBuffer byteBuffer, d.b bVar) {
            try {
                this.a.a(b.this.c.a(byteBuffer), new a(bVar));
            } catch (RuntimeException e2) {
                h.a.b.c("BasicMessageChannel#" + b.this.b, "Failed to handle message", e2);
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements d.b {
        private final e<T> a;

        private c(e<T> eVar) {
            this.a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.a.d.a.d.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.a.a(b.this.c.a(byteBuffer));
            } catch (RuntimeException e2) {
                h.a.b.c("BasicMessageChannel#" + b.this.b, "Failed to handle message reply", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t, e<T> eVar);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public b(h.a.d.a.d dVar, String str, i<T> iVar) {
        this(dVar, str, iVar, null);
    }

    public b(h.a.d.a.d dVar, String str, i<T> iVar, d.c cVar) {
        this.a = dVar;
        this.b = str;
        this.c = iVar;
        this.f2882d = cVar;
    }

    public void c(T t) {
        d(t, null);
    }

    public void d(T t, e<T> eVar) {
        h.a.d.a.d dVar = this.a;
        String str = this.b;
        ByteBuffer b = this.c.b(t);
        c cVar = null;
        if (eVar != null) {
            cVar = new c(eVar);
        }
        dVar.b(str, b, cVar);
    }

    public void e(d<T> dVar) {
        d.c cVar = this.f2882d;
        C0119b bVar = null;
        if (cVar != null) {
            h.a.d.a.d dVar2 = this.a;
            String str = this.b;
            if (dVar != null) {
                bVar = new C0119b(dVar);
            }
            dVar2.g(str, bVar, cVar);
            return;
        }
        h.a.d.a.d dVar3 = this.a;
        String str2 = this.b;
        if (dVar != null) {
            bVar = new C0119b(dVar);
        }
        dVar3.d(str2, bVar);
    }
}
