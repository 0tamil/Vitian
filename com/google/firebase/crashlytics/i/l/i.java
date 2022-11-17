package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
/* loaded from: classes.dex */
final class i extends a0.e.a.b {
    private final String a;

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a.b
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a.b) {
            return this.a.equals(((a0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}
