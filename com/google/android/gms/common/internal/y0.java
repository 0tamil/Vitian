package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.c;
import f.b.a.b.d.c.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y0 extends e {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c cVar, Looper looper) {
        super(looper);
        this.a = cVar;
    }

    private static final void a(Message message) {
        z0 z0Var = (z0) message.obj;
        z0Var.b();
        z0Var.e();
    }

    private static final boolean b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        a aVar3;
        a aVar4;
        boolean z;
        if (this.a.A.get() == message.arg1) {
            int i2 = message.what;
            if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.a.x()) || message.what == 5)) && !this.a.c()) {
                a(message);
                return;
            }
            int i3 = message.what;
            PendingIntent pendingIntent = null;
            if (i3 == 4) {
                this.a.x = new a(message.arg2);
                if (c.k0(this.a)) {
                    c cVar = this.a;
                    z = cVar.y;
                    if (!z) {
                        cVar.l0(3, null);
                        return;
                    }
                }
                c cVar2 = this.a;
                aVar4 = cVar2.x;
                a aVar5 = aVar4 != null ? cVar2.x : new a(8);
                this.a.n.a(aVar5);
                this.a.P(aVar5);
            } else if (i3 == 5) {
                c cVar3 = this.a;
                aVar3 = cVar3.x;
                a aVar6 = aVar3 != null ? cVar3.x : new a(8);
                this.a.n.a(aVar6);
                this.a.P(aVar6);
            } else if (i3 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                a aVar7 = new a(message.arg2, pendingIntent);
                this.a.n.a(aVar7);
                this.a.P(aVar7);
            } else if (i3 == 6) {
                this.a.l0(5, null);
                c cVar4 = this.a;
                aVar = cVar4.s;
                if (aVar != null) {
                    aVar2 = cVar4.s;
                    aVar2.b(message.arg2);
                }
                this.a.Q(message.arg2);
                c.j0(this.a, 5, 1, null);
            } else if (i3 == 2 && !this.a.a()) {
                a(message);
            } else if (b(message)) {
                ((z0) message.obj).c();
            } else {
                int i4 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i4);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        } else if (b(message)) {
            a(message);
        }
    }
}
