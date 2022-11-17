package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
/* loaded from: classes.dex */
public final class o {
    static RemoteInput a(o oVar) {
        Set<String> d2;
        int i2 = Build.VERSION.SDK_INT;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(oVar.i()).setLabel(oVar.h()).setChoices(oVar.e()).setAllowFreeFormInput(oVar.c()).addExtras(oVar.g());
        if (i2 >= 26 && (d2 = oVar.d()) != null) {
            for (String str : d2) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (i2 >= 29) {
            addExtras.setEditChoicesBeforeSending(oVar.f());
        }
        return addExtras.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oVarArr.length];
        for (int i2 = 0; i2 < oVarArr.length; i2++) {
            remoteInputArr[i2] = a(oVarArr[i2]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        throw null;
    }

    public Set<String> d() {
        throw null;
    }

    public CharSequence[] e() {
        throw null;
    }

    public int f() {
        throw null;
    }

    public Bundle g() {
        throw null;
    }

    public CharSequence h() {
        throw null;
    }

    public String i() {
        throw null;
    }
}
