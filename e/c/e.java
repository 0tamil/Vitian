package e.c;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class e<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2027d;

    /* renamed from: e  reason: collision with root package name */
    private int f2028e;

    /* renamed from: f  reason: collision with root package name */
    private int f2029f;

    /* renamed from: g  reason: collision with root package name */
    private int f2030g;

    /* renamed from: h  reason: collision with root package name */
    private int f2031h;

    public e(int i2) {
        if (i2 > 0) {
            this.c = i2;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int e(K k2, V v) {
        int f2 = f(k2, v);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z, K k2, V v, V v2) {
    }

    public final V c(K k2) {
        V put;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v = this.a.get(k2);
            if (v != null) {
                this.f2030g++;
                return v;
            }
            this.f2031h++;
            V a = a(k2);
            if (a == null) {
                return null;
            }
            synchronized (this) {
                this.f2028e++;
                put = this.a.put(k2, a);
                if (put != null) {
                    this.a.put(k2, put);
                } else {
                    this.b += e(k2, a);
                }
            }
            if (put != null) {
                b(false, k2, a, put);
                return put;
            }
            g(this.c);
            return a;
        }
    }

    public final V d(K k2, V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2027d++;
            this.b += e(k2, v);
            put = this.a.put(k2, v);
            if (put != null) {
                this.b -= e(k2, put);
            }
        }
        if (put != null) {
            b(false, k2, put, v);
        }
        g(this.c);
        return put;
    }

    protected int f(K k2, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.b >= 0 && (!this.a.isEmpty() || this.b == 0)) {
                    if (this.b <= i2 || this.a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.a.remove(key);
                    this.b -= e(key, value);
                    this.f2029f++;
                } else {
                    break;
                }
            }
            b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f2030g;
        i3 = this.f2031h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f2030g), Integer.valueOf(this.f2031h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
