package com.google.firebase.messaging.l1;

import com.google.firebase.messaging.t0;
import com.google.firebase.n.j.f;
/* loaded from: classes.dex */
public final class b {
    private final com.google.firebase.messaging.l1.a a;

    /* loaded from: classes.dex */
    public static final class a {
        private com.google.firebase.messaging.l1.a a = null;

        a() {
        }

        public b a() {
            return new b(this.a);
        }

        public a b(com.google.firebase.messaging.l1.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(com.google.firebase.messaging.l1.a aVar) {
        this.a = aVar;
    }

    public static a b() {
        return new a();
    }

    @f(tag = 1)
    public com.google.firebase.messaging.l1.a a() {
        return this.a;
    }

    public byte[] c() {
        return t0.a(this);
    }
}
