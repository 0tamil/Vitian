package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;
/* loaded from: classes.dex */
public final class m0 {
    private final SparseIntArray a = new SparseIntArray();
    private e b;

    public m0(e eVar) {
        p.i(eVar);
        this.b = eVar;
    }

    public final int a(Context context, int i2) {
        return this.a.get(i2, -1);
    }

    public final int b(Context context, a.f fVar) {
        p.i(context);
        p.i(fVar);
        int i2 = 0;
        if (!fVar.s()) {
            return 0;
        }
        int u = fVar.u();
        int a = a(context, u);
        if (a == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.a.size()) {
                    i2 = -1;
                    break;
                }
                int keyAt = this.a.keyAt(i3);
                if (keyAt > u && this.a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            a = i2 == -1 ? this.b.h(context, u) : i2;
            this.a.put(u, a);
        }
        return a;
    }

    public final void c() {
        this.a.clear();
    }
}
