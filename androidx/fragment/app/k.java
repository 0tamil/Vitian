package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.a;
import e.d.o.d;
/* loaded from: classes.dex */
public abstract class k<E> extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Activity f759e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f760f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f761g;

    /* renamed from: h  reason: collision with root package name */
    final n f762h;

    k(Activity activity, Context context, Handler handler, int i2) {
        this.f762h = new o();
        this.f759e = activity;
        d.e(context, "context == null");
        this.f760f = context;
        d.e(handler, "handler == null");
        this.f761g = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View e(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity h() {
        return this.f759e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.f760f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler l() {
        return this.f761g;
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f760f);
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            a.l(this.f760f, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q() {
    }
}
