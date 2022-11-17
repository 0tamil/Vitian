package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.h;
import com.google.firebase.iid.a.a;
import com.google.firebase.o.d;
import com.google.firebase.p.k;
import com.google.firebase.s.i;
import f.b.a.a.g;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseMessaging a(o oVar) {
        return new FirebaseMessaging((h) oVar.a(h.class), (a) oVar.a(a.class), oVar.b(i.class), oVar.b(k.class), (com.google.firebase.installations.h) oVar.a(com.google.firebase.installations.h.class), (g) oVar.a(g.class), (d) oVar.a(d.class));
    }

    @Override // com.google.firebase.components.r
    @Keep
    public List<n<?>> getComponents() {
        n.b a = n.a(FirebaseMessaging.class);
        a.b(u.j(h.class));
        a.b(u.h(a.class));
        a.b(u.i(i.class));
        a.b(u.i(k.class));
        a.b(u.h(g.class));
        a.b(u.j(com.google.firebase.installations.h.class));
        a.b(u.j(d.class));
        a.f(u.a);
        a.c();
        return Arrays.asList(a.d(), com.google.firebase.s.h.a("fire-fcm", "23.0.4"));
    }
}
