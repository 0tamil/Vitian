package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: e  reason: collision with root package name */
    protected final i f1077e;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(i iVar) {
        this.f1077e = iVar;
    }

    public static i c(Activity activity) {
        return d(new h(activity));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static i d(h hVar) {
        if (hVar.d()) {
            return i3.A1(hVar.b());
        }
        if (hVar.c()) {
            return g3.f(hVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static i getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d2 = this.f1077e.d();
        p.i(d2);
        return d2;
    }

    public void e(int i2, int i3, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
