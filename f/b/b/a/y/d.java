package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import f.b.b.a.z.a.z;
/* loaded from: classes.dex */
public final class d extends z<d, b> implements Object {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile a1<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
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
    public static final class b extends z.a<d, b> implements Object {
        private b() {
            super(d.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i2) {
            s();
            ((d) this.f2641f).Y(i2);
            return this;
        }

        public b y(f fVar) {
            s();
            ((d) this.f2641f).W(fVar);
            return this;
        }

        public b z(v vVar) {
            s();
            ((d) this.f2641f).X(vVar);
            return this;
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        z.L(d.class, dVar);
    }

    private d() {
    }

    public static b U() {
        return DEFAULT_INSTANCE.t();
    }

    public static d V(i iVar, q qVar) {
        return (d) z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(f fVar) {
        fVar.getClass();
        this.aesCtrKey_ = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i2) {
        this.version_ = i2;
    }

    public f R() {
        f fVar = this.aesCtrKey_;
        return fVar == null ? f.R() : fVar;
    }

    public v S() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.R() : vVar;
    }

    public int T() {
        return this.version_;
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<d> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (d.class) {
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
