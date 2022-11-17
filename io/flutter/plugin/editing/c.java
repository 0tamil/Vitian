package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.j.n;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends SpannableStringBuilder {

    /* renamed from: e  reason: collision with root package name */
    private int f3182e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f3183f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f3184g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<b> f3185h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<d> f3186i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private String f3187j;

    /* renamed from: k  reason: collision with root package name */
    private String f3188k;
    private int l;
    private int m;
    private int n;
    private int o;
    private BaseInputConnection p;

    /* loaded from: classes.dex */
    class a extends BaseInputConnection {
        final /* synthetic */ Editable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, View view, boolean z, Editable editable) {
            super(view, z);
            this.a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, boolean z2, boolean z3);
    }

    public c(n.e eVar, View view) {
        this.p = new a(this, view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z, boolean z2, boolean z3) {
        this.f3183f++;
        bVar.a(z, z2, z3);
        this.f3183f--;
    }

    private void k(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<b> it = this.f3184g.iterator();
            while (it.hasNext()) {
                j(it.next(), z, z2, z3);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f3183f > 0) {
            h.a.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f3182e > 0) {
            h.a.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f3185h;
        } else {
            arrayList = this.f3184g;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f3182e++;
        if (this.f3183f > 0) {
            h.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f3182e == 1 && !this.f3184g.isEmpty()) {
            this.f3188k = toString();
            this.l = i();
            this.m = h();
            this.n = g();
            this.o = f();
        }
    }

    public void c() {
        this.f3186i.clear();
    }

    public void d() {
        int i2 = this.f3182e;
        if (i2 == 0) {
            h.a.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i2 == 1) {
            Iterator<b> it = this.f3185h.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f3184g.isEmpty()) {
                h.a.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f3184g.size()) + " listener(s)");
                boolean equals = toString().equals(this.f3188k) ^ true;
                boolean z = false;
                boolean z2 = (this.l == i() && this.m == h()) ? false : true;
                if (!(this.n == g() && this.o == f())) {
                    z = true;
                }
                k(equals, z2, z);
            }
        }
        this.f3184g.addAll(this.f3185h);
        this.f3185h.clear();
        this.f3182e--;
    }

    public ArrayList<d> e() {
        ArrayList<d> arrayList = new ArrayList<>(this.f3186i);
        this.f3186i.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f3183f > 0) {
            h.a.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f3184g.remove(bVar);
        if (this.f3182e > 0) {
            this.f3185h.remove(bVar);
        }
    }

    public void m(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.p.setComposingRegion(i2, i3);
        }
    }

    public void n(n.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.b, eVar.c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f3118d, eVar.f3119e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z;
        boolean z2;
        if (this.f3183f > 0) {
            h.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i6 = i3 - i2;
        boolean z3 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z3; i7++) {
            z3 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z3) {
            this.f3187j = null;
        }
        int i8 = i();
        int h2 = h();
        int g2 = g();
        int f2 = f();
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        boolean z4 = z3;
        this.f3186i.add(new d(cVar, i2, i3, charSequence, i(), h(), g(), f()));
        if (this.f3182e > 0) {
            return replace;
        }
        boolean z5 = (i() == i8 && h() == h2) ? false : true;
        if (g() == g2 && f() == f2) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        k(z, z5, z2);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        this.f3186i.add(new d(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f3187j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f3187j = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
