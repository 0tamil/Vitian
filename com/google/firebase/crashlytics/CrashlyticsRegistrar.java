package com.google.firebase.crashlytics;

import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.crashlytics.i.c;
import com.google.firebase.h;
import com.google.firebase.l.a.a;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements r {
    /* JADX INFO: Access modifiers changed from: private */
    public g a(o oVar) {
        return g.e((h) oVar.a(h.class), (com.google.firebase.installations.h) oVar.a(com.google.firebase.installations.h.class), oVar.e(c.class), oVar.e(a.class));
    }

    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        n.b a = n.a(g.class);
        a.b(u.j(h.class));
        a.b(u.j(com.google.firebase.installations.h.class));
        a.b(u.a(c.class));
        a.b(u.a(a.class));
        a.f(new q() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                g a2;
                a2 = CrashlyticsRegistrar.this.a(oVar);
                return a2;
            }
        });
        a.e();
        return Arrays.asList(a.d(), com.google.firebase.s.h.a("fire-cls", "18.2.10"));
    }
}
