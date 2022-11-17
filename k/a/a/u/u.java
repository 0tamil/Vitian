package k.a.a.u;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* loaded from: classes.dex */
final class u implements Externalizable {

    /* renamed from: e  reason: collision with root package name */
    private byte f3607e;

    /* renamed from: f  reason: collision with root package name */
    private Object f3608f;

    public u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(byte b, Object obj) {
        this.f3607e = b;
        this.f3608f = obj;
    }

    private static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return p.T(objectInput);
            case 2:
                return q.x(objectInput);
            case 3:
                return k.v0(objectInput);
            case 4:
                return l.p(objectInput);
            case 5:
                return s.T(objectInput);
            case 6:
                return t.d(objectInput);
            case 7:
                return w.T(objectInput);
            case 8:
                return x.d(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return h.s(objectInput);
            case 12:
                return d.P(objectInput);
            case 13:
                return g.L(objectInput);
        }
    }

    private static void b(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((p) obj).Z(objectOutput);
                return;
            case 2:
                ((q) obj).A(objectOutput);
                return;
            case 3:
                ((k) obj).z0(objectOutput);
                return;
            case 4:
                ((l) obj).t(objectOutput);
                return;
            case 5:
                ((s) obj).X(objectOutput);
                return;
            case 6:
                ((t) obj).p(objectOutput);
                return;
            case 7:
                ((w) obj).X(objectOutput);
                return;
            case 8:
                ((x) obj).p(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((h) obj).v(objectOutput);
                return;
            case 12:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((g) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.f3608f;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f3607e = readByte;
        this.f3608f = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        b(this.f3607e, this.f3608f, objectOutput);
    }
}
