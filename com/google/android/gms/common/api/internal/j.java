package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j<L> {
    private final Executor a;
    private volatile L b;
    private volatile a<L> c;

    /* loaded from: classes.dex */
    public static final class a<L> {
        private final L a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface b<L> {
        void a(L l);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Looper looper, L l, String str) {
        this.a = new com.google.android.gms.common.util.n.a(looper);
        p.j(l, "Listener must not be null");
        this.b = l;
        p.e(str);
        this.c = new a<>(l, str);
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public a<L> b() {
        return this.c;
    }

    public void c(final b<? super L> bVar) {
        p.j(bVar, "Notifier must not be null");
        this.a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.r1
            @Override // java.lang.Runnable
            public final void run() {
                j.this.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(b<? super L> bVar) {
        Object obj = (L) this.b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e2) {
            bVar.b();
            throw e2;
        }
    }
}
