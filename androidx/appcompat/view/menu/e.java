package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import e.a.g;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    Context f214e;

    /* renamed from: f  reason: collision with root package name */
    LayoutInflater f215f;

    /* renamed from: g  reason: collision with root package name */
    g f216g;

    /* renamed from: h  reason: collision with root package name */
    ExpandedMenuView f217h;

    /* renamed from: i  reason: collision with root package name */
    int f218i;

    /* renamed from: j  reason: collision with root package name */
    int f219j;

    /* renamed from: k  reason: collision with root package name */
    int f220k;
    private m.a l;
    a m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: e  reason: collision with root package name */
        private int f221e = -1;

        public a() {
            a();
        }

        void a() {
            i v = e.this.f216g.v();
            if (v != null) {
                ArrayList<i> z = e.this.f216g.z();
                int size = z.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (z.get(i2) == v) {
                        this.f221e = i2;
                        return;
                    }
                }
            }
            this.f221e = -1;
        }

        /* renamed from: b */
        public i getItem(int i2) {
            ArrayList<i> z = e.this.f216g.z();
            int i3 = i2 + e.this.f218i;
            int i4 = this.f221e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return z.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f216g.z().size() - e.this.f218i;
            return this.f221e < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f215f.inflate(eVar.f220k, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.f220k = i2;
        this.f219j = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f214e = context;
        this.f215f = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.m == null) {
            this.m = new a();
        }
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.l;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    public n c(ViewGroup viewGroup) {
        if (this.f217h == null) {
            this.f217h = (ExpandedMenuView) this.f215f.inflate(g.f1934g, viewGroup, false);
            if (this.m == null) {
                this.m = new a();
            }
            this.f217h.setAdapter((ListAdapter) this.m);
            this.f217h.setOnItemClickListener(this);
        }
        return this.f217h;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Context context, g gVar) {
        a aVar;
        LayoutInflater from;
        if (this.f219j != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f219j);
            this.f214e = contextThemeWrapper;
            from = LayoutInflater.from(contextThemeWrapper);
        } else {
            if (this.f214e != null) {
                this.f214e = context;
                if (this.f215f == null) {
                    from = LayoutInflater.from(context);
                }
            }
            this.f216g = gVar;
            aVar = this.m;
            if (aVar == null) {
                aVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.f215f = from;
        this.f216g = gVar;
        aVar = this.m;
        if (aVar == null) {
        }
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
        this.l = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.l;
        if (aVar == null) {
            return true;
        }
        aVar.c(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f216g.M(this.m.getItem(i2), this, 0);
    }
}
