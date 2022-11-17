package f.b.a.a.i;

import android.content.Context;
import f.b.a.a.i.a0.j.j0;
import java.io.Closeable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        u a();

        a b(Context context);
    }

    abstract j0 b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract t c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }
}
