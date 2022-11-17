package f.b.b.a.a0;

import f.b.b.a.a0.n;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class m<T_WRAPPER extends n<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f2447d = Logger.getLogger(m.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f2448e;

    /* renamed from: f  reason: collision with root package name */
    public static final m<n.a, Cipher> f2449f;

    /* renamed from: g  reason: collision with root package name */
    public static final m<n.b, Mac> f2450g;
    private T_WRAPPER a;
    private List<Provider> b = f2448e;
    private boolean c = true;

    static {
        f2448e = v.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>();
        f2449f = new m<>(new n.a());
        f2450g = new m<>(new n.b());
    }

    public m(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f2447d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception e2 = null;
        for (Provider provider : this.b) {
            try {
                return (T_ENGINE) this.a.a(str, provider);
            } catch (Exception e3) {
                e2 = e3;
                if (e2 == null) {
                }
            }
        }
        if (this.c) {
            return (T_ENGINE) this.a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", e2);
    }
}
