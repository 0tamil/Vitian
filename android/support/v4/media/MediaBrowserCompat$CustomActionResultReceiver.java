package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import d.a.a.a.b;
/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends b {

    /* renamed from: g  reason: collision with root package name */
    private final String f0g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f1h;

    /* renamed from: i  reason: collision with root package name */
    private final a f2i;

    @Override // d.a.a.a.b
    protected void a(int i2, Bundle bundle) {
        if (this.f2i != null) {
            MediaSessionCompat.a(bundle);
            if (i2 == -1) {
                this.f2i.a(this.f0g, this.f1h, bundle);
            } else if (i2 == 0) {
                this.f2i.c(this.f0g, this.f1h, bundle);
            } else if (i2 != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.f1h + ", resultData=" + bundle + ")");
            } else {
                this.f2i.b(this.f0g, this.f1h, bundle);
            }
        }
    }
}
