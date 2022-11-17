package f.b.b.a.a0;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class u {
    private static final ThreadLocal<SecureRandom> a = new a();

    /* loaded from: classes.dex */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return u.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
