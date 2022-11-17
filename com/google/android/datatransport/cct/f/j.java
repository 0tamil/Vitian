package com.google.android.datatransport.cct.f;

import com.google.auto.value.AutoValue;
import com.google.firebase.n.a;
import com.google.firebase.n.i.d;
import java.util.List;
@AutoValue
/* loaded from: classes.dex */
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static a b() {
        d dVar = new d();
        dVar.g(b.a);
        dVar.h(true);
        return dVar.f();
    }

    public abstract List<m> c();
}
