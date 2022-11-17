package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
/* loaded from: classes.dex */
public final class b {
    private final c a;
    private final SavedStateRegistry b = new SavedStateRegistry();

    private b(c cVar) {
        this.a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        d a = this.a.a();
        if (a.b() == d.c.INITIALIZED) {
            a.a(new Recreator(this.a));
            this.b.b(a, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
