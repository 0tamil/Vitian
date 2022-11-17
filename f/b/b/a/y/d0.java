package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.z;
/* loaded from: classes.dex */
public final class d0 extends z<d0, b> implements Object {
    private static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile a1<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private b0.i<c> keyInfo_ = z.x();
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
    public static final class b extends z.a<d0, b> implements Object {
        private b() {
            super(d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(c cVar) {
            s();
            ((d0) this.f2641f).Q(cVar);
            return this;
        }

        public b z(int i2) {
            s();
            ((d0) this.f2641f).U(i2);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends z<c, a> implements Object {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements Object {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a A(z zVar) {
                s();
                ((c) this.f2641f).W(zVar);
                return this;
            }

            public a B(String str) {
                s();
                ((c) this.f2641f).X(str);
                return this;
            }

            public a y(int i2) {
                s();
                ((c) this.f2641f).U(i2);
                return this;
            }

            public a z(i0 i0Var) {
                s();
                ((c) this.f2641f).V(i0Var);
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

        public static a T() {
            return DEFAULT_INSTANCE.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U(int i2) {
            this.keyId_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(i0 i0Var) {
            this.outputPrefixType_ = i0Var.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(z zVar) {
            this.status_ = zVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int S() {
            return this.keyId_;
        }

        @Override // f.b.b.a.z.a.z
        protected final Object w(z.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return z.F(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        z.L(d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(c cVar) {
        cVar.getClass();
        R();
        this.keyInfo_.add(cVar);
    }

    private void R() {
        if (!this.keyInfo_.f()) {
            this.keyInfo_ = z.D(this.keyInfo_);
        }
    }

    public static b T() {
        return DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i2) {
        this.primaryKeyId_ = i2;
    }

    public c S(int i2) {
        return this.keyInfo_.get(i2);
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<d0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (d0.class) {
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
