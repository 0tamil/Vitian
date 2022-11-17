package f.f.a.d;

import android.content.Context;
import android.os.Build;
import com.scottyab.rootbeer.b;
/* loaded from: classes.dex */
public class d {
    public static boolean a(Context context) {
        return (Build.VERSION.SDK_INT >= 23 ? new b() : new c()).a() || b(context).booleanValue();
    }

    private static Boolean b(Context context) {
        b bVar = new b(context);
        String str = Build.BRAND;
        return Boolean.valueOf((str.toLowerCase().contains("oneplus") || str.toLowerCase().contains("moto") || str.toLowerCase().contains("xiaomi") || str.toLowerCase().contains("lenovo")) ? bVar.o() : bVar.n());
    }
}
