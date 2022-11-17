package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.p;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import e.d.l.b;
import e.d.p.s;
import e.d.p.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class c extends c0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c0.e.c.values().length];
            a = iArr;
            try {
                iArr[c0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f703e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0.e f704f;

        b(List list, c0.e eVar) {
            this.f703e = list;
            this.f704f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f703e.contains(this.f704f)) {
                this.f703e.remove(this.f704f);
                c.this.s(this.f704f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0019c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f706d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f707e;

        C0019c(c cVar, ViewGroup viewGroup, View view, boolean z, c0.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.f706d = eVar;
            this.f707e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.f706d.e().a(this.b);
            }
            this.f707e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements b.a {
        final /* synthetic */ Animator a;

        d(c cVar, Animator animator) {
            this.a = animator;
        }

        @Override // e.d.l.b.a
        public void a() {
            this.a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ k c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        e(c cVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements b.a {
        final /* synthetic */ View a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ k c;

        f(c cVar, View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        @Override // e.d.l.b.a
        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0.e f709e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0.e f710f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f711g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.c.a f712h;

        g(c cVar, c0.e eVar, c0.e eVar2, boolean z, e.c.a aVar) {
            this.f709e = eVar;
            this.f710f = eVar2;
            this.f711g = z;
            this.f712h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f709e.f(), this.f710f.f(), this.f711g, this.f712h, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z f713e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f714f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rect f715g;

        h(c cVar, z zVar, View view, Rect rect) {
            this.f713e = zVar;
            this.f714f = view;
            this.f715g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f713e.k(this.f714f, this.f715g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f716e;

        i(c cVar, ArrayList arrayList) {
            this.f716e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.B(this.f716e, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f717e;

        j(c cVar, m mVar) {
            this.f717e = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f717e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends l {
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f718d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f719e;

        k(c0.e eVar, e.d.l.b bVar, boolean z) {
            super(eVar, bVar);
            this.c = z;
        }

        f.d e(Context context) {
            if (this.f718d) {
                return this.f719e;
            }
            f.d c = androidx.fragment.app.f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.c);
            this.f719e = c;
            this.f718d = true;
            return c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        private final c0.e a;
        private final e.d.l.b b;

        l(c0.e eVar, e.d.l.b bVar) {
            this.a = eVar;
            this.b = bVar;
        }

        void a() {
            this.a.d(this.b);
        }

        c0.e b() {
            return this.a;
        }

        e.d.l.b c() {
            return this.b;
        }

        boolean d() {
            c0.e.c cVar;
            c0.e.c d2 = c0.e.c.d(this.a.f().L);
            c0.e.c e2 = this.a.e();
            return d2 == e2 || !(d2 == (cVar = c0.e.c.VISIBLE) || e2 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l {
        private final Object c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f720d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f721e;

        m(c0.e eVar, e.d.l.b bVar, boolean z, boolean z2) {
            super(eVar, bVar);
            boolean z3;
            Object obj;
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment f2 = eVar.f();
                this.c = z ? f2.L() : f2.v();
                Fragment f3 = eVar.f();
                z3 = z ? f3.o() : f3.n();
            } else {
                Fragment f4 = eVar.f();
                this.c = z ? f4.N() : f4.y();
                z3 = true;
            }
            this.f720d = z3;
            if (z2) {
                Fragment f5 = eVar.f();
                obj = z ? f5.P() : f5.O();
            } else {
                obj = null;
            }
            this.f721e = obj;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        z e() {
            z f2 = f(this.c);
            z f3 = f(this.f721e);
            if (f2 == null || f3 == null || f2 == f3) {
                return f2 != null ? f2 : f3;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.f721e);
        }

        public Object g() {
            return this.f721e;
        }

        Object h() {
            return this.c;
        }

        public boolean i() {
            return this.f721e != null;
        }

        boolean j() {
            return this.f720d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d e2;
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (!kVar.d() && (e2 = kVar.e(context)) != null) {
                Animator animator = e2.b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    c0.e b2 = kVar.b();
                    Fragment f2 = b2.f();
                    if (Boolean.TRUE.equals(map.get(b2))) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = b2.e() == c0.e.c.GONE;
                        if (z3) {
                            list2.remove(b2);
                        }
                        View view = f2.L;
                        m2.startViewTransition(view);
                        animator.addListener(new C0019c(this, m2, view, z3, b2, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(this, animator));
                        z2 = true;
                    }
                }
            } else {
                kVar.a();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            c0.e b3 = kVar2.b();
            Fragment f3 = b3.f();
            if (z) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z2) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = f3.L;
                f.d e3 = kVar2.e(context);
                e.d.o.d.d(e3);
                Animation animation = e3.a;
                e.d.o.d.d(animation);
                Animation animation2 = animation;
                if (b3.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation2);
                    kVar2.a();
                } else {
                    m2.startViewTransition(view2);
                    f.e eVar = new f.e(animation2, m2, view2);
                    eVar.setAnimationListener(new e(this, m2, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(this, view2, m2, kVar2));
            }
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z, c0.e eVar, c0.e eVar2) {
        View view;
        View view2;
        Boolean bool;
        ArrayList<View> arrayList;
        View view3;
        Object obj;
        e.c.a aVar;
        Boolean bool2;
        ArrayList<View> arrayList2;
        Boolean bool3;
        HashMap hashMap;
        c0.e eVar3;
        z zVar;
        Rect rect;
        ArrayList<View> arrayList3;
        View view4;
        p pVar;
        p pVar2;
        Boolean bool4;
        View view5;
        View view6;
        String q;
        Boolean bool5;
        boolean z2 = z;
        c0.e eVar4 = eVar;
        c0.e eVar5 = eVar2;
        Boolean bool6 = Boolean.TRUE;
        Boolean bool7 = Boolean.FALSE;
        HashMap hashMap2 = new HashMap();
        z zVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                z e2 = mVar.e();
                if (zVar2 == null) {
                    zVar2 = e2;
                } else if (!(e2 == null || zVar2 == e2)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m mVar2 : list) {
                hashMap2.put(mVar2.b(), bool7);
                mVar2.a();
            }
            return hashMap2;
        }
        View view7 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        e.c.a aVar2 = new e.c.a();
        Iterator<m> it = list.iterator();
        Object obj2 = null;
        View view8 = null;
        boolean z3 = false;
        while (true) {
            view = view8;
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar4 == null || eVar5 == null) {
                aVar = aVar2;
                arrayList3 = arrayList4;
                bool2 = bool7;
                hashMap = hashMap2;
                view4 = view7;
                zVar = zVar2;
                arrayList2 = arrayList5;
                rect = rect2;
                eVar3 = eVar4;
                bool3 = bool6;
                view8 = view;
            } else {
                Object B = zVar2.B(zVar2.g(next.g()));
                ArrayList<String> Q = eVar2.f().Q();
                ArrayList<String> Q2 = eVar.f().Q();
                ArrayList<String> R = eVar.f().R();
                Rect rect3 = rect2;
                bool2 = bool7;
                for (int i2 = 0; i2 < R.size(); i2++) {
                    int indexOf = Q.indexOf(R.get(i2));
                    R = R;
                    if (indexOf != -1) {
                        Q.set(indexOf, Q2.get(i2));
                    }
                }
                ArrayList<String> R2 = eVar2.f().R();
                Fragment f2 = eVar.f();
                if (!z2) {
                    pVar2 = f2.z();
                    pVar = eVar2.f().w();
                } else {
                    pVar2 = f2.w();
                    pVar = eVar2.f().z();
                }
                int size = Q.size();
                for (int i3 = 0; i3 < size; i3++) {
                    size = size;
                    aVar2.put(Q.get(i3), R2.get(i3));
                }
                e.c.a<String, View> aVar3 = new e.c.a<>();
                u(aVar3, eVar.f().L);
                aVar3.n(Q);
                if (pVar2 != null) {
                    pVar2.a(Q, aVar3);
                    int size2 = Q.size() - 1;
                    while (size2 >= 0) {
                        String str = Q.get(size2);
                        View view9 = aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            bool5 = bool6;
                        } else {
                            bool5 = bool6;
                            if (!str.equals(u.t(view9))) {
                                aVar2.put(u.t(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        bool6 = bool5;
                    }
                    bool4 = bool6;
                } else {
                    bool4 = bool6;
                    aVar2.n(aVar3.keySet());
                }
                e.c.a<String, View> aVar4 = new e.c.a<>();
                u(aVar4, eVar2.f().L);
                aVar4.n(R2);
                aVar4.n(aVar2.values());
                if (pVar != null) {
                    pVar.a(R2, aVar4);
                    for (int size3 = R2.size() - 1; size3 >= 0; size3--) {
                        String str2 = R2.get(size3);
                        View view10 = aVar4.get(str2);
                        if (view10 == null) {
                            String q2 = x.q(aVar2, str2);
                            if (q2 != null) {
                                aVar2.remove(q2);
                            }
                        } else if (!str2.equals(u.t(view10)) && (q = x.q(aVar2, str2)) != null) {
                            aVar2.put(q, u.t(view10));
                        }
                    }
                } else {
                    x.y(aVar2, aVar4);
                }
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    eVar3 = eVar;
                    eVar5 = eVar2;
                    aVar = aVar2;
                    arrayList3 = arrayList4;
                    hashMap = hashMap2;
                    view4 = view7;
                    zVar = zVar2;
                    view8 = view;
                    bool3 = bool4;
                    obj2 = null;
                    arrayList2 = arrayList5;
                    rect = rect3;
                } else {
                    x.f(eVar2.f(), eVar.f(), z2, aVar3, true);
                    aVar = aVar2;
                    hashMap = hashMap2;
                    arrayList2 = arrayList5;
                    View view11 = view7;
                    ArrayList<View> arrayList6 = arrayList4;
                    s.a(m(), new g(this, eVar2, eVar, z, aVar4));
                    for (View view12 : aVar3.values()) {
                        t(arrayList6, view12);
                    }
                    if (!Q.isEmpty()) {
                        View view13 = aVar3.get(Q.get(0));
                        zVar2.v(B, view13);
                        view8 = view13;
                    } else {
                        view8 = view;
                    }
                    for (View view14 : aVar4.values()) {
                        t(arrayList2, view14);
                    }
                    if (R2.isEmpty() || (view6 = aVar4.get(R2.get(0))) == null) {
                        rect = rect3;
                        view5 = view11;
                    } else {
                        rect = rect3;
                        s.a(m(), new h(this, zVar2, view6, rect));
                        view5 = view11;
                        z3 = true;
                    }
                    zVar2.z(B, view5, arrayList6);
                    view4 = view5;
                    arrayList3 = arrayList6;
                    zVar = zVar2;
                    zVar2.t(B, null, null, null, null, B, arrayList2);
                    eVar3 = eVar;
                    bool3 = bool4;
                    hashMap.put(eVar3, bool3);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool3);
                    obj2 = B;
                }
            }
            view7 = view4;
            zVar2 = zVar;
            bool6 = bool3;
            bool7 = bool2;
            arrayList4 = arrayList3;
            eVar4 = eVar3;
            aVar2 = aVar;
            rect2 = rect;
            arrayList5 = arrayList2;
            hashMap2 = hashMap;
            z2 = z;
        }
        e.c.a aVar5 = aVar2;
        ArrayList<View> arrayList7 = arrayList4;
        Boolean bool8 = bool7;
        HashMap hashMap3 = hashMap2;
        View view15 = view7;
        z zVar3 = zVar2;
        ArrayList<View> arrayList8 = arrayList5;
        Rect rect4 = rect2;
        c0.e eVar6 = eVar4;
        Boolean bool9 = bool6;
        ArrayList arrayList9 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj3 = null;
        Object obj4 = null;
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.d()) {
                it2 = it2;
                hashMap3.put(next2.b(), bool8);
                next2.a();
            } else {
                it2 = it2;
                Boolean bool10 = bool8;
                Object g2 = zVar3.g(next2.h());
                Object obj5 = obj3;
                c0.e b2 = next2.b();
                boolean z4 = obj2 != null && (b2 == eVar6 || b2 == eVar5);
                if (g2 == null) {
                    if (!z4) {
                        hashMap3.put(b2, bool10);
                        next2.a();
                    }
                    view2 = view15;
                    arrayList = arrayList7;
                    bool = bool10;
                    view3 = view;
                    obj3 = obj5;
                } else {
                    bool = bool10;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b2.f().L);
                    if (z4) {
                        if (b2 == eVar6) {
                            arrayList10.removeAll(arrayList7);
                        } else {
                            arrayList10.removeAll(arrayList8);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        zVar3.a(g2, view15);
                        view2 = view15;
                        arrayList = arrayList7;
                        obj = obj6;
                    } else {
                        zVar3.b(g2, arrayList10);
                        view2 = view15;
                        obj = obj6;
                        zVar3.t(g2, g2, arrayList10, null, null, null, null);
                        if (b2.e() == c0.e.c.GONE) {
                            list2.remove(b2);
                            g2 = g2;
                            zVar3.r(g2, b2.f().L, arrayList10);
                            arrayList = arrayList7;
                            s.a(m(), new i(this, arrayList10));
                        } else {
                            arrayList = arrayList7;
                            g2 = g2;
                        }
                    }
                    if (b2.e() == c0.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z3) {
                            zVar3.u(g2, rect4);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        zVar3.v(g2, view3);
                    }
                    hashMap3.put(b2, bool9);
                    obj3 = obj5;
                    if (next2.j()) {
                        obj3 = zVar3.n(obj3, g2, null);
                    } else {
                        obj = zVar3.n(obj, g2, null);
                    }
                    obj4 = obj;
                }
                view = view3;
                arrayList7 = arrayList;
                bool8 = bool;
                view15 = view2;
            }
        }
        ArrayList<View> arrayList11 = arrayList7;
        Object m2 = zVar3.m(obj3, obj4, obj2);
        for (m mVar3 : list) {
            if (!mVar3.d()) {
                Object h2 = mVar3.h();
                c0.e b3 = mVar3.b();
                boolean z5 = obj2 != null && (b3 == eVar6 || b3 == eVar5);
                if (h2 != null || z5) {
                    if (!u.y(m())) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b3);
                        }
                        mVar3.a();
                    } else {
                        zVar3.w(mVar3.b().f(), m2, mVar3.c(), new j(this, mVar3));
                    }
                }
            }
        }
        if (!u.y(m())) {
            return hashMap3;
        }
        x.B(arrayList9, 4);
        ArrayList<String> o = zVar3.o(arrayList8);
        zVar3.c(m(), m2);
        zVar3.y(m(), arrayList11, arrayList8, o, aVar5);
        x.B(arrayList9, 0);
        zVar3.A(obj2, arrayList11, arrayList8);
        return hashMap3;
    }

    @Override // androidx.fragment.app.c0
    void f(List<c0.e> list, boolean z) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e eVar3 : list) {
            c0.e.c d2 = c0.e.c.d(eVar3.f().L);
            int i2 = a.a[eVar3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (d2 == c0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && d2 != c0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList(list);
        for (c0.e eVar4 : list) {
            e.d.l.b bVar = new e.d.l.b();
            eVar4.j(bVar);
            arrayList.add(new k(eVar4, bVar, z));
            e.d.l.b bVar2 = new e.d.l.b();
            eVar4.j(bVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, bVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, bVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, bVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, bVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<c0.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (c0.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
    }

    void s(c0.e eVar) {
        eVar.e().a(eVar.f().L);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && u.t(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, View view) {
        String t = u.t(view);
        if (t != null) {
            map.put(t, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(e.c.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(u.t(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
