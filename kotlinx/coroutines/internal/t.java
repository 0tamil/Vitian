package kotlinx.coroutines.internal;

import j.u.g;
import j.x.d.i;
import kotlinx.coroutines.x1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends x1 {

    /* renamed from: f  reason: collision with root package name */
    private final Throwable f3813f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3814g;

    public t(Throwable th, String str) {
        this.f3813f = th;
        this.f3814g = str;
    }

    private final Void B() {
        String i2;
        if (this.f3813f != null) {
            String str = this.f3814g;
            String str2 = "";
            if (!(str == null || (i2 = i.i(". ", str)) == null)) {
                str2 = i2;
            }
            throw new IllegalStateException(i.i("Module with the Main dispatcher had failed to initialize", str2), this.f3813f);
        }
        s.c();
        throw null;
    }

    public Void A(g gVar, Runnable runnable) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.x1, kotlinx.coroutines.f0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f3813f;
        sb.append(th != null ? i.i(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.f0
    public /* bridge */ /* synthetic */ void w(g gVar, Runnable runnable) {
        A(gVar, runnable);
        throw null;
    }

    @Override // kotlinx.coroutines.f0
    public boolean x(g gVar) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.x1
    public x1 y() {
        return this;
    }
}
