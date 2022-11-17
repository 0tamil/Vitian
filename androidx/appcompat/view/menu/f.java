package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    g f223e;

    /* renamed from: f  reason: collision with root package name */
    private int f224f = -1;

    /* renamed from: g  reason: collision with root package name */
    private boolean f225g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f226h;

    /* renamed from: i  reason: collision with root package name */
    private final LayoutInflater f227i;

    /* renamed from: j  reason: collision with root package name */
    private final int f228j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f226h = z;
        this.f227i = layoutInflater;
        this.f223e = gVar;
        this.f228j = i2;
        a();
    }

    void a() {
        i v = this.f223e.v();
        if (v != null) {
            ArrayList<i> z = this.f223e.z();
            int size = z.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z.get(i2) == v) {
                    this.f224f = i2;
                    return;
                }
            }
        }
        this.f224f = -1;
    }

    public g b() {
        return this.f223e;
    }

    /* renamed from: c */
    public i getItem(int i2) {
        ArrayList<i> z = this.f226h ? this.f223e.z() : this.f223e.E();
        int i3 = this.f224f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return z.get(i2);
    }

    public void d(boolean z) {
        this.f225g = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> z = this.f226h ? this.f223e.z() : this.f223e.E();
        int i2 = this.f224f;
        int size = z.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f227i.inflate(this.f228j, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f223e.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f225g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
