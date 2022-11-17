package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends androidx.lifecycle.q {

    /* renamed from: i  reason: collision with root package name */
    private static final r.a f786i = new a();

    /* renamed from: e  reason: collision with root package name */
    private final boolean f788e;
    private final HashMap<String, Fragment> b = new HashMap<>();
    private final HashMap<String, q> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, s> f787d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f789f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f790g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f791h = false;

    /* loaded from: classes.dex */
    class a implements r.a {
        a() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends androidx.lifecycle.q> T a(Class<T> cls) {
            return new q(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(boolean z) {
        this.f788e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q i(s sVar) {
        return (q) new r(sVar, f786i).a(q.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.q
    public void d() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f789f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (this.f791h) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.b.containsKey(fragment.f678j)) {
            this.b.put(fragment.f678j, fragment);
            if (n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.f787d.equals(qVar.f787d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.c.get(fragment.f678j);
        if (qVar != null) {
            qVar.d();
            this.c.remove(fragment.f678j);
        }
        s sVar = this.f787d.get(fragment.f678j);
        if (sVar != null) {
            sVar.a();
            this.f787d.remove(fragment.f678j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(String str) {
        return this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q h(Fragment fragment) {
        q qVar = this.c.get(fragment.f678j);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f788e);
        this.c.put(fragment.f678j, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.f787d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> j() {
        return new ArrayList(this.b.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s k(Fragment fragment) {
        s sVar = this.f787d.get(fragment.f678j);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s();
        this.f787d.put(fragment.f678j, sVar2);
        return sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f789f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        if (!this.f791h) {
            if ((this.b.remove(fragment.f678j) != null) && n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (n.E0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z) {
        this.f791h = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        if (!this.b.containsKey(fragment.f678j)) {
            return true;
        }
        return this.f788e ? this.f789f : !this.f790g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f787d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
