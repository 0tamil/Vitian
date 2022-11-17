package com.google.firebase.crashlytics.i.j;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(".ae");
        return startsWith;
    }
}
