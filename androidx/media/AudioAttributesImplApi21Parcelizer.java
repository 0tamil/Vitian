package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.b;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bVar.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bVar.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.x(false, false);
        bVar.H(audioAttributesImplApi21.a, 1);
        bVar.F(audioAttributesImplApi21.b, 2);
    }
}
