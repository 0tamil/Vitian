package kotlinx.coroutines;

import j.r;
import j.u.d;
import j.u.g;
import j.u.i.c;
import j.x.c.p;
import kotlinx.coroutines.l2.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w1 extends c2 {

    /* renamed from: g  reason: collision with root package name */
    private final d<r> f3937g;

    public w1(g gVar, p<? super k0, ? super d<? super r>, ? extends Object> pVar) {
        super(gVar, false);
        d<r> a;
        a = c.a(pVar, this, this);
        this.f3937g = a;
    }

    @Override // kotlinx.coroutines.u1
    protected void d0() {
        a.c(this.f3937g, this);
    }
}
