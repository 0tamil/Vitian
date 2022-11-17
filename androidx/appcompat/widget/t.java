package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.a.a;
/* loaded from: classes.dex */
public class t extends RatingBar {

    /* renamed from: e  reason: collision with root package name */
    private final r f486e;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.F);
    }

    public t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s0.a(this, getContext());
        r rVar = new r(this);
        this.f486e = rVar;
        rVar.c(attributeSet, i2);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap b = this.f486e.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
