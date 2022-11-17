package e.d.n;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {
    public static final e.d.n.d a = new C0072e(null, false);
    public static final e.d.n.d b = new C0072e(null, true);
    public static final e.d.n.d c = new C0072e(b.a, false);

    /* loaded from: classes.dex */
    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // e.d.n.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int a = e.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i2++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // e.d.n.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                i5 = e.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements e.d.n.d {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i2, int i3) {
            int a = this.a.a(charSequence, i2, i3);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return b();
            }
            return false;
        }

        @Override // e.d.n.d
        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence != null && i2 >= 0 && i3 >= 0 && charSequence.length() - i3 >= i2) {
                return this.a == null ? b() : c(charSequence, i2, i3);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* renamed from: e.d.n.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0072e extends d {
        private final boolean b;

        C0072e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // e.d.n.e.d
        protected boolean b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        @Override // e.d.n.e.d
        protected boolean b() {
            return e.d.n.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.b;
        f fVar = f.b;
    }

    static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
