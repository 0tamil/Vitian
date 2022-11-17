package f.b.b.a.v.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f.b.b.a.a0.o;
import f.b.b.a.l;
import f.b.b.a.y.c0;
import f.b.b.a.y.t;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e implements l {
    private final SharedPreferences.Editor a;
    private final String b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            this.a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // f.b.b.a.l
    public void a(c0 c0Var) {
        if (!this.a.putString(this.b, o.b(c0Var.b())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // f.b.b.a.l
    public void b(t tVar) {
        if (!this.a.putString(this.b, o.b(tVar.b())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
