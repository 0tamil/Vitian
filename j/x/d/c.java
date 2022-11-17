package j.x.d;

import j.c0.n;
import j.s.i;
import j.s.y;
import j.s.z;
import j.x.c.b;
import j.x.c.d;
import j.x.c.e;
import j.x.c.f;
import j.x.c.g;
import j.x.c.h;
import j.x.c.j;
import j.x.c.k;
import j.x.c.l;
import j.x.c.m;
import j.x.c.o;
import j.x.c.p;
import j.x.c.q;
import j.x.c.r;
import j.x.c.s;
import j.x.c.t;
import j.x.c.u;
import j.x.c.v;
import j.x.c.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c implements j.a0.c<Object>, b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3474f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Class<? extends j.c<?>>, Integer> f3475g;

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String> f3476h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String> f3477i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String> f3478j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<String, String> f3479k;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f3480e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            Method enclosingMethod;
            String S;
            String T;
            String T2;
            i.d(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        i.c(simpleName, "name");
                        T2 = n.T(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (T2 != null) {
                            return T2;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    i.c(simpleName, "name");
                    if (enclosingConstructor != null) {
                        T = n.T(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                        return T;
                    }
                    S = n.S(simpleName, '$', null, 2, null);
                    return S;
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) c.f3479k.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) c.f3479k.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List d2;
        int g2;
        Map<Class<? extends j.c<?>>, Integer> g3;
        int a2;
        String V;
        String V2;
        int i2 = 0;
        d2 = i.d(j.x.c.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, j.x.c.c.class, d.class, e.class, f.class, g.class, h.class, j.x.c.i.class, j.class, k.class, m.class, j.x.c.n.class, o.class);
        g2 = j.s.j.g(d2, 10);
        ArrayList arrayList = new ArrayList(g2);
        for (Object obj : d2) {
            i2++;
            if (i2 >= 0) {
                arrayList.add(j.o.a((Class) obj, Integer.valueOf(i2)));
            } else {
                j.s.g.f();
                throw null;
            }
        }
        g3 = z.g(arrayList);
        f3475g = g3;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f3476h = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f3477i = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.c(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.c(str, "kotlinName");
            V2 = n.V(str, '.', null, 2, null);
            sb.append(V2);
            sb.append("CompanionObject");
            j.k a3 = j.o.a(sb.toString(), str + ".Companion");
            hashMap3.put(a3.c(), a3.d());
        }
        for (Map.Entry<Class<? extends j.c<?>>, Integer> entry : f3475g.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f3478j = hashMap3;
        a2 = y.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            V = n.V((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, V);
        }
        f3479k = linkedHashMap;
    }

    public c(Class<?> cls) {
        i.d(cls, "jClass");
        this.f3480e = cls;
    }

    @Override // j.a0.c
    public String a() {
        return f3474f.a(b());
    }

    @Override // j.x.d.b
    public Class<?> b() {
        return this.f3480e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(j.x.a.a(this), j.x.a.a((j.a0.c) obj));
    }

    public int hashCode() {
        return j.x.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
