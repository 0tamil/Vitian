package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.k;
import f.b.c.n;
import f.b.c.o;
import f.b.c.p;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.l;
import java.util.LinkedHashMap;
import java.util.Map;
@Keep
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements x {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    /* loaded from: classes.dex */
    class a extends w<R> {
        final /* synthetic */ Map a;
        final /* synthetic */ Map b;

        a(Map map, Map map2) {
            this.a = map;
            this.b = map2;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [R, java.lang.Object] */
        @Override // f.b.c.w
        public R c(f.b.c.b0.a aVar) {
            k a = l.a(aVar);
            k s = a.i().s(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (s != null) {
                String k2 = s.k();
                w wVar = (w) this.a.get(k2);
                if (wVar != null) {
                    return wVar.a(a);
                }
                throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + k2 + "; did you forget to register a subtype?");
            }
            throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
        }

        @Override // f.b.c.w
        public void e(c cVar, R r) {
            Class<?> cls = r.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            w wVar = (w) this.b.get(cls);
            if (wVar != null) {
                n i2 = wVar.d(r).i();
                if (!i2.r(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    n nVar = new n();
                    nVar.p(RuntimeTypeAdapterFactory.this.typeFieldName, new p(str));
                    for (Map.Entry<String, k> entry : i2.q()) {
                        nVar.p(entry.getKey(), entry.getValue());
                    }
                    l.b(nVar, cVar);
                    return;
                }
                throw new o("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            throw new o("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // f.b.c.x
    public <R> w<R> create(e eVar, f.b.c.a0.a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            w<T> l = eVar.l(this, f.b.c.a0.a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), l);
            linkedHashMap2.put(entry.getValue(), l);
        }
        return new a(linkedHashMap, linkedHashMap2).b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }
}
