package j.y;

import j.x.d.i;
import java.util.Random;
/* loaded from: classes.dex */
public final class b extends j.y.a {

    /* renamed from: g  reason: collision with root package name */
    private final a f3482g = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // j.y.a
    public Random c() {
        Random random = this.f3482g.get();
        i.c(random, "implStorage.get()");
        return random;
    }
}
