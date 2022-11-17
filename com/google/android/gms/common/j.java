package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public class j extends d {
    private Dialog s0;
    private DialogInterface.OnCancelListener t0;
    private Dialog u0;

    public static j K1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        p.j(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.s0 = dialog2;
        if (onCancelListener != null) {
            jVar.t0 = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog D1(Bundle bundle) {
        Dialog dialog = this.s0;
        if (dialog != null) {
            return dialog;
        }
        H1(false);
        if (this.u0 == null) {
            Context t = t();
            p.i(t);
            this.u0 = new AlertDialog.Builder(t).create();
        }
        return this.u0;
    }

    @Override // androidx.fragment.app.d
    public void J1(n nVar, String str) {
        super.J1(nVar, str);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.t0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
