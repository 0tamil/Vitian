package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public class w implements a.d {
    public static final w b = c().a();
    private final String a;

    /* loaded from: classes.dex */
    public static class a {
        private String a;

        /* synthetic */ a(b0 b0Var) {
        }

        public w a() {
            return new w(this.a, null);
        }
    }

    /* synthetic */ w(String str, c0 c0Var) {
        this.a = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return o.a(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return o.b(this.a);
    }
}
