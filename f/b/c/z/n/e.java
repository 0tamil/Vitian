package f.b.c.z.n;

import f.b.c.a0.a;
import f.b.c.j;
import f.b.c.r;
import f.b.c.w;
import f.b.c.x;
import f.b.c.y.b;
import f.b.c.z.c;
/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: e  reason: collision with root package name */
    private final c f2749e;

    public e(c cVar) {
        this.f2749e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w<?> a(c cVar, f.b.c.e eVar, a<?> aVar, b bVar) {
        w<?> wVar;
        Object a = cVar.a(a.a(bVar.value())).a();
        if (a instanceof w) {
            wVar = (w) a;
        } else if (a instanceof x) {
            wVar = ((x) a).create(eVar, aVar);
        } else {
            boolean z = a instanceof r;
            if (z || (a instanceof j)) {
                j jVar = null;
                r rVar = z ? (r) a : null;
                if (a instanceof j) {
                    jVar = (j) a;
                }
                wVar = new l<>(rVar, jVar, eVar, aVar, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (wVar == null || !bVar.nullSafe()) ? wVar : wVar.b();
    }

    @Override // f.b.c.x
    public <T> w<T> create(f.b.c.e eVar, a<T> aVar) {
        b bVar = (b) aVar.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return (w<T>) a(this.f2749e, eVar, aVar, bVar);
    }
}
