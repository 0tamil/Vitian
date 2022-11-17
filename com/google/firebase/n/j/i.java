package com.google.firebase.n.j;

import com.google.firebase.n.b;
import com.google.firebase.n.c;
import com.google.firebase.n.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements g {
    private boolean a = false;
    private boolean b = false;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private final g f1868d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar) {
        this.f1868d = gVar;
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.n.g
    public g a(String str) {
        c();
        this.f1868d.g(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.n.g
    public g b(boolean z) {
        c();
        this.f1868d.m(this.c, z, this.b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(c cVar, boolean z) {
        this.a = false;
        this.c = cVar;
        this.b = z;
    }
}
