package f.b.c.z;

import f.b.c.b;
import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.w;
import f.b.c.x;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements x, Cloneable {

    /* renamed from: k  reason: collision with root package name */
    public static final d f2714k = new d();

    /* renamed from: h  reason: collision with root package name */
    private boolean f2718h;

    /* renamed from: e  reason: collision with root package name */
    private double f2715e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    private int f2716f = 136;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2717g = true;

    /* renamed from: i  reason: collision with root package name */
    private List<f.b.c.a> f2719i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private List<f.b.c.a> f2720j = Collections.emptyList();

    /* loaded from: classes.dex */
    class a extends w<T> {
        private w<T> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f2721d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.b.c.a0.a f2722e;

        a(boolean z, boolean z2, e eVar, f.b.c.a0.a aVar) {
            this.b = z;
            this.c = z2;
            this.f2721d = eVar;
            this.f2722e = aVar;
        }

        private w<T> f() {
            w<T> wVar = this.a;
            if (wVar != 0) {
                return wVar;
            }
            w<T> l = this.f2721d.l(d.this, this.f2722e);
            this.a = l;
            return l;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // f.b.c.w
        public T c(f.b.c.b0.a aVar) {
            if (!this.b) {
                return f().c(aVar);
            }
            aVar.Q();
            return null;
        }

        @Override // f.b.c.w
        public void e(c cVar, T t) {
            if (this.c) {
                cVar.t();
            } else {
                f().e(cVar, t);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f2715e == -1.0d || m((f.b.c.y.d) cls.getAnnotation(f.b.c.y.d.class), (f.b.c.y.e) cls.getAnnotation(f.b.c.y.e.class))) {
            return (!this.f2717g && i(cls)) || h(cls);
        }
        return true;
    }

    private boolean f(Class<?> cls, boolean z) {
        for (f.b.c.a aVar : z ? this.f2719i : this.f2720j) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !j(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean i(Class<?> cls) {
        return cls.isMemberClass() && !j(cls);
    }

    private boolean j(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean k(f.b.c.y.d dVar) {
        return dVar == null || dVar.value() <= this.f2715e;
    }

    private boolean l(f.b.c.y.e eVar) {
        return eVar == null || eVar.value() > this.f2715e;
    }

    private boolean m(f.b.c.y.d dVar, f.b.c.y.e eVar) {
        return k(dVar) && l(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean c(Class<?> cls, boolean z) {
        return e(cls) || f(cls, z);
    }

    @Override // f.b.c.x
    public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
        Class<? super T> c = aVar.c();
        boolean e2 = e(c);
        boolean z = e2 || f(c, true);
        boolean z2 = e2 || f(c, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    public boolean g(Field field, boolean z) {
        f.b.c.y.a aVar;
        if ((this.f2716f & field.getModifiers()) != 0) {
            return true;
        }
        if (!(this.f2715e == -1.0d || m((f.b.c.y.d) field.getAnnotation(f.b.c.y.d.class), (f.b.c.y.e) field.getAnnotation(f.b.c.y.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f2718h && ((aVar = (f.b.c.y.a) field.getAnnotation(f.b.c.y.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f2717g && i(field.getType())) || h(field.getType())) {
            return true;
        }
        List<f.b.c.a> list = z ? this.f2719i : this.f2720j;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (f.b.c.a aVar2 : list) {
            if (aVar2.b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
