package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class z0<TListener> {
    private TListener a;
    private boolean b = false;
    final /* synthetic */ c c;

    public z0(c cVar, TListener tlistener) {
        this.c = cVar;
        this.a = tlistener;
    }

    protected abstract void a(TListener tlistener);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.p;
        synchronized (arrayList) {
            arrayList2 = this.c.p;
            arrayList2.remove(this);
        }
    }
}
