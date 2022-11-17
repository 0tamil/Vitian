package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.j;
import f.b.a.b.g.a;
import f.b.a.b.g.i;
import f.b.a.b.g.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l0 {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static k1 f1777d;
    private final Context a;
    private final Executor b = x.f1843e;

    public l0(Context context) {
        this.a = context;
    }

    private static i<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).g(x.f1843e, e.a);
    }

    private static k1 b(Context context, String str) {
        k1 k1Var;
        synchronized (c) {
            if (f1777d == null) {
                f1777d = new k1(context, str);
            }
            k1Var = f1777d;
        }
        return k1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer c(i iVar) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer e(i iVar) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ i f(Context context, Intent intent, i iVar) {
        return (!j.g() || ((Integer) iVar.j()).intValue() != 402) ? iVar : a(context, intent).g(x.f1843e, f.a);
    }

    public i<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public i<Integer> h(final Context context, final Intent intent) {
        boolean z = true;
        boolean z2 = j.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        return (!z2 || z) ? l.c(this.b, new Callable() { // from class: com.google.firebase.messaging.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(a1.b().g(context, intent));
                return valueOf;
            }
        }).h(this.b, new a() { // from class: com.google.firebase.messaging.g
            @Override // f.b.a.b.g.a
            public final Object a(i iVar) {
                return l0.f(context, intent, iVar);
            }
        }) : a(context, intent);
    }
}
