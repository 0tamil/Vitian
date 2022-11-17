package com.google.firebase.n.j;

import com.google.firebase.n.b;
import com.google.firebase.n.c;
import com.google.firebase.n.d;
import com.google.firebase.n.e;
import com.google.firebase.n.f;
import com.google.firebase.n.j.f;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
final class g implements e {

    /* renamed from: g  reason: collision with root package name */
    private static final c f1862g;

    /* renamed from: h  reason: collision with root package name */
    private static final c f1863h;
    private OutputStream a;
    private final Map<Class<?>, d<?>> b;
    private final Map<Class<?>, f<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final d<Object> f1865d;

    /* renamed from: e  reason: collision with root package name */
    private final i f1866e = new i(this);

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f1861f = Charset.forName("UTF-8");

    /* renamed from: i  reason: collision with root package name */
    private static final d<Map.Entry<Object, Object>> f1864i = com.google.firebase.n.j.a.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.a.values().length];
            a = iArr;
            try {
                iArr[f.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        c.b a2 = c.a("key");
        c b = c.b();
        b.c(1);
        a2.b(b.a());
        f1862g = a2.a();
        c.b a3 = c.a("value");
        c b2 = c.b();
        b2.c(2);
        a3.b(b2.a());
        f1863h = a3.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, com.google.firebase.n.f<?>> map2, d<Object> dVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.f1865d = dVar;
    }

    private static ByteBuffer n(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long o(d<T> dVar, T t) {
        d dVar2 = new d();
        try {
            OutputStream outputStream = this.a;
            this.a = dVar2;
            dVar.a(t, this);
            this.a = outputStream;
            long b = dVar2.b();
            dVar2.close();
            return b;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> g p(d<T> dVar, c cVar, T t, boolean z) {
        long o = o(dVar, t);
        if (z && o == 0) {
            return this;
        }
        v((t(cVar) << 3) | 2);
        w(o);
        dVar.a(t, this);
        return this;
    }

    private <T> g q(com.google.firebase.n.f<T> fVar, c cVar, T t, boolean z) {
        this.f1866e.d(cVar, z);
        fVar.a(t, this.f1866e);
        return this;
    }

    private static f s(c cVar) {
        f fVar = (f) cVar.c(f.class);
        if (fVar != null) {
            return fVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int t(c cVar) {
        f fVar = (f) cVar.c(f.class);
        if (fVar != null) {
            return fVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void u(Map.Entry entry, e eVar) {
        eVar.f(f1862g, entry.getKey());
        eVar.f(f1863h, entry.getValue());
    }

    private void v(int i2) {
        while (true) {
            int i3 = ((i2 & (-128)) > 0L ? 1 : ((i2 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 != 0) {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & 127);
                return;
            }
        }
    }

    private void w(long j2) {
        while (true) {
            int i2 = (((-128) & j2) > 0L ? 1 : (((-128) & j2) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } else {
                outputStream.write(((int) j2) & 127);
                return;
            }
        }
    }

    e a(c cVar, double d2, boolean z) {
        if (z && d2 == 0.0d) {
            return this;
        }
        v((t(cVar) << 3) | 1);
        this.a.write(n(8).putDouble(d2).array());
        return this;
    }

    e b(c cVar, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        v((t(cVar) << 3) | 5);
        this.a.write(n(4).putFloat(f2).array());
        return this;
    }

    @Override // com.google.firebase.n.e
    public /* bridge */ /* synthetic */ e c(c cVar, boolean z) {
        l(cVar, z);
        return this;
    }

    @Override // com.google.firebase.n.e
    public /* bridge */ /* synthetic */ e d(c cVar, long j2) {
        j(cVar, j2);
        return this;
    }

    @Override // com.google.firebase.n.e
    public /* bridge */ /* synthetic */ e e(c cVar, int i2) {
        h(cVar, i2);
        return this;
    }

    @Override // com.google.firebase.n.e
    public e f(c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e g(c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            v((t(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f1861f);
            v(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                g(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                p(f1864i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            a(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            b(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            k(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m(cVar, ((Boolean) obj).booleanValue(), z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            v((t(cVar) << 3) | 2);
            v(bArr.length);
            this.a.write(bArr);
            return this;
        } else {
            d<?> dVar = this.b.get(obj.getClass());
            if (dVar != null) {
                p(dVar, cVar, obj, z);
                return this;
            }
            com.google.firebase.n.f<?> fVar = this.c.get(obj.getClass());
            if (fVar != null) {
                q(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof e) {
                h(cVar, ((e) obj).b());
                return this;
            } else if (obj instanceof Enum) {
                h(cVar, ((Enum) obj).ordinal());
                return this;
            } else {
                p(this.f1865d, cVar, obj, z);
                return this;
            }
        }
    }

    public g h(c cVar, int i2) {
        i(cVar, i2, true);
        return this;
    }

    g i(c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        f s = s(cVar);
        int i3 = a.a[s.intEncoding().ordinal()];
        if (i3 == 1) {
            v(s.tag() << 3);
            v(i2);
        } else if (i3 == 2) {
            v(s.tag() << 3);
            v((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            v((s.tag() << 3) | 5);
            this.a.write(n(4).putInt(i2).array());
        }
        return this;
    }

    public g j(c cVar, long j2) {
        k(cVar, j2, true);
        return this;
    }

    g k(c cVar, long j2, boolean z) {
        if (z && j2 == 0) {
            return this;
        }
        f s = s(cVar);
        int i2 = a.a[s.intEncoding().ordinal()];
        if (i2 == 1) {
            v(s.tag() << 3);
            w(j2);
        } else if (i2 == 2) {
            v(s.tag() << 3);
            w((j2 >> 63) ^ (j2 << 1));
        } else if (i2 == 3) {
            v((s.tag() << 3) | 1);
            this.a.write(n(8).putLong(j2).array());
        }
        return this;
    }

    public g l(c cVar, boolean z) {
        m(cVar, z, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g m(c cVar, boolean z, boolean z2) {
        i(cVar, z ? 1 : 0, z2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g r(Object obj) {
        if (obj == null) {
            return this;
        }
        d<?> dVar = this.b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
