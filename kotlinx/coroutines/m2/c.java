package kotlinx.coroutines.m2;

import j.u.g;
import j.x.d.e;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
/* loaded from: classes.dex */
public class c extends e1 {

    /* renamed from: f  reason: collision with root package name */
    private final int f3887f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3888g;

    /* renamed from: h  reason: collision with root package name */
    private final long f3889h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3890i;

    /* renamed from: j  reason: collision with root package name */
    private a f3891j;

    public c(int i2, int i3, long j2, String str) {
        this.f3887f = i2;
        this.f3888g = i3;
        this.f3889h = j2;
        this.f3890i = str;
        this.f3891j = y();
    }

    public c(int i2, int i3, String str) {
        this(i2, i3, l.f3903d, str);
    }

    public /* synthetic */ c(int i2, int i3, String str, int i4, e eVar) {
        this((i4 & 1) != 0 ? l.b : i2, (i4 & 2) != 0 ? l.c : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a y() {
        return new a(this.f3887f, this.f3888g, this.f3889h, this.f3890i);
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        try {
            a.i(this.f3891j, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            q0.f3915k.w(gVar, runnable);
        }
    }

    public final void z(Runnable runnable, j jVar, boolean z) {
        try {
            this.f3891j.h(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            q0.f3915k.O(this.f3891j.d(runnable, jVar));
        }
    }
}
