package e.e.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.e.a.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e  reason: collision with root package name */
    protected boolean f2148e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f2149f;

    /* renamed from: g  reason: collision with root package name */
    protected Cursor f2150g;

    /* renamed from: h  reason: collision with root package name */
    protected Context f2151h;

    /* renamed from: i  reason: collision with root package name */
    protected int f2152i;

    /* renamed from: j  reason: collision with root package name */
    protected C0079a f2153j;

    /* renamed from: k  reason: collision with root package name */
    protected DataSetObserver f2154k;
    protected e.e.a.b l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0079a extends ContentObserver {
        C0079a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2148e = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2148e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    public void b(Cursor cursor) {
        Cursor j2 = j(cursor);
        if (j2 != null) {
            j2.close();
        }
    }

    @Override // e.e.a.b.a
    public Cursor c() {
        return this.f2150g;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i2) {
        b bVar;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2149f = true;
        } else {
            this.f2149f = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2150g = cursor;
        this.f2148e = z;
        this.f2151h = context;
        this.f2152i = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f2153j = new C0079a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2153j = null;
        }
        this.f2154k = bVar;
        if (z) {
            C0079a aVar = this.f2153j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2154k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2148e || (cursor = this.f2150g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2148e) {
            return null;
        }
        this.f2150g.moveToPosition(i2);
        if (view == null) {
            view = g(this.f2151h, this.f2150g, viewGroup);
        }
        e(view, this.f2151h, this.f2150g);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.l == null) {
            this.l = new e.e.a.b(this);
        }
        return this.l;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2148e || (cursor = this.f2150g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2150g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f2148e || (cursor = this.f2150g) == null || !cursor.moveToPosition(i2)) {
            return 0L;
        }
        return this.f2150g.getLong(this.f2152i);
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2148e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2150g.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f2151h, this.f2150g, viewGroup);
            }
            e(view, this.f2151h, this.f2150g);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (this.f2149f && (cursor = this.f2150g) != null && !cursor.isClosed()) {
            this.f2148e = this.f2150g.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f2150g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0079a aVar = this.f2153j;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2154k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2150g = cursor;
        if (cursor != null) {
            C0079a aVar2 = this.f2153j;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2154k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2152i = cursor.getColumnIndexOrThrow("_id");
            this.f2148e = true;
            notifyDataSetChanged();
        } else {
            this.f2152i = -1;
            this.f2148e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
