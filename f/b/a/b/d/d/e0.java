package f.b.a.b.d.d;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.location.f0;
/* loaded from: classes.dex */
public class e0 extends h<h> {
    private final String E;
    protected final y<h> F = new d0(this);

    public e0(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.E = str;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle E() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.E);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String I() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int u() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* bridge */ /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final c[] z() {
        return f0.f1338f;
    }
}
