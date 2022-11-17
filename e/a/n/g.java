package e.a.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f1984e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f1985f;
    final Object[] a;
    final Object[] b;
    Context c;

    /* renamed from: d  reason: collision with root package name */
    private Object f1986d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        e.d.p.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f1987d;

        /* renamed from: e  reason: collision with root package name */
        private int f1988e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1989f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1990g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1991h;

        /* renamed from: i  reason: collision with root package name */
        private int f1992i;

        /* renamed from: j  reason: collision with root package name */
        private int f1993j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f1994k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f1984e, g.this.a));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            e.d.p.b bVar = this.A;
            if (bVar != null) {
                e.d.p.i.a(menuItem, bVar);
            }
            e.d.p.i.c(menuItem, this.B);
            e.d.p.i.g(menuItem, this.C);
            e.d.p.i.b(menuItem, this.n, this.o);
            e.d.p.i.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                e.d.p.i.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                e.d.p.i.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1991h = true;
            i(this.a.add(this.b, this.f1992i, this.f1993j, this.f1994k));
        }

        public SubMenu b() {
            this.f1991h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f1992i, this.f1993j, this.f1994k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f1991h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.c.obtainStyledAttributes(attributeSet, e.a.j.d1);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.f1, 0);
            this.c = obtainStyledAttributes.getInt(e.a.j.h1, 0);
            this.f1987d = obtainStyledAttributes.getInt(e.a.j.i1, 0);
            this.f1988e = obtainStyledAttributes.getInt(e.a.j.j1, 0);
            this.f1989f = obtainStyledAttributes.getBoolean(e.a.j.g1, true);
            this.f1990g = obtainStyledAttributes.getBoolean(e.a.j.e1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            x0 t = x0.t(g.this.c, attributeSet, e.a.j.k1);
            this.f1992i = t.m(e.a.j.n1, 0);
            this.f1993j = (t.j(e.a.j.q1, this.c) & (-65536)) | (t.j(e.a.j.r1, this.f1987d) & 65535);
            this.f1994k = t.o(e.a.j.s1);
            this.l = t.o(e.a.j.t1);
            this.m = t.m(e.a.j.l1, 0);
            this.n = c(t.n(e.a.j.u1));
            this.o = t.j(e.a.j.B1, 4096);
            this.p = c(t.n(e.a.j.v1));
            this.q = t.j(e.a.j.F1, 4096);
            int i2 = e.a.j.w1;
            this.r = t.r(i2) ? t.a(i2, false) : this.f1988e;
            this.s = t.a(e.a.j.o1, false);
            this.t = t.a(e.a.j.p1, this.f1989f);
            this.u = t.a(e.a.j.m1, this.f1990g);
            this.v = t.j(e.a.j.G1, -1);
            this.z = t.n(e.a.j.x1);
            this.w = t.m(e.a.j.y1, 0);
            this.x = t.n(e.a.j.A1);
            String n = t.n(e.a.j.z1);
            this.y = n;
            boolean z = n != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (e.d.p.b) e(n, g.f1985f, g.this.b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t.o(e.a.j.C1);
            this.C = t.o(e.a.j.H1);
            int i3 = e.a.j.E1;
            if (t.r(i3)) {
                this.E = f0.d(t.j(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = e.a.j.D1;
            if (t.r(i4)) {
                this.D = t.c(i4);
            } else {
                this.D = null;
            }
            t.v();
            this.f1991h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.f1987d = 0;
            this.f1988e = 0;
            this.f1989f = true;
            this.f1990g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1984e = clsArr;
        f1985f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                e.d.p.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    Object b() {
        if (this.f1986d == null) {
            this.f1986d = a(this.c);
        }
        return this.f1986d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof e.d.k.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i2);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
