package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* loaded from: classes.dex */
public abstract class g {
    @Deprecated
    public Fragment d(Context context, String str, Bundle bundle) {
        return Fragment.X(context, str, bundle);
    }

    public abstract View e(int i2);

    public abstract boolean f();
}
