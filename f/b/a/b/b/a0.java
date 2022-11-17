package f.b.a.b.b;

import android.os.Bundle;
import android.util.Log;
import f.b.a.b.g.a;
import f.b.a.b.g.i;
import java.io.IOException;
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements a {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // f.b.a.b.g.a
    public final Object a(i iVar) {
        if (iVar.n()) {
            return (Bundle) iVar.j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.i());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.i());
    }
}
