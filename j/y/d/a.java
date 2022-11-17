package j.y.d;

import j.x.d.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class a extends j.y.a {
    @Override // j.y.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.c(current, "ThreadLocalRandom.current()");
        return current;
    }
}
