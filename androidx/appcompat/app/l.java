package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import java.util.Calendar;
/* loaded from: classes.dex */
class l {

    /* renamed from: d  reason: collision with root package name */
    private static l f157d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        boolean a;
        long b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        long f158d;

        /* renamed from: e  reason: collision with root package name */
        long f159e;

        /* renamed from: f  reason: collision with root package name */
        long f160f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(Context context) {
        if (f157d == null) {
            Context applicationContext = context.getApplicationContext();
            f157d = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f157d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c = c.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (c.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.c.f160f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        k b = k.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b.a;
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.c == 1;
        long j4 = b.b;
        long j5 = b.a;
        boolean z2 = z;
        b.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b.b;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j5 ? 0 + j6 : currentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.a = z2;
        aVar.b = j3;
        aVar.c = j4;
        aVar.f158d = j5;
        aVar.f159e = j6;
        aVar.f160f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
