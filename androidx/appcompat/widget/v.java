package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a.a;
/* loaded from: classes.dex */
public class v extends SeekBar {

    /* renamed from: e  reason: collision with root package name */
    private final w f488e;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.H);
    }

    public v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s0.a(this, getContext());
        w wVar = new w(this);
        this.f488e = wVar;
        wVar.c(attributeSet, i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f488e.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f488e.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f488e.g(canvas);
    }
}
