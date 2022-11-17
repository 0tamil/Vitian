package com.google.firebase.crashlytics.i;

import android.content.Context;
import com.google.firebase.crashlytics.i.j.n;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class e {
    private final Context a;
    private b b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        private final String a;
        private final String b;

        private b(e eVar) {
            int q = n.q(eVar.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q != 0) {
                this.a = "Unity";
                String string = eVar.a.getResources().getString(q);
                this.b = string;
                f f2 = f.f();
                f2.i("Unity Editor version is: " + string);
            } else if (eVar.c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                f.f().i("Development platform is: Flutter");
            } else {
                this.a = null;
                this.b = null;
            }
        }
    }

    public e(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }
}
