package io.flutter.embedding.engine.i.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.android.d;
/* loaded from: classes.dex */
public interface b {
    boolean a(int i2, int i3, Intent intent);

    void b(Bundle bundle);

    void c(Bundle bundle);

    void d(d<Activity> dVar, androidx.lifecycle.d dVar2);

    void e();

    void g();

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);

    void onUserLeaveHint();
}
