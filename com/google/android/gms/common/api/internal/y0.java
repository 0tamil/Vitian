package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class y0 implements q1, a3 {
    private final Lock a;
    private final Condition b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final e f1193d;

    /* renamed from: e  reason: collision with root package name */
    private final x0 f1194e;

    /* renamed from: f  reason: collision with root package name */
    final Map<a.c<?>, a.f> f1195f;

    /* renamed from: g  reason: collision with root package name */
    final Map<a.c<?>, com.google.android.gms.common.a> f1196g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final com.google.android.gms.common.internal.e f1197h;

    /* renamed from: i  reason: collision with root package name */
    final Map<a<?>, Boolean> f1198i;

    /* renamed from: j  reason: collision with root package name */
    final a.AbstractC0026a<? extends g, f.b.a.b.e.a> f1199j;
    @NotOnlyInitialized

    /* renamed from: k  reason: collision with root package name */
    private volatile v0 f1200k;
    int l;
    final u0 m;
    final o1 n;

    public y0(Context context, u0 u0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.e eVar2, Map<a<?>, Boolean> map2, a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar, ArrayList<z2> arrayList, o1 o1Var) {
        this.c = context;
        this.a = lock;
        this.f1193d = eVar;
        this.f1195f = map;
        this.f1197h = eVar2;
        this.f1198i = map2;
        this.f1199j = aVar;
        this.m = u0Var;
        this.n = o1Var;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).c(this);
        }
        this.f1194e = new x0(this, looper);
        this.b = lock.newCondition();
        this.f1200k = new q0(this);
    }

    @Override // com.google.android.gms.common.api.internal.a3
    public final void J(com.google.android.gms.common.a aVar, a<?> aVar2, boolean z) {
        this.a.lock();
        try {
            this.f1200k.e(aVar, aVar2, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a() {
        if (this.f1200k.d()) {
            this.f1196g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(int i2) {
        this.a.lock();
        try {
            this.f1200k.f(i2);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final <A extends a.b, R extends j, T extends d<R, A>> T c(T t) {
        t.m();
        this.f1200k.c(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void d(Bundle bundle) {
        this.a.lock();
        try {
            this.f1200k.b(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void e() {
        if (this.f1200k instanceof c0) {
            ((c0) this.f1200k).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f1200k);
        for (a<?> aVar : this.f1198i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            a.f fVar = this.f1195f.get(aVar.b());
            p.i(fVar);
            fVar.l(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final boolean g() {
        return this.f1200k instanceof c0;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void h() {
        this.f1200k.a();
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final <A extends a.b, T extends d<? extends j, A>> T i(T t) {
        t.m();
        return (T) this.f1200k.h(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.a.lock();
        try {
            this.m.v();
            this.f1200k = new c0(this);
            this.f1200k.g();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.a.lock();
        try {
            this.f1200k = new p0(this, this.f1197h, this.f1198i, this.f1193d, this.f1199j, this.a, this.c);
            this.f1200k.g();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(com.google.android.gms.common.a aVar) {
        this.a.lock();
        try {
            this.f1200k = new q0(this);
            this.f1200k.g();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(w0 w0Var) {
        this.f1194e.sendMessage(this.f1194e.obtainMessage(1, w0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(RuntimeException runtimeException) {
        this.f1194e.sendMessage(this.f1194e.obtainMessage(2, runtimeException));
    }
}
