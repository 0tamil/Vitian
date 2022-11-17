package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public interface q1 {
    void a();

    <A extends a.b, R extends j, T extends d<R, A>> T c(T t);

    void e();

    void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean g();

    void h();

    <A extends a.b, T extends d<? extends j, A>> T i(T t);
}
