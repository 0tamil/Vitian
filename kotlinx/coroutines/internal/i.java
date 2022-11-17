package kotlinx.coroutines.internal;

import j.l;
import j.m;
import j.r;
import j.x.c.l;
import j.x.d.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.d0;
/* loaded from: classes.dex */
public final class i {
    private static final int a = d(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, l<Throwable, Throwable>> c = new WeakHashMap<>();

    /* loaded from: classes.dex */
    public static final class a extends j implements l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f3799e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f3799e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                l.a aVar = j.l.f3445e;
                newInstance = this.f3799e.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                l.a aVar2 = j.l.f3445e;
                obj = m.a(th2);
                j.l.a(obj);
            }
            if (newInstance != null) {
                obj = (Throwable) newInstance;
                j.l.a(obj);
                if (j.l.c(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j implements j.x.c.l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f3800e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f3800e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                l.a aVar = j.l.f3445e;
                newInstance = this.f3800e.newInstance(th);
            } catch (Throwable th2) {
                l.a aVar2 = j.l.f3445e;
                obj = m.a(th2);
                j.l.a(obj);
            }
            if (newInstance != null) {
                obj = (Throwable) newInstance;
                j.l.a(obj);
                if (j.l.c(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j implements j.x.c.l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f3801e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f3801e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            Object newInstance;
            try {
                l.a aVar = j.l.f3445e;
                newInstance = this.f3801e.newInstance(th.getMessage());
            } catch (Throwable th3) {
                l.a aVar2 = j.l.f3445e;
                Object a = m.a(th3);
                j.l.a(a);
                th2 = a;
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th);
                j.l.a(th4);
                th2 = th4;
                boolean c = j.l.c(th2);
                Object obj = th2;
                if (c) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j implements j.x.c.l<Throwable, Throwable> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Constructor f3802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f3802e = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            Object newInstance;
            try {
                l.a aVar = j.l.f3445e;
                newInstance = this.f3802e.newInstance(new Object[0]);
            } catch (Throwable th3) {
                l.a aVar2 = j.l.f3445e;
                Object a = m.a(th3);
                j.l.a(a);
                th2 = a;
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th);
                j.l.a(th4);
                th2 = th4;
                boolean c = j.l.c(th2);
                Object obj = th2;
                if (c) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int a;
            a = j.t.b.a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
            return a;
        }
    }

    /* loaded from: classes.dex */
    static final class f extends j implements j.x.c.l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f3803e = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class g extends j implements j.x.c.l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f3804e = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final j.x.c.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length == 1) {
            Class<?> cls = parameterTypes[0];
            if (j.x.d.i.a(cls, Throwable.class)) {
                return new b(constructor);
            }
            if (j.x.d.i.a(cls, String.class)) {
                return new c(constructor);
            }
            return null;
        } else if (length == 2 && j.x.d.i.a(parameterTypes[0], String.class) && j.x.d.i.a(parameterTypes[1], Throwable.class)) {
            return new a(constructor);
        } else {
            return null;
        }
    }

    private static final int b(Class<?> cls, int i2) {
        do {
            int i3 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    static /* synthetic */ int c(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return b(cls, i2);
    }

    private static final int d(Class<?> cls, int i2) {
        Object obj;
        j.x.a.b(cls);
        try {
            l.a aVar = j.l.f3445e;
            obj = Integer.valueOf(c(cls, 0, 1, null));
            j.l.a(obj);
        } catch (Throwable th) {
            l.a aVar2 = j.l.f3445e;
            obj = m.a(th);
            j.l.a(obj);
        }
        obj = Integer.valueOf(i2);
        if (j.l.c(obj)) {
        }
        return ((Number) obj).intValue();
    }

    /* JADX WARN: Finally extract failed */
    public static final <E extends Throwable> E e(E e2) {
        Object obj;
        List k2;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        Object obj2 = null;
        if (e2 instanceof d0) {
            try {
                l.a aVar = j.l.f3445e;
                obj = ((d0) e2).a();
                j.l.a(obj);
            } catch (Throwable th) {
                l.a aVar2 = j.l.f3445e;
                obj = m.a(th);
                j.l.a(obj);
            }
            if (!j.l.c(obj)) {
                obj2 = obj;
            }
            return (E) obj2;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            j.x.c.l<Throwable, Throwable> lVar = c.get(e2.getClass());
            readLock2.unlock();
            if (lVar != null) {
                return (E) lVar.invoke(e2);
            }
            int i2 = 0;
            if (a != d(e2.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c.put(e2.getClass(), f.f3803e);
                    r rVar = r.a;
                    return null;
                } finally {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                k2 = j.s.e.k(e2.getClass().getConstructors(), new e());
                Iterator it = k2.iterator();
                j.x.c.l<Throwable, Throwable> lVar2 = null;
                while (it.hasNext() && (lVar2 = a((Constructor) it.next())) == null) {
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = b;
                readLock = reentrantReadWriteLock2.readLock();
                readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    c.put(e2.getClass(), lVar2 == null ? g.f3804e : lVar2);
                    r rVar2 = r.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    if (lVar2 == null) {
                        return null;
                    }
                    return (E) lVar2.invoke(e2);
                } finally {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
        } catch (Throwable th2) {
            readLock2.unlock();
            throw th2;
        }
    }
}
