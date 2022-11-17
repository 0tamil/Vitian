package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: e  reason: collision with root package name */
    private Dialog f1203e;

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnCancelListener f1204f;

    /* renamed from: g  reason: collision with root package name */
    private Dialog f1205g;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        p.j(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f1203e = dialog2;
        if (onCancelListener != null) {
            bVar.f1204f = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1204f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f1203e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f1205g == null) {
            Activity activity = getActivity();
            p.i(activity);
            this.f1205g = new AlertDialog.Builder(activity).create();
        }
        return this.f1205g;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
