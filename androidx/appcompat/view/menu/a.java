package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.d.k.a.b;
/* loaded from: classes.dex */
public class a implements b {
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f186d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f187e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f188f;

    /* renamed from: g  reason: collision with root package name */
    private char f189g;

    /* renamed from: i  reason: collision with root package name */
    private char f191i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f193k;
    private Context l;
    private CharSequence m;
    private CharSequence n;

    /* renamed from: h  reason: collision with root package name */
    private int f190h = 4096;

    /* renamed from: j  reason: collision with root package name */
    private int f192j = 4096;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.l = context;
        this.a = i3;
        this.b = i2;
        this.c = i5;
        this.f186d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f193k;
        if (drawable == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable p = androidx.core.graphics.drawable.a.p(drawable);
            this.f193k = p;
            Drawable mutate = p.mutate();
            this.f193k = mutate;
            if (this.q) {
                androidx.core.graphics.drawable.a.n(mutate, this.o);
            }
            if (this.r) {
                androidx.core.graphics.drawable.a.o(this.f193k, this.p);
            }
        }
    }

    @Override // e.d.k.a.b
    public b a(e.d.p.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // e.d.k.a.b
    public e.d.p.b b() {
        return null;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public b d(int i2) {
        throw new UnsupportedOperationException();
    }

    public b e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public b f(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f192j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f191i;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f193k;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f188f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f190h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f189g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f186d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f187e;
        return charSequence != null ? charSequence : this.f186d;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        d(i2);
        throw null;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f191i = Character.toLowerCase(c);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
        this.f191i = Character.toLowerCase(c);
        this.f192j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & (-3));
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f193k = androidx.core.content.a.f(this.l, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f193k = drawable;
        c();
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f188f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f189g = c;
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
        this.f189g = c;
        this.f190h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f189g = c;
        this.f191i = Character.toLowerCase(c2);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f189g = c;
        this.f190h = KeyEvent.normalizeMetaState(i2);
        this.f191i = Character.toLowerCase(c2);
        this.f192j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f186d = this.l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f186d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f187e = charSequence;
        return this;
    }

    @Override // e.d.k.a.b, android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }
}
