package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e.d.l.b;
import e.d.p.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c0 {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList<>();
    final ArrayList<e> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f722d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f723e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f724e;

        a(d dVar) {
            this.f724e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.b.contains(this.f724e)) {
                this.f724e.e().a(this.f724e.f().L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f726e;

        b(d dVar) {
            this.f726e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.b.remove(this.f726e);
            c0.this.c.remove(this.f726e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f728h;

        d(e.c cVar, e.b bVar, u uVar, e.d.l.b bVar2) {
            super(cVar, bVar, uVar.k(), bVar2);
            this.f728h = uVar;
        }

        @Override // androidx.fragment.app.c0.e
        public void c() {
            super.c();
            this.f728h.m();
        }

        @Override // androidx.fragment.app.c0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k2 = this.f728h.k();
                View findFocus = k2.L.findFocus();
                if (findFocus != null) {
                    k2.p1(findFocus);
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                    }
                }
                View h1 = f().h1();
                if (h1.getParent() == null) {
                    this.f728h.b();
                    h1.setAlpha(0.0f);
                }
                if (h1.getAlpha() == 0.0f && h1.getVisibility() == 0) {
                    h1.setVisibility(4);
                }
                h1.setAlpha(k2.K());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        private c a;
        private b b;
        private final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f729d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<e.d.l.b> f730e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f731f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f732g = false;

        /* loaded from: classes.dex */
        class a implements b.a {
            a() {
            }

            @Override // e.d.l.b.a
            public void a() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c c(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a(View view) {
                int i2;
                int i3 = c.a[ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (i3 == 3) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (i3 == 4) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, e.d.l.b bVar2) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            bVar2.c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f729d.add(runnable);
        }

        final void b() {
            if (!h()) {
                this.f731f = true;
                if (this.f730e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f730e).iterator();
                while (it.hasNext()) {
                    ((e.d.l.b) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f732g) {
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f732g = true;
                for (Runnable runnable : this.f729d) {
                    runnable.run();
                }
            }
        }

        public final void d(e.d.l.b bVar) {
            if (this.f730e.remove(bVar) && this.f730e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        b g() {
            return this.b;
        }

        final boolean h() {
            return this.f731f;
        }

        final boolean i() {
            return this.f732g;
        }

        public final void j(e.d.l.b bVar) {
            l();
            this.f730e.add(bVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i2 = c.b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                    }
                    this.a = c.REMOVED;
                    bVar2 = b.REMOVING;
                } else if (i2 == 3 && this.a != c.REMOVED) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                    }
                    this.a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.a == c.REMOVED) {
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = c.VISIBLE;
                bVar2 = b.ADDING;
            } else {
                return;
            }
            this.b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.b) {
            e.d.l.b bVar2 = new e.d.l.b();
            e h2 = h(uVar.k());
            if (h2 != null) {
                h2.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, bVar2);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i2 = e.g.b.b_res_0x7f08009f;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a2 = d0Var.a(viewGroup);
        viewGroup.setTag(i2, a2);
        return a2;
    }

    private void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.c(next.f().h1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    abstract void f(List<e> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (!this.f723e) {
            if (!u.x(this.a)) {
                j();
                this.f722d = false;
                return;
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f722d);
                    this.f722d = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean x = u.x(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (x) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (x) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f723e) {
            this.f723e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h2 = h(uVar.k());
        if (h2 != null) {
            return h2.g();
        }
        e i2 = i(uVar.k());
        if (i2 != null) {
            return i2.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.b) {
            q();
            this.f723e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.b.get(size);
                e.c d2 = e.c.d(eVar.f().L);
                e.c e2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e2 == cVar && d2 != cVar) {
                    this.f723e = eVar.f().b0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.f722d = z;
    }
}
