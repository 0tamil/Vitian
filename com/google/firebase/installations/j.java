package com.google.firebase.installations;

import com.google.firebase.installations.l;
import com.google.firebase.installations.q.d;
/* loaded from: classes.dex */
class j implements n {
    private final o a;
    private final f.b.a.b.g.j<l> b;

    public j(o oVar, f.b.a.b.g.j<l> jVar) {
        this.a = oVar;
        this.b = jVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(d dVar) {
        if (!dVar.k() || this.a.f(dVar)) {
            return false;
        }
        f.b.a.b.g.j<l> jVar = this.b;
        l.a a = l.a();
        a.b(dVar.b());
        a.d(dVar.c());
        a.c(dVar.h());
        jVar.c(a.a());
        return true;
    }
}
