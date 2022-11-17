package h.a.c;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import h.a.d.a.m;
import h.a.d.a.p;
/* loaded from: classes.dex */
public interface c extends ComponentCallbacks2, m, p {
    void onCreate(Bundle bundle);

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onPostResume();

    void onResume();

    void onStart();

    void onStop();

    void onUserLeaveHint();

    boolean q();
}
