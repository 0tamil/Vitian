package com.google.firebase.n.j;
/* loaded from: classes.dex */
public @interface f {

    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
