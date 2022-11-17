package k.a.a.x;

import k.a.a.d;
/* loaded from: classes.dex */
public enum b implements l {
    NANOS("Nanos", d.g(1)),
    MICROS("Micros", d.g(1000)),
    MILLIS("Millis", d.g(1000000)),
    SECONDS("Seconds", d.h(1)),
    MINUTES("Minutes", d.h(60)),
    HOURS("Hours", d.h(3600)),
    HALF_DAYS("HalfDays", d.h(43200)),
    DAYS("Days", d.h(86400)),
    WEEKS("Weeks", d.h(604800)),
    MONTHS("Months", d.h(2629746)),
    YEARS("Years", d.h(31556952)),
    DECADES("Decades", d.h(315569520)),
    CENTURIES("Centuries", d.h(3155695200L)),
    MILLENNIA("Millennia", d.h(31556952000L)),
    ERAS("Eras", d.h(31556952000000000L)),
    FOREVER("Forever", d.j(Long.MAX_VALUE, 999999999));
    

    /* renamed from: e  reason: collision with root package name */
    private final String f3720e;

    b(String str, d dVar) {
        this.f3720e = str;
    }

    @Override // k.a.a.x.l
    public boolean a() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // k.a.a.x.l
    public <R extends d> R c(R r, long j2) {
        return (R) r.r(j2, this);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3720e;
    }
}
