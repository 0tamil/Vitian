package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: e  reason: collision with root package name */
    protected Context f194e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f195f;

    /* renamed from: g  reason: collision with root package name */
    protected g f196g;

    /* renamed from: h  reason: collision with root package name */
    protected LayoutInflater f197h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f198i;

    /* renamed from: j  reason: collision with root package name */
    private int f199j;

    /* renamed from: k  reason: collision with root package name */
    private int f200k;
    protected n l;

    public b(Context context, int i2, int i3) {
        this.f194e = context;
        this.f197h = LayoutInflater.from(context);
        this.f199j = i2;
        this.f200k = i3;
    }

    protected void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.l).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f198i;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    public abstract void c(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void e(Context context, g gVar) {
        this.f195f = context;
        LayoutInflater.from(context);
        this.f196g = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f198i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        m.a aVar = this.f198i;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f196g;
        }
        return aVar.c(rVar2);
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup != null) {
            g gVar = this.f196g;
            int i2 = 0;
            if (gVar != null) {
                gVar.r();
                ArrayList<i> E = this.f196g.E();
                int size = E.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = E.get(i4);
                    if (q(i3, iVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View n = n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            a(n, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f197h.inflate(this.f200k, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a m() {
        return this.f198i;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a k2 = view instanceof n.a ? (n.a) view : k(viewGroup);
        c(iVar, k2);
        return (View) k2;
    }

    public n o(ViewGroup viewGroup) {
        if (this.l == null) {
            n nVar = (n) this.f197h.inflate(this.f199j, viewGroup, false);
            this.l = nVar;
            nVar.b(this.f196g);
            j(true);
        }
        return this.l;
    }

    public void p(int i2) {
    }

    public abstract boolean q(int i2, i iVar);
}
