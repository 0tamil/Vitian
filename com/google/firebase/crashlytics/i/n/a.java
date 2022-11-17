package com.google.firebase.crashlytics.i.n;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
        return compareTo;
    }
}
