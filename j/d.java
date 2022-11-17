package j;

import j.x.d.i;
/* loaded from: classes.dex */
public final class d implements Comparable<d> {

    /* renamed from: i  reason: collision with root package name */
    public static final d f3438i = e.a();

    /* renamed from: e  reason: collision with root package name */
    private final int f3439e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3440f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3441g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3442h;

    public d(int i2, int i3, int i4) {
        this.f3439e = i2;
        this.f3440f = i3;
        this.f3441g = i4;
        this.f3442h = c(i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
        if ((r7 >= 0 && r7 < 256) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int c(int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= 0 && i2 < 256) {
            if (i3 >= 0 && i3 < 256) {
            }
        }
        z = false;
        if (z) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        i.d(dVar, "other");
        return this.f3442h - dVar.f3442h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f3442h == dVar.f3442h;
    }

    public int hashCode() {
        return this.f3442h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3439e);
        sb.append('.');
        sb.append(this.f3440f);
        sb.append('.');
        sb.append(this.f3441g);
        return sb.toString();
    }
}
