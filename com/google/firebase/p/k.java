package com.google.firebase.p;
/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f1877e;

        a(int i2) {
            this.f1877e = i2;
        }

        public int a() {
            return this.f1877e;
        }
    }

    a b(String str);
}
