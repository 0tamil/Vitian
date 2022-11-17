package f.b.b.a.v.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import f.b.b.a.g;
import f.b.b.a.i;
import f.b.b.a.j;
import f.b.b.a.k;
import f.b.b.a.l;
import f.b.b.a.v.a.c;
import f.b.b.a.z.a.c0;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* loaded from: classes.dex */
public final class a {
    private static final String c = "a";
    private final f.b.b.a.a a;
    private j b;

    /* loaded from: classes.dex */
    public static final class b {
        private k a = null;
        private l b = null;
        private String c = null;

        /* renamed from: d  reason: collision with root package name */
        private f.b.b.a.a f2461d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2462e = true;

        /* renamed from: f  reason: collision with root package name */
        private g f2463f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f2464g = null;

        /* renamed from: h  reason: collision with root package name */
        private j f2465h;

        private j e() {
            f.b.b.a.a aVar = this.f2461d;
            if (aVar != null) {
                try {
                    return j.j(i.j(this.a, aVar));
                } catch (c0 | GeneralSecurityException e2) {
                    Log.w(a.c, "cannot decrypt keyset: ", e2);
                }
            }
            return j.j(f.b.b.a.b.a(this.a));
        }

        private j f() {
            try {
                return e();
            } catch (FileNotFoundException e2) {
                Log.w(a.c, "keyset not found, will generate a new one", e2);
                if (this.f2463f != null) {
                    j i2 = j.i();
                    i2.a(this.f2463f);
                    i2.h(i2.c().g().S(0).S());
                    if (this.f2461d != null) {
                        i2.c().k(this.b, this.f2461d);
                    } else {
                        f.b.b.a.b.b(i2.c(), this.b);
                    }
                    return i2;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private f.b.b.a.a g() {
            c cVar;
            if (!a.d()) {
                Log.w(a.c, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.f2464g != null) {
                c.b bVar = new c.b();
                bVar.b(this.f2464g);
                cVar = bVar.a();
            } else {
                cVar = new c();
            }
            boolean e2 = cVar.e(this.c);
            if (!e2) {
                try {
                    c.d(this.c);
                } catch (GeneralSecurityException | ProviderException e3) {
                    Log.w(a.c, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
            }
            try {
                return cVar.b(this.c);
            } catch (GeneralSecurityException | ProviderException e4) {
                if (!e2) {
                    Log.w(a.c, "cannot use Android Keystore, it'll be disabled", e4);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.c), e4);
            }
        }

        public synchronized a d() {
            if (this.c != null) {
                this.f2461d = g();
            }
            this.f2465h = f();
            return new a(this);
        }

        public b h(g gVar) {
            this.f2463f = gVar;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f2462e) {
                this.c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public b j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.a = new d(context, str, str2);
                this.b = new e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    private a(b bVar) {
        l unused = bVar.b;
        this.a = bVar.f2461d;
        this.b = bVar.f2465h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized i c() {
        return this.b.c();
    }
}
