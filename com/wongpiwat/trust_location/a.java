package com.wongpiwat.trust_location;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.e;
/* loaded from: classes.dex */
public class a implements f.b, f.c, com.google.android.gms.location.c {
    private final Context a;
    private androidx.appcompat.app.c b;
    private l c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1883d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1884e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1885f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1886g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1887h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1888i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1889j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1890k;
    private boolean l;
    private boolean m;
    private com.google.android.gms.common.api.f n;
    private LocationRequest o;
    private Status p;
    private boolean q;
    private int r;
    private Location s;
    private int t;
    private final DialogInterface.OnClickListener u = new b();
    private final View.OnClickListener v = new c();
    private final DialogInterface.OnClickListener w = new d();
    private final View.OnClickListener x = new e();
    private final DialogInterface.OnClickListener y = new f();
    private final View.OnClickListener z = new g();
    private final com.google.android.gms.common.api.k<com.google.android.gms.location.f> A = new h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.wongpiwat.trust_location.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0058a implements Runnable {
        RunnableC0058a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.n();
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (a.this.b != null) {
                a.this.b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } else if (!a.this.f1887h) {
                String simpleName = b.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + b.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.b != null) {
                a.this.b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } else if (!a.this.f1887h) {
                String simpleName = c.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + c.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (a.this.b != null) {
                a.this.b.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            } else if (!a.this.f1887h) {
                String simpleName = d.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + d.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.b != null) {
                a.this.b.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            } else if (!a.this.f1887h) {
                String simpleName = e.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + e.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (a.this.b != null) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", a.this.b.getPackageName(), null));
                a.this.b.startActivity(intent);
            } else if (!a.this.f1887h) {
                String simpleName = f.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + f.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.b != null) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", a.this.b.getPackageName(), null));
                a.this.b.startActivity(intent);
            } else if (!a.this.f1887h) {
                String simpleName = g.class.getSimpleName();
                Log.e(simpleName, "Need to launch an intent, but no activity is registered! Specify a valid activity when constructing " + g.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements com.google.android.gms.common.api.k<com.google.android.gms.location.f> {
        h() {
        }

        /* renamed from: b */
        public void a(com.google.android.gms.location.f fVar) {
            a.this.f1889j = true;
            a.this.p = fVar.a();
            int c = a.this.p.c();
            if (c == 0) {
                a.this.f1890k = true;
                a.this.o();
            } else if (c == 6) {
                a.this.f1890k = false;
                a.this.l = true;
            } else if (c == 8502) {
                a.this.f1890k = false;
            }
            a.this.n();
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class i {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.values().length];
            a = iArr;
            try {
                iArr[j.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.PASSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum j {
        HIGH,
        MEDIUM,
        LOW,
        PASSIVE
    }

    /* loaded from: classes.dex */
    public enum k {
        SETTINGS,
        RETRIEVAL
    }

    /* loaded from: classes.dex */
    public interface l {
        void a();

        void b();

        void c(k kVar, String str);

        void d();

        void e(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

        void f(Location location);

        void g(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

        void h(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);
    }

    public a(Context context, l lVar, j jVar, long j2, boolean z) {
        this.a = context;
        if (context instanceof androidx.appcompat.app.c) {
            this.b = (androidx.appcompat.app.c) context;
        }
        this.c = lVar;
        int i2 = i.a[jVar.ordinal()];
        this.f1883d = i2 != 1 ? i2 != 2 ? i2 != 3 ? 105 : 104 : 102 : 100;
        this.f1884e = j2;
        this.f1885f = z;
        if (this.n == null) {
            f.a aVar = new f.a(context);
            aVar.b(this);
            aVar.c(this);
            aVar.a(com.google.android.gms.location.d.a);
            this.n = aVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!this.f1888i) {
            q();
        }
        if (!this.f1888i) {
            if (this.r < 2) {
                l lVar = this.c;
                if (lVar != null) {
                    lVar.a();
                } else if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.e(simpleName, "Need location permission, but no listener is registered! Specify a valid listener when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
                }
            }
        } else if (!this.f1889j) {
            w();
        } else if (!this.f1890k) {
            if (this.l) {
                l lVar2 = this.c;
                if (lVar2 != null) {
                    lVar2.b();
                } else if (!this.f1887h) {
                    String simpleName2 = a.class.getSimpleName();
                    Log.e(simpleName2, "Need location settings change, but no listener is registered! Specify a valid listener when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
                }
            } else {
                s();
            }
        } else if (!this.m) {
            y();
            new Handler().postDelayed(new RunnableC0058a(), 10000L);
        } else if (!p()) {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.n.l() && this.f1888i && this.f1889j && this.f1890k) {
            try {
                c(com.google.android.gms.location.d.b.b(this.n));
            } catch (SecurityException e2) {
                if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.e(simpleName, "Error while requesting last location:\n " + e2.toString());
                }
                l lVar = this.c;
                if (lVar != null) {
                    k kVar = k.RETRIEVAL;
                    lVar.c(kVar, "Could not retrieve initial location:\n" + e2.getMessage());
                }
            }
        }
    }

    private boolean p() {
        if (this.n.l() && this.f1888i) {
            try {
                LocationAvailability d2 = com.google.android.gms.location.d.b.d(this.n);
                if (d2 != null) {
                    return d2.b();
                }
                return false;
            } catch (SecurityException e2) {
                if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.e(simpleName, "Error while checking location availability:\n " + e2.toString());
                }
                l lVar = this.c;
                if (lVar != null) {
                    k kVar = k.RETRIEVAL;
                    lVar.c(kVar, "Could not check location availability:\n" + e2.getMessage());
                }
            }
        }
        return false;
    }

    private void q() {
        this.f1888i = Build.VERSION.SDK_INT < 23 || androidx.core.content.a.a(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private void r() {
        this.q = false;
    }

    private void s() {
        LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
        boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
        boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
        if (!isProviderEnabled && !isProviderEnabled2) {
            l lVar = this.c;
            if (lVar != null) {
                lVar.h(this.v, this.u);
            } else if (!this.f1887h) {
                String simpleName = a.class.getSimpleName();
                Log.e(simpleName, "Location providers need to be enabled, but no listener is registered! Specify a valid listener when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
            }
        }
    }

    private boolean t(Location location) {
        if (location == null) {
            return false;
        }
        if (this.q || (Build.VERSION.SDK_INT >= 18 && location.isFromMockProvider())) {
            this.s = location;
            this.t = 0;
        } else {
            this.t = Math.min(this.t + 1, 1000000);
        }
        if (this.t >= 20) {
            this.s = null;
        }
        Location location2 = this.s;
        return location2 == null || ((double) location.distanceTo(location2)) > 1000.0d;
    }

    private void w() {
        if (this.n.l() && this.f1888i) {
            LocationRequest b2 = LocationRequest.b();
            this.o = b2;
            b2.f(this.f1883d);
            this.o.e(this.f1884e);
            this.o.d(this.f1884e);
            e.a aVar = new e.a();
            aVar.a(this.o);
            aVar.c(true);
            com.google.android.gms.location.d.c.a(this.n, aVar.b()).c(this.A);
        }
    }

    private void y() {
        if (this.n.l() && this.f1888i && this.f1889j) {
            try {
                com.google.android.gms.location.d.b.a(this.n, this.o, this);
                this.m = true;
            } catch (SecurityException e2) {
                if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.e(simpleName, "Error while requesting location updates:\n " + e2.toString());
                }
                l lVar = this.c;
                if (lVar != null) {
                    k kVar = k.RETRIEVAL;
                    lVar.c(kVar, "Could not request location updates:\n" + e2.getMessage());
                }
            }
        }
    }

    public void A() {
        r();
        this.n.d();
    }

    public void B() {
        if (this.n.l()) {
            com.google.android.gms.location.d.b.c(this.n, this);
            this.n.e();
        }
        this.f1888i = false;
        this.f1889j = false;
        this.f1890k = false;
        this.m = false;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public void a(com.google.android.gms.common.a aVar) {
        if (!this.f1887h) {
            String simpleName = a.class.getSimpleName();
            Log.e(simpleName, "Error while trying to connect to Google API:\n" + aVar.c());
        }
        l lVar = this.c;
        if (lVar != null) {
            k kVar = k.RETRIEVAL;
            lVar.c(kVar, "Could not connect to Google API:\n" + aVar.c());
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public void b(int i2) {
    }

    @Override // com.google.android.gms.location.c
    public void c(Location location) {
        if (location != null) {
            boolean t = t(location);
            if (!this.f1886g || this.f1887h || this.f1885f || t) {
                l lVar = this.c;
                if (lVar != null) {
                    lVar.f(location);
                } else if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.w(simpleName, "New location is available, but no listener is registered!\nSpecify a valid listener when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
                }
            } else {
                l lVar2 = this.c;
                if (lVar2 != null) {
                    lVar2.g(this.x, this.w);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public void d(Bundle bundle) {
        n();
    }

    public boolean u(int i2, int[] iArr) {
        l lVar;
        if (i2 != 1) {
            return false;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.r++;
            if (!this.f1887h) {
                Log.i(a.class.getSimpleName(), "Location permission request denied.");
            }
            if (this.r >= 2 && (lVar = this.c) != null) {
                lVar.e(this.z, this.y);
            }
            return false;
        }
        n();
        return true;
    }

    public void v() {
        l lVar;
        if (!this.f1888i) {
            androidx.appcompat.app.c cVar = this.b;
            if (cVar == null) {
                if (!this.f1887h) {
                    String simpleName = a.class.getSimpleName();
                    Log.e(simpleName, "Need location permission, but no activity is registered! Specify a valid activity when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
                }
            } else if (!androidx.core.app.a.q(cVar, "android.permission.ACCESS_FINE_LOCATION") || (lVar = this.c) == null) {
                x();
            } else {
                lVar.d();
            }
        }
    }

    public void x() {
        androidx.appcompat.app.c cVar = this.b;
        if (cVar != null) {
            androidx.core.app.a.p(cVar, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
        } else if (!this.f1887h) {
            String simpleName = a.class.getSimpleName();
            Log.e(simpleName, "Need location permission, but no activity is registered! Specify a valid activity when constructing " + a.class.getSimpleName() + " or register it explicitly with register().");
        }
    }

    public void z(boolean z) {
        this.f1886g = z;
    }
}
