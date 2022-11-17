package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.p;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class k {
    private final Set<j<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> j<L> a(L l, Looper looper, String str) {
        p.j(l, "Listener must not be null");
        p.j(looper, "Looper must not be null");
        p.j(str, "Listener type must not be null");
        return new j<>(looper, l, str);
    }

    public static <L> j.a<L> b(L l, String str) {
        p.j(l, "Listener must not be null");
        p.j(str, "Listener type must not be null");
        p.f(str, "Listener type must not be empty");
        return new j.a<>(l, str);
    }

    public final void c() {
        for (j<?> jVar : this.a) {
            jVar.a();
        }
        this.a.clear();
    }
}
