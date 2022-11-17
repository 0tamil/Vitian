package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.l.a0;
import java.io.File;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends t {
    private final a0 a;
    private final String b;
    private final File c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.c = file;
    }

    @Override // com.google.firebase.crashlytics.i.j.t
    public a0 b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.j.t
    public File c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.j.t
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.b()) && this.b.equals(tVar.d()) && this.c.equals(tVar.c());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
