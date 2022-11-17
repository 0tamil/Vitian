package f.b.a.b.e.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
/* loaded from: classes.dex */
public class a extends h<g> implements g {
    public static final /* synthetic */ int I = 0;
    private final boolean E = true;
    private final e F;
    private final Bundle G;
    private final Integer H;

    public a(Context context, Looper looper, boolean z, e eVar, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.F = eVar;
        this.G = bundle;
        this.H = eVar.g();
    }

    public static Bundle o0(e eVar) {
        eVar.f();
        Integer g2 = eVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (g2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g2.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle E() {
        if (!C().getPackageName().equals(this.F.d())) {
            this.G.putString("com.google.android.gms.signin.internal.realClientPackageName", this.F.d());
        }
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String I() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // f.b.a.b.e.g
    public final void f(j jVar, boolean z) {
        try {
            Integer num = this.H;
            p.i(num);
            ((g) H()).R(jVar, num.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // f.b.a.b.e.g
    public final void h() {
        try {
            Integer num = this.H;
            p.i(num);
            ((g) H()).J(num.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean q() {
        return this.E;
    }

    @Override // f.b.a.b.e.g
    public final void r() {
        m(new c.d());
    }

    @Override // f.b.a.b.e.g
    public final void t(f fVar) {
        p.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.F.b();
            GoogleSignInAccount b2 = "<<default account>>".equals(b.name) ? com.google.android.gms.auth.api.signin.a.a.a(C()).b() : null;
            Integer num = this.H;
            p.i(num);
            ((g) H()).S(new j(1, new o0(b, num.intValue(), b2)), fVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.F(new l(1, new com.google.android.gms.common.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int u() {
        return com.google.android.gms.common.g.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
