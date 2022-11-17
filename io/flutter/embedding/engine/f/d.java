package io.flutter.embedding.engine.f;

import android.content.res.AssetManager;
import h.a.d.a.d;
import h.a.d.a.u;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public class d implements h.a.d.a.d {

    /* renamed from: e  reason: collision with root package name */
    private final FlutterJNI f3002e;

    /* renamed from: f  reason: collision with root package name */
    private final AssetManager f3003f;

    /* renamed from: g  reason: collision with root package name */
    private final io.flutter.embedding.engine.f.e f3004g;

    /* renamed from: h  reason: collision with root package name */
    private final h.a.d.a.d f3005h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3006i;

    /* renamed from: j  reason: collision with root package name */
    private String f3007j;

    /* renamed from: k  reason: collision with root package name */
    private e f3008k;
    private final d.a l;

    /* loaded from: classes.dex */
    class a implements d.a {
        a() {
        }

        @Override // h.a.d.a.d.a
        public void a(ByteBuffer byteBuffer, d.b bVar) {
            d.this.f3007j = u.b.a(byteBuffer);
            if (d.this.f3008k != null) {
                d.this.f3008k.a(d.this.f3007j);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final AssetManager a;
        public final String b;
        public final FlutterCallbackInformation c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.a = assetManager;
            this.b = str;
            this.c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.b + ", library path: " + this.c.callbackLibraryPath + ", function: " + this.c.callbackName + " )";
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final String b;
        public final String c;

        public c(String str, String str2) {
            this.a = str;
            this.b = null;
            this.c = str2;
        }

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a)) {
                return false;
            }
            return this.c.equals(cVar.c);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.a + ", function: " + this.c + " )";
        }
    }

    /* renamed from: io.flutter.embedding.engine.f.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0126d implements h.a.d.a.d {

        /* renamed from: e  reason: collision with root package name */
        private final io.flutter.embedding.engine.f.e f3009e;

        private C0126d(io.flutter.embedding.engine.f.e eVar) {
            this.f3009e = eVar;
        }

        /* synthetic */ C0126d(io.flutter.embedding.engine.f.e eVar, a aVar) {
            this(eVar);
        }

        @Override // h.a.d.a.d
        public d.c a(d.C0120d dVar) {
            return this.f3009e.a(dVar);
        }

        @Override // h.a.d.a.d
        public void b(String str, ByteBuffer byteBuffer, d.b bVar) {
            this.f3009e.b(str, byteBuffer, bVar);
        }

        @Override // h.a.d.a.d
        public void d(String str, d.a aVar) {
            this.f3009e.d(str, aVar);
        }

        @Override // h.a.d.a.d
        public /* synthetic */ d.c e() {
            return h.a.d.a.c.a(this);
        }

        @Override // h.a.d.a.d
        public void g(String str, d.a aVar, d.c cVar) {
            this.f3009e.g(str, aVar, cVar);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str);
    }

    public d(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f3006i = false;
        a aVar = new a();
        this.l = aVar;
        this.f3002e = flutterJNI;
        this.f3003f = assetManager;
        io.flutter.embedding.engine.f.e eVar = new io.flutter.embedding.engine.f.e(flutterJNI);
        this.f3004g = eVar;
        eVar.d("flutter/isolate", aVar);
        this.f3005h = new C0126d(eVar, null);
        if (flutterJNI.isAttached()) {
            this.f3006i = true;
        }
    }

    @Override // h.a.d.a.d
    @Deprecated
    public d.c a(d.C0120d dVar) {
        return this.f3005h.a(dVar);
    }

    @Override // h.a.d.a.d
    @Deprecated
    public void b(String str, ByteBuffer byteBuffer, d.b bVar) {
        this.f3005h.b(str, byteBuffer, bVar);
    }

    @Override // h.a.d.a.d
    @Deprecated
    public void d(String str, d.a aVar) {
        this.f3005h.d(str, aVar);
    }

    @Override // h.a.d.a.d
    public /* synthetic */ d.c e() {
        return h.a.d.a.c.a(this);
    }

    @Override // h.a.d.a.d
    @Deprecated
    public void g(String str, d.a aVar, d.c cVar) {
        this.f3005h.g(str, aVar, cVar);
    }

    public void i(b bVar) {
        if (this.f3006i) {
            h.a.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        h.a.e.d.a("DartExecutor#executeDartCallback");
        try {
            h.a.b.e("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f3002e;
            String str = bVar.b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.a, null);
            this.f3006i = true;
        } finally {
            h.a.e.d.b();
        }
    }

    public void j(c cVar, List<String> list) {
        if (this.f3006i) {
            h.a.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        h.a.e.d.a("DartExecutor#executeDartEntrypoint");
        try {
            h.a.b.e("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f3002e.runBundleAndSnapshotFromLibrary(cVar.a, cVar.c, cVar.b, this.f3003f, list);
            this.f3006i = true;
        } finally {
            h.a.e.d.b();
        }
    }

    public h.a.d.a.d k() {
        return this.f3005h;
    }

    public String l() {
        return this.f3007j;
    }

    public boolean m() {
        return this.f3006i;
    }

    public void n() {
        if (this.f3002e.isAttached()) {
            this.f3002e.notifyLowMemoryWarning();
        }
    }

    public void o() {
        h.a.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f3002e.setPlatformMessageHandler(this.f3004g);
    }

    public void p() {
        h.a.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f3002e.setPlatformMessageHandler(null);
    }
}
