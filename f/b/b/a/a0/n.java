package f.b.b.a.a0;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public interface n<T> {

    /* loaded from: classes.dex */
    public static class a implements n<Cipher> {
        /* renamed from: b */
        public Cipher a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements n<Mac> {
        /* renamed from: b */
        public Mac a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}
