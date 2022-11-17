package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.i;
/* loaded from: classes.dex */
public class s {
    private final Resources a;
    private final String b;

    public s(Context context) {
        p.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(i.a_res_0x7f0e0025);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
