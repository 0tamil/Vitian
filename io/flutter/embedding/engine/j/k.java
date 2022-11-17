package io.flutter.embedding.engine.j;

import h.a.d.a.j;
import h.a.d.a.k;
import h.a.d.a.t;
import io.flutter.embedding.engine.f.d;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k {
    public final boolean a;
    private byte[] b;
    private h.a.d.a.k c;

    /* renamed from: d  reason: collision with root package name */
    private k.d f3093d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3094e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3095f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f3096g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.d {
        final /* synthetic */ byte[] a;

        a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // h.a.d.a.k.d
        public void a(String str, String str2, Object obj) {
            h.a.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // h.a.d.a.k.d
        public void b(Object obj) {
            k.this.b = this.a;
        }

        @Override // h.a.d.a.k.d
        public void c() {
        }
    }

    /* loaded from: classes.dex */
    class b implements k.c {
        b() {
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            Map i2;
            String str = jVar.a;
            Object obj = jVar.b;
            str.hashCode();
            if (str.equals("get")) {
                k.this.f3095f = true;
                if (!k.this.f3094e) {
                    k kVar = k.this;
                    if (kVar.a) {
                        kVar.f3093d = dVar;
                        return;
                    }
                }
                k kVar2 = k.this;
                i2 = kVar2.i(kVar2.b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                k.this.b = (byte[]) obj;
                i2 = null;
            }
            dVar.b(i2);
        }
    }

    k(h.a.d.a.k kVar, boolean z) {
        this.f3094e = false;
        this.f3095f = false;
        b bVar = new b();
        this.f3096g = bVar;
        this.c = kVar;
        this.a = z;
        kVar.e(bVar);
    }

    public k(d dVar, boolean z) {
        this(new h.a.d.a.k(dVar, "flutter/restoration", t.b), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.b = null;
    }

    public byte[] h() {
        return this.b;
    }

    public void j(byte[] bArr) {
        this.f3094e = true;
        k.d dVar = this.f3093d;
        if (dVar != null) {
            dVar.b(i(bArr));
            this.f3093d = null;
        } else if (this.f3095f) {
            this.c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.b = bArr;
    }
}
