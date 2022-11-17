package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((a0.c) obj).b().compareTo(((a0.c) obj2).b());
        return compareTo;
    }
}
