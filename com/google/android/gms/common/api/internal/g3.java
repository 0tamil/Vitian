package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import e.c.a;
import f.b.a.b.d.c.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class g3 extends Fragment implements i {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap<Activity, WeakReference<g3>> f1119h = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, LifecycleCallback> f1120e = Collections.synchronizedMap(new a());

    /* renamed from: f  reason: collision with root package name */
    private int f1121f = 0;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f1122g;

    public static g3 f(Activity activity) {
        g3 g3Var;
        WeakHashMap<Activity, WeakReference<g3>> weakHashMap = f1119h;
        WeakReference<g3> weakReference = weakHashMap.get(activity);
        if (weakReference != null && (g3Var = weakReference.get()) != null) {
            return g3Var;
        }
        try {
            g3 g3Var2 = (g3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (g3Var2 == null || g3Var2.isRemoving()) {
                g3Var2 = new g3();
                activity.getFragmentManager().beginTransaction().add(g3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference<>(g3Var2));
            return g3Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f1120e.containsKey(str)) {
            this.f1120e.put(str, lifecycleCallback);
            if (this.f1121f > 0) {
                new e(Looper.getMainLooper()).post(new f3(this, lifecycleCallback, str));
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
        return cls.cast(this.f1120e.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.e(i2, i3, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1121f = 1;
        this.f1122g = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f1120e.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f1121f = 5;
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f1121f = 3;
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f1120e.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().i(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f1121f = 2;
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f1121f = 4;
        for (LifecycleCallback lifecycleCallback : this.f1120e.values()) {
            lifecycleCallback.k();
        }
    }
}
