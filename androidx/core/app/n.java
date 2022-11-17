package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class n {
    CharSequence a;
    IconCompat b;
    String c;

    /* renamed from: d  reason: collision with root package name */
    String f608d;

    /* renamed from: e  reason: collision with root package name */
    boolean f609e;

    /* renamed from: f  reason: collision with root package name */
    boolean f610f;

    /* loaded from: classes.dex */
    public static class a {
        CharSequence a;
        IconCompat b;
        String c;

        /* renamed from: d  reason: collision with root package name */
        String f611d;

        /* renamed from: e  reason: collision with root package name */
        boolean f612e;

        /* renamed from: f  reason: collision with root package name */
        boolean f613f;

        public n a() {
            return new n(this);
        }

        public a b(boolean z) {
            this.f612e = z;
            return this;
        }

        public a c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public a d(boolean z) {
            this.f613f = z;
            return this;
        }

        public a e(String str) {
            this.f611d = str;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public a g(String str) {
            this.c = str;
            return this;
        }
    }

    n(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.f608d = aVar.f611d;
        this.f609e = aVar.f612e;
        this.f610f = aVar.f613f;
    }

    public static n a(Person person) {
        a aVar = new a();
        aVar.f(person.getName());
        aVar.c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null);
        aVar.g(person.getUri());
        aVar.e(person.getKey());
        aVar.b(person.isBot());
        aVar.d(person.isImportant());
        return aVar.a();
    }

    public static n b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        a aVar = new a();
        aVar.f(bundle.getCharSequence("name"));
        aVar.c(bundle2 != null ? IconCompat.b(bundle2) : null);
        aVar.g(bundle.getString("uri"));
        aVar.e(bundle.getString("key"));
        aVar.b(bundle.getBoolean("isBot"));
        aVar.d(bundle.getBoolean("isImportant"));
        return aVar.a();
    }

    public IconCompat c() {
        return this.b;
    }

    public String d() {
        return this.f608d;
    }

    public CharSequence e() {
        return this.a;
    }

    public String f() {
        return this.c;
    }

    public boolean g() {
        return this.f609e;
    }

    public boolean h() {
        return this.f610f;
    }

    public String i() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a == null) {
            return "";
        }
        return "name:" + ((Object) this.a);
    }

    public Person j() {
        return new Person.Builder().setName(e()).setIcon(c() != null ? c().C() : null).setUri(f()).setKey(d()).setBot(g()).setImportant(h()).build();
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.B() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.f608d);
        bundle.putBoolean("isBot", this.f609e);
        bundle.putBoolean("isImportant", this.f610f);
        return bundle;
    }
}
