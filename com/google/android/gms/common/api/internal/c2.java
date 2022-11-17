package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q0;
import f.b.a.b.e.b.d;
import f.b.a.b.e.b.l;
import f.b.a.b.e.g;
import java.util.Set;
/* loaded from: classes.dex */
public final class c2 extends d implements f.b, f.c {

    /* renamed from: h  reason: collision with root package name */
    private static final a.AbstractC0026a<? extends g, f.b.a.b.e.a> f1088h = f.b.a.b.e.f.c;
    private final Context a;
    private final Handler b;
    private final a.AbstractC0026a<? extends g, f.b.a.b.e.a> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f1089d;

    /* renamed from: e  reason: collision with root package name */
    private final e f1090e;

    /* renamed from: f  reason: collision with root package name */
    private g f1091f;

    /* renamed from: g  reason: collision with root package name */
    private b2 f1092g;

    public c2(Context context, Handler handler, e eVar) {
        a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar = f1088h;
        this.a = context;
        this.b = handler;
        p.j(eVar, "ClientSettings must not be null");
        this.f1090e = eVar;
        this.f1089d = eVar.e();
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void T(c2 c2Var, l lVar) {
        com.google.android.gms.common.a b = lVar.b();
        if (b.f()) {
            q0 c = lVar.c();
            p.i(c);
            q0 q0Var = c;
            b = q0Var.b();
            if (!b.f()) {
                String valueOf = String.valueOf(b);
                String.valueOf(valueOf).length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
            } else {
                c2Var.f1092g.b(q0Var.c(), c2Var.f1089d);
                c2Var.f1091f.n();
            }
        }
        c2Var.f1092g.c(b);
        c2Var.f1091f.n();
    }

    @Override // f.b.a.b.e.b.f
    public final void F(l lVar) {
        this.b.post(new a2(this, lVar));
    }

    public final void U(b2 b2Var) {
        g gVar = this.f1091f;
        if (gVar != null) {
            gVar.n();
        }
        this.f1090e.j(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        e eVar = this.f1090e;
        this.f1091f = aVar.c(context, looper, eVar, eVar.f(), this, this);
        this.f1092g = b2Var;
        Set<Scope> set = this.f1089d;
        if (set == null || set.isEmpty()) {
            this.b.post(new z1(this));
        } else {
            this.f1091f.r();
        }
    }

    public final void V() {
        g gVar = this.f1091f;
        if (gVar != null) {
            gVar.n();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(com.google.android.gms.common.a aVar) {
        this.f1092g.c(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(int i2) {
        this.f1091f.n();
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void d(Bundle bundle) {
        this.f1091f.t(this);
    }
}
