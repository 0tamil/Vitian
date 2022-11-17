package com.google.android.gms.common.internal;
/* loaded from: classes.dex */
public final class q {
    private static q b;
    private static final r c = new r(0, false, false, 0, 0);
    private r a;

    private q() {
    }

    public static synchronized q b() {
        q qVar;
        synchronized (q.class) {
            if (b == null) {
                b = new q();
            }
            qVar = b;
        }
        return qVar;
    }

    public r a() {
        return this.a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.a = c;
            return;
        }
        r rVar2 = this.a;
        if (rVar2 == null || rVar2.f() < rVar.f()) {
            this.a = rVar;
        }
    }
}
