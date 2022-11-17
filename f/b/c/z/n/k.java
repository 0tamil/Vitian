package f.b.c.z.n;

import f.b.c.d;
import f.b.c.e;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.i;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class k implements x {

    /* renamed from: e  reason: collision with root package name */
    private final f.b.c.z.c f2755e;

    /* renamed from: f  reason: collision with root package name */
    private final d f2756f;

    /* renamed from: g  reason: collision with root package name */
    private final f.b.c.z.d f2757g;

    /* renamed from: h  reason: collision with root package name */
    private final e f2758h;

    /* renamed from: i  reason: collision with root package name */
    private final f.b.c.z.o.b f2759i = f.b.c.z.o.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f2760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2761e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f2762f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f2763g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f.b.c.a0.a f2764h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f2765i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, String str, boolean z, boolean z2, Field field, boolean z3, w wVar, e eVar, f.b.c.a0.a aVar, boolean z4) {
            super(str, z, z2);
            this.f2760d = field;
            this.f2761e = z3;
            this.f2762f = wVar;
            this.f2763g = eVar;
            this.f2764h = aVar;
            this.f2765i = z4;
        }

        @Override // f.b.c.z.n.k.c
        void a(f.b.c.b0.a aVar, Object obj) {
            Object c = this.f2762f.c(aVar);
            if (c != null || !this.f2765i) {
                this.f2760d.set(obj, c);
            }
        }

        @Override // f.b.c.z.n.k.c
        void b(f.b.c.b0.c cVar, Object obj) {
            (this.f2761e ? this.f2762f : new m(this.f2763g, this.f2762f, this.f2764h.e())).e(cVar, this.f2760d.get(obj));
        }

        @Override // f.b.c.z.n.k.c
        public boolean c(Object obj) {
            return this.b && this.f2760d.get(obj) != obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends w<T> {
        private final i<T> a;
        private final Map<String, c> b;

        b(i<T> iVar, Map<String, c> map) {
            this.a = iVar;
            this.b = map;
        }

        @Override // f.b.c.w
        public T c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            T a = this.a.a();
            try {
                aVar.c();
                while (aVar.q()) {
                    c cVar = this.b.get(aVar.A());
                    if (cVar != null && cVar.c) {
                        cVar.a(aVar, a);
                    }
                    aVar.Q();
                }
                aVar.l();
                return a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new s(e3);
            }
        }

        @Override // f.b.c.w
        public void e(f.b.c.b0.c cVar, T t) {
            if (t == null) {
                cVar.t();
                return;
            }
            cVar.f();
            try {
                for (c cVar2 : this.b.values()) {
                    if (cVar2.c(t)) {
                        cVar.r(cVar2.a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.l();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {
        final String a;
        final boolean b;
        final boolean c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        abstract void a(f.b.c.b0.a aVar, Object obj);

        abstract void b(f.b.c.b0.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public k(f.b.c.z.c cVar, d dVar, f.b.c.z.d dVar2, e eVar) {
        this.f2755e = cVar;
        this.f2756f = dVar;
        this.f2757g = dVar2;
        this.f2758h = eVar;
    }

    private c a(e eVar, Field field, String str, f.b.c.a0.a<?> aVar, boolean z, boolean z2) {
        boolean a2 = f.b.c.z.k.a(aVar.c());
        f.b.c.y.b bVar = (f.b.c.y.b) field.getAnnotation(f.b.c.y.b.class);
        w<?> a3 = bVar != null ? this.f2758h.a(this.f2755e, eVar, aVar, bVar) : null;
        boolean z3 = a3 != null;
        if (a3 == null) {
            a3 = eVar.j(aVar);
        }
        return new a(this, str, z, z2, field, z3, a3, eVar, aVar, a2);
    }

    static boolean c(Field field, boolean z, f.b.c.z.d dVar) {
        return !dVar.c(field.getType(), z) && !dVar.g(field, z);
    }

    private Map<String, c> d(e eVar, f.b.c.a0.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = aVar.e();
        f.b.c.a0.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean b2 = b(field, true);
                boolean b3 = b(field, z);
                if (b2 || b3) {
                    this.f2759i.b(field);
                    Type p = f.b.c.z.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> e3 = e(field);
                    c cVar = null;
                    int size = e3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = e3.get(i3);
                        boolean z2 = i3 != 0 ? false : b2;
                        int i4 = i3;
                        Field field2 = field;
                        c cVar2 = cVar;
                        size = size;
                        e3 = e3;
                        field = field;
                        cVar = (c) linkedHashMap.put(str, a(eVar, field2, str, f.b.c.a0.a.b(p), z2, b3));
                        if (cVar2 != null) {
                            cVar = cVar2;
                        }
                        i3 = i4 + 1;
                        b2 = z2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e2 + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = f.b.c.a0.a.b(f.b.c.z.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        f.b.c.y.c cVar = (f.b.c.y.c) field.getAnnotation(f.b.c.y.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f2756f.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z) {
        return c(field, z, this.f2757g);
    }

    @Override // f.b.c.x
    public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.f2755e.a(aVar), d(eVar, aVar, c2));
    }
}
