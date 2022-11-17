package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends w implements n.o {
    final n q;
    boolean r;
    int s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().k().getClassLoader() : null);
        this.s = -1;
        this.q = nVar;
    }

    private static boolean w(w.a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.p && fragment.L != null && !fragment.E && !fragment.D && fragment.b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.f814h = aVar.f813g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f805g) {
            return true;
        }
        this.q.e(this);
        return true;
    }

    @Override // androidx.fragment.app.w
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.w
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.w
    public void h() {
        i();
        this.q.b0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.w
    public void j(int i2, Fragment fragment, String str, int i3) {
        super.j(i2, fragment, str, i3);
        fragment.w = this.q;
    }

    @Override // androidx.fragment.app.w
    public w k(Fragment fragment) {
        n nVar = fragment.w;
        if (nVar == null || nVar == this.q) {
            super.k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i2) {
        w.a aVar;
        if (this.f805g) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.a.get(i3).b;
                if (fragment != null) {
                    fragment.v += i2;
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.v);
                    }
                }
            }
        }
    }

    int n(boolean z) {
        if (!this.r) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                o("  ", printWriter);
                printWriter.close();
            }
            this.r = true;
            this.s = this.f805g ? this.q.i() : -1;
            this.q.Y(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f806h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f804f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f804f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.f802d == 0 && this.f803e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f802d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f803e));
            }
            if (!(this.f807i == 0 && this.f808j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f807i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f808j);
            }
            if (!(this.f809k == 0 && this.l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f809k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                w.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.f810d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f810d));
                    }
                    if (aVar.f811e != 0 || aVar.f812f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f811e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f812f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            w.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.t1(false);
                fragment.r1(this.f804f);
                fragment.v1(this.m, this.n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, false);
                    this.q.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.Z0(fragment);
                    break;
                case 4:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.B0(fragment);
                    break;
                case 5:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, false);
                    this.q.k1(fragment);
                    break;
                case 6:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.x(fragment);
                    break;
                case 7:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, false);
                    this.q.k(fragment);
                    break;
                case 8:
                    this.q.i1(fragment);
                    break;
                case 9:
                    this.q.i1(null);
                    break;
                case 10:
                    this.q.h1(fragment, aVar.f814h);
                    break;
            }
            if (!this.o && aVar.a != 1 && fragment != null && !n.P) {
                this.q.M0(fragment);
            }
        }
        if (!(this.o || n.P)) {
            n nVar = this.q;
            nVar.N0(nVar.q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.t1(true);
                fragment.r1(n.d1(this.f804f));
                fragment.v1(this.n, this.m);
            }
            switch (aVar.a) {
                case 1:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, true);
                    this.q.Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g(fragment);
                    break;
                case 4:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.k1(fragment);
                    break;
                case 5:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, true);
                    this.q.B0(fragment);
                    break;
                case 6:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.k(fragment);
                    break;
                case 7:
                    fragment.m1(aVar.c, aVar.f810d, aVar.f811e, aVar.f812f);
                    this.q.g1(fragment, true);
                    this.q.x(fragment);
                    break;
                case 8:
                    this.q.i1(null);
                    break;
                case 9:
                    this.q.i1(fragment);
                    break;
                case 10:
                    this.q.h1(fragment, aVar.f813g);
                    break;
            }
            if (!this.o && aVar.a != 3 && fragment != null && !n.P) {
                this.q.M0(fragment);
            }
        }
        if (!(this.o || !z || n.P)) {
            n nVar = this.q;
            nVar.N0(nVar.q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            w.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i4 = fragment3.B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.B == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i2, new w.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.f811e = aVar.f811e;
                                aVar2.f810d = aVar.f810d;
                                aVar2.f812f = aVar.f812f;
                                this.a.add(i2, aVar2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i2);
                        i2--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i2, new w.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.a.add(i2, new w.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.b);
            i2++;
        }
        return fragment2;
    }

    public String t() {
        return this.f806h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f806h != null) {
            sb.append(" ");
            sb.append(this.f806h);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.B : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.B : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.B : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (w(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                this.p.get(i2).run();
            }
            this.p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(Fragment.g gVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            w.a aVar = this.a.get(i2);
            if (w(aVar)) {
                aVar.b.s1(gVar);
            }
        }
    }
}
