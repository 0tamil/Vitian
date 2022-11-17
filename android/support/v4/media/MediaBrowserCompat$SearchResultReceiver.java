package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import d.a.a.a.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends b {

    /* renamed from: g  reason: collision with root package name */
    private final String f7g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f8h;

    /* renamed from: i  reason: collision with root package name */
    private final c f9i;

    @Override // d.a.a.a.b
    protected void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f9i.a(this.f7g, this.f8h);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f9i.b(this.f7g, this.f8h, arrayList);
    }
}
