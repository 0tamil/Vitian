package androidx.media.d;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.app.j;
import androidx.media.b;
import androidx.media.c;
/* loaded from: classes.dex */
public class a extends j.i {

    /* renamed from: e  reason: collision with root package name */
    int[] f883e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f884f;

    /* renamed from: g  reason: collision with root package name */
    boolean f885g;

    /* renamed from: h  reason: collision with root package name */
    PendingIntent f886h;

    private RemoteViews A(j.a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), c.a_res_0x7f0b001f);
        int i2 = androidx.media.a.a_res_0x7f080027;
        remoteViews.setImageViewResource(i2, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i2, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i2, aVar.j());
        }
        return remoteViews;
    }

    int B(int i2) {
        return i2 <= 3 ? c.c_res_0x7f0b0023 : c.b_res_0x7f0b0021;
    }

    int C() {
        return c.d_res_0x7f0b0028;
    }

    @Override // androidx.core.app.j.i
    public void b(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            Notification.Builder a = iVar.a();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            x(mediaStyle);
            a.setStyle(mediaStyle);
        } else if (this.f885g) {
            iVar.a().setOngoing(true);
        }
    }

    @Override // androidx.core.app.j.i
    public RemoteViews s(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return y();
    }

    @Override // androidx.core.app.j.i
    public RemoteViews t(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return z();
    }

    Notification.MediaStyle x(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f883e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f884f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.b());
        }
        return mediaStyle;
    }

    RemoteViews y() {
        int min = Math.min(this.a.b.size(), 5);
        RemoteViews c = c(false, B(min), false);
        c.removeAllViews(androidx.media.a.d_res_0x7f080077);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                c.addView(androidx.media.a.d_res_0x7f080077, A(this.a.b.get(i2)));
            }
        }
        if (this.f885g) {
            int i3 = androidx.media.a.b_res_0x7f080048;
            c.setViewVisibility(i3, 0);
            c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(b.a_res_0x7f090002));
            c.setOnClickPendingIntent(i3, this.f886h);
        } else {
            c.setViewVisibility(androidx.media.a.b_res_0x7f080048, 8);
        }
        return c;
    }

    RemoteViews z() {
        RemoteViews c = c(false, C(), true);
        int size = this.a.b.size();
        int[] iArr = this.f883e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c.removeAllViews(androidx.media.a.d_res_0x7f080077);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                if (i2 < size) {
                    c.addView(androidx.media.a.d_res_0x7f080077, A(this.a.b.get(this.f883e[i2])));
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                }
            }
        }
        if (this.f885g) {
            c.setViewVisibility(androidx.media.a.c_res_0x7f08005d, 8);
            int i3 = androidx.media.a.b_res_0x7f080048;
            c.setViewVisibility(i3, 0);
            c.setOnClickPendingIntent(i3, this.f886h);
            c.setInt(i3, "setAlpha", this.a.a.getResources().getInteger(b.a_res_0x7f090002));
        } else {
            c.setViewVisibility(androidx.media.a.c_res_0x7f08005d, 0);
            c.setViewVisibility(androidx.media.a.b_res_0x7f080048, 8);
        }
        return c;
    }
}
