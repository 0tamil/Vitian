package f.b.b.a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class n {
    private static final CopyOnWriteArrayList<m> a = new CopyOnWriteArrayList<>();

    public static m a(String str) {
        Iterator<m> it = a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
