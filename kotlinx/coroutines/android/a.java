package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import j.r;
import j.u.g;
import j.x.d.e;
import j.x.d.i;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.v0;
/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f3769f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3770g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3771h;

    /* renamed from: i  reason: collision with root package name */
    private final a f3772i;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ a(Handler handler, String str, int i2, e eVar) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a(Handler handler, String str, boolean z) {
        super(null);
        a aVar = null;
        this.f3769f = handler;
        this.f3770g = str;
        this.f3771h = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
            r rVar = r.a;
        }
        this.f3772i = aVar2;
    }

    private final void A(g gVar, Runnable runnable) {
        r1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        v0.b().w(gVar, runnable);
    }

    /* renamed from: B */
    public a y() {
        return this.f3772i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f3769f == this.f3769f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f3769f);
    }

    @Override // kotlinx.coroutines.x1, kotlinx.coroutines.f0
    public String toString() {
        String z = z();
        if (z != null) {
            return z;
        }
        String str = this.f3770g;
        if (str == null) {
            str = this.f3769f.toString();
        }
        return this.f3771h ? i.i(str, ".immediate") : str;
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        if (!this.f3769f.post(runnable)) {
            A(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.f0
    public boolean x(g gVar) {
        return !this.f3771h || !i.a(Looper.myLooper(), this.f3769f.getLooper());
    }
}
