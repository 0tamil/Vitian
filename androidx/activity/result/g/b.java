package androidx.activity.result.g;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.g.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    static Intent e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    /* renamed from: f */
    public a.C0007a<Map<String, Boolean>> b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new a.C0007a<>(Collections.emptyMap());
        }
        e.c.a aVar = new e.c.a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = androidx.core.content.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new a.C0007a<>(aVar);
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, Boolean> c(int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
