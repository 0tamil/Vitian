package com.google.firebase.p;

import com.google.auto.value.AutoValue;
import java.util.List;
@AutoValue
/* loaded from: classes.dex */
public abstract class m {
    public static m a(String str, List<String> list) {
        return new f(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
