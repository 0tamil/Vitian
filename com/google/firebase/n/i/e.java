package com.google.firebase.n.i;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.n.b;
import com.google.firebase.n.c;
import com.google.firebase.n.d;
import com.google.firebase.n.f;
import com.google.firebase.n.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
final class e implements com.google.firebase.n.e, g {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f1852d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f1853e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Object> f1854f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1855g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.f1852d = map;
        this.f1853e = map2;
        this.f1854f = dVar;
        this.f1855g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) {
        v();
        this.c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    private e u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        return i(obj, false);
    }

    private void v() {
        if (this.b) {
            e eVar = this.a;
            if (eVar != null) {
                eVar.v();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.n.g
    public /* bridge */ /* synthetic */ g a(String str) {
        j(str);
        return this;
    }

    @Override // com.google.firebase.n.g
    public /* bridge */ /* synthetic */ g b(boolean z) {
        o(z);
        return this;
    }

    @Override // com.google.firebase.n.e
    public com.google.firebase.n.e c(c cVar, boolean z) {
        n(cVar.b(), z);
        return this;
    }

    @Override // com.google.firebase.n.e
    public com.google.firebase.n.e d(c cVar, long j2) {
        l(cVar.b(), j2);
        return this;
    }

    @Override // com.google.firebase.n.e
    public com.google.firebase.n.e e(c cVar, int i2) {
        k(cVar.b(), i2);
        return this;
    }

    @Override // com.google.firebase.n.e
    public com.google.firebase.n.e f(c cVar, Object obj) {
        return m(cVar.b(), obj);
    }

    public e g(int i2) {
        v();
        this.c.value(i2);
        return this;
    }

    public e h(long j2) {
        v();
        this.c.value(j2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e i(Object obj, boolean z) {
        int[] iArr;
        int i2 = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                p((byte[]) obj);
                return this;
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i2 < length) {
                    this.c.value(iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    h(jArr[i2]);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    this.c.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    this.c.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    i(obj2, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object obj3 : (Collection) obj) {
                i(obj3, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                }
            }
            this.c.endObject();
            return this;
        } else {
            d<?> dVar = this.f1852d.get(obj.getClass());
            if (dVar != null) {
                s(dVar, obj, z);
                return this;
            }
            f<?> fVar = this.f1853e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                j(((Enum) obj).name());
                return this;
            } else {
                s(this.f1854f, obj, z);
                return this;
            }
        }
    }

    public e j(String str) {
        v();
        this.c.value(str);
        return this;
    }

    public e k(String str, int i2) {
        v();
        this.c.name(str);
        g(i2);
        return this;
    }

    public e l(String str, long j2) {
        v();
        this.c.name(str);
        h(j2);
        return this;
    }

    public e m(String str, Object obj) {
        return this.f1855g ? u(str, obj) : t(str, obj);
    }

    public e n(String str, boolean z) {
        v();
        this.c.name(str);
        o(z);
        return this;
    }

    public e o(boolean z) {
        v();
        this.c.value(z);
        return this;
    }

    public e p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        v();
        this.c.flush();
    }

    e s(d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        dVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
