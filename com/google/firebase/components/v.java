package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class v extends w {

    /* renamed from: e  reason: collision with root package name */
    private final List<n<?>> f1369e;

    public v(List<n<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f1369e = list;
    }
}
