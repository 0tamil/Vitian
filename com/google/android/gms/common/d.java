package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.j;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.g;
import f.b.a.b.a.a;
import f.b.a.b.a.b;
/* loaded from: classes.dex */
public class d extends e {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final d f1209d = new d();
    private String b;

    public static d n() {
        return f1209d;
    }

    @Override // com.google.android.gms.common.e
    public Intent c(Context context, int i2, String str) {
        return super.c(context, i2, str);
    }

    @Override // com.google.android.gms.common.e
    public PendingIntent d(Context context, int i2, int i3) {
        return super.d(context, i2, i3);
    }

    @Override // com.google.android.gms.common.e
    public final String f(int i2) {
        return super.f(i2);
    }

    @Override // com.google.android.gms.common.e
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.e
    public int h(Context context, int i2) {
        return super.h(context, i2);
    }

    @Override // com.google.android.gms.common.e
    public final boolean k(int i2) {
        return super.k(i2);
    }

    public Dialog l(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i2, h0.b(activity, c(activity, i2, "d"), i3), onCancelListener);
    }

    public PendingIntent m(Context context, a aVar) {
        return aVar.e() ? aVar.d() : d(context, aVar.b(), 0);
    }

    public boolean o(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l = l(activity, i2, i3, onCancelListener);
        if (l == null) {
            return false;
        }
        t(activity, l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i2) {
        u(context, i2, null, e(context, i2, 0, "n"));
    }

    final Dialog q(Context context, int i2, h0 h0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(e0.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = e0.c(context, i2);
        if (c2 != null) {
            builder.setPositiveButton(c2, h0Var);
        }
        String g2 = e0.g(context, i2);
        if (g2 != null) {
            builder.setTitle(g2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(e0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final n1 s(Context context, m1 m1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        n1 n1Var = new n1(m1Var);
        context.registerReceiver(n1Var, intentFilter);
        n1Var.a(context);
        if (j(context, "com.google.android.gms")) {
            return n1Var;
        }
        m1Var.a();
        n1Var.b();
        return null;
    }

    final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e) {
                j.K1(dialog, onCancelListener).J1(((e) activity).s(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void u(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i2), null), new IllegalArgumentException());
        if (i2 == 18) {
            v(context);
        } else if (pendingIntent != null) {
            String f2 = e0.f(context, i2);
            String e2 = e0.e(context, i2);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            p.i(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            j.e eVar = new j.e(context);
            eVar.C(true);
            eVar.l(true);
            eVar.s(f2);
            j.c cVar = new j.c();
            cVar.x(e2);
            eVar.M(cVar);
            if (g.b(context)) {
                p.k(com.google.android.gms.common.util.j.d());
                eVar.K(context.getApplicationInfo().icon);
                eVar.G(2);
                if (g.c(context)) {
                    eVar.a(a.a, resources.getString(b.o), pendingIntent);
                } else {
                    eVar.q(pendingIntent);
                }
            } else {
                eVar.K(17301642);
                eVar.O(resources.getString(b.h_res_0x7f0e0024));
                eVar.T(System.currentTimeMillis());
                eVar.q(pendingIntent);
                eVar.r(e2);
            }
            if (com.google.android.gms.common.util.j.g()) {
                p.k(com.google.android.gms.common.util.j.g());
                synchronized (c) {
                    str2 = this.b;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = e0.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.n(str2);
            }
            Notification b2 = eVar.b();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                g.b.set(false);
                i3 = 10436;
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, b2);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    final void v(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean w(Activity activity, i iVar, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog q = q(activity, i2, h0.c(iVar, c(activity, i2, "d"), 2), onCancelListener);
        if (q == null) {
            return false;
        }
        t(activity, q, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, a aVar, int i2) {
        PendingIntent m;
        if (com.google.android.gms.common.l.a.a(context) || (m = m(context, aVar)) == null) {
            return false;
        }
        u(context, aVar.b(), null, f.b.a.b.d.a.e.a(context, 0, GoogleApiActivity.a(context, m, i2, true), f.b.a.b.d.a.e.a | 134217728));
        return true;
    }
}
