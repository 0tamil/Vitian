package f.b.b.a.v.a;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.m;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
/* loaded from: classes.dex */
public final class c implements m {
    private static final String c = "c";
    private final String a;
    private KeyStore b;

    /* loaded from: classes.dex */
    public static final class b {
        String a = null;
        KeyStore b;

        public b() {
            this.b = null;
            if (c.f()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.b = keyStore;
                    keyStore.load(null);
                } catch (IOException | GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        public c a() {
            return new c(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    public c() {
        this(new b());
    }

    private c(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public static void d(String str) {
        if (!new c().e(str)) {
            String b2 = w.b("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(b2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static f.b.b.a.a g(f.b.b.a.a aVar) {
        byte[] c2 = u.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c2, aVar.b(aVar.a(c2, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L14;
     */
    @Override // f.b.b.a.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(String str) {
        String str2 = this.a;
        boolean z = true;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.a == null) {
        }
        z = false;
        return z;
    }

    @Override // f.b.b.a.m
    public synchronized f.b.b.a.a b(String str) {
        f.b.b.a.v.a.b bVar;
        String str2 = this.a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, str));
        }
        bVar = new f.b.b.a.v.a.b(w.b("android-keystore://", str), this.b);
        g(bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            } catch (InterruptedException unused2) {
            }
            return this.b.containsAlias(str2);
        }
        return this.b.containsAlias(w.b("android-keystore://", str));
    }
}
