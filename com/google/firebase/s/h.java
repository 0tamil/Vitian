package com.google.firebase.s;

import android.content.Context;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.u;
/* loaded from: classes.dex */
public class h {

    /* loaded from: classes.dex */
    public interface a<T> {
        String a(T t);
    }

    public static n<?> a(String str, String str2) {
        return n.g(g.a(str, str2), g.class);
    }

    public static n<?> b(final String str, final a<Context> aVar) {
        n.b h2 = n.h(g.class);
        h2.b(u.j(Context.class));
        h2.f(new q() { // from class: com.google.firebase.s.b
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                g a2;
                a2 = g.a(str, aVar.a((Context) oVar.a(Context.class)));
                return a2;
            }
        });
        return h2.d();
    }
}
