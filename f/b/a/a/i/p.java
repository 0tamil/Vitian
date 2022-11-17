package f.b.a.a.i;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import f.b.a.a.d;
import f.b.a.a.i.e;
@AutoValue
/* loaded from: classes.dex */
public abstract class p {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(d dVar);
    }

    public static a a() {
        e.b bVar = new e.b();
        bVar.d(d.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public boolean e() {
        return c() != null;
    }

    public p f(d dVar) {
        a a2 = a();
        a2.b(b());
        a2.d(dVar);
        a2.c(c());
        return a2.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
