package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import h.a.d.a.m;
import h.a.d.a.n;
import h.a.d.a.p;
import h.a.d.a.q;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements io.flutter.embedding.engine.i.b, io.flutter.embedding.engine.i.c.b {
    private final io.flutter.embedding.engine.b b;
    private final a.b c;

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.d<Activity> f2984e;

    /* renamed from: f  reason: collision with root package name */
    private c f2985f;

    /* renamed from: i  reason: collision with root package name */
    private Service f2988i;

    /* renamed from: j  reason: collision with root package name */
    private f f2989j;
    private BroadcastReceiver l;
    private C0125d m;
    private ContentProvider o;
    private e p;
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.a> a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.c.a> f2983d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private boolean f2986g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.f.a> f2987h = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.d.a> f2990k = new HashMap();
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.e.a> n = new HashMap();

    /* loaded from: classes.dex */
    private static class b implements a.AbstractC0128a {
        private b(io.flutter.embedding.engine.h.f fVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements io.flutter.embedding.engine.i.c.c {
        private final Activity a;
        private final Set<p> b = new HashSet();
        private final Set<m> c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<n> f2991d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<q> f2992e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<c.a> f2993f = new HashSet();

        public c(Activity activity, androidx.lifecycle.d dVar) {
            this.a = activity;
            new HiddenLifecycleReference(dVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public void a(m mVar) {
            this.c.add(mVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public void b(n nVar) {
            this.f2991d.add(nVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public void c(p pVar) {
            this.b.add(pVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public Activity d() {
            return this.a;
        }

        boolean e(int i2, int i3, Intent intent) {
            Iterator it = new HashSet(this.c).iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((m) it.next()).a(i2, i3, intent) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        void f(Intent intent) {
            for (n nVar : this.f2991d) {
                nVar.onNewIntent(intent);
            }
        }

        boolean g(int i2, String[] strArr, int[] iArr) {
            while (true) {
                boolean z = false;
                for (p pVar : this.b) {
                    if (pVar.onRequestPermissionsResult(i2, strArr, iArr) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        void h(Bundle bundle) {
            for (c.a aVar : this.f2993f) {
                aVar.b(bundle);
            }
        }

        void i(Bundle bundle) {
            for (c.a aVar : this.f2993f) {
                aVar.c(bundle);
            }
        }

        void j() {
            for (q qVar : this.f2992e) {
                qVar.onUserLeaveHint();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0125d implements io.flutter.embedding.engine.i.d.b {
    }

    /* loaded from: classes.dex */
    private static class e implements io.flutter.embedding.engine.i.e.b {
    }

    /* loaded from: classes.dex */
    private static class f implements io.flutter.embedding.engine.i.f.b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, io.flutter.embedding.engine.b bVar, io.flutter.embedding.engine.h.f fVar) {
        this.b = bVar;
        this.c = new a.b(context, bVar, bVar.h(), bVar.q(), bVar.o().F(), new b(fVar));
    }

    private void h(Activity activity, androidx.lifecycle.d dVar) {
        this.f2985f = new c(activity, dVar);
        this.b.o().Y(activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.b.o().s(activity, this.b.q(), this.b.h());
        for (io.flutter.embedding.engine.i.c.a aVar : this.f2983d.values()) {
            if (this.f2986g) {
                aVar.onReattachedToActivityForConfigChanges(this.f2985f);
            } else {
                aVar.onAttachedToActivity(this.f2985f);
            }
        }
        this.f2986g = false;
    }

    private void j() {
        this.b.o().z();
        this.f2984e = null;
        this.f2985f = null;
    }

    private void k() {
        if (p()) {
            e();
        } else if (s()) {
            n();
        } else if (q()) {
            l();
        } else if (r()) {
            m();
        }
    }

    private boolean p() {
        return this.f2984e != null;
    }

    private boolean q() {
        return this.l != null;
    }

    private boolean r() {
        return this.o != null;
    }

    private boolean s() {
        return this.f2988i != null;
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public boolean a(int i2, int i3, Intent intent) {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f2985f.e(i2, i3, intent);
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void b(Bundle bundle) {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f2985f.h(bundle);
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void c(Bundle bundle) {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f2985f.i(bundle);
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void d(io.flutter.embedding.android.d<Activity> dVar, androidx.lifecycle.d dVar2) {
        h.a.e.d.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.d<Activity> dVar3 = this.f2984e;
            if (dVar3 != null) {
                dVar3.e();
            }
            k();
            this.f2984e = dVar;
            h(dVar.f(), dVar2);
        } finally {
            h.a.e.d.b();
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void e() {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (io.flutter.embedding.engine.i.c.a aVar : this.f2983d.values()) {
                    aVar.onDetachedFromActivity();
                }
                j();
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.i.b
    public void f(io.flutter.embedding.engine.i.a aVar) {
        h.a.e.d.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (o(aVar.getClass())) {
                h.a.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.b + ").");
                return;
            }
            h.a.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.c);
            if (aVar instanceof io.flutter.embedding.engine.i.c.a) {
                io.flutter.embedding.engine.i.c.a aVar2 = (io.flutter.embedding.engine.i.c.a) aVar;
                this.f2983d.put(aVar.getClass(), aVar2);
                if (p()) {
                    aVar2.onAttachedToActivity(this.f2985f);
                }
            }
            if (aVar instanceof io.flutter.embedding.engine.i.f.a) {
                io.flutter.embedding.engine.i.f.a aVar3 = (io.flutter.embedding.engine.i.f.a) aVar;
                this.f2987h.put(aVar.getClass(), aVar3);
                if (s()) {
                    aVar3.a(this.f2989j);
                }
            }
            if (aVar instanceof io.flutter.embedding.engine.i.d.a) {
                io.flutter.embedding.engine.i.d.a aVar4 = (io.flutter.embedding.engine.i.d.a) aVar;
                this.f2990k.put(aVar.getClass(), aVar4);
                if (q()) {
                    aVar4.a(this.m);
                }
            }
            if (aVar instanceof io.flutter.embedding.engine.i.e.a) {
                io.flutter.embedding.engine.i.e.a aVar5 = (io.flutter.embedding.engine.i.e.a) aVar;
                this.n.put(aVar.getClass(), aVar5);
                if (r()) {
                    aVar5.a(this.p);
                }
            }
        } finally {
            h.a.e.d.b();
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void g() {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f2986g = true;
                for (io.flutter.embedding.engine.i.c.a aVar : this.f2983d.values()) {
                    aVar.onDetachedFromActivityForConfigChanges();
                }
                j();
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void i() {
        h.a.b.e("FlutterEngineCxnRegstry", "Destroying.");
        k();
        v();
    }

    public void l() {
        if (q()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (io.flutter.embedding.engine.i.d.a aVar : this.f2990k.values()) {
                    aVar.b();
                }
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void m() {
        if (r()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (io.flutter.embedding.engine.i.e.a aVar : this.n.values()) {
                    aVar.b();
                }
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void n() {
        if (s()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (io.flutter.embedding.engine.i.f.a aVar : this.f2987h.values()) {
                    aVar.b();
                }
                this.f2988i = null;
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public boolean o(Class<? extends io.flutter.embedding.engine.i.a> cls) {
        return this.a.containsKey(cls);
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void onNewIntent(Intent intent) {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f2985f.f(intent);
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f2985f.g(i2, strArr, iArr);
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void onUserLeaveHint() {
        if (p()) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f2985f.j();
            } finally {
                h.a.e.d.b();
            }
        } else {
            h.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void t(Class<? extends io.flutter.embedding.engine.i.a> cls) {
        io.flutter.embedding.engine.i.a aVar = this.a.get(cls);
        if (aVar != null) {
            h.a.e.d.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof io.flutter.embedding.engine.i.c.a) {
                    if (p()) {
                        ((io.flutter.embedding.engine.i.c.a) aVar).onDetachedFromActivity();
                    }
                    this.f2983d.remove(cls);
                }
                if (aVar instanceof io.flutter.embedding.engine.i.f.a) {
                    if (s()) {
                        ((io.flutter.embedding.engine.i.f.a) aVar).b();
                    }
                    this.f2987h.remove(cls);
                }
                if (aVar instanceof io.flutter.embedding.engine.i.d.a) {
                    if (q()) {
                        ((io.flutter.embedding.engine.i.d.a) aVar).b();
                    }
                    this.f2990k.remove(cls);
                }
                if (aVar instanceof io.flutter.embedding.engine.i.e.a) {
                    if (r()) {
                        ((io.flutter.embedding.engine.i.e.a) aVar).b();
                    }
                    this.n.remove(cls);
                }
                aVar.onDetachedFromEngine(this.c);
                this.a.remove(cls);
            } finally {
                h.a.e.d.b();
            }
        }
    }

    public void u(Set<Class<? extends io.flutter.embedding.engine.i.a>> set) {
        for (Class<? extends io.flutter.embedding.engine.i.a> cls : set) {
            t(cls);
        }
    }

    public void v() {
        u(new HashSet(this.a.keySet()));
        this.a.clear();
    }
}
