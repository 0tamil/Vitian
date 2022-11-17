package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;
    final ArrayDeque<b> b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {
        private final d a;
        private final b b;
        private androidx.activity.a c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.a = dVar;
            this.b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.c(this);
            this.b.e(this);
            androidx.activity.a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            if (bVar == d.b.ON_START) {
                this.c = OnBackPressedDispatcher.this.b(this.b);
            } else if (bVar == d.b.ON_STOP) {
                androidx.activity.a aVar = this.c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == d.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(g gVar, b bVar) {
        d a2 = gVar.a();
        if (a2.b() != d.c.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }

    androidx.activity.a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
