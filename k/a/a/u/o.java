package k.a.a.u;

import e.a.j;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import k.a.a.f;
import k.a.a.q;
import k.a.a.x.e;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class o extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    static final Locale f3586g = new Locale("ja", "JP", "JP");

    /* renamed from: h  reason: collision with root package name */
    public static final o f3587h = new o();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<String, String[]> f3588i;

    /* renamed from: j  reason: collision with root package name */
    private static final Map<String, String[]> f3589j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<String, String[]> f3590k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.a.MICRO_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.a.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.a.HOUR_OF_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.a.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.a.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[k.a.a.x.a.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[k.a.a.x.a.SECOND_OF_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.MILLI_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.a.a.x.a.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[k.a.a.x.a.NANO_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[k.a.a.x.a.NANO_OF_SECOND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[k.a.a.x.a.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[k.a.a.x.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[k.a.a.x.a.EPOCH_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[k.a.a.x.a.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[k.a.a.x.a.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_YEAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f3588i = hashMap;
        HashMap hashMap2 = new HashMap();
        f3589j = hashMap2;
        HashMap hashMap3 = new HashMap();
        f3590k = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private o() {
    }

    private Object readResolve() {
        return f3587h;
    }

    public int A(i iVar, int i2) {
        q qVar;
        if (iVar instanceof q) {
            int R = (((q) iVar).y().R() + i2) - 1;
            n.i(1L, (qVar.t().R() - qVar.y().R()) + 1).b(i2, k.a.a.x.a.YEAR_OF_ERA);
            return R;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public n B(k.a.a.x.a aVar) {
        int[] iArr = a.a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.h();
            default:
                Calendar calendar = Calendar.getInstance(f3586g);
                int i2 = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        q[] z = q.z();
                        return n.i(z[0].getValue(), z[z.length - 1].getValue());
                    case 20:
                        q[] z2 = q.z();
                        return n.i(p.f3591h.R(), z2[z2.length - 1].t().R());
                    case 21:
                        q[] z3 = q.z();
                        int R = (z3[z3.length - 1].t().R() - z3[z3.length - 1].y().R()) + 1;
                        int i3 = Integer.MAX_VALUE;
                        while (i2 < z3.length) {
                            i3 = Math.min(i3, (z3[i2].t().R() - z3[i2].y().R()) + 1);
                            i2++;
                        }
                        return n.k(1L, 6L, i3, R);
                    case 22:
                        return n.k(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case j.b3 /* 23 */:
                        q[] z4 = q.z();
                        int i4 = 366;
                        while (i2 < z4.length) {
                            i4 = Math.min(i4, (z4[i2].y().U() - z4[i2].y().N()) + 1);
                            i2++;
                        }
                        return n.j(1L, i4, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }

    @Override // k.a.a.u.h
    public String k() {
        return "japanese";
    }

    @Override // k.a.a.u.h
    public String l() {
        return "Japanese";
    }

    @Override // k.a.a.u.h
    public c<p> q(e eVar) {
        return super.q(eVar);
    }

    @Override // k.a.a.u.h
    public f<p> w(k.a.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public p x(int i2, int i3, int i4) {
        return new p(f.Y(i2, i3, i4));
    }

    /* renamed from: y */
    public p c(e eVar) {
        return eVar instanceof p ? (p) eVar : new p(f.I(eVar));
    }

    /* renamed from: z */
    public q h(int i2) {
        return q.v(i2);
    }
}
