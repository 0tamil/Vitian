package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l1 implements Handler.Callback {
    final /* synthetic */ m1 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l1(m1 m1Var, k1 k1Var) {
        this.a = m1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i2 = message.what;
        if (i2 == 0) {
            hashMap = this.a.f1267f;
            synchronized (hashMap) {
                i1 i1Var = (i1) message.obj;
                hashMap2 = this.a.f1267f;
                j1 j1Var = (j1) hashMap2.get(i1Var);
                if (j1Var != null && j1Var.i()) {
                    if (j1Var.j()) {
                        j1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.a.f1267f;
                    hashMap3.remove(i1Var);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            hashMap4 = this.a.f1267f;
            synchronized (hashMap4) {
                i1 i1Var2 = (i1) message.obj;
                hashMap5 = this.a.f1267f;
                j1 j1Var2 = (j1) hashMap5.get(i1Var2);
                if (j1Var2 != null && j1Var2.a() == 3) {
                    String valueOf = String.valueOf(i1Var2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = j1Var2.b();
                    if (b == null) {
                        b = i1Var2.b();
                    }
                    if (b == null) {
                        String d2 = i1Var2.d();
                        p.i(d2);
                        b = new ComponentName(d2, "unknown");
                    }
                    j1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
