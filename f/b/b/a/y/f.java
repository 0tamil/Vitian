package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import f.b.b.a.z.a.z;
/* loaded from: classes.dex */
public final class f extends z<f, b> implements Object {
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile a1<f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i keyValue_ = i.f2526f;
    private h params_;
    private int version_;

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
    public static final class b extends z.a<f, b> implements Object {
        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i2) {
            s();
            ((f) this.f2641f).Z(i2);
            return this;
        }

        public b y(i iVar) {
            s();
            ((f) this.f2641f).X(iVar);
            return this;
        }

        public b z(h hVar) {
            s();
            ((f) this.f2641f).Y(hVar);
            return this;
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        z.L(f.class, fVar);
    }

    private f() {
    }

    public static f R() {
        return DEFAULT_INSTANCE;
    }

    public static b V() {
        return DEFAULT_INSTANCE.t();
    }

    public static f W(i iVar, q qVar) {
        return (f) z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(h hVar) {
        hVar.getClass();
        this.params_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i2) {
        this.version_ = i2;
    }

    public i S() {
        return this.keyValue_;
    }

    public h T() {
        h hVar = this.params_;
        return hVar == null ? h.O() : hVar;
    }

    public int U() {
        return this.version_;
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<f> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (f.class) {
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
