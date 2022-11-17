package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import e.a.h;
import e.d.k.a.b;
import e.d.p.b;
/* loaded from: classes.dex */
public final class i implements b {
    private View A;
    private e.d.p.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f241d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f242e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f243f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f244g;

    /* renamed from: h  reason: collision with root package name */
    private char f245h;

    /* renamed from: j  reason: collision with root package name */
    private char f247j;
    private Drawable l;
    g n;
    private r o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;

    /* renamed from: i  reason: collision with root package name */
    private int f246i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f248k = 4096;
    private int m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.AbstractC0074b {
        a() {
        }

        @Override // e.d.p.b.AbstractC0074b
        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.n.J(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.z = 0;
        this.n = gVar;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.f241d = i5;
        this.f242e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.n(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.o(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // e.d.k.a.b
    public e.d.k.a.b a(e.d.p.b bVar) {
        e.d.p.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.n.K(true);
        e.d.p.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // e.d.k.a.b
    public e.d.p.b b() {
        return this.B;
    }

    public void c() {
        this.n.I(this);
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f241d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.n.G() ? this.f247j : this.f245h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        e.d.p.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d2 = bVar.d(this);
        this.A = d2;
        return d2;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f248k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f247j;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable d2 = e.a.k.a.a.d(this.n.u(), this.m);
        this.m = 0;
        this.l = d2;
        return e(d2);
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f244g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f246i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f245h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f242e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f243f;
        if (charSequence == null) {
            charSequence = this.f242e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i2;
        char g2 = g();
        if (g2 == 0) {
            return "";
        }
        Resources resources = this.n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.k_res_0x7f0e0011));
        }
        int i3 = this.n.G() ? this.f248k : this.f246i;
        d(sb, i3, 65536, resources.getString(h.g_res_0x7f0e000d));
        d(sb, i3, 4096, resources.getString(h.c_res_0x7f0e0009));
        d(sb, i3, 2, resources.getString(h.b_res_0x7f0e0008));
        d(sb, i3, 1, resources.getString(h.h_res_0x7f0e000e));
        d(sb, i3, 4, resources.getString(h.j_res_0x7f0e0010));
        d(sb, i3, 8, resources.getString(h.f_res_0x7f0e000c));
        if (g2 == '\b') {
            i2 = h.d_res_0x7f0e000a;
        } else if (g2 == '\n') {
            i2 = h.e_res_0x7f0e000b;
        } else if (g2 != ' ') {
            sb.append(g2);
            return sb.toString();
        } else {
            i2 = h.i_res_0x7f0e000f;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        e.d.p.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        e.d.p.b bVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f244g != null) {
            try {
                this.n.u().startActivity(this.f244g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        e.d.p.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public e.d.k.a.b p(int i2) {
        Context u = this.n.u();
        q(LayoutInflater.from(u).inflate(i2, (ViewGroup) new LinearLayout(u), false));
        return this;
    }

    public e.d.k.a.b q(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.I(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f247j == c) {
            return this;
        }
        this.f247j = Character.toLowerCase(c);
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
        if (this.f247j == c && this.f248k == i2) {
            return this;
        }
        this.f247j = Character.toLowerCase(c);
        this.f248k = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.T(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public e.d.k.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.y = z ? this.y | 16 : this.y & (-17);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f244g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f245h == c) {
            return this;
        }
        this.f245h = c;
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
        if (this.f245h == c && this.f246i == i2) {
            return this;
        }
        this.f245h = c;
        this.f246i = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f245h = c;
        this.f247j = Character.toLowerCase(c2);
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f245h = c;
        this.f246i = KeyEvent.normalizeMetaState(i2);
        this.f247j = Character.toLowerCase(c2);
        this.f248k = KeyEvent.normalizeMetaState(i3);
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        w(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.u().getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f242e = charSequence;
        this.n.K(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f243f = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public e.d.k.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.J(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f242e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        this.y = z ? this.y | 32 : this.y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public e.d.k.a.b w(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.n.A();
    }
}
