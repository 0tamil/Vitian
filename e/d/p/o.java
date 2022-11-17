package e.d.p;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o {
    private int a;
    private int b;

    public o(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.b = i2;
        } else {
            this.a = i2;
        }
    }

    public void d(View view, int i2) {
        if (i2 == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
