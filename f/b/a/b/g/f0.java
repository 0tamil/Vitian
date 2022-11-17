package f.b.a.b.g;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0<TResult> {
    private final Object a = new Object();
    private Queue<e0<TResult>> b;
    private boolean c;

    public final void a(e0<TResult> e0Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(e0Var);
        }
    }

    public final void b(i<TResult> iVar) {
        e0<TResult> poll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.b.poll();
                        if (poll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    poll.c(iVar);
                }
            }
        }
    }
}
