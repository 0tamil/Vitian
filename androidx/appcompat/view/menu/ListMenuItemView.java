package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.x0;
import e.a.a;
import e.a.f;
import e.a.g;
import e.a.j;
import e.d.p.u;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e  reason: collision with root package name */
    private i f179e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f180f;

    /* renamed from: g  reason: collision with root package name */
    private RadioButton f181g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f182h;

    /* renamed from: i  reason: collision with root package name */
    private CheckBox f183i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f184j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f185k;
    private ImageView l;
    private LinearLayout m;
    private Drawable n;
    private int o;
    private Context p;
    private boolean q;
    private Drawable r;
    private boolean s;
    private LayoutInflater t;
    private boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        x0 u = x0.u(getContext(), attributeSet, j.I1, i2, 0);
        this.n = u.f(j.K1);
        this.o = u.m(j.J1, -1);
        this.q = u.a(j.L1, false);
        this.p = context;
        this.r = u.f(j.M1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.z, 0);
        this.s = obtainStyledAttributes.hasValue(0);
        u.v();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f1935h, (ViewGroup) this, false);
        this.f183i = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f1936i, (ViewGroup) this, false);
        this.f180f = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f1938k, (ViewGroup) this, false);
        this.f181g = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f185k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            rect.top += this.l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(i iVar, int i2) {
        this.f179e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f179e;
    }

    public void h(boolean z, char c) {
        int i2 = (!z || !this.f179e.A()) ? 8 : 0;
        if (i2 == 0) {
            this.f184j.setText(this.f179e.h());
        }
        if (this.f184j.getVisibility() != i2) {
            this.f184j.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        u.L(this, this.n);
        TextView textView = (TextView) findViewById(f.M);
        this.f182h = textView;
        int i2 = this.o;
        if (i2 != -1) {
            textView.setTextAppearance(this.p, i2);
        }
        this.f184j = (TextView) findViewById(f.F_res_0x7f08009a);
        ImageView imageView = (ImageView) findViewById(f.I);
        this.f185k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.l = (ImageView) findViewById(f.r_res_0x7f080065);
        this.m = (LinearLayout) findViewById(f.l_res_0x7f080052);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f180f != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f180f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f181g != null || this.f183i != null) {
            if (this.f179e.m()) {
                if (this.f181g == null) {
                    g();
                }
                compoundButton2 = this.f181g;
                compoundButton = this.f183i;
            } else {
                if (this.f183i == null) {
                    e();
                }
                compoundButton2 = this.f183i;
                compoundButton = this.f181g;
            }
            if (z) {
                compoundButton2.setChecked(this.f179e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f183i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f181g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f179e.m()) {
            if (this.f181g == null) {
                g();
            }
            compoundButton = this.f181g;
        } else {
            if (this.f183i == null) {
                e();
            }
            compoundButton = this.f183i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f179e.z() || this.u;
        if (z || this.q) {
            ImageView imageView = this.f180f;
            if (imageView != null || drawable != null || this.q) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.q) {
                    ImageView imageView2 = this.f180f;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f180f.getVisibility() != 0) {
                        this.f180f.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f180f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f182h.setText(charSequence);
            if (this.f182h.getVisibility() != 0) {
                textView = this.f182h;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f182h.getVisibility() != 8) {
                textView = this.f182h;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
