package com.google.firebase.crashlytics.i.o;

import com.google.firebase.crashlytics.i.l.a0;
import f.b.a.a.e;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // f.b.a.a.e
    public final Object a(Object obj) {
        byte[] bytes;
        bytes = c.b.E((a0) obj).getBytes(Charset.forName("UTF-8"));
        return bytes;
    }
}
