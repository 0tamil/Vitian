package e.i.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import e.c.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends e.i.a.a {
    static boolean c = false;
    private final g a;
    private final c b;

    /* loaded from: classes.dex */
    public static class a<D> extends l<D> {

        /* renamed from: k  reason: collision with root package name */
        private final int f2164k;
        private final Bundle l;
        private final e.i.b.a<D> m;
        private g n;
        private C0081b<D> o;
        private e.i.b.a<D> p;

        @Override // androidx.lifecycle.LiveData
        protected void g() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.d();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void h() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void i(m<? super D> mVar) {
            super.i(mVar);
            this.n = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void j(D d2) {
            super.j(d2);
            e.i.b.a<D> aVar = this.p;
            if (aVar != null) {
                aVar.c();
                throw null;
            }
        }

        e.i.b.a<D> k(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.a();
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2164k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            e.i.b.a<D> aVar = this.m;
            aVar.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        void m() {
            g gVar = this.n;
            C0081b<D> bVar = this.o;
            if (gVar != null && bVar != null) {
                super.i(bVar);
                e(gVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2164k);
            sb.append(" : ");
            e.d.o.b.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.i.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0081b<D> implements m<D> {
    }

    /* loaded from: classes.dex */
    static class c extends q {
        private static final r.a c = new a();
        private h<a> b = new h<>();

        /* loaded from: classes.dex */
        static class a implements r.a {
            a() {
            }

            @Override // androidx.lifecycle.r.a
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c f(s sVar) {
            return (c) new r(sVar, c).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.q
        public void d() {
            super.d();
            if (this.b.k() <= 0) {
                this.b.c();
            } else {
                this.b.l(0).k(true);
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.b.k() > 0) {
                    a l = this.b.l(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.i(0));
                    printWriter.print(": ");
                    printWriter.println(l.toString());
                    l.l(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        void g() {
            int k2 = this.b.k();
            for (int i2 = 0; i2 < k2; i2++) {
                this.b.l(i2).m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar, s sVar) {
        this.a = gVar;
        this.b = c.f(sVar);
    }

    @Override // e.i.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // e.i.a.a
    public void c() {
        this.b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        e.d.o.b.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
