package io.flutter.embedding.android;

import android.view.KeyEvent;
import android.view.View;
import io.flutter.plugin.editing.e;
import java.util.HashSet;
/* loaded from: classes.dex */
public class m {
    protected final c[] a;
    private final HashSet<KeyEvent> b = new HashSet<>();
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final View f2966d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        final KeyEvent a;
        int b;
        boolean c = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements c.a {
            boolean a;

            private a() {
                this.a = false;
            }

            @Override // io.flutter.embedding.android.m.c.a
            public void a(boolean z) {
                if (!this.a) {
                    this.a = true;
                    b bVar = b.this;
                    int i2 = bVar.b - 1;
                    bVar.b = i2;
                    boolean z2 = z | bVar.c;
                    bVar.c = z2;
                    if (i2 == 0 && !z2) {
                        m.this.d(bVar.a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        b(KeyEvent keyEvent) {
            this.b = m.this.a.length;
            this.a = keyEvent;
        }

        public c.a a() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {

        /* loaded from: classes.dex */
        public interface a {
            void a(boolean z);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public m(View view, e eVar, c[] cVarArr) {
        this.f2966d = view;
        this.c = eVar;
        this.a = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        if (!this.c.r(keyEvent) && this.f2966d != null) {
            this.b.add(keyEvent);
            this.f2966d.getRootView().dispatchKeyEvent(keyEvent);
            if (this.b.remove(keyEvent)) {
                h.a.b.f("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void b() {
        int size = this.b.size();
        if (size > 0) {
            h.a.b.f("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public boolean c(KeyEvent keyEvent) {
        if (this.b.remove(keyEvent)) {
            return false;
        }
        if (this.a.length > 0) {
            b bVar = new b(keyEvent);
            for (c cVar : this.a) {
                cVar.a(keyEvent, bVar.a());
            }
            return true;
        }
        d(keyEvent);
        return true;
    }
}
