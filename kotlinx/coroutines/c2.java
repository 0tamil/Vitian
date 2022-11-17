package kotlinx.coroutines;

import j.r;
import j.u.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c2 extends c<r> {
    public c2(g gVar, boolean z) {
        super(gVar, true, z);
    }

    @Override // kotlinx.coroutines.u1
    protected boolean P(Throwable th) {
        h0.a(getContext(), th);
        return true;
    }
}
