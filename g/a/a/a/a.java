package g.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import j.x.d.i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a implements k.c, io.flutter.embedding.engine.i.a {

    /* renamed from: e  reason: collision with root package name */
    private Context f2863e;

    /* renamed from: f  reason: collision with root package name */
    private k f2864f;

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            cArr2[i4] = cArr[i3 >>> 4];
            cArr2[i4 + 1] = cArr[i3 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if ((r5.length == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String b(PackageManager packageManager) {
        String d2;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f2863e;
                i.b(context);
                SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    i.c(apkContentsSigners, "signingInfo.apkContentsSigners");
                    byte[] byteArray = ((Signature) j.s.a.g(apkContentsSigners)).toByteArray();
                    i.c(byteArray, "signingInfo.apkContentsS…ers.first().toByteArray()");
                    d2 = d(byteArray);
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    i.c(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                    byte[] byteArray2 = ((Signature) j.s.a.g(signingCertificateHistory)).toByteArray();
                    i.c(byteArray2, "signingInfo.signingCerti…ory.first().toByteArray()");
                    d2 = d(byteArray2);
                }
            } else {
                Context context2 = this.f2863e;
                i.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                boolean z = false;
                if (signatureArr != null) {
                }
                z = true;
                if (z) {
                    return null;
                }
                i.c(signatureArr, "packageInfo.signatures");
                if (j.s.a.g(signatureArr) == null) {
                    return null;
                }
                i.c(signatureArr, "signatures");
                byte[] byteArray3 = ((Signature) j.s.a.g(signatureArr)).toByteArray();
                i.c(byteArray3, "signatures.first().toByteArray()");
                d2 = d(byteArray3);
            }
            return d2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final long c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    private final String d(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        i.c(digest, "hashText");
        return a(digest);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        i.d(bVar, "binding");
        this.f2863e = bVar.a();
        k kVar = new k(bVar.b(), "dev.fluttercommunity.plus/package_info");
        this.f2864f = kVar;
        i.b(kVar);
        kVar.e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        i.d(bVar, "binding");
        this.f2863e = null;
        k kVar = this.f2864f;
        i.b(kVar);
        kVar.e(null);
        this.f2864f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        i.d(jVar, "call");
        i.d(dVar, "result");
        try {
            if (i.a(jVar.a, "getAll")) {
                Context context = this.f2863e;
                i.b(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.f2863e;
                i.b(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                i.c(packageManager, "packageManager");
                String b = b(packageManager);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context3 = this.f2863e;
                i.b(context3);
                hashMap.put("packageName", context3.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                i.c(packageInfo, "info");
                hashMap.put("buildNumber", String.valueOf(c(packageInfo)));
                if (b != null) {
                    hashMap.put("buildSignature", b);
                }
                dVar.b(hashMap);
                return;
            }
            dVar.c();
        } catch (PackageManager.NameNotFoundException e2) {
            dVar.a("Name not found", e2.getMessage(), null);
        }
    }
}
