package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.regex.Pattern;
import k.a.a.w.d;
import k.a.a.y.f;
import k.a.a.y.g;
import k.a.a.y.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends q implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f3555g = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: e  reason: collision with root package name */
    private final String f3556e;

    /* renamed from: f  reason: collision with root package name */
    private final transient f f3557f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String str, f fVar) {
        this.f3556e = str;
        this.f3557f = fVar;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s w(String str, boolean z) {
        d.i(str, "zoneId");
        if (str.length() < 2 || !f3555g.matcher(str).matches()) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        f fVar = null;
        try {
            fVar = i.c(str, true);
        } catch (g e2) {
            if (str.equals("GMT0")) {
                fVar = r.f3550i.d();
            } else if (z) {
                throw e2;
            }
        }
        return new s(str, fVar);
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    private static s x(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new s(str, r.f3550i.d());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                r z = r.z(str.substring(3));
                if (z.y() == 0) {
                    return new s(str.substring(0, 3), z.d());
                }
                return new s(str.substring(0, 3) + z.a(), z.d());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return w(str, false);
            } else {
                r z2 = r.z(str.substring(2));
                if (z2.y() == 0) {
                    return new s("UT", z2.d());
                }
                return new s("UT" + z2.a(), z2.d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q y(DataInput dataInput) {
        return x(dataInput.readUTF());
    }

    @Override // k.a.a.q
    public String a() {
        return this.f3556e;
    }

    @Override // k.a.a.q
    public f d() {
        f fVar = this.f3557f;
        return fVar != null ? fVar : i.c(this.f3556e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k.a.a.q
    public void v(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        z(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f3556e);
    }
}
