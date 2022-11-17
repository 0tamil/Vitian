package e.d.p.f0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class c {
    private final AbstractC0078c a;

    /* loaded from: classes.dex */
    private static final class a implements AbstractC0078c {
        final InputContentInfo a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public void a() {
            this.a.requestPermission();
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Uri b() {
            return this.a.getLinkUri();
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public ClipDescription c() {
            return this.a.getDescription();
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Object d() {
            return this.a;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Uri e() {
            return this.a.getContentUri();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements AbstractC0078c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public void a() {
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Uri b() {
            return this.c;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public ClipDescription c() {
            return this.b;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Object d() {
            return null;
        }

        @Override // e.d.p.f0.c.AbstractC0078c
        public Uri e() {
            return this.a;
        }
    }

    /* renamed from: e.d.p.f0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface AbstractC0078c {
        void a();

        Uri b();

        ClipDescription c();

        Object d();

        Uri e();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private c(AbstractC0078c cVar) {
        this.a = cVar;
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.e();
    }

    public ClipDescription b() {
        return this.a.c();
    }

    public Uri c() {
        return this.a.b();
    }

    public void d() {
        this.a.a();
    }

    public Object e() {
        return this.a.d();
    }
}
