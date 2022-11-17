package f.b.b.a;

import f.b.b.a.y.a0;
import f.b.b.a.y.c0;
import f.b.b.a.y.i0;
import f.b.b.a.y.y;
import f.b.b.a.y.z;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class j {
    private final c0.b a;

    private j(c0.b bVar) {
        this.a = bVar;
    }

    private synchronized boolean d(int i2) {
        boolean z;
        Iterator<c0.c> it = this.a.B().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().T() == i2) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    private synchronized c0.c e(a0 a0Var) {
        c0.c.a X;
        y p = r.p(a0Var);
        int f2 = f();
        i0 S = a0Var.S();
        if (S == i0.UNKNOWN_PREFIX) {
            S = i0.TINK;
        }
        X = c0.c.X();
        X.y(p);
        X.z(f2);
        X.B(z.ENABLED);
        X.A(S);
        return X.a();
    }

    private synchronized int f() {
        int g2;
        do {
            g2 = g();
        } while (d(g2));
        return g2;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (i2 == 0) {
            secureRandom.nextBytes(bArr);
            i2 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i2;
    }

    public static j i() {
        return new j(c0.W());
    }

    public static j j(i iVar) {
        return new j(iVar.f().h());
    }

    public synchronized j a(g gVar) {
        b(gVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z) {
        c0.c e2;
        e2 = e(a0Var);
        this.a.y(e2);
        if (z) {
            this.a.C(e2.T());
        }
        return e2.T();
    }

    public synchronized i c() {
        return i.e(this.a.a());
    }

    public synchronized j h(int i2) {
        for (int i3 = 0; i3 < this.a.A(); i3++) {
            c0.c z = this.a.z(i3);
            if (z.T() == i2) {
                if (z.V().equals(z.ENABLED)) {
                    this.a.C(i2);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i2);
        return this;
    }
}
