package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.p;
import androidx.fragment.app.w;
import e.d.p.s;
import e.d.p.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final z b;
    static final z c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f815e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f816f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e.d.l.b f817g;

        a(g gVar, Fragment fragment, e.d.l.b bVar) {
            this.f815e = gVar;
            this.f816f = fragment;
            this.f817g = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f815e.a(this.f816f, this.f817g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f818e;

        b(ArrayList arrayList) {
            this.f818e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.B(this.f818e, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f819e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f820f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e.d.l.b f821g;

        c(g gVar, Fragment fragment, e.d.l.b bVar) {
            this.f819e = gVar;
            this.f820f = fragment;
            this.f821g = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f819e.a(this.f820f, this.f821g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f822e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f823f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f824g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f825h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f826i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f827j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f828k;
        final /* synthetic */ Object l;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f822e = obj;
            this.f823f = zVar;
            this.f824g = view;
            this.f825h = fragment;
            this.f826i = arrayList;
            this.f827j = arrayList2;
            this.f828k = arrayList3;
            this.l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f822e;
            if (obj != null) {
                this.f823f.p(obj, this.f824g);
                this.f827j.addAll(x.k(this.f823f, this.f822e, this.f825h, this.f826i, this.f824g));
            }
            if (this.f828k != null) {
                if (this.l != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f824g);
                    this.f823f.q(this.l, this.f828k, arrayList);
                }
                this.f828k.clear();
                this.f828k.add(this.f824g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f829e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f830f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f831g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.c.a f832h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f833i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ z f834j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Rect f835k;

        e(Fragment fragment, Fragment fragment2, boolean z, e.c.a aVar, View view, z zVar, Rect rect) {
            this.f829e = fragment;
            this.f830f = fragment2;
            this.f831g = z;
            this.f832h = aVar;
            this.f833i = view;
            this.f834j = zVar;
            this.f835k = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f829e, this.f830f, this.f831g, this.f832h, false);
            View view = this.f833i;
            if (view != null) {
                this.f834j.k(view, this.f835k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z f836e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.c.a f837f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f838g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f839h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f840i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f841j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f842k;
        final /* synthetic */ Fragment l;
        final /* synthetic */ boolean m;
        final /* synthetic */ ArrayList n;
        final /* synthetic */ Object o;
        final /* synthetic */ Rect p;

        f(z zVar, e.c.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f836e = zVar;
            this.f837f = aVar;
            this.f838g = obj;
            this.f839h = hVar;
            this.f840i = arrayList;
            this.f841j = view;
            this.f842k = fragment;
            this.l = fragment2;
            this.m = z;
            this.n = arrayList2;
            this.o = obj2;
            this.p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.c.a<String, View> h2 = x.h(this.f836e, this.f837f, this.f838g, this.f839h);
            if (h2 != null) {
                this.f840i.addAll(h2.values());
                this.f840i.add(this.f841j);
            }
            x.f(this.f842k, this.l, this.m, h2, false);
            Object obj = this.f838g;
            if (obj != null) {
                this.f836e.A(obj, this.n, this.f840i);
                View t = x.t(h2, this.f839h, this.o, this.m);
                if (t != null) {
                    this.f836e.k(t, this.p);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, e.d.l.b bVar);

        void b(Fragment fragment, e.d.l.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        public Fragment a;
        public boolean b;
        public androidx.fragment.app.a c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f843d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f844e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f845f;

        h() {
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 21 ? new y() : null;
        c = x();
    }

    private static void A(z zVar, Object obj, Object obj2, e.c.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.n : aVar2.m).get(0));
            zVar.v(obj, view);
            if (obj2 != null) {
                zVar.v(obj2, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                e.c.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (gVar.f() && (viewGroup = (ViewGroup) gVar.e(keyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, d2, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d2, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, e.c.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l = aVar.l(size);
            if (collection.contains(u.t(l))) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.p != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0088, code lost:
        if (r0.D == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(androidx.fragment.app.a aVar, w.a aVar2, SparseArray<h> sparseArray, boolean z, boolean z2) {
        int i2;
        boolean z3;
        boolean z4;
        h hVar;
        boolean z5;
        Fragment fragment = aVar2.b;
        if (fragment != null && (i2 = fragment.B) != 0) {
            int i3 = z ? a[aVar2.a] : aVar2.a;
            boolean z6 = false;
            boolean z7 = true;
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        boolean z8 = !z2 ? false : false;
                        z4 = z8;
                        z3 = true;
                        z7 = false;
                        hVar = sparseArray.get(i2);
                        if (z6) {
                        }
                        if (!z2) {
                        }
                        if (z4) {
                        }
                        if (z2) {
                        }
                    } else if (i3 != 5) {
                        if (i3 != 6) {
                            if (i3 != 7) {
                                z3 = false;
                                z7 = false;
                                z4 = false;
                                hVar = sparseArray.get(i2);
                                if (z6) {
                                    hVar = p(hVar, sparseArray, i2);
                                    hVar.a = fragment;
                                    hVar.b = z;
                                    hVar.c = aVar;
                                }
                                if (!z2 && z7) {
                                    if (hVar != null && hVar.f843d == fragment) {
                                        hVar.f843d = null;
                                    }
                                    if (!aVar.o) {
                                        n nVar = aVar.q;
                                        nVar.q0().p(nVar.v(fragment));
                                        nVar.O0(fragment);
                                    }
                                }
                                if (z4 && (hVar == null || hVar.f843d == null)) {
                                    hVar = p(hVar, sparseArray, i2);
                                    hVar.f843d = fragment;
                                    hVar.f844e = z;
                                    hVar.f845f = aVar;
                                }
                                if (z2 && z3 && hVar != null && hVar.a == fragment) {
                                    hVar.a = null;
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (z2) {
                        if (fragment.Q) {
                            if (!fragment.D) {
                            }
                        }
                        z5 = false;
                        z6 = z5;
                        z3 = false;
                        z4 = false;
                        hVar = sparseArray.get(i2);
                        if (z6) {
                        }
                        if (!z2) {
                            if (hVar != null) {
                                hVar.f843d = null;
                            }
                            if (!aVar.o) {
                            }
                        }
                        if (z4) {
                            hVar = p(hVar, sparseArray, i2);
                            hVar.f843d = fragment;
                            hVar.f844e = z;
                            hVar.f845f = aVar;
                        }
                        if (z2) {
                            return;
                        }
                        return;
                    } else {
                        z5 = fragment.D;
                        z6 = z5;
                        z3 = false;
                        z4 = false;
                        hVar = sparseArray.get(i2);
                        if (z6) {
                        }
                        if (!z2) {
                        }
                        if (z4) {
                        }
                        if (z2) {
                        }
                    }
                }
                boolean z9 = fragment.p;
                if (!z2) {
                }
                z4 = z8;
                z3 = true;
                z7 = false;
                hVar = sparseArray.get(i2);
                if (z6) {
                }
                if (!z2) {
                }
                if (z4) {
                }
                if (z2) {
                }
            }
            if (z2) {
                z5 = fragment.P;
                z6 = z5;
                z3 = false;
                z4 = false;
                hVar = sparseArray.get(i2);
                if (z6) {
                }
                if (!z2) {
                }
                if (z4) {
                }
                if (z2) {
                }
            } else {
                if (!fragment.p) {
                }
                z5 = false;
                z6 = z5;
                z3 = false;
                z4 = false;
                hVar = sparseArray.get(i2);
                if (z6) {
                }
                if (!z2) {
                }
                if (z4) {
                }
                if (z2) {
                }
            }
        }
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    private static e.c.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        e.c.a<String, String> aVar = new e.c.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.u(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.m;
                        arrayList4 = aVar2.n;
                    } else {
                        arrayList4 = aVar2.m;
                        arrayList3 = aVar2.n;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.q.n0().f()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Fragment fragment, Fragment fragment2, boolean z, e.c.a<String, View> aVar, boolean z2) {
        p w = z ? fragment2.w() : fragment.w();
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.l(i2));
            }
            if (z2) {
                w.c(arrayList2, arrayList, null);
            } else {
                w.b(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static e.c.a<String, View> h(z zVar, e.c.a<String, String> aVar, Object obj, h hVar) {
        p pVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.a;
        View T = fragment.T();
        if (aVar.isEmpty() || obj == null || T == null) {
            aVar.clear();
            return null;
        }
        e.c.a<String, View> aVar2 = new e.c.a<>();
        zVar.j(aVar2, T);
        androidx.fragment.app.a aVar3 = hVar.c;
        if (hVar.b) {
            pVar = fragment.z();
            arrayList = aVar3.m;
        } else {
            pVar = fragment.w();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        if (pVar != null) {
            pVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(u.t(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, u.t(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static e.c.a<String, View> i(z zVar, e.c.a<String, String> aVar, Object obj, h hVar) {
        p pVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f843d;
        e.c.a<String, View> aVar2 = new e.c.a<>();
        zVar.j(aVar2, fragment.h1());
        androidx.fragment.app.a aVar3 = hVar.f845f;
        if (hVar.f844e) {
            pVar = fragment.w();
            arrayList = aVar3.n;
        } else {
            pVar = fragment.z();
            arrayList = aVar3.m;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
        }
        if (pVar != null) {
            pVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(u.t(view))) {
                    aVar.put(u.t(view), aVar.remove(str));
                }
            }
        } else {
            aVar.n(aVar2.keySet());
        }
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object y = fragment.y();
            if (y != null) {
                arrayList.add(y);
            }
            Object N = fragment.N();
            if (N != null) {
                arrayList.add(N);
            }
            Object P = fragment.P();
            if (P != null) {
                arrayList.add(P);
            }
        }
        if (fragment2 != null) {
            Object v = fragment2.v();
            if (v != null) {
                arrayList.add(v);
            }
            Object L = fragment2.L();
            if (L != null) {
                arrayList.add(L);
            }
            Object O = fragment2.O();
            if (O != null) {
                arrayList.add(O);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View T = fragment.T();
        if (T != null) {
            zVar.f(arrayList2, T);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, e.c.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        e.c.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f843d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(zVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        e.c.a<String, View> i2 = i(zVar, aVar2, obj3, hVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(i2.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar.z(obj4, view, arrayList);
            A(zVar, obj4, obj2, i2, hVar.f844e, hVar.f845f);
            if (obj != null) {
                zVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        s.a(viewGroup, new f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, e.c.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f843d;
        if (fragment != null) {
            fragment.h1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object u = aVar.isEmpty() ? null : u(zVar, fragment, fragment2, z);
        e.c.a<String, View> i2 = i(zVar, aVar, u, hVar);
        e.c.a<String, View> h2 = h(zVar, aVar, u, hVar);
        if (aVar.isEmpty()) {
            if (i2 != null) {
                i2.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i2, aVar.keySet());
            a(arrayList2, h2, aVar.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            zVar.z(obj3, view, arrayList);
            A(zVar, obj3, obj2, i2, hVar.f844e, hVar.f845f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar, obj, z);
            if (t != null) {
                zVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        s.a(viewGroup, new e(fragment, fragment2, z, h2, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, e.c.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f843d;
        z j2 = j(fragment2, fragment);
        if (j2 != null) {
            boolean z = hVar.b;
            boolean z2 = hVar.f844e;
            Object r = r(j2, fragment, z);
            Object s = s(j2, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object l = l(j2, viewGroup, view, aVar, hVar, arrayList, arrayList2, r, s);
            if (r == null && l == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k2 = k(j2, obj, fragment2, arrayList, view);
            if (k2 == null || k2.isEmpty()) {
                obj = null;
            }
            Object obj2 = obj;
            j2.a(r, view);
            Object v = v(j2, r, obj2, l, fragment, hVar.b);
            if (!(fragment2 == null || k2 == null || (k2.size() <= 0 && arrayList.size() <= 0))) {
                e.d.l.b bVar = new e.d.l.b();
                gVar.b(fragment2, bVar);
                j2.w(fragment2, v, bVar, new c(gVar, fragment2, bVar));
            }
            if (v != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                j2.t(v, r, arrayList3, obj2, k2, l, arrayList2);
                z(j2, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k2);
                j2.x(viewGroup, arrayList2, aVar);
                j2.c(viewGroup, v);
                j2.s(viewGroup, arrayList2, aVar);
            }
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, e.c.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f843d;
        z j2 = j(fragment2, fragment);
        if (j2 != null) {
            boolean z = hVar.b;
            boolean z2 = hVar.f844e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object r = r(j2, fragment, z);
            Object s = s(j2, fragment2, z2);
            Object m = m(j2, viewGroup, view, aVar, hVar, arrayList2, arrayList, r, s);
            if (r == null && m == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k2 = k(j2, obj, fragment2, arrayList2, view);
            ArrayList<View> k3 = k(j2, r, fragment, arrayList, view);
            B(k3, 4);
            Object v = v(j2, r, obj, m, fragment, z);
            if (!(fragment2 == null || k2 == null || (k2.size() <= 0 && arrayList2.size() <= 0))) {
                e.d.l.b bVar = new e.d.l.b();
                gVar.b(fragment2, bVar);
                j2.w(fragment2, v, bVar, new a(gVar, fragment2, bVar));
            }
            if (v != null) {
                w(j2, obj, fragment2, k2);
                ArrayList<String> o = j2.o(arrayList);
                j2.t(v, r, k3, obj, k2, m, arrayList);
                j2.c(viewGroup, v);
                j2.y(viewGroup, arrayList2, arrayList, o, aVar);
                B(k3, 0);
                j2.A(m, arrayList2, arrayList);
            }
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String q(e.c.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.l(i2))) {
                return aVar.i(i2);
            }
        }
        return null;
    }

    private static Object r(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.L() : fragment.v());
    }

    private static Object s(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.N() : fragment.y());
    }

    static View t(e.c.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.m : aVar2.n).get(0));
    }

    private static Object u(z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z ? fragment2.P() : fragment.O()));
    }

    private static Object v(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.o() : fragment.n() ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void w(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.p && fragment.D && fragment.Q) {
            fragment.q1(true);
            zVar.r(obj, fragment.T(), arrayList);
            s.a(fragment.K, new b(arrayList));
        }
    }

    private static z x() {
        try {
            return (z) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(e.c.a<String, String> aVar, e.c.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void z(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        s.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
