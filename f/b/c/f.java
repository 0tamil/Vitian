package f.b.c;

import f.b.c.z.d;
import f.b.c.z.n.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    private String f2695h;
    private d a = d.f2714k;
    private t b = t.f2700e;
    private d c = c.f2676e;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, g<?>> f2691d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<x> f2692e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<x> f2693f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f2694g = false;

    /* renamed from: i  reason: collision with root package name */
    private int f2696i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f2697j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2698k = false;
    private boolean l = false;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private v q = u.f2703e;
    private v r = u.f2704f;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, int i2, int i3, List<x> list) {
        x xVar;
        x xVar2;
        boolean z = f.b.c.z.p.d.a;
        x xVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            xVar = d.b.b.b(str);
            if (z) {
                xVar3 = f.b.c.z.p.d.c.b(str);
                xVar2 = f.b.c.z.p.d.b.b(str);
                list.add(xVar);
                if (!z) {
                }
            }
            xVar2 = null;
            list.add(xVar);
            if (!z) {
            }
        } else if (i2 != 2 && i3 != 2) {
            x a = d.b.b.a(i2, i3);
            if (z) {
                xVar3 = f.b.c.z.p.d.c.a(i2, i3);
                xVar2 = f.b.c.z.p.d.b.a(i2, i3);
                xVar = a;
                list.add(xVar);
                if (!z) {
                    list.add(xVar3);
                    list.add(xVar2);
                    return;
                }
                return;
            }
            xVar = a;
            xVar2 = null;
            list.add(xVar);
            if (!z) {
            }
        }
    }

    public e b() {
        List<x> arrayList = new ArrayList<>(this.f2692e.size() + this.f2693f.size() + 3);
        arrayList.addAll(this.f2692e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f2693f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f2695h, this.f2696i, this.f2697j, arrayList);
        return new e(this.a, this.c, this.f2691d, this.f2694g, this.f2698k, this.o, this.m, this.n, this.p, this.l, this.b, this.f2695h, this.f2696i, this.f2697j, this.f2692e, this.f2693f, arrayList, this.q, this.r);
    }

    public f c(x xVar) {
        this.f2692e.add(xVar);
        return this;
    }
}
