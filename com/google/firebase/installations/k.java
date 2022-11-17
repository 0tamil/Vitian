package com.google.firebase.installations;

import com.google.firebase.installations.q.d;
import f.b.a.b.g.j;
/* loaded from: classes.dex */
class k implements n {
    final j<String> a;

    public k(j<String> jVar) {
        this.a = jVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}
