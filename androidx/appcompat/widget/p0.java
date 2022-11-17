package androidx.appcompat.widget;
/* loaded from: classes.dex */
class p0 {
    private int a = 0;
    private int b = 0;
    private int c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f455d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f456e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f457f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f458g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f459h = false;

    public int a() {
        return this.f458g ? this.a : this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f458g ? this.b : this.a;
    }

    public void e(int i2, int i3) {
        this.f459h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f456e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f457f = i3;
            this.b = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(boolean z) {
        int i2;
        if (z != this.f458g) {
            this.f458g = z;
            if (!this.f459h) {
                this.a = this.f456e;
            } else if (z) {
                int i3 = this.f455d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f456e;
                }
                this.a = i3;
                i2 = this.c;
            } else {
                int i4 = this.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f456e;
                }
                this.a = i4;
                i2 = this.f455d;
            }
            i2 = this.f457f;
            this.b = i2;
        }
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.f455d = i3;
        this.f459h = true;
        if (this.f458g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
