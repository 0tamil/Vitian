package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f881d;

    /* loaded from: classes.dex */
    static class a implements AudioAttributesImpl.a {
        private int a = 0;
        private int b = 0;
        private int c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f882d = -1;

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.f882d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public /* bridge */ /* synthetic */ AudioAttributesImpl.a b(int i2) {
            c(i2);
            return this;
        }

        public a c(int i2) {
            if (i2 != 10) {
                this.f882d = i2;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.f881d = -1;
    }

    AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.f881d = -1;
        this.b = i2;
        this.c = i3;
        this.a = i4;
        this.f881d = i5;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        int i2 = this.c;
        int c = c();
        if (c == 6) {
            i2 |= 4;
        } else if (c == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f881d;
        return i2 != -1 ? i2 : AudioAttributesCompat.a(false, this.c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.b == audioAttributesImplBase.a() && this.c == audioAttributesImplBase.b() && this.a == audioAttributesImplBase.d() && this.f881d == audioAttributesImplBase.f881d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.f881d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f881d != -1) {
            sb.append(" stream=");
            sb.append(this.f881d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
