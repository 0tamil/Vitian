package kotlinx.coroutines.m2;

import j.z.f;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.c0;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: k  reason: collision with root package name */
    public static final b f3886k;
    private static final f0 l;

    static {
        int a;
        int d2;
        b bVar = new b();
        f3886k = bVar;
        a = f.a(64, a0.a());
        d2 = c0.d("kotlinx.coroutines.io.parallelism", a, 0, 0, 12, null);
        l = new e(bVar, d2, "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, null, 7, null);
    }

    public final f0 A() {
        return l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        return "Dispatchers.Default";
    }
}
