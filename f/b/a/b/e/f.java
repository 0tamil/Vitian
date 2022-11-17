package f.b.a.b.e;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public final class f {
    public static final a.g<f.b.a.b.e.b.a> a;
    public static final a.g<f.b.a.b.e.b.a> b;
    public static final a.AbstractC0026a<f.b.a.b.e.b.a, a> c;

    /* renamed from: d  reason: collision with root package name */
    static final a.AbstractC0026a<f.b.a.b.e.b.a, e> f2394d;

    /* renamed from: e  reason: collision with root package name */
    public static final a<a> f2395e;

    static {
        a.g<f.b.a.b.e.b.a> gVar = new a.g<>();
        a = gVar;
        a.g<f.b.a.b.e.b.a> gVar2 = new a.g<>();
        b = gVar2;
        c cVar = new c();
        c = cVar;
        d dVar = new d();
        f2394d = dVar;
        new Scope("profile");
        new Scope("email");
        f2395e = new a<>("SignIn.API", cVar, gVar);
        new a("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
