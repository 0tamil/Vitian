package e.d.p.e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: e  reason: collision with root package name */
    private final int f2127e;

    /* renamed from: f  reason: collision with root package name */
    private final b f2128f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2129g;

    public a(int i2, b bVar, int i3) {
        this.f2127e = i2;
        this.f2128f = bVar;
        this.f2129g = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2127e);
        this.f2128f.F(this.f2129g, bundle);
    }
}
