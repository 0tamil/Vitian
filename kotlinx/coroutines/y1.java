package kotlinx.coroutines;

import j.x.d.i;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.o;
/* loaded from: classes.dex */
public final class y1 extends m implements i1 {
    @Override // kotlinx.coroutines.i1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.i1
    public y1 f() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return o0.c() ? y("Active") : super.toString();
    }

    public final String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (o oVar = (o) o(); !i.a(oVar, this); oVar = oVar.p()) {
            if (oVar instanceof t1) {
                t1 t1Var = (t1) oVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(t1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        i.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
