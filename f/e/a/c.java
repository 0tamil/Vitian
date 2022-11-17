package f.e.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c implements io.flutter.embedding.engine.i.a, k.c {
    static String m;
    private static HandlerThread o;
    private static Handler p;

    /* renamed from: e  reason: collision with root package name */
    private Context f2818e;

    /* renamed from: f  reason: collision with root package name */
    private k f2819f;

    /* renamed from: g  reason: collision with root package name */
    static final Map<String, Integer> f2813g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f2814h = false;

    /* renamed from: i  reason: collision with root package name */
    private static int f2815i = 0;

    /* renamed from: j  reason: collision with root package name */
    static int f2816j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f2817k = new Object();
    private static final Object l = new Object();
    private static int n = 0;
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, f.e.a.a> q = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f2820e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f2821f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2822g;

        a(j jVar, i iVar, f.e.a.a aVar) {
            this.f2820e = jVar;
            this.f2821f = iVar;
            this.f2822g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.M(this.f2822g, new f.e.a.f.e(this.f2820e, this.f2821f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f2824e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f2825f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2826g;

        b(j jVar, i iVar, f.e.a.a aVar) {
            this.f2824e = jVar;
            this.f2825f = iVar;
            this.f2826g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.e.a.f.e eVar = new f.e.a.f.e(this.f2824e, this.f2825f);
            boolean e2 = eVar.e();
            boolean h2 = eVar.h();
            ArrayList arrayList = new ArrayList();
            for (Map map : (List) this.f2824e.a("operations")) {
                f.e.a.f.c cVar = new f.e.a.f.c(map, e2);
                String l = cVar.l();
                l.hashCode();
                char c = 65535;
                switch (l.hashCode()) {
                    case -1319569547:
                        if (l.equals("execute")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (l.equals("insert")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -838846263:
                        if (l.equals("update")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 107944136:
                        if (l.equals("query")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (c.this.o(this.f2826g, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h2) {
                                cVar.o(this.f2825f);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 1:
                        if (c.this.w(this.f2826g, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h2) {
                                cVar.o(this.f2825f);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 2:
                        if (c.this.O(this.f2826g, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h2) {
                                cVar.o(this.f2825f);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    case 3:
                        if (c.this.M(this.f2826g, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h2) {
                                cVar.o(this.f2825f);
                                return;
                            }
                            cVar.p(arrayList);
                        }
                    default:
                        i iVar = this.f2825f;
                        iVar.a("bad_param", "Batch method '" + l + "' not supported", null);
                        return;
                }
            }
            i iVar2 = this.f2825f;
            if (e2) {
                iVar2.b(null);
            } else {
                iVar2.b(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.e.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0113c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f2828e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f2829f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2830g;

        RunnableC0113c(j jVar, i iVar, f.e.a.a aVar) {
            this.f2828e = jVar;
            this.f2829f = iVar;
            this.f2830g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.w(this.f2830g, new f.e.a.f.e(this.f2828e, this.f2829f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2832e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f2833f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f2834g;

        d(f.e.a.a aVar, j jVar, i iVar) {
            this.f2832e = aVar;
            this.f2833f = jVar;
            this.f2834g = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.p(this.f2832e, this.f2833f, this.f2834g) != null) {
                this.f2834g.b(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f2836e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f2837f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2838g;

        e(j jVar, i iVar, f.e.a.a aVar) {
            this.f2836e = jVar;
            this.f2837f = iVar;
            this.f2838g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.O(this.f2838g, new f.e.a.f.e(this.f2836e, this.f2837f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2840e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f2841f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f2842g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Boolean f2843h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2844i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j f2845j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f2846k;
        final /* synthetic */ int l;

        f(boolean z, String str, i iVar, Boolean bool, f.e.a.a aVar, j jVar, boolean z2, int i2) {
            this.f2840e = z;
            this.f2841f = str;
            this.f2842g = iVar;
            this.f2843h = bool;
            this.f2844i = aVar;
            this.f2845j = jVar;
            this.f2846k = z2;
            this.l = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.l) {
                if (!this.f2840e) {
                    File file = new File(new File(this.f2841f).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        i iVar = this.f2842g;
                        iVar.a("sqlite_error", "open_failed " + this.f2841f, null);
                        return;
                    }
                }
                try {
                    if (Boolean.TRUE.equals(this.f2843h)) {
                        this.f2844i.h();
                    } else {
                        this.f2844i.g();
                    }
                    synchronized (c.f2817k) {
                        if (this.f2846k) {
                            c.f2813g.put(this.f2841f, Integer.valueOf(this.l));
                        }
                        c.q.put(Integer.valueOf(this.l), this.f2844i);
                    }
                    if (f.e.a.b.b(this.f2844i.f2810d)) {
                        Log.d("Sqflite", this.f2844i.d() + "opened " + this.l + " " + this.f2841f);
                    }
                    this.f2842g.b(c.y(this.l, false, false));
                } catch (Exception e2) {
                    c.this.v(e2, new f.e.a.f.e(this.f2845j, this.f2842g), this.f2844i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2847e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f2848f;

        g(f.e.a.a aVar, i iVar) {
            this.f2847e = aVar;
            this.f2848f = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.l) {
                c.this.k(this.f2847e);
            }
            this.f2848f.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.e.a.a f2850e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f2851f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f2852g;

        h(f.e.a.a aVar, String str, i iVar) {
            this.f2850e = aVar;
            this.f2851f = str;
            this.f2852g = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.l) {
                f.e.a.a aVar = this.f2850e;
                if (aVar != null) {
                    c.this.k(aVar);
                }
                try {
                    if (f.e.a.b.c(c.f2816j)) {
                        Log.d("Sqflite", "delete database " + this.f2851f);
                    }
                    f.e.a.a.b(this.f2851f);
                } catch (Exception e2) {
                    Log.e("Sqflite", "error " + e2 + " while closing database " + c.n);
                }
            }
            this.f2852g.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i implements k.d {
        final Handler a;
        private final k.d b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f2854e;

            a(Object obj) {
                this.f2854e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.b(this.f2854e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f2856e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f2857f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object f2858g;

            b(String str, String str2, Object obj) {
                this.f2856e = str;
                this.f2857f = str2;
                this.f2858g = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.a(this.f2856e, this.f2857f, this.f2858g);
            }
        }

        /* renamed from: f.e.a.c$i$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0114c implements Runnable {
            RunnableC0114c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.c();
            }
        }

        private i(c cVar, k.d dVar) {
            this.a = new Handler(Looper.getMainLooper());
            this.b = dVar;
        }

        /* synthetic */ i(c cVar, k.d dVar, a aVar) {
            this(cVar, dVar);
        }

        @Override // h.a.d.a.k.d
        public void a(String str, String str2, Object obj) {
            this.a.post(new b(str, str2, obj));
        }

        @Override // h.a.d.a.k.d
        public void b(Object obj) {
            this.a.post(new a(obj));
        }

        @Override // h.a.d.a.k.d
        public void c() {
            this.a.post(new RunnableC0114c());
        }
    }

    private void A(j jVar, k.d dVar) {
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            p.post(new b(jVar, new i(this, dVar, null), t));
        }
    }

    private void B(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            if (f.e.a.b.b(t.f2810d)) {
                Log.d("Sqflite", t.d() + "closing " + intValue + " " + t.b);
            }
            String str = t.b;
            synchronized (f2817k) {
                q.remove(Integer.valueOf(intValue));
                if (t.a) {
                    f2813g.remove(str);
                }
            }
            p.post(new g(t, new i(this, dVar, null)));
        }
    }

    private void C(j jVar, k.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.a("cmd"))) {
            int i2 = f2816j;
            if (i2 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i2));
            }
            Map<Integer, f.e.a.a> map = q;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, f.e.a.a> entry : map.entrySet()) {
                    f.e.a.a value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.a));
                    int i3 = value.f2810d;
                    if (i3 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i3));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.b(hashMap);
    }

    private void D(j jVar, k.d dVar) {
        f.e.a.e.a.a = Boolean.TRUE.equals(jVar.b());
        f.e.a.e.a.c = f.e.a.e.a.b && f.e.a.e.a.a;
        if (!f.e.a.e.a.a) {
            f2816j = 0;
        } else if (f.e.a.e.a.c) {
            f2816j = 2;
        } else if (f.e.a.e.a.a) {
            f2816j = 1;
        }
        dVar.b(null);
    }

    private void E(j jVar, k.d dVar) {
        f.e.a.a aVar;
        Map<Integer, f.e.a.a> map;
        String str = (String) jVar.a("path");
        synchronized (f2817k) {
            if (f.e.a.b.c(f2816j)) {
                Log.d("Sqflite", "Look for " + str + " in " + f2813g.keySet());
            }
            Map<String, Integer> map2 = f2813g;
            Integer num = map2.get(str);
            if (num == null || (aVar = (map = q).get(num)) == null || !aVar.f2811e.isOpen()) {
                aVar = null;
            } else {
                if (f.e.a.b.c(f2816j)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.d());
                    sb.append("found single instance ");
                    sb.append(aVar.f2812f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        h hVar = new h(aVar, str, new i(this, dVar, null));
        Handler handler = p;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    private void F(j jVar, k.d dVar) {
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            p.post(new d(t, jVar, new i(this, dVar, null)));
        }
    }

    private void H(j jVar, k.d dVar) {
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            p.post(new RunnableC0113c(jVar, new i(this, dVar, null), t));
        }
    }

    private void I(j jVar, k.d dVar) {
        int i2;
        f.e.a.a aVar;
        String str = (String) jVar.a("path");
        Boolean bool = (Boolean) jVar.a("readOnly");
        boolean x = x(str);
        boolean z = !Boolean.FALSE.equals(jVar.a("singleInstance")) && !x;
        if (z) {
            synchronized (f2817k) {
                if (f.e.a.b.c(f2816j)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f2813g.keySet());
                }
                Integer num = f2813g.get(str);
                if (!(num == null || (aVar = q.get(num)) == null)) {
                    if (aVar.f2811e.isOpen()) {
                        if (f.e.a.b.c(f2816j)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.d());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f2812f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.b(y(num.intValue(), true, aVar.f2812f));
                        return;
                    } else if (f.e.a.b.c(f2816j)) {
                        Log.d("Sqflite", aVar.d() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f2817k;
        synchronized (obj) {
            i2 = n + 1;
            n = i2;
        }
        f.e.a.a aVar2 = new f.e.a.a(str, i2, z, f2816j);
        i iVar = new i(this, dVar, null);
        synchronized (obj) {
            if (p == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f2815i);
                o = handlerThread;
                handlerThread.start();
                p = new Handler(o.getLooper());
                if (f.e.a.b.b(aVar2.f2810d)) {
                    Log.d("Sqflite", aVar2.d() + "starting thread" + o + " priority " + f2815i);
                }
            }
            if (f.e.a.b.b(aVar2.f2810d)) {
                Log.d("Sqflite", aVar2.d() + "opened " + i2 + " " + str);
            }
            p.post(new f(x, str, iVar, bool, aVar2, jVar, z, i2));
        }
    }

    private void K(j jVar, k.d dVar) {
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            p.post(new a(jVar, new i(this, dVar, null), t));
        }
    }

    private void L(j jVar, k.d dVar) {
        f.e.a.a t = t(jVar, dVar);
        if (t != null) {
            p.post(new e(jVar, new i(this, dVar, null), t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [f.e.a.f.g, f.e.a.f.f] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public boolean M(f.e.a.a aVar, f.e.a.f.f fVar) {
        Throwable th;
        Exception e2;
        f.e.a.d d2 = fVar.d();
        ArrayList arrayList = new ArrayList();
        if (f.e.a.b.b(aVar.f2810d)) {
            Log.d("Sqflite", aVar.d() + d2);
        }
        boolean z = f2814h;
        Cursor cursor = 0;
        try {
            try {
                f.e.a.d i2 = d2.i();
                Cursor rawQuery = aVar.c().rawQuery(i2.e(), i2.b());
                ArrayList arrayList2 = null;
                int i3 = 0;
                while (rawQuery.moveToNext()) {
                    try {
                        if (z) {
                            Map<String, Object> m2 = m(rawQuery);
                            if (f.e.a.b.b(aVar.f2810d)) {
                                Log.d("Sqflite", aVar.d() + N(m2));
                            }
                            arrayList.add(m2);
                        } else {
                            if (cursor == 0) {
                                ArrayList arrayList3 = new ArrayList();
                                HashMap hashMap = new HashMap();
                                i3 = rawQuery.getColumnCount();
                                hashMap.put("columns", Arrays.asList(rawQuery.getColumnNames()));
                                hashMap.put("rows", arrayList3);
                                arrayList2 = arrayList3;
                                cursor = hashMap;
                            }
                            arrayList2.add(l(rawQuery, i3));
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        cursor = rawQuery;
                        v(e2, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (z) {
                    fVar.b(arrayList);
                } else {
                    if (cursor == 0) {
                        cursor = new HashMap();
                    }
                    fVar.b(cursor);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String N(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? r((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b2 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b2));
        }
        return arrayList.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(f.e.a.a aVar, f.e.a.f.f fVar) {
        Throwable th;
        Exception e2;
        if (!q(aVar, fVar)) {
            return false;
        }
        Cursor cursor = null;
        if (fVar.e()) {
            fVar.b(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = aVar.f().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i2 = rawQuery.getInt(0);
                            if (f.e.a.b.b(aVar.f2810d)) {
                                Log.d("Sqflite", aVar.d() + "changed " + i2);
                            }
                            fVar.b(Integer.valueOf(i2));
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        cursor = rawQuery;
                        v(e2, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", aVar.d() + "fail to read changes for Update/Delete");
                fVar.b(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(f.e.a.a aVar) {
        try {
            if (f.e.a.b.b(aVar.f2810d)) {
                Log.d("Sqflite", aVar.d() + "closing database " + o);
            }
            aVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + n);
        }
        synchronized (f2817k) {
            if (q.isEmpty() && p != null) {
                if (f.e.a.b.b(aVar.f2810d)) {
                    Log.d("Sqflite", aVar.d() + "stopping thread" + o);
                }
                o.quit();
                o = null;
                p = null;
            }
        }
    }

    private static List<Object> l(Cursor cursor, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            Object n2 = n(cursor, i3);
            if (f.e.a.e.a.c) {
                String str = null;
                if (n2 != null) {
                    str = n2.getClass().isArray() ? "array(" + n2.getClass().getComponentType().getName() + ")" : n2.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i3);
                sb.append(" ");
                sb.append(cursor.getType(i3));
                sb.append(": ");
                sb.append(n2);
                sb.append(str == null ? "" : " (" + str + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(n2);
        }
        return arrayList;
    }

    private static Map<String, Object> m(Cursor cursor) {
        Object obj;
        String str;
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f.e.a.e.a.c) {
                Log.d("Sqflite", "column " + i2 + " " + cursor.getType(i2));
            }
            int type = cursor.getType(i2);
            if (type == 0) {
                str = columnNames[i2];
                obj = null;
            } else if (type == 1) {
                str = columnNames[i2];
                obj = Long.valueOf(cursor.getLong(i2));
            } else if (type == 2) {
                str = columnNames[i2];
                obj = Double.valueOf(cursor.getDouble(i2));
            } else if (type != 3) {
                if (type == 4) {
                    hashMap.put(columnNames[i2], cursor.getBlob(i2));
                }
            } else {
                str = columnNames[i2];
                obj = cursor.getString(i2);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static Object n(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(f.e.a.a aVar, f.e.a.f.f fVar) {
        if (!q(aVar, fVar)) {
            return false;
        }
        fVar.b(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f.e.a.a p(f.e.a.a aVar, j jVar, k.d dVar) {
        if (q(aVar, new f.e.a.f.d(dVar, u(jVar), (Boolean) jVar.a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    private boolean q(f.e.a.a aVar, f.e.a.f.f fVar) {
        Boolean bool = Boolean.FALSE;
        f.e.a.d d2 = fVar.d();
        if (f.e.a.b.b(aVar.f2810d)) {
            Log.d("Sqflite", aVar.d() + d2);
        }
        Boolean f2 = fVar.f();
        try {
            try {
                aVar.f().execSQL(d2.e(), d2.f());
                if (Boolean.TRUE.equals(f2)) {
                    aVar.f2812f = true;
                }
                if (bool.equals(f2)) {
                    aVar.f2812f = false;
                }
                return true;
            } catch (Exception e2) {
                v(e2, fVar, aVar);
                if (bool.equals(f2)) {
                    aVar.f2812f = false;
                }
                return false;
            }
        } catch (Throwable th) {
            if (bool.equals(f2)) {
                aVar.f2812f = false;
            }
            throw th;
        }
    }

    private static Map<String, Object> r(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(N(entry.getKey()), value instanceof Map ? r((Map) value) : N(value));
        }
        return hashMap;
    }

    private f.e.a.a s(int i2) {
        return q.get(Integer.valueOf(i2));
    }

    private f.e.a.a t(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        f.e.a.a s = s(intValue);
        if (s != null) {
            return s;
        }
        dVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    private f.e.a.d u(j jVar) {
        return new f.e.a.d((String) jVar.a("sql"), (List) jVar.a("arguments"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Exception exc, f.e.a.f.f fVar, f.e.a.a aVar) {
        String message;
        Map<String, Object> a2;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + aVar.b;
            a2 = null;
        } else {
            boolean z = exc instanceof SQLException;
            message = exc.getMessage();
            a2 = f.e.a.f.h.a(fVar);
        }
        fVar.a("sqlite_error", message, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean w(f.e.a.a aVar, f.e.a.f.f fVar) {
        Throwable th;
        Exception e2;
        Cursor cursor;
        if (!q(aVar, fVar)) {
            return false;
        }
        Cursor cursor2 = null;
        if (fVar.e()) {
            fVar.b(null);
            return true;
        }
        try {
            try {
                cursor = aVar.f().rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            if (cursor.getInt(0) == 0) {
                                if (f.e.a.b.b(aVar.f2810d)) {
                                    Log.d("Sqflite", aVar.d() + "no changes (id was " + cursor.getLong(1) + ")");
                                }
                                fVar.b(null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return true;
                            }
                            long j2 = cursor.getLong(1);
                            if (f.e.a.b.b(aVar.f2810d)) {
                                Log.d("Sqflite", aVar.d() + "inserted " + j2);
                            }
                            fVar.b(Long.valueOf(j2));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        v(e2, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", aVar.d() + "fail to read changes for Insert");
                fVar.b(null);
                if (cursor != null) {
                    cursor.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = "SELECT changes(), last_insert_rowid()";
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    static boolean x(String str) {
        return str == null || str.equals(":memory:");
    }

    static Map y(int i2, boolean z, boolean z2) {
        Boolean bool = Boolean.TRUE;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z) {
            hashMap.put("recovered", bool);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", bool);
        }
        return hashMap;
    }

    private void z(Context context, h.a.d.a.d dVar) {
        this.f2818e = context;
        k kVar = new k(dVar, "com.tekartik.sqflite");
        this.f2819f = kVar;
        kVar.e(this);
    }

    void G(j jVar, k.d dVar) {
        if (m == null) {
            m = this.f2818e.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.b(m);
    }

    void J(j jVar, k.d dVar) {
        Object a2 = jVar.a("queryAsMapList");
        if (a2 != null) {
            f2814h = Boolean.TRUE.equals(a2);
        }
        Object a3 = jVar.a("androidThreadPriority");
        if (a3 != null) {
            f2815i = ((Integer) a3).intValue();
        }
        Integer a4 = f.e.a.b.a(jVar);
        if (a4 != null) {
            f2816j = a4.intValue();
        }
        dVar.b(null);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        z(bVar.a(), bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f2818e = null;
        this.f2819f.e(null);
        this.f2819f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c = '\b';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c = '\t';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c = '\n';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c = 11;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                F(jVar, dVar);
                return;
            case 1:
                B(jVar, dVar);
                return;
            case 2:
                J(jVar, dVar);
                return;
            case 3:
                H(jVar, dVar);
                return;
            case 4:
                L(jVar, dVar);
                return;
            case 5:
                E(jVar, dVar);
                return;
            case 6:
                D(jVar, dVar);
                return;
            case 7:
                I(jVar, dVar);
                return;
            case '\b':
                A(jVar, dVar);
                return;
            case '\t':
                C(jVar, dVar);
                return;
            case '\n':
                K(jVar, dVar);
                return;
            case 11:
                dVar.b("Android " + Build.VERSION.RELEASE);
                return;
            case '\f':
                G(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }
}
