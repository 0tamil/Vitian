package j.z;

import j.s.v;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: e  reason: collision with root package name */
    private final int f3489e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3490f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3491g;

    /* renamed from: h  reason: collision with root package name */
    private int f3492h;

    public b(int i2, int i3, int i4) {
        this.f3489e = i4;
        this.f3490f = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f3491g = z;
        this.f3492h = !z ? i3 : i2;
    }

    @Override // j.s.v
    public int b() {
        int i2 = this.f3492h;
        if (i2 != this.f3490f) {
            this.f3492h = this.f3489e + i2;
        } else if (this.f3491g) {
            this.f3491g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3491g;
    }
}
