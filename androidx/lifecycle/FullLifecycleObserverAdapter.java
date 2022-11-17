package androidx.lifecycle;

import androidx.lifecycle.d;
/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements e {
    private final b a;
    private final e b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.a = bVar;
        this.b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.a.c(gVar);
                break;
            case 2:
                this.a.g(gVar);
                break;
            case 3:
                this.a.a(gVar);
                break;
            case 4:
                this.a.e(gVar);
                break;
            case 5:
                this.a.f(gVar);
                break;
            case 6:
                this.a.b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.b;
        if (eVar != null) {
            eVar.d(gVar, bVar);
        }
    }
}
