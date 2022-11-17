package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;
/* loaded from: classes.dex */
class FragmentManager$6 implements e {
    final /* synthetic */ String a;
    final /* synthetic */ s b;
    final /* synthetic */ d c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f690d;

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        Map map;
        Map map2;
        if (bVar == d.b.ON_START) {
            map2 = this.f690d.f772j;
            Bundle bundle = (Bundle) map2.get(this.a);
            if (bundle != null) {
                this.b.a(this.a, bundle);
                this.f690d.q(this.a);
            }
        }
        if (bVar == d.b.ON_DESTROY) {
            this.c.c(this);
            map = this.f690d.f773k;
            map.remove(this.a);
        }
    }
}
