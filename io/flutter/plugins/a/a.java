package io.flutter.plugins.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import h.a.d.a.d;
import h.a.d.a.j;
import h.a.d.a.k;
import h.a.d.a.t;
import io.flutter.embedding.engine.i.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a implements io.flutter.embedding.engine.i.a, k.c {

    /* renamed from: e  reason: collision with root package name */
    private Context f3206e;

    /* renamed from: f  reason: collision with root package name */
    private k f3207f;

    /* renamed from: g  reason: collision with root package name */
    private c f3208g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements c {
        private b() {
        }

        @Override // io.flutter.plugins.a.a.c
        public void a(k.d dVar) {
            dVar.b(a.this.h());
        }

        @Override // io.flutter.plugins.a.a.c
        public void b(k.d dVar) {
            dVar.b(a.this.k());
        }

        @Override // io.flutter.plugins.a.a.c
        public void c(k.d dVar) {
            dVar.b(a.this.i());
        }

        @Override // io.flutter.plugins.a.a.c
        public void d(k.d dVar) {
            dVar.b(a.this.l());
        }

        @Override // io.flutter.plugins.a.a.c
        public void e(String str, k.d dVar) {
            dVar.b(a.this.j(str));
        }

        @Override // io.flutter.plugins.a.a.c
        public void f(k.d dVar) {
            dVar.b(a.this.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        void a(k.d dVar);

        void b(k.d dVar);

        void c(k.d dVar);

        void d(k.d dVar);

        void e(String str, k.d dVar);

        void f(k.d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g() {
        return h.a.e.a.d(this.f3206e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h() {
        return h.a.e.a.c(this.f3206e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> i() {
        File[] externalCacheDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f3206e.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f3206e.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> j(String str) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f3206e.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f3206e.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        File externalFilesDir = this.f3206e.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        return this.f3206e.getCacheDir().getPath();
    }

    private void m(d dVar, Context context) {
        try {
            this.f3207f = new k(dVar, "plugins.flutter.io/path_provider_android", t.b, dVar.e());
            this.f3208g = new b();
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f3206e = context;
        this.f3207f.e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        m(bVar.b(), bVar.a());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3207f.e(null);
        this.f3207f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1832373352:
                if (str.equals("getApplicationSupportDirectory")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1208689078:
                if (str.equals("getExternalCacheDirectories")) {
                    c2 = 1;
                    break;
                }
                break;
            case 299667825:
                if (str.equals("getExternalStorageDirectories")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1200320591:
                if (str.equals("getApplicationDocumentsDirectory")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1252916648:
                if (str.equals("getStorageDirectory")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1711844626:
                if (str.equals("getTemporaryDirectory")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f3208g.f(dVar);
                return;
            case 1:
                this.f3208g.c(dVar);
                return;
            case 2:
                this.f3208g.e(io.flutter.plugins.a.b.a((Integer) jVar.a("type")), dVar);
                return;
            case 3:
                this.f3208g.a(dVar);
                return;
            case 4:
                this.f3208g.b(dVar);
                return;
            case 5:
                this.f3208g.d(dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }
}
