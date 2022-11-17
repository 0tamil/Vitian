package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.q;
import f.b.b.a.z.a.z;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c0 extends z<c0, b> implements Object {
    private static final c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile a1<c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private b0.i<c> key_ = z.x();
    private int primaryKeyId_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[z.f.values().length];
            a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<c0, b> implements Object {
        private b() {
            super(c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public int A() {
            return ((c0) this.f2641f).T();
        }

        public List<c> B() {
            return Collections.unmodifiableList(((c0) this.f2641f).U());
        }

        public b C(int i2) {
            s();
            ((c0) this.f2641f).Y(i2);
            return this;
        }

        public b y(c cVar) {
            s();
            ((c0) this.f2641f).Q(cVar);
            return this;
        }

        public c z(int i2) {
            return ((c0) this.f2641f).S(i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends z<c, a> implements Object {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements Object {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a A(i0 i0Var) {
                s();
                ((c) this.f2641f).a0(i0Var);
                return this;
            }

            public a B(z zVar) {
                s();
                ((c) this.f2641f).b0(zVar);
                return this;
            }

            public a y(y yVar) {
                s();
                ((c) this.f2641f).Y(yVar);
                return this;
            }

            public a z(int i2) {
                s();
                ((c) this.f2641f).Z(i2);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.L(c.class, cVar);
        }

        private c() {
        }

        public static a X() {
            return DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(int i2) {
            this.keyId_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(i0 i0Var) {
            this.outputPrefixType_ = i0Var.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(z zVar) {
            this.status_ = zVar.b();
        }

        public y S() {
            y yVar = this.keyData_;
            return yVar == null ? y.R() : yVar;
        }

        public int T() {
            return this.keyId_;
        }

        public i0 U() {
            i0 a2 = i0.a(this.outputPrefixType_);
            return a2 == null ? i0.UNRECOGNIZED : a2;
        }

        public z V() {
            z a2 = z.a(this.status_);
            return a2 == null ? z.UNRECOGNIZED : a2;
        }

        public boolean W() {
            return this.keyData_ != null;
        }

        @Override // f.b.b.a.z.a.z
        protected final Object w(z.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return z.F(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a1<c> a1Var = PARSER;
                    if (a1Var == null) {
                        synchronized (c.class) {
                            a1Var = PARSER;
                            if (a1Var == null) {
                                a1Var = new z.b<>(DEFAULT_INSTANCE);
                                PARSER = a1Var;
                            }
                        }
                    }
                    return a1Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        z.L(c0.class, c0Var);
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(c cVar) {
        cVar.getClass();
        R();
        this.key_.add(cVar);
    }

    private void R() {
        if (!this.key_.f()) {
            this.key_ = z.D(this.key_);
        }
    }

    public static b W() {
        return DEFAULT_INSTANCE.t();
    }

    public static c0 X(byte[] bArr, q qVar) {
        return (c0) z.H(DEFAULT_INSTANCE, bArr, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i2) {
        this.primaryKeyId_ = i2;
    }

    public c S(int i2) {
        return this.key_.get(i2);
    }

    public int T() {
        return this.key_.size();
    }

    public List<c> U() {
        return this.key_;
    }

    public int V() {
        return this.primaryKeyId_;
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<c0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (c0.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
