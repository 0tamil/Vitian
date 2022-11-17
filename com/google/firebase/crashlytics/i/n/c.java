package com.google.firebase.crashlytics.i.n;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int v;
        v = e.v((File) obj, (File) obj2);
        return v;
    }
}
