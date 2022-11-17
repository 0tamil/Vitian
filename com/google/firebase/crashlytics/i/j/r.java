package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.n.f;
import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r {
    private final String a;
    private final f b;

    public r(String str, f fVar) {
        this.a = str;
        this.b = fVar;
    }

    private File b() {
        return this.b.d(this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
            f2.e("Error creating marker: " + this.a, e2);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
