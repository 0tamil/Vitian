package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.p;
import f.b.a.b.g.j;
/* loaded from: classes.dex */
public abstract class r<A extends a.b, ResultT> {
    private final c[] a;
    private final boolean b;
    private final int c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {
        private o<A, j<ResultT>> a;
        private c[] c;
        private boolean b = true;

        /* renamed from: d  reason: collision with root package name */
        private int f1158d = 0;

        /* synthetic */ a(e2 e2Var) {
        }

        public r<A, ResultT> a() {
            p.b(this.a != null, "execute parameter required");
            return new d2(this, this.c, this.b, this.f1158d);
        }

        public a<A, ResultT> b(o<A, j<ResultT>> oVar) {
            this.a = oVar;
            return this;
        }

        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        public a<A, ResultT> d(c... cVarArr) {
            this.c = cVarArr;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(c[] cVarArr, boolean z, int i2) {
        this.a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i2;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a2, j<ResultT> jVar);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final c[] e() {
        return this.a;
    }
}
