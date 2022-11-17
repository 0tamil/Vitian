package f.b.a.a.i.a0.j;

import android.database.Cursor;
import f.b.a.a.i.a0.j.r0;
/* loaded from: classes.dex */
public final /* synthetic */ class m implements r0.b {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // f.b.a.a.i.a0.j.r0.b
    public final Object a(Object obj) {
        Long valueOf;
        valueOf = Long.valueOf(r2.moveToNext() ? ((Cursor) obj).getLong(0) : 0L);
        return valueOf;
    }
}
