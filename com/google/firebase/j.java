package com.google.firebase;

import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public class j extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        p.f(str, "Detail message must not be empty");
    }
}
