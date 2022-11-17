package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.e;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public class h {
    private final Object a;

    public h(Activity activity) {
        p.j(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final e b() {
        return (e) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof e;
    }
}
