package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e.g.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements LayoutInflater.Factory2 {

    /* renamed from: e  reason: collision with root package name */
    final n f763e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f764e;

        a(u uVar) {
            this.f764e = uVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k2 = this.f764e.k();
            this.f764e.m();
            c0.n((ViewGroup) k2.L.getParent(), l.this.f763e).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(n nVar) {
        this.f763e = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        u uVar;
        View view2;
        StringBuilder sb;
        String str2;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f763e);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.c, -1);
        String string = obtainStyledAttributes.getString(c.f2160d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f763e.g0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f763e.h0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f763e.g0(id);
        }
        if (fragment == null) {
            fragment = this.f763e.p0().a(context.getClassLoader(), attributeValue);
            fragment.r = true;
            fragment.A = resourceId != 0 ? resourceId : id;
            fragment.B = id;
            fragment.C = string;
            fragment.s = true;
            n nVar = this.f763e;
            fragment.w = nVar;
            fragment.x = nVar.s0();
            fragment.w0(this.f763e.s0().k(), attributeSet, fragment.f674f);
            uVar = this.f763e.g(fragment);
            if (n.E0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
            fragment.K = (ViewGroup) view;
            uVar.m();
            uVar.j();
            view2 = fragment.L;
            if (view2 == null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragment.L.getTag() == null) {
                    fragment.L.setTag(string);
                }
                fragment.L.addOnAttachStateChangeListener(new a(uVar));
                return fragment.L;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        } else if (!fragment.s) {
            fragment.s = true;
            n nVar2 = this.f763e;
            fragment.w = nVar2;
            fragment.x = nVar2.s0();
            fragment.w0(this.f763e.s0().k(), attributeSet, fragment.f674f);
            uVar = this.f763e.v(fragment);
            if (n.E0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragment);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
            fragment.K = (ViewGroup) view;
            uVar.m();
            uVar.j();
            view2 = fragment.L;
            if (view2 == null) {
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
