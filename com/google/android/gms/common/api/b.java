package com.google.android.gms.common.api;
/* loaded from: classes.dex */
public class b extends Exception {
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    protected final Status f1053e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Status status) {
        super(r3.toString());
        int c = status.c();
        String d2 = status.d() != null ? status.d() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 13);
        sb.append(c);
        sb.append(": ");
        sb.append(d2);
        this.f1053e = status;
    }

    public Status a() {
        return this.f1053e;
    }
}
