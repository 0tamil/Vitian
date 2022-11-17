package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class w {
    int b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    int f802d;

    /* renamed from: e  reason: collision with root package name */
    int f803e;

    /* renamed from: f  reason: collision with root package name */
    int f804f;

    /* renamed from: g  reason: collision with root package name */
    boolean f805g;

    /* renamed from: h  reason: collision with root package name */
    String f806h;

    /* renamed from: i  reason: collision with root package name */
    int f807i;

    /* renamed from: j  reason: collision with root package name */
    CharSequence f808j;

    /* renamed from: k  reason: collision with root package name */
    int f809k;
    CharSequence l;
    ArrayList<String> m;
    ArrayList<String> n;
    ArrayList<Runnable> p;
    ArrayList<a> a = new ArrayList<>();
    boolean o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        int a;
        Fragment b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f810d;

        /* renamed from: e  reason: collision with root package name */
        int f811e;

        /* renamed from: f  reason: collision with root package name */
        int f812f;

        /* renamed from: g  reason: collision with root package name */
        d.c f813g;

        /* renamed from: h  reason: collision with root package name */
        d.c f814h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            d.c cVar = d.c.RESUMED;
            this.f813g = cVar;
            this.f814h = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(j jVar, ClassLoader classLoader) {
    }

    public w b(int i2, Fragment fragment, String str) {
        j(i2, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.K = viewGroup;
        b(viewGroup.getId(), fragment, str);
        return this;
    }

    public w d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.f810d = this.c;
        aVar.f811e = this.f802d;
        aVar.f812f = this.f803e;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public w i() {
        if (!this.f805g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.C;
            if (str2 == null || str.equals(str2)) {
                fragment.C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.C + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.A;
                if (i4 == 0 || i4 == i2) {
                    fragment.A = i2;
                    fragment.B = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.A + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i3, fragment));
    }

    public w k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w l(boolean z) {
        this.o = z;
        return this;
    }
}
