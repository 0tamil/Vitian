package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;
/* loaded from: classes.dex */
final class c3 implements o1 {
    final /* synthetic */ t a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c3(t tVar, b3 b3Var) {
        this.a = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void a(Bundle bundle) {
        t.q(this.a).lock();
        try {
            t.v(this.a, bundle);
            t.r(this.a, a.f1038i);
            t.w(this.a);
        } finally {
            t.q(this.a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void b(int i2, boolean z) {
        t.q(this.a).lock();
        try {
            t tVar = this.a;
            if (!t.x(tVar) && t.m(tVar) != null && t.m(tVar).f()) {
                t.t(this.a, true);
                t.p(this.a).b(i2);
            }
            t.t(this.a, false);
            t.u(this.a, i2, z);
        } finally {
            t.q(this.a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void c(a aVar) {
        t.q(this.a).lock();
        try {
            t.r(this.a, aVar);
            t.w(this.a);
        } finally {
            t.q(this.a).unlock();
        }
    }
}
