package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.i;
/* loaded from: classes.dex */
public abstract class h0 implements DialogInterface.OnClickListener {
    public static h0 b(Activity activity, Intent intent, int i2) {
        return new f0(intent, activity, i2);
    }

    public static h0 c(i iVar, Intent intent, int i2) {
        return new g0(intent, iVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            String str = "Failed to start resolution intent.";
            str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            if (true == Build.FINGERPRINT.contains("generic")) {
            }
            Log.e("DialogRedirect", str, e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
