package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.c0.a;
/* loaded from: classes.dex */
public class p implements y {
    private final Context a;
    private final j0 b;
    private AlarmManager c;

    /* renamed from: d  reason: collision with root package name */
    private final t f1010d;

    /* renamed from: e  reason: collision with root package name */
    private final a f1011e;

    p(Context context, j0 j0Var, AlarmManager alarmManager, a aVar, t tVar) {
        this.a = context;
        this.b = j0Var;
        this.c = alarmManager;
        this.f1011e = aVar;
        this.f1010d = tVar;
    }

    public p(Context context, j0 j0Var, a aVar, t tVar) {
        this(context, j0Var, (AlarmManager) context.getSystemService("alarm"), aVar, tVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(f.b.a.a.i.p pVar, int i2) {
        b(pVar, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(f.b.a.a.i.p pVar, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(f.b.a.a.i.d0.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (z || !c(intent)) {
            long g2 = this.b.g(pVar);
            long g3 = this.f1010d.g(pVar.d(), g2, i2);
            f.b.a.a.i.y.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(g3), Long.valueOf(g2), Integer.valueOf(i2));
            this.c.set(3, this.f1011e.a() + g3, PendingIntent.getBroadcast(this.a, 0, intent, 0));
            return;
        }
        f.b.a.a.i.y.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }
}
