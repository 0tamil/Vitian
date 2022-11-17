package com.google.firebase.crashlytics.i.n;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements FilenameFilter {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith("event");
        return startsWith;
    }
}
