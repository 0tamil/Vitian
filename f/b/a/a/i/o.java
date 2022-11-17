package f.b.a.a.i;

import com.google.auto.value.AutoValue;
import f.b.a.a.b;
import f.b.a.a.c;
import f.b.a.a.e;
import f.b.a.a.i.d;
/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes.dex */
public abstract class o {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new d.b();
    }

    public abstract b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract c<?> c();

    public byte[] d() {
        return e().a(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
