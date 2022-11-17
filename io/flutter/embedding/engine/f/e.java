package io.flutter.embedding.engine.f;

import h.a.d.a.d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.f.e;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements h.a.d.a.d, io.flutter.embedding.engine.f.f {

    /* renamed from: e  reason: collision with root package name */
    private final FlutterJNI f3010e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, f> f3011f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, List<b>> f3012g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f3013h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f3014i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Integer, d.b> f3015j;

    /* renamed from: k  reason: collision with root package name */
    private int f3016k;
    private final d l;
    private WeakHashMap<d.c, d> m;
    private i n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public final ByteBuffer a;
        int b;
        long c;

        b(ByteBuffer byteBuffer, int i2, long j2) {
            this.a = byteBuffer;
            this.b = i2;
            this.c = j2;
        }
    }

    /* loaded from: classes.dex */
    static class c implements d {
        private final ExecutorService a;

        c(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // io.flutter.embedding.engine.f.e.d
        public void a(Runnable runnable) {
            this.a.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void a(Runnable runnable);
    }

    /* renamed from: io.flutter.embedding.engine.f.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0127e implements i {
        ExecutorService a = h.a.a.e().b();

        C0127e() {
        }

        @Override // io.flutter.embedding.engine.f.e.i
        public d a(d.C0120d dVar) {
            return dVar.a() ? new h(this.a) : new c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {
        public final d.a a;
        public final d b;

        f(d.a aVar, d dVar) {
            this.a = aVar;
            this.b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements d.b {
        private final FlutterJNI a;
        private final int b;
        private final AtomicBoolean c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i2) {
            this.a = flutterJNI;
            this.b = i2;
        }

        @Override // h.a.d.a.d.b
        public void a(ByteBuffer byteBuffer) {
            if (this.c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.a.invokePlatformMessageEmptyResponseCallback(this.b);
            } else {
                this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements d {
        private final ExecutorService a;
        private final ConcurrentLinkedQueue<Runnable> b = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void e() {
            if (this.c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.c.set(false);
                    if (!this.b.isEmpty()) {
                        this.a.execute(new Runnable() { // from class: io.flutter.embedding.engine.f.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.h.this.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.f.e.d
        public void a(Runnable runnable) {
            this.b.add(runnable);
            this.a.execute(new Runnable() { // from class: io.flutter.embedding.engine.f.a
                @Override // java.lang.Runnable
                public final void run() {
                    e.h.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        d a(d.C0120d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j implements d.c {
        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FlutterJNI flutterJNI) {
        this(flutterJNI, new C0127e());
    }

    e(FlutterJNI flutterJNI, i iVar) {
        this.f3011f = new HashMap();
        this.f3012g = new HashMap();
        this.f3013h = new Object();
        this.f3014i = new AtomicBoolean(false);
        this.f3015j = new HashMap();
        this.f3016k = 1;
        this.l = new io.flutter.embedding.engine.f.g();
        this.m = new WeakHashMap<>();
        this.f3010e = flutterJNI;
        this.n = iVar;
    }

    private void h(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        d dVar = fVar != null ? fVar.b : null;
        Runnable cVar = new Runnable() { // from class: io.flutter.embedding.engine.f.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.l(str, fVar, byteBuffer, i2, j2);
            }
        };
        if (dVar == null) {
            dVar = this.l;
        }
        dVar.a(cVar);
    }

    private static void i(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    private void j(f fVar, ByteBuffer byteBuffer, int i2) {
        if (fVar != null) {
            try {
                h.a.b.e("DartMessenger", "Deferring to registered handler to process message.");
                fVar.a.a(byteBuffer, new g(this.f3010e, i2));
                return;
            } catch (Error e2) {
                i(e2);
                return;
            } catch (Exception e3) {
                h.a.b.c("DartMessenger", "Uncaught exception in binary message listener", e3);
            }
        } else {
            h.a.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f3010e.invokePlatformMessageEmptyResponseCallback(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void l(String str, f fVar, ByteBuffer byteBuffer, int i2, long j2) {
        h.a.e.d.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            j(fVar, byteBuffer, i2);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f3010e.cleanupMessageData(j2);
            h.a.e.d.b();
        }
    }

    @Override // h.a.d.a.d
    public d.c a(d.C0120d dVar) {
        d a2 = this.n.a(dVar);
        j jVar = new j();
        this.m.put(jVar, a2);
        return jVar;
    }

    @Override // h.a.d.a.d
    public void b(String str, ByteBuffer byteBuffer, d.b bVar) {
        h.a.e.d.a("DartMessenger#send on " + str);
        try {
            h.a.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i2 = this.f3016k;
            this.f3016k = i2 + 1;
            if (bVar != null) {
                this.f3015j.put(Integer.valueOf(i2), bVar);
            }
            if (byteBuffer == null) {
                this.f3010e.dispatchEmptyPlatformMessage(str, i2);
            } else {
                this.f3010e.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
        } finally {
            h.a.e.d.b();
        }
    }

    @Override // io.flutter.embedding.engine.f.f
    public void c(int i2, ByteBuffer byteBuffer) {
        h.a.b.e("DartMessenger", "Received message reply from Dart.");
        d.b remove = this.f3015j.remove(Integer.valueOf(i2));
        if (remove != null) {
            try {
                h.a.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Error e2) {
                i(e2);
            } catch (Exception e3) {
                h.a.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e3);
            }
        }
    }

    @Override // h.a.d.a.d
    public void d(String str, d.a aVar) {
        g(str, aVar, null);
    }

    @Override // h.a.d.a.d
    public /* synthetic */ d.c e() {
        return h.a.d.a.c.a(this);
    }

    @Override // io.flutter.embedding.engine.f.f
    public void f(String str, ByteBuffer byteBuffer, int i2, long j2) {
        f fVar;
        boolean z;
        h.a.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f3013h) {
            fVar = this.f3011f.get(str);
            z = this.f3014i.get() && fVar == null;
            if (z) {
                if (!this.f3012g.containsKey(str)) {
                    this.f3012g.put(str, new LinkedList());
                }
                this.f3012g.get(str).add(new b(byteBuffer, i2, j2));
            }
        }
        if (!z) {
            h(str, fVar, byteBuffer, i2, j2);
        }
    }

    @Override // h.a.d.a.d
    public void g(String str, d.a aVar, d.c cVar) {
        if (aVar == null) {
            h.a.b.e("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f3013h) {
                this.f3011f.remove(str);
            }
            return;
        }
        d dVar = null;
        if (cVar == null || (dVar = this.m.get(cVar)) != null) {
            h.a.b.e("DartMessenger", "Setting handler for channel '" + str + "'");
            synchronized (this.f3013h) {
                this.f3011f.put(str, new f(aVar, dVar));
                List<b> remove = this.f3012g.remove(str);
                if (remove != null) {
                    for (b bVar : remove) {
                        h(str, this.f3011f.get(str), bVar.a, bVar.b, bVar.c);
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
    }
}
