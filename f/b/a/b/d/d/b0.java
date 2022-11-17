package f.b.a.b.d.d;

import android.os.Looper;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public final class b0 {
    public static Looper a() {
        p.l(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
