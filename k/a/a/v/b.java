package k.a.a.v;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import k.a.a.q;
import k.a.a.u.h;
import k.a.a.u.m;
import k.a.a.v.c;
import k.a.a.v.d;
import k.a.a.w.d;
import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.i;
import k.a.a.x.k;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final b f3624h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f3625i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f3626j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f3627k;
    public static final b l;
    private final c.f a;
    private final Locale b;
    private final h c;

    /* renamed from: d  reason: collision with root package name */
    private final i f3628d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<i> f3629e;

    /* renamed from: f  reason: collision with root package name */
    private final h f3630f;

    /* renamed from: g  reason: collision with root package name */
    private final q f3631g;

    static {
        c cVar = new c();
        a aVar = a.YEAR;
        j jVar = j.EXCEEDS_PAD;
        cVar.l(aVar, 4, 10, jVar);
        cVar.e('-');
        a aVar2 = a.MONTH_OF_YEAR;
        cVar.k(aVar2, 2);
        cVar.e('-');
        a aVar3 = a.DAY_OF_MONTH;
        cVar.k(aVar3, 2);
        i iVar = i.STRICT;
        b u = cVar.u(iVar);
        m mVar = m.f3582g;
        b l2 = u.l(mVar);
        f3624h = l2;
        c cVar2 = new c();
        cVar2.p();
        cVar2.a(l2);
        cVar2.h();
        cVar2.u(iVar).l(mVar);
        c cVar3 = new c();
        cVar3.p();
        cVar3.a(l2);
        cVar3.o();
        cVar3.h();
        cVar3.u(iVar).l(mVar);
        c cVar4 = new c();
        a aVar4 = a.HOUR_OF_DAY;
        cVar4.k(aVar4, 2);
        cVar4.e(':');
        a aVar5 = a.MINUTE_OF_HOUR;
        cVar4.k(aVar5, 2);
        cVar4.o();
        cVar4.e(':');
        a aVar6 = a.SECOND_OF_MINUTE;
        cVar4.k(aVar6, 2);
        cVar4.o();
        cVar4.b(a.NANO_OF_SECOND, 0, 9, true);
        b u2 = cVar4.u(iVar);
        f3625i = u2;
        c cVar5 = new c();
        cVar5.p();
        cVar5.a(u2);
        cVar5.h();
        cVar5.u(iVar);
        c cVar6 = new c();
        cVar6.p();
        cVar6.a(u2);
        cVar6.o();
        cVar6.h();
        cVar6.u(iVar);
        c cVar7 = new c();
        cVar7.p();
        cVar7.a(l2);
        cVar7.e('T');
        cVar7.a(u2);
        b l3 = cVar7.u(iVar).l(mVar);
        f3626j = l3;
        c cVar8 = new c();
        cVar8.p();
        cVar8.a(l3);
        cVar8.h();
        b l4 = cVar8.u(iVar).l(mVar);
        f3627k = l4;
        c cVar9 = new c();
        cVar9.a(l4);
        cVar9.o();
        cVar9.e('[');
        cVar9.q();
        cVar9.m();
        cVar9.e(']');
        cVar9.u(iVar).l(mVar);
        c cVar10 = new c();
        cVar10.a(l3);
        cVar10.o();
        cVar10.h();
        cVar10.o();
        cVar10.e('[');
        cVar10.q();
        cVar10.m();
        cVar10.e(']');
        cVar10.u(iVar).l(mVar);
        c cVar11 = new c();
        cVar11.p();
        cVar11.l(aVar, 4, 10, jVar);
        cVar11.e('-');
        cVar11.k(a.DAY_OF_YEAR, 3);
        cVar11.o();
        cVar11.h();
        cVar11.u(iVar).l(mVar);
        c cVar12 = new c();
        cVar12.p();
        cVar12.l(k.a.a.x.c.c, 4, 10, jVar);
        cVar12.f("-W");
        cVar12.k(k.a.a.x.c.b, 2);
        cVar12.e('-');
        a aVar7 = a.DAY_OF_WEEK;
        cVar12.k(aVar7, 1);
        cVar12.o();
        cVar12.h();
        cVar12.u(iVar).l(mVar);
        c cVar13 = new c();
        cVar13.p();
        cVar13.c();
        l = cVar13.u(iVar);
        c cVar14 = new c();
        cVar14.p();
        cVar14.k(aVar, 4);
        cVar14.k(aVar2, 2);
        cVar14.k(aVar3, 2);
        cVar14.o();
        cVar14.g("+HHMMss", "Z");
        cVar14.u(iVar).l(mVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        c cVar15 = new c();
        cVar15.p();
        cVar15.r();
        cVar15.o();
        cVar15.i(aVar7, hashMap);
        cVar15.f(", ");
        cVar15.n();
        cVar15.l(aVar3, 1, 2, j.NOT_NEGATIVE);
        cVar15.e(' ');
        cVar15.i(aVar2, hashMap2);
        cVar15.e(' ');
        cVar15.k(aVar, 4);
        cVar15.e(' ');
        cVar15.k(aVar4, 2);
        cVar15.e(':');
        cVar15.k(aVar5, 2);
        cVar15.o();
        cVar15.e(':');
        cVar15.k(aVar6, 2);
        cVar15.n();
        cVar15.e(' ');
        cVar15.g("+HHMM", "GMT");
        cVar15.u(i.SMART).l(mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c.f fVar, Locale locale, h hVar, i iVar, Set<i> set, h hVar2, q qVar) {
        d.i(fVar, "printerParser");
        this.a = fVar;
        d.i(locale, "locale");
        this.b = locale;
        d.i(hVar, "decimalStyle");
        this.c = hVar;
        d.i(iVar, "resolverStyle");
        this.f3628d = iVar;
        this.f3629e = set;
        this.f3630f = hVar2;
        this.f3631g = qVar;
    }

    private e a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        return new e("Text '" + str + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    private a i(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        d.b j2 = j(charSequence, parsePosition2);
        if (j2 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return j2.u();
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new e("Text '" + str + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new e("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    private d.b j(CharSequence charSequence, ParsePosition parsePosition) {
        k.a.a.w.d.i(charSequence, "text");
        k.a.a.w.d.i(parsePosition, "position");
        d dVar = new d(this);
        int c = this.a.c(dVar, charSequence, parsePosition.getIndex());
        if (c < 0) {
            parsePosition.setErrorIndex(~c);
            return null;
        }
        parsePosition.setIndex(c);
        return dVar.t();
    }

    public String b(e eVar) {
        StringBuilder sb = new StringBuilder(32);
        c(eVar, sb);
        return sb.toString();
    }

    public void c(e eVar, Appendable appendable) {
        k.a.a.w.d.i(eVar, "temporal");
        k.a.a.w.d.i(appendable, "appendable");
        try {
            f fVar = new f(eVar, this);
            if (appendable instanceof StringBuilder) {
                this.a.a(fVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.a.a(fVar, sb);
            appendable.append(sb);
        } catch (IOException e2) {
            throw new k.a.a.b(e2.getMessage(), e2);
        }
    }

    public h d() {
        return this.f3630f;
    }

    public h e() {
        return this.c;
    }

    public Locale f() {
        return this.b;
    }

    public q g() {
        return this.f3631g;
    }

    public <T> T h(CharSequence charSequence, k<T> kVar) {
        k.a.a.w.d.i(charSequence, "text");
        k.a.a.w.d.i(kVar, "type");
        try {
            a i2 = i(charSequence, null);
            i2.G(this.f3628d, this.f3629e);
            return (T) i2.w(kVar);
        } catch (e e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw a(charSequence, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.f k(boolean z) {
        return this.a.b(z);
    }

    public b l(h hVar) {
        return k.a.a.w.d.c(this.f3630f, hVar) ? this : new b(this.a, this.b, this.c, this.f3628d, this.f3629e, hVar, this.f3631g);
    }

    public b m(i iVar) {
        k.a.a.w.d.i(iVar, "resolverStyle");
        return k.a.a.w.d.c(this.f3628d, iVar) ? this : new b(this.a, this.b, this.c, iVar, this.f3629e, this.f3630f, this.f3631g);
    }

    public String toString() {
        String fVar = this.a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
