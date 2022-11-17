package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.h;
import com.google.firebase.p.i;
import com.google.firebase.p.j;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ h a(o oVar) {
        return new g((h) oVar.a(h.class), oVar.b(j.class));
    }

    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        n.b a = n.a(h.class);
        a.b(u.j(h.class));
        a.b(u.i(j.class));
        a.f(d.a);
        return Arrays.asList(a.d(), i.a(), com.google.firebase.s.h.a("fire-installations", "17.0.1"));
    }
}
