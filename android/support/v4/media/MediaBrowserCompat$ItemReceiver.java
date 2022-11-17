package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import d.a.a.a.b;
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends b {

    /* renamed from: g  reason: collision with root package name */
    private final String f3g;

    /* renamed from: h  reason: collision with root package name */
    private final b f4h;

    @Override // d.a.a.a.b
    protected void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f4h.a(this.f3g);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f4h.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f4h.a(this.f3g);
        }
    }
}
