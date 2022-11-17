package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.h0;
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements h0 {

    /* renamed from: e  reason: collision with root package name */
    private h0.a f306e;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        h0.a aVar = this.f306e;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.h0
    public void setOnFitSystemWindowsListener(h0.a aVar) {
        this.f306e = aVar;
    }
}
