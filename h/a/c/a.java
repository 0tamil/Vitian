package h.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import h.a.c.b;
import io.flutter.view.e;
import io.flutter.view.g;
@Deprecated
/* loaded from: classes.dex */
public class a extends Activity implements b.AbstractC0118b {

    /* renamed from: e  reason: collision with root package name */
    private final b f2868e;

    /* renamed from: f  reason: collision with root package name */
    private final c f2869f;

    public a() {
        b bVar = new b(this, this);
        this.f2868e = bVar;
        this.f2869f = bVar;
    }

    @Override // h.a.c.b.AbstractC0118b
    public boolean a() {
        return false;
    }

    @Override // h.a.c.b.AbstractC0118b
    public g b(Context context) {
        return null;
    }

    @Override // h.a.c.b.AbstractC0118b
    public e c() {
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f2869f.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f2869f.q()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2869f.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2869f.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f2869f.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f2869f.onLowMemory();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.f2869f.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2869f.onPause();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f2869f.onPostResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2869f.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f2869f.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.f2869f.onStop();
        super.onStop();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        this.f2869f.onTrimMemory(i2);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        this.f2869f.onUserLeaveHint();
    }
}
