package f.b.b.a.z.a;

import f.b.b.a.z.a.s0;
/* loaded from: classes.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {
    static {
        q.b();
    }

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.k()) {
            return messagetype;
        }
        c0 a = d(messagetype).a();
        a.i(messagetype);
        throw a;
    }

    private n1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).o() : new n1(messagetype);
    }

    /* renamed from: e */
    public MessageType a(i iVar, q qVar) {
        MessageType f2 = f(iVar, qVar);
        c(f2);
        return f2;
    }

    public MessageType f(i iVar, q qVar) {
        try {
            j s = iVar.s();
            MessageType messagetype = (MessageType) b(s, qVar);
            try {
                s.a(0);
                return messagetype;
            } catch (c0 e2) {
                e2.i(messagetype);
                throw e2;
            }
        } catch (c0 e3) {
            throw e3;
        }
    }
}
