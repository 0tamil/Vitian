package f.b.b.a.z.a;

import f.b.b.a.z.a.a;
import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.e;
import f.b.b.a.z.a.s0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.v;
import f.b.b.a.z.a.z;
import f.b.b.a.z.a.z.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends f.b.b.a.z.a.a<MessageType, BuilderType> {
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected p1 unknownFields = p1.e();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0100a<MessageType, BuilderType> {

        /* renamed from: e  reason: collision with root package name */
        private final MessageType f2640e;

        /* renamed from: f  reason: collision with root package name */
        protected MessageType f2641f;

        /* renamed from: g  reason: collision with root package name */
        protected boolean f2642g = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f2640e = messagetype;
            this.f2641f = (MessageType) messagetype.u(f.NEW_MUTABLE_INSTANCE);
        }

        private void x(MessageType messagetype, MessageType messagetype2) {
            d1.a().e(messagetype).a(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.b.b.a.z.a.a.AbstractC0100a
        protected /* bridge */ /* synthetic */ a.AbstractC0100a l(f.b.b.a.z.a.a aVar) {
            v((z) aVar);
            return this;
        }

        /* renamed from: o */
        public final MessageType a() {
            MessageType q = p();
            if (q.k()) {
                return q;
            }
            throw a.AbstractC0100a.n(q);
        }

        /* renamed from: q */
        public MessageType p() {
            if (this.f2642g) {
                return this.f2641f;
            }
            this.f2641f.C();
            this.f2642g = true;
            return this.f2641f;
        }

        /* renamed from: r */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) g().f();
            buildertype.w(p());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            if (this.f2642g) {
                t();
                this.f2642g = false;
            }
        }

        protected void t() {
            MessageType messagetype = (MessageType) this.f2641f.u(f.NEW_MUTABLE_INSTANCE);
            x(messagetype, this.f2641f);
            this.f2641f = messagetype;
        }

        /* renamed from: u */
        public MessageType g() {
            return this.f2640e;
        }

        protected BuilderType v(MessageType messagetype) {
            w(messagetype);
            return this;
        }

        public BuilderType w(MessageType messagetype) {
            s();
            x(this.f2641f, messagetype);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends z<T, ?>> extends f.b.b.a.z.a.b<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        /* renamed from: g */
        public T b(j jVar, q qVar) {
            return (T) z.J(this.a, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends z<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected v<d> extensions = v.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public v<d> N() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* loaded from: classes.dex */
    static final class d implements v.b<d> {

        /* renamed from: e  reason: collision with root package name */
        final b0.d<?> f2643e;

        /* renamed from: f  reason: collision with root package name */
        final int f2644f;

        /* renamed from: g  reason: collision with root package name */
        final u1.b f2645g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f2646h;

        /* renamed from: i  reason: collision with root package name */
        final boolean f2647i;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f2644f - dVar.f2644f;
        }

        @Override // f.b.b.a.z.a.v.b
        public int b() {
            return this.f2644f;
        }

        public b0.d<?> c() {
            return this.f2643e;
        }

        @Override // f.b.b.a.z.a.v.b
        public boolean f() {
            return this.f2646h;
        }

        @Override // f.b.b.a.z.a.v.b
        public u1.b i() {
            return this.f2645g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.b.b.a.z.a.v.b
        public s0.a m(s0.a aVar, s0 s0Var) {
            a aVar2 = (a) aVar;
            aVar2.w((z) s0Var);
            return aVar2;
        }

        @Override // f.b.b.a.z.a.v.b
        public u1.c n() {
            return this.f2645g.a();
        }

        @Override // f.b.b.a.z.a.v.b
        public boolean o() {
            return this.f2647i;
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends s0, Type> extends o<ContainingType, Type> {
        final s0 a;
        final d b;

        public u1.b a() {
            return this.b.i();
        }

        public s0 b() {
            return this.a;
        }

        public int c() {
            return this.b.b();
        }

        public boolean d() {
            return this.b.f2646h;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends z<T, ?>> boolean B(T t, boolean z) {
        byte byteValue = ((Byte) t.u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = d1.a().e(t).b(t);
        if (z) {
            t.v(f.SET_MEMOIZED_IS_INITIALIZED, b2 ? t : null);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> b0.i<E> D(b0.i<E> iVar) {
        int size = iVar.size();
        return iVar.d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object F(s0 s0Var, String str, Object[] objArr) {
        return new f1(s0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T G(T t, i iVar, q qVar) {
        T t2 = (T) I(t, iVar, qVar);
        s(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T H(T t, byte[] bArr, q qVar) {
        T t2 = (T) K(t, bArr, 0, bArr.length, qVar);
        s(t2);
        return t2;
    }

    private static <T extends z<T, ?>> T I(T t, i iVar, q qVar) {
        try {
            j s = iVar.s();
            T t2 = (T) J(t, s, qVar);
            try {
                s.a(0);
                return t2;
            } catch (c0 e2) {
                e2.i(t2);
                throw e2;
            }
        } catch (c0 e3) {
            throw e3;
        }
    }

    static <T extends z<T, ?>> T J(T t, j jVar, q qVar) {
        T t2 = (T) t.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e2 = d1.a().e(t2);
            e2.h(t2, k.S(jVar), qVar);
            e2.i(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof c0) {
                throw ((c0) e3.getCause());
            }
            c0 c0Var = new c0(e3.getMessage());
            c0Var.i(t2);
            throw c0Var;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof c0) {
                throw ((c0) e4.getCause());
            }
            throw e4;
        }
    }

    static <T extends z<T, ?>> T K(T t, byte[] bArr, int i2, int i3, q qVar) {
        T t2 = (T) t.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e2 = d1.a().e(t2);
            e2.d(t2, bArr, i2, i2 + i3, new e.b(qVar));
            e2.i(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e3) {
            if (e3.getCause() instanceof c0) {
                throw ((c0) e3.getCause());
            }
            c0 c0Var = new c0(e3.getMessage());
            c0Var.i(t2);
            throw c0Var;
        } catch (IndexOutOfBoundsException unused) {
            c0 j2 = c0.j();
            j2.i(t2);
            throw j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<?, ?>> void L(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends z<T, ?>> T s(T t) {
        if (t == null || t.k()) {
            return t;
        }
        c0 a2 = t.o().a();
        a2.i(t);
        throw a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> b0.i<E> x() {
        return e1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends z<?, ?>> T y(Class<T> cls) {
        z<?, ?> zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zVar == null) {
            zVar = (T) ((z) s1.i(cls)).g();
            if (zVar != null) {
                defaultInstanceMap.put(cls, zVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zVar;
    }

    protected void C() {
        d1.a().e(this).i(this);
    }

    /* renamed from: E */
    public final BuilderType f() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    /* renamed from: M */
    public final BuilderType h() {
        BuilderType buildertype = (BuilderType) u(f.NEW_BUILDER);
        buildertype.w(this);
        return buildertype;
    }

    @Override // f.b.b.a.z.a.s0
    public void c(l lVar) {
        d1.a().e(this).e(this, m.P(lVar));
    }

    @Override // f.b.b.a.z.a.s0
    public int e() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d1.a().e(this).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g().getClass().isInstance(obj)) {
            return false;
        }
        return d1.a().e(this).c(this, (z) obj);
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int j2 = d1.a().e(this).j(this);
        this.memoizedHashCode = j2;
        return j2;
    }

    @Override // f.b.b.a.z.a.s0
    public final a1<MessageType> j() {
        return (a1) u(f.GET_PARSER);
    }

    @Override // f.b.b.a.z.a.t0
    public final boolean k() {
        return B(this, true);
    }

    @Override // f.b.b.a.z.a.a
    int l() {
        return this.memoizedSerializedSize;
    }

    @Override // f.b.b.a.z.a.a
    void q(int i2) {
        this.memoizedSerializedSize = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object r() {
        return u(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType t() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    public String toString() {
        return u0.e(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object u(f fVar) {
        return w(fVar, null, null);
    }

    protected Object v(f fVar, Object obj) {
        return w(fVar, obj, null);
    }

    protected abstract Object w(f fVar, Object obj, Object obj2);

    /* renamed from: z */
    public final MessageType g() {
        return (MessageType) u(f.GET_DEFAULT_INSTANCE);
    }
}
