package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.c;
/* loaded from: classes.dex */
public final class c1 extends s0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f1218g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f1219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c cVar, int i2, IBinder iBinder, Bundle bundle) {
        super(cVar, i2, bundle);
        this.f1219h = cVar;
        this.f1218g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.s0
    protected final void f(a aVar) {
        if (this.f1219h.t != null) {
            this.f1219h.t.a(aVar);
        }
        this.f1219h.P(aVar);
    }

    @Override // com.google.android.gms.common.internal.s0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f1218g;
            p.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f1219h.I().equals(interfaceDescriptor)) {
            String I = this.f1219h.I();
            StringBuilder sb = new StringBuilder(String.valueOf(I).length() + 34 + String.valueOf(interfaceDescriptor).length());
            sb.append("service descriptor mismatch: ");
            sb.append(I);
            sb.append(" vs. ");
            sb.append(interfaceDescriptor);
            str = sb.toString();
            Log.w("GmsClient", str);
            return false;
        }
        IInterface w = this.f1219h.w(this.f1218g);
        if (w == null || (!c.j0(this.f1219h, 2, 4, w) && !c.j0(this.f1219h, 3, 4, w))) {
            return false;
        }
        this.f1219h.x = null;
        Bundle B = this.f1219h.B();
        c cVar = this.f1219h;
        aVar = cVar.s;
        if (aVar == null) {
            return true;
        }
        aVar2 = cVar.s;
        aVar2.d(B);
        return true;
    }
}
