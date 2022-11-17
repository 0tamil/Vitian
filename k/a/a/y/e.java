package k.a.a.y;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import k.a.a.c;
import k.a.a.f;
import k.a.a.g;
import k.a.a.h;
import k.a.a.i;
import k.a.a.r;
import k.a.a.u.m;
import k.a.a.w.d;
/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final i f3755e;

    /* renamed from: f  reason: collision with root package name */
    private final byte f3756f;

    /* renamed from: g  reason: collision with root package name */
    private final c f3757g;

    /* renamed from: h  reason: collision with root package name */
    private final h f3758h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3759i;

    /* renamed from: j  reason: collision with root package name */
    private final b f3760j;

    /* renamed from: k  reason: collision with root package name */
    private final r f3761k;
    private final r l;
    private final r m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UTC,
        WALL,
        STANDARD;

        public g a(g gVar, r rVar, r rVar2) {
            long y;
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                y = rVar2.y() - r.f3550i.y();
            } else if (i2 != 2) {
                return gVar;
            } else {
                y = rVar2.y() - rVar.y();
            }
            return gVar.e0(y);
        }
    }

    e(i iVar, int i2, c cVar, h hVar, int i3, b bVar, r rVar, r rVar2, r rVar3) {
        this.f3755e = iVar;
        this.f3756f = (byte) i2;
        this.f3757g = cVar;
        this.f3758h = hVar;
        this.f3759i = i3;
        this.f3760j = bVar;
        this.f3761k = rVar;
        this.l = rVar2;
        this.m = rVar3;
    }

    private void a(StringBuilder sb, long j2) {
        if (j2 < 10) {
            sb.append(0);
        }
        sb.append(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        i u = i.u(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        c a2 = i3 == 0 ? null : c.a(i3);
        int i4 = (507904 & readInt) >>> 14;
        b bVar = b.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        int readInt2 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        r B = r.B(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        r B2 = r.B(i6 == 3 ? dataInput.readInt() : B.y() + (i6 * 1800));
        r B3 = r.B(i7 == 3 ? dataInput.readInt() : B.y() + (i7 * 1800));
        if (i2 >= -28 && i2 <= 31 && i2 != 0) {
            return new e(u, i2, a2, h.H(d.f(readInt2, 86400)), d.d(readInt2, 86400), bVar, B, B2, B3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new k.a.a.y.a((byte) 3, this);
    }

    public d b(int i2) {
        f fVar;
        k.a.a.x.f fVar2;
        byte b2 = this.f3756f;
        if (b2 < 0) {
            i iVar = this.f3755e;
            fVar = f.Z(i2, iVar, iVar.d(m.f3582g.z(i2)) + 1 + this.f3756f);
            c cVar = this.f3757g;
            if (cVar != null) {
                fVar2 = k.a.a.x.g.b(cVar);
                fVar = fVar.h(fVar2);
            }
        } else {
            fVar = f.Z(i2, this.f3755e, b2);
            c cVar2 = this.f3757g;
            if (cVar2 != null) {
                fVar2 = k.a.a.x.g.a(cVar2);
                fVar = fVar.h(fVar2);
            }
        }
        return new d(this.f3760j.a(g.V(fVar.e0(this.f3759i), this.f3758h), this.f3761k, this.l), this.l, this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        int Q = this.f3758h.Q() + (this.f3759i * 86400);
        int y = this.f3761k.y();
        int y2 = this.l.y() - y;
        int y3 = this.m.y() - y;
        int y4 = (Q % 3600 != 0 || Q > 86400) ? 31 : Q == 86400 ? 24 : this.f3758h.y();
        int i2 = y % 900 == 0 ? (y / 900) + 128 : 255;
        int i3 = (y2 == 0 || y2 == 1800 || y2 == 3600) ? y2 / 1800 : 3;
        int i4 = (y3 == 0 || y3 == 1800 || y3 == 3600) ? y3 / 1800 : 3;
        c cVar = this.f3757g;
        dataOutput.writeInt((this.f3755e.getValue() << 28) + ((this.f3756f + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (y4 << 14) + (this.f3760j.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (y4 == 31) {
            dataOutput.writeInt(Q);
        }
        if (i2 == 255) {
            dataOutput.writeInt(y);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.l.y());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.m.y());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3755e == eVar.f3755e && this.f3756f == eVar.f3756f && this.f3757g == eVar.f3757g && this.f3760j == eVar.f3760j && this.f3759i == eVar.f3759i && this.f3758h.equals(eVar.f3758h) && this.f3761k.equals(eVar.f3761k) && this.l.equals(eVar.l) && this.m.equals(eVar.m);
    }

    public int hashCode() {
        int Q = ((this.f3758h.Q() + this.f3759i) << 15) + (this.f3755e.ordinal() << 11) + ((this.f3756f + 32) << 5);
        c cVar = this.f3757g;
        return ((((Q + ((cVar == null ? 7 : cVar.ordinal()) << 2)) + this.f3760j.ordinal()) ^ this.f3761k.hashCode()) ^ this.l.hashCode()) ^ this.m.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        long j2;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.l.compareTo(this.m) > 0 ? "Gap " : "Overlap ");
        sb.append(this.l);
        sb.append(" to ");
        sb.append(this.m);
        sb.append(", ");
        c cVar = this.f3757g;
        if (cVar != null) {
            byte b2 = this.f3756f;
            sb.append(cVar.name());
            if (b2 == -1) {
                str = " on or before last day of ";
            } else if (b2 < 0) {
                sb.append(" on or before last day minus ");
                sb.append((-this.f3756f) - 1);
                str = " of ";
            } else {
                sb.append(" on or after ");
            }
            sb.append(str);
            sb.append(this.f3755e.name());
            sb.append(" at ");
            if (this.f3759i != 0) {
                sb.append(this.f3758h);
            } else {
                a(sb, d.e((this.f3758h.Q() / 60) + (this.f3759i * 24 * 60), 60L));
                sb.append(':');
                a(sb, d.g(j2, 60));
            }
            sb.append(" ");
            sb.append(this.f3760j);
            sb.append(", standard offset ");
            sb.append(this.f3761k);
            sb.append(']');
            return sb.toString();
        }
        sb.append(this.f3755e.name());
        sb.append(' ');
        sb.append((int) this.f3756f);
        sb.append(" at ");
        if (this.f3759i != 0) {
        }
        sb.append(" ");
        sb.append(this.f3760j);
        sb.append(", standard offset ");
        sb.append(this.f3761k);
        sb.append(']');
        return sb.toString();
    }
}
