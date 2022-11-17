package androidx.lifecycle;

import androidx.lifecycle.d;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    static final Object f859j = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f860d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f861e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f862f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f864h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f865i;
    final Object a = new Object();
    private e.b.a.b.b<m<? super T>, LiveData<T>.b> b = new e.b.a.b.b<>();
    int c = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f863g = -1;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.b implements e {

        /* renamed from: e  reason: collision with root package name */
        final g f866e;

        LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.f866e = gVar;
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            d.c b = this.f866e.a().b();
            if (b == d.c.DESTROYED) {
                LiveData.this.i(this.a);
                return;
            }
            for (d.c cVar = null; cVar != b; cVar = b) {
                h(k());
                b = this.f866e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void i() {
            this.f866e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean j(g gVar) {
            return this.f866e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean k() {
            return this.f866e.a().b().a(d.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    private class a extends LiveData<T>.b {
        a(LiveData liveData, m<? super T> mVar) {
            super(mVar);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean k() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b {
        final m<? super T> a;
        boolean b;
        int c = -1;

        b(m<? super T> mVar) {
            this.a = mVar;
        }

        void h(boolean z) {
            if (z != this.b) {
                this.b = z;
                LiveData.this.b(z ? 1 : -1);
                if (this.b) {
                    LiveData.this.d(this);
                }
            }
        }

        void i() {
        }

        boolean j(g gVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f859j;
        this.f862f = obj;
        this.f861e = obj;
    }

    static void a(String str) {
        if (!e.b.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(LiveData<T>.b bVar) {
        if (bVar.b) {
            if (!bVar.k()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.c;
            int i3 = this.f863g;
            if (i2 < i3) {
                bVar.c = i3;
                bVar.a.a((Object) this.f861e);
            }
        }
    }

    void b(int i2) {
        int i3 = this.c;
        this.c = i2 + i3;
        if (!this.f860d) {
            this.f860d = true;
            while (true) {
                try {
                    int i4 = this.c;
                    if (i3 != i4) {
                        boolean z = i3 == 0 && i4 > 0;
                        boolean z2 = i3 > 0 && i4 == 0;
                        if (z) {
                            g();
                        } else if (z2) {
                            h();
                        }
                        i3 = i4;
                    } else {
                        return;
                    }
                } finally {
                    this.f860d = false;
                }
            }
        }
    }

    void d(LiveData<T>.b bVar) {
        if (this.f864h) {
            this.f865i = true;
            return;
        }
        this.f864h = true;
        do {
            this.f865i = false;
            if (bVar == null) {
                e.b.a.b.b<m<? super T>, LiveData<T>.b>.d k2 = this.b.k();
                while (k2.hasNext()) {
                    c((b) k2.next().getValue());
                    if (this.f865i) {
                        break;
                    }
                }
            } else {
                c(bVar);
                bVar = null;
            }
        } while (this.f865i);
        this.f864h = false;
    }

    public void e(g gVar, m<? super T> mVar) {
        a("observe");
        if (gVar.a().b() != d.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            LiveData<T>.b n = this.b.n(mVar, lifecycleBoundObserver);
            if (n != null && !n.j(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (n == null) {
                gVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void f(m<? super T> mVar) {
        a("observeForever");
        a aVar = new a(this, mVar);
        LiveData<T>.b n = this.b.n(mVar, aVar);
        if (n instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (n == null) {
            aVar.h(true);
        }
    }

    protected void g() {
    }

    protected void h() {
    }

    public void i(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.b o = this.b.o(mVar);
        if (o != null) {
            o.i();
            o.h(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(T t) {
        a("setValue");
        this.f863g++;
        this.f861e = t;
        d(null);
    }
}
