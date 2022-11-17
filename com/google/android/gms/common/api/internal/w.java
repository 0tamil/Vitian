package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import f.b.a.b.g.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class w {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    private final Map<j<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).d(new b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(BasePendingResult<? extends com.google.android.gms.common.api.j> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new u(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <TResult> void d(j<TResult> jVar, boolean z) {
        this.b.put(jVar, Boolean.valueOf(z));
        jVar.a().b(new v(this, jVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i2, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            str2 = " due to service disconnection.";
        } else {
            if (i2 == 3) {
                str2 = " due to dead object exception.";
            }
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            h(true, new Status(20, sb.toString()));
        }
        sb.append(str2);
        if (str != null) {
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, g.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }
}
