package androidx.activity.result.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: androidx.activity.result.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0007a<T> {
        @SuppressLint({"UnknownNullness"})
        private final T a;

        public C0007a(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i2);

    public C0007a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i2, Intent intent);
}
