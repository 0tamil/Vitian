package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {
    final Object a;
    private final List<c> b;
    private HashMap<c, a> c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f27d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: e  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f28e;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f28e.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                    mediaControllerCompat$MediaControllerImplApi21.f27d.c(b.a.a(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f27d.d(androidx.versionedparcelable.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.BinderC0004c {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void H(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void Q(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void f(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void h(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void n() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void o(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f27d.a() != null) {
            for (c cVar : this.b) {
                a aVar = new a(cVar);
                this.c.put(cVar, aVar);
                cVar.b = aVar;
                try {
                    this.f27d.a().k(aVar);
                    cVar.i(13, null, null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.b.clear();
        }
    }
}
