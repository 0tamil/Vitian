package f.b.b.a.y;

import f.b.b.a.z.a.a1;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import f.b.b.a.z.a.z;
/* loaded from: classes.dex */
public final class t extends z<t, b> implements Object {
    private static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile a1<t> PARSER;
    private i encryptedKeyset_ = i.f2526f;
    private d0 keysetInfo_;

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
    public static final class b extends z.a<t, b> implements Object {
        private b() {
            super(t.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(i iVar) {
            s();
            ((t) this.f2641f).T(iVar);
            return this;
        }

        public b z(d0 d0Var) {
            s();
            ((t) this.f2641f).U(d0Var);
            return this;
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        z.L(t.class, tVar);
    }

    private t() {
    }

    public static b R() {
        return DEFAULT_INSTANCE.t();
    }

    public static t S(byte[] bArr, q qVar) {
        return (t) z.H(DEFAULT_INSTANCE, bArr, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(i iVar) {
        iVar.getClass();
        this.encryptedKeyset_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(d0 d0Var) {
        d0Var.getClass();
        this.keysetInfo_ = d0Var;
    }

    public i Q() {
        return this.encryptedKeyset_;
    }

    @Override // f.b.b.a.z.a.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new b(null);
            case 3:
                return z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<t> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (t.class) {
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
