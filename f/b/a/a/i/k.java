package f.b.a.a.i;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
abstract class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
