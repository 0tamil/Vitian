package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.x;
import e.a.j;
import e.a.n.d;
import e.c.g;
import e.d.p.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class h {
    private static final Class<?>[] b = {Context.class, AttributeSet.class};
    private static final int[] c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f145d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    private static final g<String, Constructor<? extends View>> f146e = new g<>();
    private final Object[] a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        private final View f147e;

        /* renamed from: f  reason: collision with root package name */
        private final String f148f;

        /* renamed from: g  reason: collision with root package name */
        private Method f149g;

        /* renamed from: h  reason: collision with root package name */
        private Context f150h;

        public a(View view, String str) {
            this.f147e = view;
            this.f148f = str;
        }

        private void a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f148f, View.class)) != null) {
                        this.f149g = method;
                        this.f150h = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f147e.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f147e.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f148f + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f147e.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f149g == null) {
                a(this.f147e.getContext());
            }
            try {
                this.f149g.invoke(this.f150h, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || u.v(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) {
        String str3;
        g<String, Constructor<? extends View>> gVar = f146e;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f145d;
                if (i2 >= strArr.length) {
                    return null;
                }
                View r = r(context, str, strArr[i2]);
                if (r != null) {
                    return r;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.i3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(j.j3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(j.k3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof d) || ((d) context).c() != resourceId) ? new d(context, resourceId) : context : context;
    }

    private void u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(h.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    protected androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected f c(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected k f(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    protected m g(Context context, AttributeSet attributeSet) {
        return new m(context, attributeSet);
    }

    protected o h(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected p i(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t k(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected v l(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    protected a0 n(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    protected c0 o(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = u0.b(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view2 = k(context2, attributeSet);
                u(view2, str);
                break;
            case 1:
                view2 = e(context2, attributeSet);
                u(view2, str);
                break;
            case 2:
                view2 = i(context2, attributeSet);
                u(view2, str);
                break;
            case 3:
                view2 = n(context2, attributeSet);
                u(view2, str);
                break;
            case 4:
                view2 = g(context2, attributeSet);
                u(view2, str);
                break;
            case 5:
                view2 = l(context2, attributeSet);
                u(view2, str);
                break;
            case 6:
                view2 = m(context2, attributeSet);
                u(view2, str);
                break;
            case 7:
                view2 = j(context2, attributeSet);
                u(view2, str);
                break;
            case '\b':
                view2 = o(context2, attributeSet);
                u(view2, str);
                break;
            case '\t':
                view2 = h(context2, attributeSet);
                u(view2, str);
                break;
            case '\n':
                view2 = b(context2, attributeSet);
                u(view2, str);
                break;
            case 11:
                view2 = d(context2, attributeSet);
                u(view2, str);
                break;
            case '\f':
                view2 = f(context2, attributeSet);
                u(view2, str);
                break;
            case '\r':
                view2 = c(context2, attributeSet);
                u(view2, str);
                break;
            default:
                view2 = p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = s(context2, str, attributeSet);
        }
        if (view2 != null) {
            a(view2, attributeSet);
        }
        return view2;
    }
}
