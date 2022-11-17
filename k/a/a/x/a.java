package k.a.a.x;

import java.util.Map;
import k.a.a.v.i;
/* JADX WARN: Init of enum A can be incorrect */
/* JADX WARN: Init of enum B can be incorrect */
/* JADX WARN: Init of enum C can be incorrect */
/* JADX WARN: Init of enum D can be incorrect */
/* JADX WARN: Init of enum E can be incorrect */
/* JADX WARN: Init of enum F can be incorrect */
/* JADX WARN: Init of enum G can be incorrect */
/* JADX WARN: Init of enum H can be incorrect */
/* JADX WARN: Init of enum I can be incorrect */
/* JADX WARN: Init of enum J can be incorrect */
/* JADX WARN: Init of enum K can be incorrect */
/* JADX WARN: Init of enum L can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* JADX WARN: Init of enum j can be incorrect */
/* JADX WARN: Init of enum k can be incorrect */
/* JADX WARN: Init of enum l can be incorrect */
/* JADX WARN: Init of enum m can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* loaded from: classes.dex */
public enum a implements i {
    NANO_OF_SECOND("NanoOfSecond", r8, r9, n.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r8, r15, n.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r16, r9, n.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r16, r15, n.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r18, r9, n.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r18, r15, n.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r9, r20, n.i(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r9, r15, n.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r20, r25, n.i(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", r20, r15, n.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r25, r20, n.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r25, r20, n.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r25, r15, n.i(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r25, r15, n.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r20, r15, n.i(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r15, r31, n.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r15, r31, n.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r15, r31, n.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r15, r11, n.j(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", r15, r36, n.j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r15, r38, n.i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r31, r11, n.j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r31, r36, n.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r11, r36, n.i(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r11, r38, n.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r36, r38, n.j(1, 999999999, 1000000000)),
    YEAR("Year", r36, r38, n.i(-999999999, 999999999)),
    ERA("Era", b.ERAS, r38, n.i(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r9, r38, n.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r9, r38, n.i(-64800, 64800));
    

    /* renamed from: e  reason: collision with root package name */
    private final String f3710e;

    /* renamed from: f  reason: collision with root package name */
    private final l f3711f;

    /* renamed from: g  reason: collision with root package name */
    private final l f3712g;

    /* renamed from: h  reason: collision with root package name */
    private final n f3713h;

    static {
        b bVar = b.NANOS;
        b bVar2 = b.SECONDS;
        b bVar3 = b.DAYS;
        b bVar4 = b.MICROS;
        b bVar5 = b.MILLIS;
        b bVar6 = b.MINUTES;
        b bVar7 = b.HOURS;
        b bVar8 = b.HALF_DAYS;
        b bVar9 = b.WEEKS;
        b bVar10 = b.MONTHS;
        b bVar11 = b.YEARS;
        b bVar12 = b.FOREVER;
    }

    a(String str, l lVar, l lVar2, n nVar) {
        this.f3710e = str;
        this.f3711f = lVar;
        this.f3712g = lVar2;
        this.f3713h = nVar;
    }

    @Override // k.a.a.x.i
    public boolean a() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // k.a.a.x.i
    public boolean c(e eVar) {
        return eVar.j(this);
    }

    @Override // k.a.a.x.i
    public <R extends d> R d(R r, long j2) {
        return (R) r.q(this, j2);
    }

    @Override // k.a.a.x.i
    public e e(Map<i, Long> map, e eVar, i iVar) {
        return null;
    }

    @Override // k.a.a.x.i
    public long g(e eVar) {
        return eVar.l(this);
    }

    @Override // k.a.a.x.i
    public n h() {
        return this.f3713h;
    }

    @Override // k.a.a.x.i
    public boolean j() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // k.a.a.x.i
    public n k(e eVar) {
        return eVar.c(this);
    }

    public int l(long j2) {
        return h().a(j2, this);
    }

    public long p(long j2) {
        h().b(j2, this);
        return j2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3710e;
    }
}
