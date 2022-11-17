package com.google.firebase.s;

import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public class d implements i {
    private final String a;
    private final e b;

    d(Set<g> set, e eVar) {
        this.a = d(set);
        this.b = eVar;
    }

    public static n<i> b() {
        n.b a = n.a(i.class);
        a.b(u.l(g.class));
        a.f(a.a);
        return a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ i c(o oVar) {
        return new d(oVar.c(g.class), e.a());
    }

    private static String d(Set<g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<g> it = set.iterator();
        while (it.hasNext()) {
            g next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.s.i
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
