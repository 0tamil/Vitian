package f.b.b.a;

import f.b.b.a.h;
import f.b.b.a.y.y;
import f.b.b.a.z.a.c0;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.s0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class f<PrimitiveT, KeyProtoT extends s0> implements e<PrimitiveT> {
    private final h<KeyProtoT> a;
    private final Class<PrimitiveT> b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<KeyFormatProtoT extends s0, KeyProtoT extends s0> {
        final h.a<KeyFormatProtoT, KeyProtoT> a;

        a(h.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.a.d(keyformatprotot);
            return this.a.a(keyformatprotot);
        }

        KeyProtoT a(i iVar) {
            return b(this.a.c(iVar));
        }
    }

    public f(h<KeyProtoT> hVar, Class<PrimitiveT> cls) {
        if (hVar.h().contains(cls) || Void.class.equals(cls)) {
            this.a = hVar;
            this.b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", hVar.toString(), cls.getName()));
    }

    private a<?, KeyProtoT> f() {
        return new a<>(this.a.e());
    }

    private PrimitiveT g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.b)) {
            this.a.i(keyprotot);
            return (PrimitiveT) this.a.d(keyprotot, (Class<PrimitiveT>) this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // f.b.b.a.e
    public final boolean a(String str) {
        return str.equals(e());
    }

    @Override // f.b.b.a.e
    public final y b(i iVar) {
        try {
            KeyProtoT a2 = f().a(iVar);
            y.b V = y.V();
            V.z(e());
            V.A(a2.i());
            V.y(this.a.f());
            return V.a();
        } catch (c0 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // f.b.b.a.e
    public final PrimitiveT c(i iVar) {
        try {
            return g(this.a.g(iVar));
        } catch (c0 e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.b().getName(), e2);
        }
    }

    @Override // f.b.b.a.e
    public final s0 d(i iVar) {
        try {
            return f().a(iVar);
        } catch (c0 e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.e().b().getName(), e2);
        }
    }

    public final String e() {
        return this.a.c();
    }
}
