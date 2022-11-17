package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {
    b a;
    android.support.v4.media.session.a b;

    /* loaded from: classes.dex */
    private static class a extends MediaController.Callback {
        private final WeakReference<c> a;

        a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.a.get();
            if (cVar != null && cVar.b == null) {
                cVar.d(PlaybackStateCompat.a(playbackState));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.b == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends Handler {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class BinderC0004c extends a.AbstractBinderC0002a {
        private final WeakReference<c> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC0004c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void E(int i2) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void G() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void H(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void L(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void M(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void Q(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f35e, parcelableVolumeInfo.f36f, parcelableVolumeInfo.f37g, parcelableVolumeInfo.f38h, parcelableVolumeInfo.f39i) : null, null);
            }
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void g(boolean z) {
        }

        public void h(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        public void n() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void o(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void s(int i2) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void y(boolean z) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            new a(this);
        } else {
            this.b = new BinderC0004c(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i2, Object obj, Bundle bundle) {
        b bVar = this.a;
        if (bVar != null) {
            Message obtainMessage = bVar.obtainMessage(i2, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
