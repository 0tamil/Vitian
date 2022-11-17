package k.a.a.y;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class h {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<h> b = new AtomicReference<>();

    /* loaded from: classes.dex */
    static class a extends h {
        a() {
        }

        @Override // k.a.a.y.h
        protected void b() {
            Iterator it = ServiceLoader.load(i.class, i.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    i.f((i) it.next());
                } catch (ServiceConfigurationError e2) {
                    if (!(e2.getCause() instanceof SecurityException)) {
                        throw e2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        if (!a.getAndSet(true)) {
            AtomicReference<h> atomicReference = b;
            atomicReference.compareAndSet(null, new a());
            atomicReference.get().b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public static void c(h hVar) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!b.compareAndSet(null, hVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    protected abstract void b();
}
