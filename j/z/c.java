package j.z;

import j.x.d.e;
/* loaded from: classes.dex */
public final class c extends j.z.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f3493i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private static final c f3494j = new c(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final c a() {
            return c.f3494j;
        }
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // j.z.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(h() == cVar.h() && i() == cVar.i())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j.z.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // j.z.a
    public boolean isEmpty() {
        return h() > i();
    }

    public Integer m() {
        return Integer.valueOf(i());
    }

    public Integer n() {
        return Integer.valueOf(h());
    }

    @Override // j.z.a
    public String toString() {
        return h() + ".." + i();
    }
}
