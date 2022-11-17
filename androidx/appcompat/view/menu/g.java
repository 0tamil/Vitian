package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e.d.p.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class g implements e.d.k.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f229d;

    /* renamed from: e  reason: collision with root package name */
    private a f230e;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private i x;
    private boolean z;
    private int l = 0;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<i> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> w = new CopyOnWriteArrayList<>();
    private boolean y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<i> f231f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<i> f232g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f233h = true;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i> f234i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<i> f235j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private boolean f236k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.a = context;
        this.b = context.getResources();
        b0(true);
    }

    private static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.f231f.size()) {
            this.f231f.remove(i2);
            if (z) {
                K(true);
            }
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.n = C.getText(i2);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i3 > 0) {
                this.o = androidx.core.content.a.f(u(), i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        K(false);
    }

    private void b0(boolean z) {
        boolean z2 = true;
        if (!z || this.b.getConfiguration().keyboard == 1 || !v.b(ViewConfiguration.get(this.a), this.a)) {
            z2 = false;
        }
        this.f229d = z2;
    }

    private i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z) {
        if (!this.w.isEmpty()) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.j(z);
                }
            }
            c0();
        }
    }

    private boolean j(r rVar, m mVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.i(rVar);
        }
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.w.remove(next);
            } else if (!z) {
                z = mVar2.i(rVar);
            }
        }
        return z;
    }

    private static int n(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.t;
    }

    Resources C() {
        return this.b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f233h) {
            return this.f232g;
        }
        this.f232g.clear();
        int size = this.f231f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f231f.get(i2);
            if (iVar.isVisible()) {
                this.f232g.add(iVar);
            }
        }
        this.f233h = false;
        this.f236k = true;
        return this.f232g;
    }

    public boolean F() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.c;
    }

    public boolean H() {
        return this.f229d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(i iVar) {
        this.f236k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(i iVar) {
        this.f233h = true;
        K(true);
    }

    public void K(boolean z) {
        if (!this.q) {
            if (z) {
                this.f233h = true;
                this.f236k = true;
            }
            i(z);
            return;
        }
        this.r = true;
        if (z) {
            this.s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r9 & 1) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r1 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean M(MenuItem menuItem, m mVar, int i2) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k2 = iVar.k();
        e.d.p.b b2 = iVar.b();
        boolean z = b2 != null && b2.a();
        if (iVar.j()) {
            k2 |= iVar.expandActionView();
        } else if (iVar.hasSubMenu() || z) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z) {
                b2.f(rVar);
            }
            k2 |= j(rVar, mVar);
        }
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f230e = aVar;
    }

    public g S(int i2) {
        this.l = i2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f231f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f231f.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B = B(i4);
        i g2 = g(i2, i3, i4, B, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f231f;
        arrayList.add(n(arrayList, B), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.a);
    }

    public void c(m mVar, Context context) {
        this.w.add(new WeakReference<>(mVar));
        mVar.e(context, this);
        this.f236k = true;
    }

    public void c0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            K(this.s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.x;
        if (iVar != null) {
            f(iVar);
        }
        this.f231f.clear();
        K(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f230e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public final void e(boolean z) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.b(this, z);
                }
            }
            this.u = false;
        }
    }

    public boolean f(i iVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == iVar) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z = mVar.f(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            c0();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f231f.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f231f.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f230e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f231f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.w.remove(next);
            } else {
                z = mVar.g(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        c0();
        if (z) {
            this.x = iVar;
        }
        return z;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f231f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f231f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    i p(int i2, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i p = p(i2, keyEvent);
        boolean L = p != null ? L(p, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<i> list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f231f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f231f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> E = E();
        if (this.f236k) {
            Iterator<WeakReference<m>> it = this.w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z |= mVar.d();
                }
            }
            if (z) {
                this.f234i.clear();
                this.f235j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = E.get(i2);
                    (iVar.l() ? this.f234i : this.f235j).add(iVar);
                }
            } else {
                this.f234i.clear();
                this.f235j.clear();
                this.f235j.addAll(E());
            }
            this.f236k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int l = l(i2);
        if (l >= 0) {
            int size = this.f231f.size() - l;
            int i3 = 0;
            while (true) {
                i3++;
                if (i3 >= size || this.f231f.get(l).getGroupId() != i2) {
                    break;
                }
                N(l, false);
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f234i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f231f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f231f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f231f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f231f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f231f.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f231f.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f231f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.a;
    }

    public i v() {
        return this.x;
    }

    public Drawable w() {
        return this.o;
    }

    public CharSequence x() {
        return this.n;
    }

    public View y() {
        return this.p;
    }

    public ArrayList<i> z() {
        r();
        return this.f235j;
    }
}
