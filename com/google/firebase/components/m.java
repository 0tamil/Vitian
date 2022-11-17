package com.google.firebase.components;

import com.google.firebase.q.b;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m implements o {
    @Override // com.google.firebase.components.o
    public <T> T a(Class<T> cls) {
        b<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.a();
    }

    @Override // com.google.firebase.components.o
    public <T> Set<T> c(Class<T> cls) {
        return d(cls).a();
    }
}
