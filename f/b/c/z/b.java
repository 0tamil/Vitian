package f.b.c.z;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
/* loaded from: classes.dex */
public final class b {
    static final Type[] a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Type f2708e;

        public a(Type type) {
            this.f2708e = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f2708e;
        }

        public int hashCode() {
            return this.f2708e.hashCode();
        }

        public String toString() {
            return b.u(this.f2708e) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.b.c.z.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0106b implements ParameterizedType, Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Type f2709e;

        /* renamed from: f  reason: collision with root package name */
        private final Type f2710f;

        /* renamed from: g  reason: collision with root package name */
        private final Type[] f2711g;

        public C0106b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                f.b.c.z.a.a(z);
            }
            this.f2709e = type == null ? null : b.b(type);
            this.f2710f = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f2711g = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                f.b.c.z.a.b(this.f2711g[i2]);
                b.c(this.f2711g[i2]);
                Type[] typeArr3 = this.f2711g;
                typeArr3[i2] = b.b(typeArr3[i2]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f2711g.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f2709e;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f2710f;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f2711g) ^ this.f2710f.hashCode()) ^ b.m(this.f2709e);
        }

        public String toString() {
            int length = this.f2711g.length;
            if (length == 0) {
                return b.u(this.f2710f);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.u(this.f2710f));
            sb.append("<");
            sb.append(b.u(this.f2711g[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(b.u(this.f2711g[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Type f2712e;

        /* renamed from: f  reason: collision with root package name */
        private final Type f2713f;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            f.b.c.z.a.a(typeArr2.length <= 1);
            f.b.c.z.a.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                f.b.c.z.a.b(typeArr2[0]);
                b.c(typeArr2[0]);
                f.b.c.z.a.a(typeArr[0] != Object.class ? false : z);
                this.f2713f = b.b(typeArr2[0]);
                this.f2712e = Object.class;
                return;
            }
            f.b.c.z.a.b(typeArr[0]);
            b.c(typeArr[0]);
            this.f2713f = null;
            this.f2712e = b.b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f2713f;
            return type != null ? new Type[]{type} : b.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f2712e};
        }

        public int hashCode() {
            Type type = this.f2713f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2712e.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f2713f != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f2713f;
            } else if (this.f2712e == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f2712e;
            }
            sb.append(b.u(type));
            return sb.toString();
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0106b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void c(Type type) {
        f.b.c.z.a.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l = l(type, cls, Collection.class);
        if (l instanceof WildcardType) {
            l = ((WildcardType) l).getUpperBounds()[0];
        }
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments()[0] : Object.class;
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return i(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type l = l(type, cls, Map.class);
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            f.b.c.z.a.a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        f.b.c.z.a.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    static int m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType o(Type type, Type type2, Type... typeArr) {
        return new C0106b(type, type2, typeArr);
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (e(r1, r9) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type q(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type o;
        Type q;
        TypeVariable typeVariable = null;
        ?? r11 = type2;
        while (true) {
            if (r11 instanceof TypeVariable) {
                TypeVariable typeVariable2 = r11;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 == null) {
                    map.put(typeVariable2, Void.TYPE);
                    if (typeVariable == null) {
                        typeVariable = typeVariable2;
                    }
                    r11 = r(type, cls, typeVariable2);
                    r11 = r11;
                    if (r11 == typeVariable2) {
                        break;
                    }
                } else {
                    return type3 == Void.TYPE ? r11 : type3;
                }
            } else {
                if (r11 instanceof Class) {
                    Class cls2 = r11;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        q = q(type, cls, componentType, map);
                        if (e(componentType, q)) {
                            r11 = cls2;
                        }
                        o = a(q);
                        r11 = o;
                    }
                }
                if (r11 instanceof GenericArrayType) {
                    r11 = (GenericArrayType) r11;
                    Type genericComponentType = r11.getGenericComponentType();
                    q = q(type, cls, genericComponentType, map);
                } else {
                    if (r11 instanceof ParameterizedType) {
                        r11 = (ParameterizedType) r11;
                        Type ownerType = r11.getOwnerType();
                        Type q2 = q(type, cls, ownerType, map);
                        boolean z = !e(q2, ownerType);
                        Type[] actualTypeArguments = r11.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            Type q3 = q(type, cls, actualTypeArguments[i2], map);
                            if (!e(q3, actualTypeArguments[i2])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i2] = q3;
                            }
                        }
                        if (z) {
                            o = o(q2, r11.getRawType(), actualTypeArguments);
                            r11 = o;
                        }
                    } else if (r11 instanceof WildcardType) {
                        r11 = (WildcardType) r11;
                        Type[] lowerBounds = r11.getLowerBounds();
                        Type[] upperBounds = r11.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type q4 = q(type, cls, lowerBounds[0], map);
                            if (q4 != lowerBounds[0]) {
                                r11 = t(q4);
                            }
                        } else if (upperBounds.length == 1) {
                            Type q5 = q(type, cls, upperBounds[0], map);
                            if (q5 != upperBounds[0]) {
                                r11 = s(q5);
                            }
                        }
                    }
                }
            }
        }
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d2 = d(typeVariable);
        if (d2 == null) {
            return typeVariable;
        }
        Type i2 = i(type, cls, d2);
        if (!(i2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i2).getActualTypeArguments()[n(d2.getTypeParameters(), typeVariable)];
    }

    public static WildcardType s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, a);
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
