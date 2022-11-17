package com.google.android.gms.common.l;

import android.content.Context;
/* loaded from: classes.dex */
public class c {
    private static c b = new c();
    private b a = null;

    public static b a(Context context) {
        return b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new b(context);
        }
        return this.a;
    }
}
