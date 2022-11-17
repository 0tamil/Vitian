package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.j;
/* loaded from: classes.dex */
public abstract class l<R extends j> implements k<R> {
    @Override // com.google.android.gms.common.api.k
    public final void a(R r) {
        Status a = r.a();
        if (a.f()) {
            c(r);
            return;
        }
        b(a);
        if (r instanceof h) {
            try {
                ((h) r).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(r);
                String.valueOf(valueOf).length();
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(valueOf)), e2);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r);
}
