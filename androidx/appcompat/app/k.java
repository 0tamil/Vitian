package androidx.appcompat.app;
/* loaded from: classes.dex */
class k {

    /* renamed from: d  reason: collision with root package name */
    private static k f156d;
    public long a;
    public long b;
    public int c;

    k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k b() {
        if (f156d == null) {
            f156d = new k();
        }
        return f156d;
    }

    public void a(long j2, double d2, double d3) {
        float f2;
        float f3;
        double d4;
        double d5 = (0.01720197f * (((float) (j2 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d5) * 0.03341960161924362d) + d5 + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((f2 - 9.0E-4f) - d4)) + 9.0E-4f + ((-d3) / 360.0d) + (Math.sin(d5) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.c = 1;
        } else if (sin2 <= -1.0d) {
            this.c = 0;
        } else {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.b = round2;
            if (round2 >= j2 || this.a <= j2) {
                this.c = 1;
                return;
            } else {
                this.c = 0;
                return;
            }
        }
        this.a = -1L;
        this.b = -1L;
    }
}
