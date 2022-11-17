package com.google.firebase.crashlytics.i.n;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean p;
        p = e.p(file, str);
        return p;
    }
}
