package f.e.a.f;

import h.a.d.a.j;
import h.a.d.a.k;
/* loaded from: classes.dex */
public class e extends f.e.a.f.a {
    final j a;
    final a b;

    /* loaded from: classes.dex */
    class a implements g {
        final k.d a;

        a(e eVar, k.d dVar) {
            this.a = dVar;
        }

        @Override // f.e.a.f.g
        public void a(String str, String str2, Object obj) {
            this.a.a(str, str2, obj);
        }

        @Override // f.e.a.f.g
        public void b(Object obj) {
            this.a.b(obj);
        }
    }

    public e(j jVar, k.d dVar) {
        this.a = jVar;
        this.b = new a(this, dVar);
    }

    @Override // f.e.a.f.f
    public <T> T c(String str) {
        return (T) this.a.a(str);
    }

    @Override // f.e.a.f.a
    public g k() {
        return this.b;
    }
}
