package h.a;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.h.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f2865e;
    private f a;
    private io.flutter.embedding.engine.g.a b;
    private FlutterJNI.c c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f2866d;

    /* loaded from: classes.dex */
    public static final class b {
        private f a;
        private io.flutter.embedding.engine.g.a b;
        private FlutterJNI.c c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f2867d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h.a.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ThreadFactoryC0116a implements ThreadFactory {
            private int a;

            private ThreadFactoryC0116a(b bVar) {
                this.a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i2 = this.a;
                this.a = i2 + 1;
                sb.append(i2);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.c == null) {
                this.c = new FlutterJNI.c();
            }
            if (this.f2867d == null) {
                this.f2867d = Executors.newCachedThreadPool(new ThreadFactoryC0116a());
            }
            if (this.a == null) {
                this.a = new f(this.c.a(), this.f2867d);
            }
        }

        public a a() {
            b();
            return new a(this.a, this.b, this.c, this.f2867d);
        }
    }

    private a(f fVar, io.flutter.embedding.engine.g.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.a = fVar;
        this.b = aVar;
        this.c = cVar;
        this.f2866d = executorService;
    }

    public static a e() {
        if (f2865e == null) {
            f2865e = new b().a();
        }
        return f2865e;
    }

    public io.flutter.embedding.engine.g.a a() {
        return this.b;
    }

    public ExecutorService b() {
        return this.f2866d;
    }

    public f c() {
        return this.a;
    }

    public FlutterJNI.c d() {
        return this.c;
    }
}
