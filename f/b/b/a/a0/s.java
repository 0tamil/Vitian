package f.b.b.a.a0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class s implements f.b.b.a.x.a {
    private final ThreadLocal<Mac> a;
    private final String b;
    private final Key c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2451d;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a = m.f2450g.a(s.this.b);
                a.init(s.this.c);
                return a;
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public s(String str, Key key) {
        int i2;
        a aVar = new a();
        this.a = aVar;
        this.b = str;
        this.c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.f2451d = i2;
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    @Override // f.b.b.a.x.a
    public byte[] a(byte[] bArr, int i2) {
        if (i2 <= this.f2451d) {
            this.a.get().update(bArr);
            return Arrays.copyOf(this.a.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
