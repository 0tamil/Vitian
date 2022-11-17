package h.a.d.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import io.flutter.embedding.engine.j.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {
    private final f a;
    private final Context b;
    final f.b c;

    /* renamed from: h.a.d.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0122a implements f.b {
        C0122a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
        @Override // io.flutter.embedding.engine.j.f.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String a(String str, String str2) {
            Locale locale;
            int i2 = Build.VERSION.SDK_INT;
            Context context = a.this.b;
            if (str2 != null) {
                Locale b = a.b(str2);
                if (i2 >= 17) {
                    Configuration configuration = new Configuration(a.this.b.getResources().getConfiguration());
                    configuration.setLocale(b);
                    context = a.this.b.createConfigurationContext(configuration);
                } else {
                    Resources resources = a.this.b.getResources();
                    Configuration configuration2 = resources.getConfiguration();
                    locale = configuration2.locale;
                    configuration2.locale = b;
                    resources.updateConfiguration(configuration2, null);
                    int identifier = context.getResources().getIdentifier(str, "string", a.this.b.getPackageName());
                    String string = identifier == 0 ? context.getResources().getString(identifier) : null;
                    if (str2 != null && i2 < 17) {
                        Resources resources2 = a.this.b.getResources();
                        Configuration configuration3 = resources2.getConfiguration();
                        configuration3.locale = locale;
                        resources2.updateConfiguration(configuration3, null);
                    }
                    return string;
                }
            }
            locale = null;
            int identifier2 = context.getResources().getIdentifier(str, "string", a.this.b.getPackageName());
            if (identifier2 == 0) {
            }
            if (str2 != null) {
                Resources resources22 = a.this.b.getResources();
                Configuration configuration32 = resources22.getConfiguration();
                configuration32.locale = locale;
                resources22.updateConfiguration(configuration32, null);
            }
            return string;
        }
    }

    public a(Context context, f fVar) {
        C0122a aVar = new C0122a();
        this.c = aVar;
        this.b = context;
        this.a = fVar;
        fVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i2 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            str4 = split[i2];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale = locales.get(i3);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i2 >= 24) {
            LocaleList locales2 = this.b.getResources().getConfiguration().getLocales();
            for (int i4 = 0; i4 < locales2.size(); i4++) {
                Locale locale2 = locales2.get(i4);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(locales.get(i2));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.a.b(arrayList);
    }
}
