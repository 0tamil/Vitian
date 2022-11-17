package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.p;
import e.c.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: e  reason: collision with root package name */
    private final a<b<?>, com.google.android.gms.common.a> f1054e;

    public c(a<b<?>, com.google.android.gms.common.a> aVar) {
        this.f1054e = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b<?> bVar : this.f1054e.keySet()) {
            com.google.android.gms.common.a aVar = this.f1054e.get(bVar);
            p.i(aVar);
            com.google.android.gms.common.a aVar2 = aVar;
            z &= !aVar2.f();
            String b = bVar.b();
            String valueOf = String.valueOf(aVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(valueOf).length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
