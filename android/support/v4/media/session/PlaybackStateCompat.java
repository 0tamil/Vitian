package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int f40e;

    /* renamed from: f  reason: collision with root package name */
    final long f41f;

    /* renamed from: g  reason: collision with root package name */
    final long f42g;

    /* renamed from: h  reason: collision with root package name */
    final float f43h;

    /* renamed from: i  reason: collision with root package name */
    final long f44i;

    /* renamed from: j  reason: collision with root package name */
    final int f45j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f46k;
    final long l;
    List<CustomAction> m;
    final long n;
    final Bundle o;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private final String f47e;

        /* renamed from: f  reason: collision with root package name */
        private final CharSequence f48f;

        /* renamed from: g  reason: collision with root package name */
        private final int f49g;

        /* renamed from: h  reason: collision with root package name */
        private final Bundle f50h;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(Parcel parcel) {
            this.f47e = parcel.readString();
            this.f48f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f49g = parcel.readInt();
            this.f50h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f47e = str;
            this.f48f = charSequence;
            this.f49g = i2;
            this.f50h = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            return new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f48f) + ", mIcon=" + this.f49g + ", mExtras=" + this.f50h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f47e);
            TextUtils.writeToParcel(this.f48f, parcel, i2);
            parcel.writeInt(this.f49g);
            parcel.writeBundle(this.f50h);
        }
    }

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f40e = i2;
        this.f41f = j2;
        this.f42g = j3;
        this.f43h = f2;
        this.f44i = j4;
        this.f45j = i3;
        this.f46k = charSequence;
        this.l = j5;
        this.m = new ArrayList(list);
        this.n = j6;
        this.o = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f40e = parcel.readInt();
        this.f41f = parcel.readLong();
        this.f43h = parcel.readFloat();
        this.l = parcel.readLong();
        this.f42g = parcel.readLong();
        this.f44i = parcel.readLong();
        this.f46k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.n = parcel.readLong();
        this.o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f45j = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = null;
        if (obj == null || i2 < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList2.add(CustomAction.a(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (i2 >= 22) {
            bundle = playbackState.getExtras();
        }
        return new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f40e + ", position=" + this.f41f + ", buffered position=" + this.f42g + ", speed=" + this.f43h + ", updated=" + this.l + ", actions=" + this.f44i + ", error code=" + this.f45j + ", error message=" + this.f46k + ", custom actions=" + this.m + ", active item id=" + this.n + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f40e);
        parcel.writeLong(this.f41f);
        parcel.writeFloat(this.f43h);
        parcel.writeLong(this.l);
        parcel.writeLong(this.f42g);
        parcel.writeLong(this.f44i);
        TextUtils.writeToParcel(this.f46k, parcel, i2);
        parcel.writeTypedList(this.m);
        parcel.writeLong(this.n);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.f45j);
    }
}
