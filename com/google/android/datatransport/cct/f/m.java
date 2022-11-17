package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.g;
import com.google.auto.value.AutoValue;
import java.util.List;
@AutoValue
/* loaded from: classes.dex */
public abstract class m {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract m a();

        public abstract a b(k kVar);

        public abstract a c(List<l> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(p pVar);

        public abstract a g(long j2);

        public abstract a h(long j2);

        public a i(int i2) {
            d(Integer.valueOf(i2));
            return this;
        }

        public a j(String str) {
            e(str);
            return this;
        }
    }

    public static a a() {
        return new g.b();
    }

    public abstract k b();

    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}
