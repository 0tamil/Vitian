package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.z;
/* loaded from: classes.dex */
public final class a0 extends z<a0, b> implements Object {
    private static final a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile a1<a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private i value_ = i.f2526f;

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
    public static final class b extends z.a<a0, b> implements Object {
        private b() {
            super(a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(i iVar) {
            s();
            ((a0) this.f2641f).Y(iVar);
            return this;
        }

        public b y(i0 i0Var) {
            s();
            ((a0) this.f2641f).W(i0Var);
            return this;
        }

        public b z(String str) {
            s();
            ((a0) this.f2641f).X(str);
            return this;
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        z.L(a0.class, a0Var);
    }

    private a0() {
    }

    public static a0 R() {
        return DEFAULT_INSTANCE;
    }

    public static b V() {
        return DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(i0 i0Var) {
        this.outputPrefixType_ = i0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    public i0 S() {
        i0 a2 = i0.a(this.outputPrefixType_);
        return a2 == null ? i0.UNRECOGNIZED : a2;
    }

    public String T() {
        return this.typeUrl_;
    }

    public i U() {
        return this.value_;
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<a0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (a0.class) {
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
