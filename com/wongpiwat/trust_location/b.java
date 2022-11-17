package com.wongpiwat.trust_location;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.view.View;
import com.wongpiwat.trust_location.a;
/* loaded from: classes.dex */
class b implements a.l {
    private final a a;
    private boolean b = false;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f1906d;

    public b(Context context) {
        a aVar = new a(context, this, a.j.HIGH, 5000L, false);
        this.a = aVar;
        aVar.z(true);
        aVar.A();
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void a() {
        this.a.x();
        this.a.v();
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void b() {
        h.a.b.d("i", "LocationSettingsStatusCodes.RESOLUTION_REQUIRED: Please Turn on GPS location service.");
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void c(a.k kVar, String str) {
        h.a.b.d("i", "Error: " + str);
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void d() {
        h.a.b.d("i", "onExplainLocationPermission: ");
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void e(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        h.a.b.d("i", "onLocationPermissionPermanentlyDeclined: ");
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void f(Location location) {
        if (location != null) {
            this.c = location.getLatitude() + "";
            this.f1906d = location.getLongitude() + "";
            this.b = false;
        }
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void g(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.b = true;
    }

    @Override // com.wongpiwat.trust_location.a.l
    public void h(View.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        h.a.b.d("i", "onFallBackToSystemSettings: ");
    }

    public a i() {
        return this.a;
    }

    public String j() {
        return this.c;
    }

    public String k() {
        return this.f1906d;
    }

    public boolean l() {
        return this.b;
    }
}
