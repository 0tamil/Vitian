package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.u;
import com.google.firebase.s.h;
import f.b.a.a.g;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements r {
    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        n.b a = n.a(g.class);
        a.b(u.j(Context.class));
        a.f(a.a);
        return Arrays.asList(a.d(), h.a("fire-transport", "18.1.3"));
    }
}
