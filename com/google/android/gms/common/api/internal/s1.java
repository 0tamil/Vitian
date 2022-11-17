package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.b;
import f.b.a.b.g.d;
import f.b.a.b.g.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1<T> implements d<T> {
    private final g a;
    private final int b;
    private final b<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final long f1163d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1164e;

    s1(g gVar, int i2, b<?> bVar, long j2, long j3, String str, String str2) {
        this.a = gVar;
        this.b = i2;
        this.c = bVar;
        this.f1163d = j2;
        this.f1164e = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> s1<T> b(g gVar, int i2, b<?> bVar) {
        boolean z;
        if (!gVar.f()) {
            return null;
        }
        r a = q.b().a();
        if (a == null) {
            z = true;
        } else if (!a.d()) {
            return null;
        } else {
            z = a.e();
            g1 w = gVar.w(bVar);
            if (w != null) {
                if (!(w.v() instanceof c)) {
                    return null;
                }
                c cVar = (c) w.v();
                if (cVar.N() && !cVar.c()) {
                    f c = c(w, cVar, i2);
                    if (c == null) {
                        return null;
                    }
                    w.G();
                    z = c.f();
                }
            }
        }
        return new s1<>(gVar, i2, bVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static f c(g1<?> g1Var, c<?> cVar, int i2) {
        int[] c;
        int[] d2;
        f L = cVar.L();
        if (L == null || !L.e() || ((c = L.c()) != null ? !b.a(c, i2) : !((d2 = L.d()) == null || !b.a(d2, i2))) || g1Var.s() >= L.b()) {
            return null;
        }
        return L;
    }

    @Override // f.b.a.b.g.d
    public final void a(i<T> iVar) {
        g1 w;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        long j3;
        if (this.a.f()) {
            r a = q.b().a();
            if ((a == null || a.d()) && (w = this.a.w(this.c)) != null && (w.v() instanceof c)) {
                c cVar = (c) w.v();
                boolean z = true;
                boolean z2 = this.f1163d > 0;
                int D = cVar.D();
                if (a != null) {
                    z2 &= a.e();
                    i3 = a.b();
                    int c = a.c();
                    i4 = a.f();
                    if (cVar.N() && !cVar.c()) {
                        f c2 = c(w, cVar, this.b);
                        if (c2 != null) {
                            if (!c2.f() || this.f1163d <= 0) {
                                z = false;
                            }
                            c = c2.b();
                            z2 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = c;
                } else {
                    i4 = 0;
                    i3 = 5000;
                    i2 = 100;
                }
                g gVar = this.a;
                if (iVar.n()) {
                    i6 = 0;
                    i5 = 0;
                } else {
                    if (iVar.l()) {
                        i6 = 100;
                    } else {
                        Exception i8 = iVar.i();
                        if (i8 instanceof com.google.android.gms.common.api.b) {
                            Status a2 = ((com.google.android.gms.common.api.b) i8).a();
                            i6 = a2.c();
                            a b = a2.b();
                            i5 = b == null ? -1 : b.b();
                        } else {
                            i6 = 101;
                        }
                    }
                    i5 = -1;
                }
                if (z2) {
                    j3 = this.f1163d;
                    j2 = System.currentTimeMillis();
                    i7 = (int) (SystemClock.elapsedRealtime() - this.f1164e);
                } else {
                    j3 = 0;
                    j2 = 0;
                    i7 = -1;
                }
                gVar.F(new n(this.b, i6, i5, j3, j2, null, null, D, i7), i4, i3, i2);
            }
        }
    }
}
