package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.c0;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z extends c0.c {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.b = str2;
        this.c = z;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.c
    public boolean b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.c
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        return this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b();
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
