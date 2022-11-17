package f.b.a.b.c;

import android.os.IBinder;
import com.google.android.gms.common.internal.p;
import f.b.a.b.c.a;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0089a {
    private final T a;

    private b(T t) {
        this.a = t;
    }

    public static <T> T b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 == 1) {
            p.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                } catch (NullPointerException e3) {
                    throw new IllegalArgumentException("Binder object is null.", e3);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <T> a d(T t) {
        return new b(t);
    }
}
