package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.f> A;
    private androidx.activity.result.c<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private androidx.fragment.app.q M;
    private boolean b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f766d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f767e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f769g;
    private ArrayList<AbstractC0021n> l;
    private androidx.fragment.app.k<?> r;
    private androidx.fragment.app.g s;
    private Fragment t;
    Fragment u;
    private androidx.activity.result.c<Intent> z;
    private final ArrayList<o> a = new ArrayList<>();
    private final v c = new v();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.l f768f = new androidx.fragment.app.l(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f770h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f771i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Bundle> f772j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f773k = Collections.synchronizedMap(new HashMap());
    private Map<Fragment, HashSet<e.d.l.b>> m = Collections.synchronizedMap(new HashMap());
    private final x.g n = new d();
    private final androidx.fragment.app.m o = new androidx.fragment.app.m(this);
    private final CopyOnWriteArrayList<r> p = new CopyOnWriteArrayList<>();
    int q = -1;
    private androidx.fragment.app.j v = null;
    private androidx.fragment.app.j w = new e();
    private d0 x = null;
    private d0 y = new f(this);
    ArrayDeque<m> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f776e;
            int i2 = pollFirst.f777f;
            Fragment i3 = n.this.c.i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i3.h0(i2, aVar.b(), aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f776e;
                int i3 = pollFirst.f777f;
                Fragment i4 = n.this.c.i(str);
                if (i4 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i4.D0(i3, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.activity.b {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.A0();
        }
    }

    /* loaded from: classes.dex */
    class d implements x.g {
        d() {
        }

        @Override // androidx.fragment.app.x.g
        public void a(Fragment fragment, e.d.l.b bVar) {
            if (!bVar.b()) {
                n.this.Y0(fragment, bVar);
            }
        }

        @Override // androidx.fragment.app.x.g
        public void b(Fragment fragment, e.d.l.b bVar) {
            n.this.f(fragment, bVar);
        }
    }

    /* loaded from: classes.dex */
    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().d(n.this.s0().k(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class f implements d0 {
        f(n nVar) {
        }

        @Override // androidx.fragment.app.d0
        public c0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        h(n nVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.L;
            if (view != null && fragment.D) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements r {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f775e;

        i(n nVar, Fragment fragment) {
            this.f775e = fragment;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            this.f775e.k0(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f776e;
            int i2 = pollFirst.f777f;
            Fragment i3 = n.this.c.i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i3.h0(i2, aVar.b(), aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends androidx.activity.result.g.a<androidx.activity.result.f, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = fVar.a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    f.b bVar = new f.b(fVar.d());
                    bVar.b(null);
                    bVar.c(fVar.c(), fVar.b());
                    fVar = bVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (n.E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i2, Intent intent) {
            return new androidx.activity.result.a(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public abstract void a(n nVar, Fragment fragment, Bundle bundle);

        public abstract void b(n nVar, Fragment fragment, Context context);

        public abstract void c(n nVar, Fragment fragment, Bundle bundle);

        public abstract void d(n nVar, Fragment fragment);

        public abstract void e(n nVar, Fragment fragment);

        public abstract void f(n nVar, Fragment fragment);

        public abstract void g(n nVar, Fragment fragment, Context context);

        public abstract void h(n nVar, Fragment fragment, Bundle bundle);

        public abstract void i(n nVar, Fragment fragment);

        public abstract void j(n nVar, Fragment fragment, Bundle bundle);

        public abstract void k(n nVar, Fragment fragment);

        public abstract void l(n nVar, Fragment fragment);

        public abstract void m(n nVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(n nVar, Fragment fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        String f776e;

        /* renamed from: f  reason: collision with root package name */
        int f777f;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            /* renamed from: b */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        m(Parcel parcel) {
            this.f776e = parcel.readString();
            this.f777f = parcel.readInt();
        }

        m(String str, int i2) {
            this.f776e = str;
            this.f777f = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f776e);
            parcel.writeInt(this.f777f);
        }
    }

    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0021n {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class p implements o {
        final String a;
        final int b;
        final int c;

        p(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        @Override // androidx.fragment.app.n.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.u;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.s().U0()) {
                return n.this.W0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class q implements Fragment.g {
        final boolean a;
        final androidx.fragment.app.a b;
        private int c;

        q(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.g
        public void a() {
            int i2 = this.c - 1;
            this.c = i2;
            if (i2 == 0) {
                this.b.q.f1();
            }
        }

        @Override // androidx.fragment.app.Fragment.g
        public void b() {
            this.c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.b;
            aVar.q.t(aVar, this.a, false, false);
        }

        void d() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.q.r0()) {
                fragment.s1(null);
                if (z && fragment.b0()) {
                    fragment.x1();
                }
            }
            androidx.fragment.app.a aVar = this.b;
            aVar.q.t(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E0(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    private boolean F0(Fragment fragment) {
        return (fragment.H && fragment.I) || fragment.y.n();
    }

    private void L(Fragment fragment) {
        if (fragment != null && fragment.equals(f0(fragment.f678j))) {
            fragment.Z0();
        }
    }

    private void L0(e.c.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment o2 = bVar.o(i2);
            if (!o2.p) {
                View h1 = o2.h1();
                o2.R = h1.getAlpha();
                h1.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private void S(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            N0(i2, false);
            if (P) {
                for (c0 c0Var : r()) {
                    c0Var.j();
                }
            }
            this.b = false;
            a0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            l1();
        }
    }

    private boolean V0(String str, int i2, int i3) {
        a0(false);
        Z(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.s().U0()) {
            return true;
        }
        boolean W0 = W0(this.I, this.J, str, i2, i3);
        if (W0) {
            this.b = true;
            try {
                a1(this.I, this.J);
            } finally {
                p();
            }
        }
        m1();
        V();
        this.c.b();
        return W0;
    }

    private void X() {
        if (P) {
            for (c0 c0Var : r()) {
                c0Var.j();
            }
        } else if (!this.m.isEmpty()) {
            for (Fragment fragment : this.m.keySet()) {
                m(fragment);
                O0(fragment);
            }
        }
    }

    private int X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, e.c.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.z(qVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(bVar);
            }
        }
        return i4;
    }

    private void Z(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.r.l().getLooper()) {
            if (!z) {
                o();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.b = true;
            try {
                e0(null, null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                e0(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).o) {
                        if (i3 != i2) {
                            d0(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).o) {
                                i3++;
                            }
                        }
                        d0(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    d0(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void b1() {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).a();
            }
        }
    }

    private static void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.m(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                aVar.r(z);
            } else {
                aVar.m(1);
                aVar.q();
            }
            i2++;
        }
    }

    private void d(e.c.b<Fragment> bVar) {
        int i2 = this.q;
        if (i2 >= 1) {
            int min = Math.min(i2, 5);
            for (Fragment fragment : this.c.n()) {
                if (fragment.f673e < min) {
                    P0(fragment, min);
                    if (fragment.L != null && !fragment.D && fragment.P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z;
        ArrayList<Boolean> arrayList3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList<Boolean> arrayList4;
        boolean z2;
        int i9;
        boolean z3;
        boolean z4 = arrayList.get(i2).o;
        ArrayList<Fragment> arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.K.addAll(this.c.n());
        Fragment w0 = w0();
        boolean z5 = false;
        for (int i10 = i2; i10 < i3; i10++) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            w0 = !arrayList2.get(i10).booleanValue() ? aVar.s(this.K, w0) : aVar.A(this.K, w0);
            z5 = z5 || aVar.f805g;
        }
        this.K.clear();
        if (!z4 && this.q >= 1) {
            if (P) {
                for (int i11 = i2; i11 < i3; i11++) {
                    Iterator<w.a> it = arrayList.get(i11).a.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().b;
                        if (!(fragment == null || fragment.w == null)) {
                            this.c.p(v(fragment));
                        }
                    }
                }
            } else {
                z = true;
                x.C(this.r.k(), this.s, arrayList, arrayList2, i2, i3, false, this.n);
                c0(arrayList, arrayList2, i2, i3);
                if (!P) {
                    boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                    for (int i12 = i2; i12 < i3; i12++) {
                        androidx.fragment.app.a aVar2 = arrayList.get(i12);
                        if (booleanValue) {
                            int size = aVar2.a.size();
                            int i13 = z ? 1 : 0;
                            int i14 = z ? 1 : 0;
                            for (int i15 = size - i13; i15 >= 0; i15--) {
                                Fragment fragment2 = aVar2.a.get(i15).b;
                                if (fragment2 != null) {
                                    v(fragment2).m();
                                }
                            }
                        } else {
                            Iterator<w.a> it2 = aVar2.a.iterator();
                            while (it2.hasNext()) {
                                Fragment fragment3 = it2.next().b;
                                if (fragment3 != null) {
                                    v(fragment3).m();
                                }
                            }
                        }
                    }
                    N0(this.q, z);
                    for (c0 c0Var : s(arrayList, i2, i3)) {
                        c0Var.r(booleanValue);
                        c0Var.p();
                        c0Var.g();
                    }
                    i4 = i3;
                    arrayList3 = arrayList2;
                } else {
                    if (z4) {
                        e.c.b<Fragment> bVar = new e.c.b<>();
                        d(bVar);
                        i6 = 1;
                        z2 = z4;
                        i7 = i3;
                        i8 = i2;
                        arrayList4 = arrayList2;
                        i9 = X0(arrayList, arrayList2, i2, i3, bVar);
                        L0(bVar);
                    } else {
                        z2 = z4;
                        i7 = i3;
                        i8 = i2;
                        arrayList4 = arrayList2;
                        i6 = 1;
                        i9 = i7;
                    }
                    if (i9 == i8 || !z2) {
                        arrayList3 = arrayList4;
                        i4 = i7;
                    } else {
                        if (this.q >= i6) {
                            arrayList3 = arrayList4;
                            int i16 = i9;
                            i4 = i7;
                            z3 = true;
                            x.C(this.r.k(), this.s, arrayList, arrayList2, i2, i16, true, this.n);
                        } else {
                            arrayList3 = arrayList4;
                            i4 = i7;
                            z3 = true;
                        }
                        N0(this.q, z3);
                    }
                }
                for (i5 = i2; i5 < i4; i5++) {
                    androidx.fragment.app.a aVar3 = arrayList.get(i5);
                    if (arrayList3.get(i5).booleanValue() && aVar3.s >= 0) {
                        aVar3.s = -1;
                    }
                    aVar3.y();
                }
                if (!z5) {
                    b1();
                    return;
                }
                return;
            }
        }
        z = true;
        c0(arrayList, arrayList2, i2, i3);
        if (!P) {
        }
        while (i5 < i4) {
        }
        if (!z5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.L.get(i2);
            if (arrayList == null || qVar.a || (indexOf2 = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || qVar.a || (indexOf = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i2++;
            } else {
                this.L.remove(i2);
                i2--;
                size--;
            }
            qVar.c();
            i2++;
        }
    }

    private void j0() {
        if (P) {
            for (c0 c0Var : r()) {
                c0Var.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private void j1(Fragment fragment) {
        ViewGroup o0 = o0(fragment);
        if (o0 != null && fragment.u() + fragment.x() + fragment.I() + fragment.J() > 0) {
            int i2 = e.g.b.c_res_0x7f0800c8;
            if (o0.getTag(i2) == null) {
                o0.setTag(i2, fragment);
            }
            ((Fragment) o0.getTag(i2)).t1(fragment.H());
        }
    }

    private boolean k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.r.l().removeCallbacks(this.N);
            return z;
        }
    }

    private void l1() {
        for (u uVar : this.c.k()) {
            S0(uVar);
        }
    }

    private void m(Fragment fragment) {
        HashSet<e.d.l.b> hashSet = this.m.get(fragment);
        if (hashSet != null) {
            Iterator<e.d.l.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            w(fragment);
            this.m.remove(fragment);
        }
    }

    private androidx.fragment.app.q m0(Fragment fragment) {
        return this.M.h(fragment);
    }

    private void m1() {
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.f770h.f(true);
                return;
            }
            androidx.activity.b bVar = this.f770h;
            if (l0() <= 0 || !H0(this.t)) {
                z = false;
            }
            bVar.f(z);
        }
    }

    private void o() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.B > 0 && this.s.f()) {
            View e2 = this.s.e(fragment.B);
            if (e2 instanceof ViewGroup) {
                return (ViewGroup) e2;
            }
        }
        return null;
    }

    private void p() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<c0> r() {
        HashSet hashSet = new HashSet();
        for (u uVar : this.c.k()) {
            ViewGroup viewGroup = uVar.k().K;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    private Set<c0> s(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<w.a> it = arrayList.get(i2).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (!(fragment == null || (viewGroup = fragment.K) == null)) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.L != null) {
            f.d c2 = androidx.fragment.app.f.c(this.r.k(), fragment, !fragment.D, fragment.H());
            if (c2 == null || (animator = c2.b) == null) {
                if (c2 != null) {
                    fragment.L.startAnimation(c2.a);
                    c2.a.start();
                }
                fragment.L.setVisibility((!fragment.D || fragment.Y()) ? 0 : 8);
                if (fragment.Y()) {
                    fragment.q1(false);
                }
            } else {
                animator.setTarget(fragment.L);
                if (!fragment.D) {
                    fragment.L.setVisibility(0);
                } else if (fragment.Y()) {
                    fragment.q1(false);
                } else {
                    ViewGroup viewGroup = fragment.K;
                    View view = fragment.L;
                    viewGroup.startViewTransition(view);
                    c2.b.addListener(new h(this, viewGroup, view, fragment));
                }
                c2.b.start();
            }
        }
        C0(fragment);
        fragment.Q = false;
        fragment.u0(fragment.D);
    }

    private void w(Fragment fragment) {
        fragment.P0();
        this.o.n(fragment, false);
        fragment.K = null;
        fragment.L = null;
        fragment.W = null;
        fragment.X.j(null);
        fragment.s = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment y0(View view) {
        Object tag = view.getTag(e.g.b.a_res_0x7f080064);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Configuration configuration) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.J0(configuration);
            }
        }
    }

    void A0() {
        a0(true);
        if (this.f770h.c()) {
            U0();
        } else {
            this.f769g.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.K0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.D) {
            fragment.D = true;
            fragment.Q = true ^ fragment.Q;
            j1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (fragment.p && F0(fragment)) {
            this.D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && G0(fragment) && fragment.M0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f767e != null) {
            for (int i2 = 0; i2 < this.f767e.size(); i2++) {
                Fragment fragment2 = this.f767e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.q0();
                }
            }
        }
        this.f767e = arrayList;
        return z;
    }

    public boolean D0() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.f769g != null) {
            this.f770h.d();
            this.f769g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.S0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.T0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.w;
        return fragment.equals(nVar.w0()) && H0(nVar.t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(Fragment fragment) {
        Iterator<r> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I0(int i2) {
        return this.q >= i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.U0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0() {
        return this.E || this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(Menu menu) {
        if (this.q >= 1) {
            for (Fragment fragment : this.c.n()) {
                if (fragment != null) {
                    fragment.V0(menu);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new m(fragment.f678j, i2));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a(intent);
            return;
        }
        this.r.p(fragment, intent, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0(Fragment fragment) {
        if (this.c.c(fragment.f678j)) {
            O0(fragment);
            View view = fragment.L;
            if (!(view == null || !fragment.P || fragment.K == null)) {
                float f2 = fragment.R;
                if (f2 > 0.0f) {
                    view.setAlpha(f2);
                }
                fragment.R = 0.0f;
                fragment.P = false;
                f.d c2 = androidx.fragment.app.f.c(this.r.k(), fragment, true, fragment.H());
                if (c2 != null) {
                    Animation animation = c2.a;
                    if (animation != null) {
                        fragment.L.startAnimation(animation);
                    } else {
                        c2.b.setTarget(fragment.L);
                        c2.b.start();
                    }
                }
            }
            if (fragment.Q) {
                u(fragment);
            }
        } else if (E0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.X0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(int i2, boolean z) {
        androidx.fragment.app.k<?> kVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i2 != this.q) {
            this.q = i2;
            if (P) {
                this.c.r();
            } else {
                for (Fragment fragment : this.c.n()) {
                    M0(fragment);
                }
                for (u uVar : this.c.k()) {
                    Fragment k2 = uVar.k();
                    if (!k2.P) {
                        M0(k2);
                    }
                    if (k2.q && !k2.Z()) {
                        this.c.q(uVar);
                    }
                }
            }
            l1();
            if (this.D && (kVar = this.r) != null && this.q == 7) {
                kVar.q();
                this.D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(Menu menu) {
        boolean z = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && G0(fragment) && fragment.Y0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        P0(fragment, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        m1();
        L(this.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void P0(Fragment fragment, int i2) {
        ViewGroup viewGroup;
        u m2 = this.c.m(fragment.f678j);
        int i3 = 1;
        if (m2 == null) {
            m2 = new u(this.o, this.c, fragment);
            m2.t(1);
        }
        if (fragment.r && fragment.s && fragment.f673e == 2) {
            i2 = Math.max(i2, 2);
        }
        int min = Math.min(i2, m2.d());
        int i4 = fragment.f673e;
        if (i4 <= min) {
            if (i4 < min && !this.m.isEmpty()) {
                m(fragment);
            }
            int i5 = fragment.f673e;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                            }
                            if (min > 4) {
                                m2.u();
                            }
                            if (min > 5) {
                                m2.p();
                            }
                        }
                        if (min > 2) {
                            m2.a();
                        }
                        if (min > 4) {
                        }
                        if (min > 5) {
                        }
                    }
                    if (min > -1) {
                        m2.j();
                    }
                    if (min > 1) {
                        m2.f();
                    }
                    if (min > 2) {
                    }
                    if (min > 4) {
                    }
                    if (min > 5) {
                    }
                }
            } else if (min > -1) {
                m2.c();
            }
            if (min > 0) {
                m2.e();
            }
            if (min > -1) {
            }
            if (min > 1) {
            }
            if (min > 2) {
            }
            if (min > 4) {
            }
            if (min > 5) {
            }
        } else if (i4 > min) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (min < 7) {
                                        m2.n();
                                    }
                                }
                            }
                            if (min < 5) {
                                m2.v();
                            }
                        }
                        if (min < 4) {
                            if (E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.L != null && this.r.o(fragment) && fragment.f675g == null) {
                                m2.s();
                            }
                        }
                    }
                    if (min < 2) {
                        f.d dVar = null;
                        View view = fragment.L;
                        if (!(view == null || (viewGroup = fragment.K) == null)) {
                            viewGroup.endViewTransition(view);
                            fragment.L.clearAnimation();
                            if (!fragment.d0()) {
                                if (this.q > -1 && !this.G && fragment.L.getVisibility() == 0 && fragment.R >= 0.0f) {
                                    dVar = androidx.fragment.app.f.c(this.r.k(), fragment, false, fragment.H());
                                }
                                fragment.R = 0.0f;
                                ViewGroup viewGroup2 = fragment.K;
                                View view2 = fragment.L;
                                if (dVar != null) {
                                    androidx.fragment.app.f.a(fragment, dVar, this.n);
                                }
                                viewGroup2.removeView(view2);
                                if (E0(2)) {
                                    Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != fragment.K) {
                                    return;
                                }
                            }
                        }
                        if (this.m.get(fragment) == null) {
                            m2.h();
                        }
                    }
                }
                if (min < 1) {
                    if (this.m.get(fragment) == null) {
                        m2.g();
                    }
                    if (i3 < 0) {
                        m2.i();
                    }
                    min = i3;
                }
            }
            i3 = min;
            if (i3 < 0) {
            }
            min = i3;
        }
        if (fragment.f673e != min) {
            if (E0(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + min + " found " + fragment.f673e);
            }
            fragment.f673e = min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0() {
        if (this.r != null) {
            this.E = false;
            this.F = false;
            this.M.n(false);
            for (Fragment fragment : this.c.n()) {
                if (fragment != null) {
                    fragment.f0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0(androidx.fragment.app.h hVar) {
        View view;
        for (u uVar : this.c.k()) {
            Fragment k2 = uVar.k();
            if (k2.B == hVar.getId() && (view = k2.L) != null && view.getParent() == null) {
                k2.K = hVar;
                uVar.b();
            }
        }
    }

    void S0(u uVar) {
        Fragment k2 = uVar.k();
        if (!k2.M) {
            return;
        }
        if (this.b) {
            this.H = true;
            return;
        }
        k2.M = false;
        if (P) {
            uVar.m();
        } else {
            O0(k2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        this.F = true;
        this.M.n(true);
        S(4);
    }

    public void T0(int i2, int i3) {
        if (i2 >= 0) {
            Y(new p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        S(2);
    }

    public boolean U0() {
        return V0(null, -1, 0);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f767e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f767e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f766d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.f766d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f771i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f766d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f766d.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f766d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f766d.get(size2);
                        if (str == null || !str.equals(aVar2.t())) {
                            if (i2 < 0 || i2 != aVar2.s) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f766d.size() - 1) {
                return false;
            }
            for (int size3 = this.f766d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f766d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(o oVar, boolean z) {
        if (!z) {
            if (this.r != null) {
                o();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.r != null) {
                this.a.add(oVar);
                f1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    void Y0(Fragment fragment, e.d.l.b bVar) {
        HashSet<e.d.l.b> hashSet = this.m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.m.remove(fragment);
            if (fragment.f673e < 5) {
                w(fragment);
                O0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.v);
        }
        boolean z = !fragment.Z();
        if (!fragment.E || z) {
            this.c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            fragment.q = true;
            j1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Finally extract failed */
    public boolean a0(boolean z) {
        Z(z);
        boolean z2 = false;
        while (k0(this.I, this.J)) {
            this.b = true;
            try {
                a1(this.I, this.J);
                p();
                z2 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        m1();
        V();
        this.c.b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(o oVar, boolean z) {
        if (!z || (this.r != null && !this.G)) {
            Z(z);
            if (oVar.a(this.I, this.J)) {
                this.b = true;
                try {
                    a1(this.I, this.J);
                } finally {
                    p();
                }
            }
            m1();
            V();
            this.c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(Parcelable parcelable) {
        u uVar;
        if (parcelable != null) {
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
            if (pVar.f779e != null) {
                this.c.t();
                Iterator<t> it = pVar.f779e.iterator();
                while (it.hasNext()) {
                    t next = it.next();
                    if (next != null) {
                        Fragment g2 = this.M.g(next.f793f);
                        if (g2 != null) {
                            if (E0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g2);
                            }
                            uVar = new u(this.o, this.c, g2, next);
                        } else {
                            uVar = new u(this.o, this.c, this.r.k().getClassLoader(), p0(), next);
                        }
                        Fragment k2 = uVar.k();
                        k2.w = this;
                        if (E0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k2.f678j + "): " + k2);
                        }
                        uVar.o(this.r.k().getClassLoader());
                        this.c.p(uVar);
                        uVar.t(this.q);
                    }
                }
                for (Fragment fragment : this.M.j()) {
                    if (!this.c.c(fragment.f678j)) {
                        if (E0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f779e);
                        }
                        this.M.m(fragment);
                        fragment.w = this;
                        u uVar2 = new u(this.o, this.c, fragment);
                        uVar2.t(1);
                        uVar2.m();
                        fragment.q = true;
                        uVar2.m();
                    }
                }
                this.c.u(pVar.f780f);
                if (pVar.f781g != null) {
                    this.f766d = new ArrayList<>(pVar.f781g.length);
                    int i2 = 0;
                    while (true) {
                        androidx.fragment.app.b[] bVarArr = pVar.f781g;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        androidx.fragment.app.a a2 = bVarArr[i2].a(this);
                        if (E0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.s + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                            a2.p("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f766d.add(a2);
                        i2++;
                    }
                } else {
                    this.f766d = null;
                }
                this.f771i.set(pVar.f782h);
                String str = pVar.f783i;
                if (str != null) {
                    Fragment f0 = f0(str);
                    this.u = f0;
                    L(f0);
                }
                ArrayList<String> arrayList = pVar.f784j;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Bundle bundle = pVar.f785k.get(i3);
                        bundle.setClassLoader(this.r.k().getClassLoader());
                        this.f772j.put(arrayList.get(i3), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(androidx.fragment.app.a aVar) {
        if (this.f766d == null) {
            this.f766d = new ArrayList<>();
        }
        this.f766d.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable e1() {
        int size;
        j0();
        X();
        a0(true);
        this.E = true;
        this.M.n(true);
        ArrayList<t> v = this.c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (v.isEmpty()) {
            if (E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f766d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.f766d.get(i2));
                if (E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f766d.get(i2));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f779e = v;
        pVar.f780f = w;
        pVar.f781g = bVarArr;
        pVar.f782h = this.f771i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            pVar.f783i = fragment.f678j;
        }
        pVar.f784j.addAll(this.f772j.keySet());
        pVar.f785k.addAll(this.f772j.values());
        pVar.l = new ArrayList<>(this.C);
        return pVar;
    }

    void f(Fragment fragment, e.d.l.b bVar) {
        if (this.m.get(fragment) == null) {
            this.m.put(fragment, new HashSet<>());
        }
        this.m.get(fragment).add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f0(String str) {
        return this.c.f(str);
    }

    void f1() {
        synchronized (this.a) {
            ArrayList<q> arrayList = this.L;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.r.l().removeCallbacks(this.N);
                this.r.l().post(this.N);
                m1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u g(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u v = v(fragment);
        fragment.w = this;
        this.c.p(v);
        if (!fragment.E) {
            this.c.a(fragment);
            fragment.q = false;
            if (fragment.L == null) {
                fragment.Q = false;
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
        return v;
    }

    public Fragment g0(int i2) {
        return this.c.g(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g1(Fragment fragment, boolean z) {
        ViewGroup o0 = o0(fragment);
        if (o0 != null && (o0 instanceof androidx.fragment.app.h)) {
            ((androidx.fragment.app.h) o0).setDrawDisappearingViewsLast(!z);
        }
    }

    public void h(r rVar) {
        this.p.add(rVar);
    }

    public Fragment h0(String str) {
        return this.c.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(Fragment fragment, d.c cVar) {
        if (!fragment.equals(f0(fragment.f678j)) || !(fragment.x == null || fragment.w == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.U = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f771i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i0(String str) {
        return this.c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.f678j)) && (fragment.x == null || fragment.w == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            L(fragment2);
            L(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(androidx.fragment.app.k<?> kVar, androidx.fragment.app.g gVar, Fragment fragment) {
        androidx.fragment.app.k<?> kVar2;
        String str;
        r rVar;
        if (this.r == null) {
            this.r = kVar;
            this.s = gVar;
            this.t = fragment;
            if (fragment != null) {
                rVar = new i(this, fragment);
            } else {
                if (kVar instanceof r) {
                    rVar = (r) kVar;
                }
                if (this.t != null) {
                    m1();
                }
                if (kVar instanceof androidx.activity.c) {
                    androidx.activity.c cVar = (androidx.activity.c) kVar;
                    OnBackPressedDispatcher i2 = cVar.i();
                    this.f769g = i2;
                    androidx.lifecycle.g gVar2 = cVar;
                    if (fragment != null) {
                        gVar2 = fragment;
                    }
                    i2.a(gVar2, this.f770h);
                }
                this.M = fragment == null ? fragment.w.m0(fragment) : kVar instanceof t ? androidx.fragment.app.q.i(((t) kVar).g()) : new androidx.fragment.app.q(false);
                this.M.n(J0());
                this.c.x(this.M);
                kVar2 = this.r;
                if (!(kVar2 instanceof androidx.activity.result.e)) {
                    androidx.activity.result.d c2 = ((androidx.activity.result.e) kVar2).c();
                    if (fragment != null) {
                        str = fragment.f678j + ":";
                    } else {
                        str = "";
                    }
                    String str2 = "FragmentManager:" + str;
                    this.z = c2.i(str2 + "StartActivityForResult", new androidx.activity.result.g.c(), new j());
                    this.A = c2.i(str2 + "StartIntentSenderForResult", new k(), new a());
                    this.B = c2.i(str2 + "RequestPermissions", new androidx.activity.result.g.b(), new b());
                    return;
                }
                return;
            }
            h(rVar);
            if (this.t != null) {
            }
            if (kVar instanceof androidx.activity.c) {
            }
            this.M = fragment == null ? fragment.w.m0(fragment) : kVar instanceof t ? androidx.fragment.app.q.i(((t) kVar).g()) : new androidx.fragment.app.q(false);
            this.M.n(J0());
            this.c.x(this.M);
            kVar2 = this.r;
            if (!(kVar2 instanceof androidx.activity.result.e)) {
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.E) {
            fragment.E = false;
            if (!fragment.p) {
                this.c.a(fragment);
                if (E0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (F0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            fragment.Q = !fragment.Q;
        }
    }

    public w l() {
        return new androidx.fragment.app.a(this);
    }

    public int l0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f766d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    boolean n() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = F0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.g n0() {
        return this.s;
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.w.p0() : this.w;
    }

    public final void q(String str) {
        this.f772j.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v q0() {
        return this.c;
    }

    public List<Fragment> r0() {
        return this.c.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.k<?> s0() {
        return this.r;
    }

    void t(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.r(z3);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.q >= 1) {
            x.C(this.r.k(), this.s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z3) {
            N0(this.q, true);
        }
        for (Fragment fragment : this.c.l()) {
            if (fragment != null && fragment.L != null && fragment.P && aVar.u(fragment.B)) {
                float f2 = fragment.R;
                if (f2 > 0.0f) {
                    fragment.L.setAlpha(f2);
                }
                if (z3) {
                    fragment.R = 0.0f;
                } else {
                    fragment.R = -1.0f;
                    fragment.P = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 t0() {
        return this.f768f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        } else {
            androidx.fragment.app.k<?> kVar = this.r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.r;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.m u0() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u v(Fragment fragment) {
        u m2 = this.c.m(fragment.f678j);
        if (m2 != null) {
            return m2;
        }
        u uVar = new u(this.o, this.c, fragment);
        uVar.o(this.r.k().getClassLoader());
        uVar.t(this.q);
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment v0() {
        return this.t;
    }

    public Fragment w0() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.E) {
            fragment.E = true;
            if (fragment.p) {
                if (E0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.s(fragment);
                if (F0(fragment)) {
                    this.D = true;
                }
                j1(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0 x0() {
        d0 d0Var = this.x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.w.x0() : this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s z0(Fragment fragment) {
        return this.M.k(fragment);
    }
}
