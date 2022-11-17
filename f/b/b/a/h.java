package f.b.b.a;

import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.s0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class h<KeyProtoT extends s0> {
    private final Class<KeyProtoT> a;
    private final Map<Class<?>, b<?, KeyProtoT>> b;
    private final Class<?> c;

    /* loaded from: classes.dex */
    public static abstract class a<KeyFormatProtoT extends s0, KeyT> {
        private final Class<KeyFormatProtoT> a;

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.a;
        }

        public abstract KeyFormatProtoT c(i iVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class b<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> a;

        public b(Class<PrimitiveT> cls) {
            this.a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);

        final Class<PrimitiveT> b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public h(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (b<?, KeyProtoT> bVar : bVarArr) {
            if (!hashMap.containsKey(bVar.b())) {
                hashMap.put(bVar.b(), bVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
        }
        this.c = bVarArr.length > 0 ? bVarArr[0].b() : Void.class;
        this.b = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> a() {
        return this.c;
    }

    public final Class<KeyProtoT> b() {
        return this.a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        b<?, KeyProtoT> bVar = this.b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> e();

    public abstract y.c f();

    public abstract KeyProtoT g(i iVar);

    public final Set<Class<?>> h() {
        return this.b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}
