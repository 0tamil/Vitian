package f.e.a.f;

import h.a.d.a.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends f.e.a.f.a {
    final Map<String, Object> a;
    final a b = new a(this);
    final boolean c;

    /* loaded from: classes.dex */
    public class a implements g {
        Object a;
        String b;
        String c;

        /* renamed from: d  reason: collision with root package name */
        Object f2861d;

        public a(c cVar) {
        }

        @Override // f.e.a.f.g
        public void a(String str, String str2, Object obj) {
            this.b = str;
            this.c = str2;
            this.f2861d = obj;
        }

        @Override // f.e.a.f.g
        public void b(Object obj) {
            this.a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z) {
        this.a = map;
        this.c = z;
    }

    @Override // f.e.a.f.f
    public <T> T c(String str) {
        return (T) this.a.get(str);
    }

    @Override // f.e.a.f.b, f.e.a.f.f
    public boolean e() {
        return this.c;
    }

    @Override // f.e.a.f.a
    public g k() {
        return this.b;
    }

    public String l() {
        return (String) this.a.get("method");
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.b.b);
        hashMap2.put("message", this.b.c);
        hashMap2.put("data", this.b.f2861d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.b.a);
        return hashMap;
    }

    public void o(k.d dVar) {
        a aVar = this.b;
        dVar.a(aVar.b, aVar.c, aVar.f2861d);
    }

    public void p(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(m());
        }
    }

    public void q(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(n());
        }
    }
}
