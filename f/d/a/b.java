package f.d.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import k.a.a.y.c;
import k.a.a.y.h;
import k.a.a.y.i;
/* loaded from: classes.dex */
final class b extends h {
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2809d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str) {
        this.c = context;
        this.f2809d = str;
    }

    @Override // k.a.a.y.h
    protected void b() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.c.getAssets().open(this.f2809d);
                i.f(new c(inputStream));
            } catch (IOException e2) {
                throw new IllegalStateException(this.f2809d + " missing from assets", e2);
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
