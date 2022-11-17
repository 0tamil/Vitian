package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f10e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f11f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f12g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f13h;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap f14i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f15j;

    /* renamed from: k  reason: collision with root package name */
    private final Bundle f16k;
    private final Uri l;
    private MediaDescription m;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private String a;
        private CharSequence b;
        private CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f17d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f18e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f19f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f20g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f21h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.f17d, this.f18e, this.f19f, this.f20g, this.f21h);
        }

        public b b(CharSequence charSequence) {
            this.f17d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f20g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f18e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f19f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f21h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f10e = parcel.readString();
        this.f11f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f14i = (Bitmap) parcel.readParcelable(classLoader);
        this.f15j = (Uri) parcel.readParcelable(classLoader);
        this.f16k = parcel.readBundle(classLoader);
        this.l = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10e = str;
        this.f11f = charSequence;
        this.f12g = charSequence2;
        this.f13h = charSequence3;
        this.f14i = bitmap;
        this.f15j = uri;
        this.f16k = bundle;
        this.l = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        int i2;
        Uri uri;
        Bundle bundle = null;
        if (obj == null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        b bVar = new b();
        MediaDescription mediaDescription = (MediaDescription) obj;
        bVar.f(mediaDescription.getMediaId());
        bVar.i(mediaDescription.getTitle());
        bVar.h(mediaDescription.getSubtitle());
        bVar.b(mediaDescription.getDescription());
        bVar.d(mediaDescription.getIconBitmap());
        bVar.e(mediaDescription.getIconUri());
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.a(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                extras.remove("android.support.v4.media.description.MEDIA_URI");
                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            bVar.c(bundle);
            if (uri == null) {
                bVar.g(uri);
            } else if (i2 >= 23) {
                bVar.g(mediaDescription.getMediaUri());
            }
            MediaDescriptionCompat a2 = bVar.a();
            a2.m = mediaDescription;
            return a2;
        }
        bundle = extras;
        bVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a22 = bVar.a();
        a22.m = mediaDescription;
        return a22;
    }

    public Object b() {
        int i2;
        MediaDescription mediaDescription = this.m;
        if (mediaDescription != null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f10e);
        builder.setTitle(this.f11f);
        builder.setSubtitle(this.f12g);
        builder.setDescription(this.f13h);
        builder.setIconBitmap(this.f14i);
        builder.setIconUri(this.f15j);
        Bundle bundle = this.f16k;
        if (i2 < 23 && this.l != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.l);
        }
        builder.setExtras(bundle);
        if (i2 >= 23) {
            builder.setMediaUri(this.l);
        }
        MediaDescription build = builder.build();
        this.m = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f11f) + ", " + ((Object) this.f12g) + ", " + ((Object) this.f13h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f10e);
            TextUtils.writeToParcel(this.f11f, parcel, i2);
            TextUtils.writeToParcel(this.f12g, parcel, i2);
            TextUtils.writeToParcel(this.f13h, parcel, i2);
            parcel.writeParcelable(this.f14i, i2);
            parcel.writeParcelable(this.f15j, i2);
            parcel.writeBundle(this.f16k);
            parcel.writeParcelable(this.l, i2);
            return;
        }
        ((MediaDescription) b()).writeToParcel(parcel, i2);
    }
}
