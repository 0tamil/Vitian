package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
/* loaded from: classes.dex */
final class SavedStateHandleController implements e {
    private boolean a;
    private final p b;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements e {
        final /* synthetic */ d a;
        final /* synthetic */ SavedStateRegistry b;

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            if (bVar == d.b.ON_START) {
                this.a.c(this);
                this.b.e(a.class);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(c cVar) {
            if (cVar instanceof t) {
                s g2 = ((t) cVar).g();
                SavedStateRegistry j2 = cVar.j();
                for (String str : g2.c()) {
                    SavedStateHandleController.h(g2.b(str), j2, cVar.a());
                }
                if (!g2.c().isEmpty()) {
                    j2.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    static void h(q qVar, SavedStateRegistry savedStateRegistry, d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) qVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.j()) {
            savedStateHandleController.i(savedStateRegistry, dVar);
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            this.a = false;
            gVar.a().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, d dVar) {
        if (this.a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.a = true;
        dVar.a(this);
        this.b.a();
        throw null;
    }

    boolean j() {
        return this.a;
    }
}
