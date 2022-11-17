package j.v.d;

import j.x.d.i;
/* loaded from: classes.dex */
public class a extends j.v.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j.v.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0142a {
        public static final Integer a;

        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() > 0) {
                        num2 = num;
                    }
                }
                a = num2;
            }
            num = null;
            if (num != null) {
            }
            a = num2;
        }
    }

    private final boolean c(int i2) {
        Integer num = C0142a.a;
        return num == null || num.intValue() >= i2;
    }

    @Override // j.v.a
    public void a(Throwable th, Throwable th2) {
        i.d(th, "cause");
        i.d(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
