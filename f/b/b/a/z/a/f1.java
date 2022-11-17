package f.b.b.a.z.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements q0 {
    private final s0 a;
    private final String b;
    private final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2520d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.a = s0Var;
        this.b = str;
        this.c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i2 = charAt2 & 8191;
            int i3 = 13;
            int i4 = 1;
            while (true) {
                i4++;
                charAt = str.charAt(i4);
                if (charAt < 55296) {
                    break;
                }
                i2 |= (charAt & 8191) << i3;
                i3 += 13;
            }
            charAt2 = i2 | (charAt << i3);
        }
        this.f2520d = charAt2;
    }

    @Override // f.b.b.a.z.a.q0
    public c1 a() {
        return (this.f2520d & 1) == 1 ? c1.PROTO2 : c1.PROTO3;
    }

    @Override // f.b.b.a.z.a.q0
    public s0 b() {
        return this.a;
    }

    @Override // f.b.b.a.z.a.q0
    public boolean c() {
        return (this.f2520d & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}
