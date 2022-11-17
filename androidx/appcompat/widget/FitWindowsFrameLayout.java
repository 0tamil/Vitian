package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.h0;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements h0 {

    /* renamed from: e  reason: collision with root package name */
    private h0.a f305e;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        h0.a aVar = this.f305e;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.h0
    public void setOnFitSystemWindowsListener(h0.a aVar) {
        this.f305e = aVar;
    }
}
