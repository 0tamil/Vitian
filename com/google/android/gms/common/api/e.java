package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.c2;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.j;
import f.b.a.b.g.i;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
/* loaded from: classes.dex */
public abstract class e<O extends a.d> {
    private final Context a;
    private final String b;
    private final com.google.android.gms.common.api.a<O> c;

    /* renamed from: d  reason: collision with root package name */
    private final O f1055d;

    /* renamed from: e  reason: collision with root package name */
    private final b<O> f1056e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f1057f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1058g;

    /* renamed from: h  reason: collision with root package name */
    private final q f1059h;

    /* renamed from: i  reason: collision with root package name */
    protected final g f1060i;

    /* loaded from: classes.dex */
    public static class a {
        public static final a c = new C0028a().a();
        public final q a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0028a {
            private q a;
            private Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        private a(q qVar, Account account, Looper looper) {
            this.a = qVar;
            this.b = looper;
        }
    }

    private e(Context context, Activity activity, com.google.android.gms.common.api.a<O> aVar, O o, a aVar2) {
        p.j(context, "Null context is not permitted.");
        p.j(aVar, "Api must not be null.");
        p.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (j.j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = aVar;
        this.f1055d = o;
        this.f1057f = aVar2.b;
        b<O> a2 = b.a(aVar, o, str);
        this.f1056e = a2;
        g x = g.x(this.a);
        this.f1060i = x;
        this.f1058g = x.m();
        this.f1059h = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            x.u(activity, x, a2);
        }
        x.b(this);
    }

    public e(Context context, com.google.android.gms.common.api.a<O> aVar, O o, a aVar2) {
        this(context, null, aVar, o, aVar2);
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T m(int i2, T t) {
        t.m();
        this.f1060i.D(this, i2, t);
        return t;
    }

    private final <TResult, A extends a.b> i<TResult> n(int i2, r<A, TResult> rVar) {
        f.b.a.b.g.j jVar = new f.b.a.b.g.j();
        this.f1060i.E(this, i2, rVar, jVar, this.f1059h);
        return jVar.a();
    }

    protected e.a b() {
        Account account;
        GoogleSignInAccount b;
        GoogleSignInAccount b2;
        e.a aVar = new e.a();
        O o = this.f1055d;
        if (!(o instanceof a.d.b) || (b2 = ((a.d.b) o).b()) == null) {
            O o2 = this.f1055d;
            account = o2 instanceof a.d.AbstractC0027a ? ((a.d.AbstractC0027a) o2).a() : null;
        } else {
            account = b2.b();
        }
        aVar.d(account);
        O o3 = this.f1055d;
        aVar.c((!(o3 instanceof a.d.b) || (b = ((a.d.b) o3).b()) == null) ? Collections.emptySet() : b.j());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> i<TResult> c(r<A, TResult> rVar) {
        return n(2, rVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T d(T t) {
        m(0, t);
        return t;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T e(T t) {
        m(1, t);
        return t;
    }

    public final b<O> f() {
        return this.f1056e;
    }

    public Context g() {
        return this.a;
    }

    protected String h() {
        return this.b;
    }

    public Looper i() {
        return this.f1057f;
    }

    public final int j() {
        return this.f1058g;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.a$f] */
    public final a.f k(Looper looper, g1<O> g1Var) {
        com.google.android.gms.common.internal.e a2 = b().a();
        a.AbstractC0026a<?, O> a3 = this.c.a();
        p.i(a3);
        ?? c = a3.c(this.a, looper, a2, this.f1055d, g1Var, g1Var);
        String h2 = h();
        if (h2 != null && (c instanceof c)) {
            ((c) c).T(h2);
        }
        if (h2 != null && (c instanceof l)) {
            ((l) c).w(h2);
        }
        return c;
    }

    public final c2 l(Context context, Handler handler) {
        return new c2(context, handler, b().a());
    }
}
