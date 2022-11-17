package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.c0;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends c0 {
    private final c0.a a;
    private final c0.c b;
    private final c0.b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.c = bVar;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0
    public c0.a a() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0
    public c0.b c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.c0
    public c0.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a.equals(c0Var.a()) && this.b.equals(c0Var.d()) && this.c.equals(c0Var.c());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
