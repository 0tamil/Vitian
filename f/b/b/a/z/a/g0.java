package f.b.b.a.z.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    private static final g0 f2524g;

    /* renamed from: f  reason: collision with root package name */
    private final List<Object> f2525f;

    static {
        g0 g0Var = new g0();
        f2524g = g0Var;
        g0Var.b();
    }

    public g0() {
        this(10);
    }

    public g0(int i2) {
        this(new ArrayList(i2));
    }

    private g0(ArrayList<Object> arrayList) {
        this.f2525f = arrayList;
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).z() : b0.j((byte[]) obj);
    }

    @Override // f.b.b.a.z.a.h0
    public h0 a() {
        return f() ? new r1(this) : this;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        h();
        if (collection instanceof h0) {
            collection = ((h0) collection).e();
        }
        boolean addAll = this.f2525f.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // f.b.b.a.z.a.h0
    public Object c(int i2) {
        return this.f2525f.get(i2);
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        h();
        this.f2525f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // f.b.b.a.z.a.h0
    public List<?> e() {
        return Collections.unmodifiableList(this.f2525f);
    }

    @Override // f.b.b.a.z.a.h0
    public void g(i iVar) {
        h();
        this.f2525f.add(iVar);
        ((AbstractList) this).modCount++;
    }

    /* renamed from: i */
    public void add(int i2, String str) {
        h();
        this.f2525f.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    /* renamed from: k */
    public String get(int i2) {
        Object obj = this.f2525f.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String z = iVar.z();
            if (iVar.p()) {
                this.f2525f.set(i2, z);
            }
            return z;
        }
        byte[] bArr = (byte[]) obj;
        String j2 = b0.j(bArr);
        if (b0.g(bArr)) {
            this.f2525f.set(i2, j2);
        }
        return j2;
    }

    /* renamed from: l */
    public g0 d(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f2525f);
            return new g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public String remove(int i2) {
        h();
        Object remove = this.f2525f.remove(i2);
        ((AbstractList) this).modCount++;
        return j(remove);
    }

    /* renamed from: n */
    public String set(int i2, String str) {
        h();
        return j(this.f2525f.set(i2, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2525f.size();
    }
}
