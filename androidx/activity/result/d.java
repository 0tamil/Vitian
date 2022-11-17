package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class d {
    private Random a = new Random();
    private final Map<Integer, String> b = new HashMap();
    private final Map<String, Integer> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, c> f71d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f72e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, b<?>> f73f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f74g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f75h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c<I> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ androidx.activity.result.g.a c;

        a(String str, int i2, androidx.activity.result.g.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i2, androidx.core.app.b bVar) {
            d.this.f72e.add(this.a);
            d.this.f(this.b, this.c, i2, bVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            d.this.k(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<O> {
        final androidx.activity.result.b<O> a;
        final androidx.activity.result.g.a<?, O> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(androidx.activity.result.b<O> bVar, androidx.activity.result.g.a<?, O> aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        final androidx.lifecycle.d a;
        private final ArrayList<e> b;

        void a() {
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    private void a(int i2, String str) {
        this.b.put(Integer.valueOf(i2), str);
        this.c.put(str, Integer.valueOf(i2));
    }

    private <O> void d(String str, int i2, Intent intent, b<O> bVar) {
        androidx.activity.result.b<O> bVar2;
        if (bVar == null || (bVar2 = bVar.a) == null) {
            this.f74g.remove(str);
            this.f75h.putParcelable(str, new androidx.activity.result.a(i2, intent));
            return;
        }
        bVar2.a(bVar.b.c(i2, intent));
    }

    private int e() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + 65536;
            if (!this.b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    private int j(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e2 = e();
        a(e2, str);
        return e2;
    }

    public final boolean b(int i2, int i3, Intent intent) {
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f72e.remove(str);
        d(str, i3, intent, this.f73f.get(str));
        return true;
    }

    public final <O> boolean c(int i2, @SuppressLint({"UnknownNullness"}) O o) {
        androidx.activity.result.b<?> bVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f72e.remove(str);
        b<?> bVar2 = this.f73f.get(str);
        if (bVar2 == null || (bVar = bVar2.a) == null) {
            this.f75h.remove(str);
            this.f74g.put(str, o);
            return true;
        }
        bVar.a(o);
        return true;
    }

    public abstract <I, O> void f(int i2, androidx.activity.result.g.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, androidx.core.app.b bVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
                }
                this.f72e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f75h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f72e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f75h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> i(String str, androidx.activity.result.g.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        int j2 = j(str);
        this.f73f.put(str, new b<>(bVar, aVar));
        if (this.f74g.containsKey(str)) {
            Object obj = this.f74g.get(str);
            this.f74g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f75h.getParcelable(str);
        if (aVar2 != null) {
            this.f75h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new a(str, j2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        Integer remove;
        if (!this.f72e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f73f.remove(str);
        if (this.f74g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f74g.get(str));
            this.f74g.remove(str);
        }
        if (this.f75h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f75h.getParcelable(str));
            this.f75h.remove(str);
        }
        c cVar = this.f71d.get(str);
        if (cVar != null) {
            cVar.a();
            this.f71d.remove(str);
        }
    }
}
