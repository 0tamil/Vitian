package j.x.d;

import j.a0.c;
import j.a0.d;
import j.a0.e;
/* loaded from: classes.dex */
public class m {
    public e a(g gVar) {
        return gVar;
    }

    public c b(Class cls) {
        return new c(cls);
    }

    public d c(Class cls, String str) {
        return new k(cls, str);
    }

    public String d(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(j jVar) {
        return d(jVar);
    }
}
