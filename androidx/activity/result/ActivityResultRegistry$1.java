package androidx.activity.result;

import androidx.activity.result.d;
import androidx.activity.result.g.a;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements e {
    final /* synthetic */ String a;
    final /* synthetic */ b b;
    final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f68d;

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (d.b.ON_START.equals(bVar)) {
            this.f68d.f73f.put(this.a, new d.b<>(this.b, this.c));
            if (this.f68d.f74g.containsKey(this.a)) {
                Object obj = this.f68d.f74g.get(this.a);
                this.f68d.f74g.remove(this.a);
                this.b.a(obj);
            }
            a aVar = (a) this.f68d.f75h.getParcelable(this.a);
            if (aVar != null) {
                this.f68d.f75h.remove(this.a);
                this.b.a(this.c.c(aVar.b(), aVar.a()));
            }
        } else if (d.b.ON_STOP.equals(bVar)) {
            this.f68d.f73f.remove(this.a);
        } else if (d.b.ON_DESTROY.equals(bVar)) {
            this.f68d.k(this.a);
        }
    }
}
