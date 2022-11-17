package e.d.m;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import e.d.o.d;
/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.a = i2;
            this.b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private final Uri a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2088d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2089e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            d.d(uri);
            this.a = uri;
            this.b = i2;
            this.c = i3;
            this.f2088d = z;
            this.f2089e = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        public int b() {
            return this.f2089e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.f2088d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i2, boolean z, int i3, Handler handler, c cVar) {
        e.d.m.a aVar = new e.d.m.a(cVar, handler);
        return z ? e.e(context, dVar, aVar, i2, i3) : e.d(context, dVar, i2, null, aVar);
    }
}
