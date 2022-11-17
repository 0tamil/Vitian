package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.w;
import e.c.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class i3 extends Fragment implements i {
    private static final WeakHashMap<e, WeakReference<i3>> f0 = new WeakHashMap<>();
    private final Map<String, LifecycleCallback> c0 = Collections.synchronizedMap(new a());
    private int d0 = 0;
    private Bundle e0;

    public static i3 A1(e eVar) {
        i3 i3Var;
        WeakHashMap<e, WeakReference<i3>> weakHashMap = f0;
        WeakReference<i3> weakReference = weakHashMap.get(eVar);
        if (weakReference != null && (i3Var = weakReference.get()) != null) {
            return i3Var;
        }
        try {
            i3 i3Var2 = (i3) eVar.s().h0("SupportLifecycleFragmentImpl");
            if (i3Var2 == null || i3Var2.c0()) {
                i3Var2 = new i3();
                w l = eVar.s().l();
                l.d(i3Var2, "SupportLifecycleFragmentImpl");
                l.g();
            }
            weakHashMap.put(eVar, new WeakReference<>(i3Var2));
            return i3Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void E0(Bundle bundle) {
        super.E0(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.c0.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().i(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.c0.containsKey(str)) {
            this.c0.put(str, lifecycleCallback);
            if (this.d0 > 0) {
                new f.b.a.b.d.c.e(Looper.getMainLooper()).post(new h3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.c0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final /* synthetic */ Activity d() {
        return m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0(int i2, int i3, Intent intent) {
        super.h0(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.e(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d0 = 1;
        this.e0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.c0.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.d0 = 5;
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.d0 = 3;
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.d0 = 2;
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.d0 = 4;
        for (LifecycleCallback lifecycleCallback : this.c0.values()) {
            lifecycleCallback.k();
        }
    }
}
