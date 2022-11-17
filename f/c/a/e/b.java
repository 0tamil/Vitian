package f.c.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public class b implements c {
    private Key c;
    private final SecureRandom b = new SecureRandom();
    private final Cipher a = Cipher.getInstance("AES/CBC/PKCS7Padding");

    public b(Context context) {
        a aVar = new a(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        if (string != null) {
            try {
                this.c = aVar.k(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e2) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e2);
            }
        }
        byte[] bArr = new byte[16];
        this.b.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        edit.putString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.l(secretKeySpec), 0));
        edit.apply();
    }

    @Override // f.c.a.e.c
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.b.nextBytes(bArr2);
        this.a.init(1, this.c, new IvParameterSpec(bArr2));
        byte[] doFinal = this.a.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + 16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        System.arraycopy(doFinal, 0, bArr3, 16, doFinal.length);
        return bArr3;
    }

    @Override // f.c.a.e.c
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, length);
        this.a.init(2, this.c, ivParameterSpec);
        return this.a.doFinal(bArr3);
    }
}
