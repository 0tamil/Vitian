package j.x;

import j.a0.c;
import j.x.d.b;
import j.x.d.i;
import j.x.d.l;
/* loaded from: classes.dex */
public final class a {
    public static final <T> Class<T> a(c<T> cVar) {
        String name;
        i.d(cVar, "<this>");
        Class<T> cls = (Class<T>) ((b) cVar).b();
        if (!cls.isPrimitive() || (name = cls.getName()) == null) {
            return cls;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }

    public static final <T> c<T> b(Class<T> cls) {
        i.d(cls, "<this>");
        return l.b(cls);
    }
}
