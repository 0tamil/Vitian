package f.b.a.b.d.d;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.c;
import com.google.android.gms.location.d;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class n0 implements a {
    @Override // com.google.android.gms.location.a
    public final g<Status> a(f fVar, LocationRequest locationRequest, c cVar) {
        p.j(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return fVar.h(new j0(this, fVar, locationRequest, cVar));
    }

    @Override // com.google.android.gms.location.a
    public final Location b(f fVar) {
        String str;
        s a = d.a(fVar);
        Context j2 = fVar.j();
        try {
            if (Build.VERSION.SDK_INT >= 30 && j2 != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(j2, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return a.t0(str);
            }
            return a.t0(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }

    @Override // com.google.android.gms.location.a
    public final g<Status> c(f fVar, c cVar) {
        return fVar.h(new k0(this, fVar, cVar));
    }

    @Override // com.google.android.gms.location.a
    public final LocationAvailability d(f fVar) {
        try {
            return d.a(fVar).p0();
        } catch (Exception unused) {
            return null;
        }
    }
}
