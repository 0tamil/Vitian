package com.google.firebase.s;

import java.util.Objects;
/* loaded from: classes.dex */
final class c extends g {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    @Override // com.google.firebase.s.g
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.s.g
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.b()) && this.b.equals(gVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
