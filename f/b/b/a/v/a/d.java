package f.b.b.a.v.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f.b.b.a.a0.o;
import f.b.b.a.k;
import f.b.b.a.y.c0;
import f.b.b.a.y.t;
import f.b.b.a.z.a.q;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public final class d implements k {
    private final SharedPreferences a;
    private final String b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            this.a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] c() {
        try {
            String string = this.a.getString(this.b, null);
            if (string != null) {
                return o.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.b));
        }
    }

    @Override // f.b.b.a.k
    public t a() {
        return t.S(c(), q.b());
    }

    @Override // f.b.b.a.k
    public c0 b() {
        return c0.X(c(), q.b());
    }
}
