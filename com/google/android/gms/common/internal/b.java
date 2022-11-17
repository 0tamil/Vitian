package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
/* loaded from: classes.dex */
public class b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.e() ? new i(status) : new com.google.android.gms.common.api.b(status);
    }
}
