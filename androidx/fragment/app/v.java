package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, u> b = new HashMap<>();
    private q c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i2) {
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                uVar.t(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u uVar : this.b.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment k2 = uVar.k();
                    printWriter.println(k2);
                    k2.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.a.get(i2).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        u uVar = this.b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.A == i2) {
                return fragment;
            }
        }
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment k2 = uVar.k();
                if (k2.A == i2) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment k2 = uVar.k();
                if (str.equals(k2.C)) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment l;
        for (u uVar : this.b.values()) {
            if (!(uVar == null || (l = uVar.k().l(str)) == null)) {
                return l;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.K;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.a.get(i2);
            if (fragment2.K == viewGroup && (view2 = fragment2.L) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.K == viewGroup && (view = fragment3.L) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u m(String str) {
        return this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q o() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(u uVar) {
        Fragment k2 = uVar.k();
        if (!c(k2.f678j)) {
            this.b.put(k2.f678j, uVar);
            if (k2.G) {
                if (k2.F) {
                    this.c.e(k2);
                } else {
                    this.c.m(k2);
                }
                k2.G = false;
            }
            if (n.E0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(u uVar) {
        Fragment k2 = uVar.k();
        if (k2.F) {
            this.c.m(k2);
        }
        if (this.b.put(k2.f678j, null) != null && n.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            u uVar = this.b.get(it.next().f678j);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u uVar2 : this.b.values()) {
            if (uVar2 != null) {
                uVar2.m();
                Fragment k2 = uVar2.k();
                if (k2.q && !k2.Z()) {
                    q(uVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f2 = f(str);
                if (f2 != null) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.b.size());
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment k2 = uVar.k();
                t r = uVar.r();
                arrayList.add(r);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k2 + ": " + r.q);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f678j);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f678j + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(q qVar) {
        this.c = qVar;
    }
}
