package j.x.d;

import j.a0.b;
import j.a0.d;
import j.a0.f;
import j.a0.g;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class a implements b, Serializable {
    public static final Object NO_RECEIVER = C0143a.f3473e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    /* renamed from: j.x.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0143a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private static final C0143a f3473e = new C0143a();

        private C0143a() {
        }
    }

    public a() {
        this(NO_RECEIVER);
    }

    protected a(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // j.a0.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // j.a0.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract b computeReflected();

    @Override // j.a0.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? l.c(cls) : l.b(cls);
    }

    @Override // j.a0.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new j.x.b();
    }

    @Override // j.a0.b
    public f getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // j.a0.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // j.a0.b
    public g getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // j.a0.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // j.a0.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // j.a0.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public abstract boolean isSuspend();
}
