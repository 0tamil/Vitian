package io.flutter.embedding.engine.j;

import h.a.d.a.b;
import h.a.d.a.f;
import io.flutter.embedding.engine.f.d;
import java.util.HashMap;
/* loaded from: classes.dex */
public class m {
    public final b<Object> a;

    public m(d dVar) {
        this.a = new b<>(dVar, "flutter/system", f.a);
    }

    public void a() {
        h.a.b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.a.c(hashMap);
    }
}
