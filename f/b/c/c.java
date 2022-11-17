package f.b.c;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class c extends Enum<c> implements f.b.c.d {

    /* renamed from: e  reason: collision with root package name */
    public static final c f2676e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f2677f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f2678g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f2679h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f2680i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f2681j;

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ c[] f2682k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    final class a extends c {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // f.b.c.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f2676e = aVar;
        c bVar = new c("UPPER_CAMEL_CASE", 1) { // from class: f.b.c.c.b
            @Override // f.b.c.d
            public String a(Field field) {
                return c.d(field.getName());
            }
        };
        f2677f = bVar;
        c cVar = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: f.b.c.c.c
            @Override // f.b.c.d
            public String a(Field field) {
                return c.d(c.c(field.getName(), " "));
            }
        };
        f2678g = cVar;
        c dVar = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: f.b.c.c.d
            @Override // f.b.c.d
            public String a(Field field) {
                return c.c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f2679h = dVar;
        c eVar = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: f.b.c.c.e
            @Override // f.b.c.d
            public String a(Field field) {
                return c.c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f2680i = eVar;
        c fVar = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: f.b.c.c.f
            @Override // f.b.c.d
            public String a(Field field) {
                return c.c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f2681j = fVar;
        f2682k = new c[]{aVar, bVar, cVar, dVar, eVar, fVar};
    }

    private c(String str, int i2) {
    }

    /* synthetic */ c(String str, int i2, a aVar) {
        this(str, i2);
    }

    static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String d(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2682k.clone();
    }
}
