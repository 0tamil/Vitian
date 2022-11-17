package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
public interface i {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T c(String str, Class<T> cls);

    Activity d();

    void startActivityForResult(Intent intent, int i2);
}
