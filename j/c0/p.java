package j.c0;

import j.x.d.i;
import j.z.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p extends o {
    public static final String b0(String str, int i2) {
        int c;
        i.d(str, "<this>");
        if (i2 >= 0) {
            c = f.c(i2, str.length());
            String substring = str.substring(c);
            i.c(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
