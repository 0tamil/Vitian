package f.b.a.a.i;

import f.b.a.a.b;
import f.b.a.a.e;
import f.b.a.a.f;
import f.b.a.a.g;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements g {
    private final Set<b> a;
    private final p b;
    private final s c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set<b> set, p pVar, s sVar) {
        this.a = set;
        this.b = pVar;
        this.c = sVar;
    }

    @Override // f.b.a.a.g
    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new r(this.b, str, bVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}
