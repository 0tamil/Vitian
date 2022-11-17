package io.flutter.embedding.engine.j;

import h.a.d.a.k;
import h.a.d.a.t;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class j {
    private final k a;
    private f b;
    private final k.c c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        private void a(h.a.d.a.j jVar, k.d dVar) {
            try {
                j.this.b.a(((Integer) jVar.b()).intValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void b(h.a.d.a.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z) {
                    j.this.b.b(new c(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), wrap));
                    dVar.b(null);
                    return;
                }
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d2 = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d2 = ((Double) map.get("left")).doubleValue();
                }
                dVar.b(Long.valueOf(j.this.b.g(new c(intValue, str, doubleValue, d2, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), wrap))));
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void c(h.a.d.a.j jVar, k.d dVar) {
            try {
                j.this.b.h(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void d(h.a.d.a.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                j.this.b.e(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void e(h.a.d.a.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                b c = j.this.b.c(new d(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()));
                if (c == null) {
                    dVar.a("error", "Failed to resize the platform view", null);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("width", Double.valueOf(c.a));
                    hashMap.put("height", Double.valueOf(c.b));
                    dVar.b(hashMap);
                }
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void f(h.a.d.a.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                j.this.b.f(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void g(h.a.d.a.j jVar, k.d dVar) {
            try {
                j.this.b.d(((Boolean) jVar.b()).booleanValue());
                dVar.b(null);
            } catch (IllegalStateException e2) {
                dVar.a("error", j.c(e2), null);
            }
        }

        private void h(h.a.d.a.j jVar, k.d dVar) {
            k.d dVar2;
            IllegalStateException e2;
            List list = (List) jVar.b();
            try {
                j.this.b.i(new e(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e3) {
                e2 = e3;
                dVar2 = dVar;
            }
            try {
                dVar2.b(null);
            } catch (IllegalStateException e4) {
                e2 = e4;
                dVar2.a("error", j.c(e2), null);
            }
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(h.a.d.a.j jVar, k.d dVar) {
            if (j.this.b != null) {
                h.a.b.e("PlatformViewsChannel", "Received '" + jVar.a + "' message.");
                String str = jVar.a;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        b(jVar, dVar);
                        return;
                    case 1:
                        d(jVar, dVar);
                        return;
                    case 2:
                        e(jVar, dVar);
                        return;
                    case 3:
                        a(jVar, dVar);
                        return;
                    case 4:
                        g(jVar, dVar);
                        return;
                    case 5:
                        h(jVar, dVar);
                        return;
                    case 6:
                        f(jVar, dVar);
                        return;
                    case 7:
                        c(jVar, dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final String b;
        public final double c;

        /* renamed from: d  reason: collision with root package name */
        public final double f3080d;

        /* renamed from: e  reason: collision with root package name */
        public final double f3081e;

        /* renamed from: f  reason: collision with root package name */
        public final double f3082f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3083g;

        /* renamed from: h  reason: collision with root package name */
        public final ByteBuffer f3084h;

        public c(int i2, String str, double d2, double d3, double d4, double d5, int i3, ByteBuffer byteBuffer) {
            this.a = i2;
            this.b = str;
            this.f3081e = d2;
            this.f3082f = d3;
            this.c = d4;
            this.f3080d = d5;
            this.f3083g = i3;
            this.f3084h = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final double b;
        public final double c;

        public d(int i2, double d2, double d3) {
            this.a = i2;
            this.b = d2;
            this.c = d3;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final int a;
        public final Number b;
        public final Number c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3085d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3086e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f3087f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f3088g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3089h;

        /* renamed from: i  reason: collision with root package name */
        public final int f3090i;

        /* renamed from: j  reason: collision with root package name */
        public final float f3091j;

        /* renamed from: k  reason: collision with root package name */
        public final float f3092k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        public e(int i2, Number number, Number number2, int i3, int i4, Object obj, Object obj2, int i5, int i6, float f2, float f3, int i7, int i8, int i9, int i10, long j2) {
            this.a = i2;
            this.b = number;
            this.c = number2;
            this.f3085d = i3;
            this.f3086e = i4;
            this.f3087f = obj;
            this.f3088g = obj2;
            this.f3089h = i5;
            this.f3090i = i6;
            this.f3091j = f2;
            this.f3092k = f3;
            this.l = i7;
            this.m = i8;
            this.n = i9;
            this.o = i10;
            this.p = j2;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i2);

        void b(c cVar);

        b c(d dVar);

        void d(boolean z);

        void e(int i2, double d2, double d3);

        void f(int i2, int i3);

        long g(c cVar);

        void h(int i2);

        void i(e eVar);
    }

    public j(io.flutter.embedding.engine.f.d dVar) {
        a aVar = new a();
        this.c = aVar;
        k kVar = new k(dVar, "flutter/platform_views", t.b);
        this.a = kVar;
        kVar.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int i2) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.c("viewFocused", Integer.valueOf(i2));
        }
    }

    public void e(f fVar) {
        this.b = fVar;
    }
}
