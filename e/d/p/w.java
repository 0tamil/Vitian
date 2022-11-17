package e.d.p;

import android.os.Build;
import android.view.ViewGroup;
import e.d.e;
/* loaded from: classes.dex */
public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(e.z_res_0x7f0800b3);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && u.t(viewGroup) == null) ? false : true;
    }
}
