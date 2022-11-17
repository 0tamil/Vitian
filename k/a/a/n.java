package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements Externalizable {

    /* renamed from: e  reason: collision with root package name */
    private byte f3543e;

    /* renamed from: f  reason: collision with root package name */
    private Object f3544f;

    public n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(byte b, Object obj) {
        this.f3543e = b;
        this.f3544f = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(DataInput dataInput) {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) {
        if (b == 64) {
            return j.x(dataInput);
        }
        switch (b) {
            case 1:
                return d.k(dataInput);
            case 2:
                return e.H(dataInput);
            case 3:
                return f.i0(dataInput);
            case 4:
                return g.h0(dataInput);
            case 5:
                return h.O(dataInput);
            case 6:
                return t.c0(dataInput);
            case 7:
                return s.y(dataInput);
            case 8:
                return r.D(dataInput);
            default:
                switch (b) {
                    case 66:
                        return l.y(dataInput);
                    case 67:
                        return o.z(dataInput);
                    case 68:
                        return p.B(dataInput);
                    case 69:
                        return k.B(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    static void c(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((d) obj).l(dataOutput);
                    return;
                case 2:
                    ((e) obj).L(dataOutput);
                    return;
                case 3:
                    ((f) obj).q0(dataOutput);
                    return;
                case 4:
                    ((g) obj).m0(dataOutput);
                    return;
                case 5:
                    ((h) obj).X(dataOutput);
                    return;
                case 6:
                    ((t) obj).l0(dataOutput);
                    return;
                case 7:
                    ((s) obj).z(dataOutput);
                    return;
                case 8:
                    ((r) obj).G(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((l) obj).D(dataOutput);
                            return;
                        case 67:
                            ((o) obj).C(dataOutput);
                            return;
                        case 68:
                            ((p) obj).H(dataOutput);
                            return;
                        case 69:
                            ((k) obj).J(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((j) obj).y(dataOutput);
        }
    }

    private Object readResolve() {
        return this.f3544f;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f3543e = readByte;
        this.f3544f = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        c(this.f3543e, this.f3544f, objectOutput);
    }
}
