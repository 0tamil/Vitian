package e.d.l;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
final class h implements g {
    private final LocaleList a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // e.d.l.g
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((g) obj).a());
    }

    @Override // e.d.l.g
    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
