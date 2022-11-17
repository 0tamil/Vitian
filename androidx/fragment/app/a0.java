package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 implements c, t {

    /* renamed from: e  reason: collision with root package name */
    private final s f691e;

    /* renamed from: f  reason: collision with root package name */
    private h f692f = null;

    /* renamed from: g  reason: collision with root package name */
    private b f693g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Fragment fragment, s sVar) {
        this.f691e = sVar;
    }

    @Override // androidx.lifecycle.g
    public d a() {
        c();
        return this.f692f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d.b bVar) {
        this.f692f.h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f692f == null) {
            this.f692f = new h(this);
            this.f693g = b.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f692f != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f693g.c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Bundle bundle) {
        this.f693g.d(bundle);
    }

    @Override // androidx.lifecycle.t
    public s g() {
        c();
        return this.f691e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d.c cVar) {
        this.f692f.o(cVar);
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry j() {
        c();
        return this.f693g.b();
    }
}
