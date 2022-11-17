package f.b.a.a.i;

import f.b.a.a.b;
import f.b.a.a.c;
import f.b.a.a.e;
import f.b.a.a.f;
import f.b.a.a.h;
import f.b.a.a.i.o;
/* loaded from: classes.dex */
final class r<T> implements f<T> {
    private final p a;
    private final String b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f2304d;

    /* renamed from: e  reason: collision with root package name */
    private final s f2305e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(p pVar, String str, b bVar, e<T, byte[]> eVar, s sVar) {
        this.a = pVar;
        this.b = str;
        this.c = bVar;
        this.f2304d = eVar;
        this.f2305e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // f.b.a.a.f
    public void a(c<T> cVar) {
        b(cVar, a.a);
    }

    @Override // f.b.a.a.f
    public void b(c<T> cVar, h hVar) {
        s sVar = this.f2305e;
        o.a a = o.a();
        a.e(this.a);
        a.c(cVar);
        a.f(this.b);
        a.d(this.f2304d);
        a.b(this.c);
        sVar.a(a.a(), hVar);
    }
}
