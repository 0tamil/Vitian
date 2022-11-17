package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
class t {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private final n<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        b(n<?> nVar) {
            this.a = nVar;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        void b(b bVar) {
            this.c.add(bVar);
        }

        n<?> c() {
            return this.a;
        }

        Set<b> d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        private final Class<?> a;
        private final boolean b;

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b == this.b;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<n<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i2 = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i2++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b2.add(bVar);
                }
            }
        }
        if (i2 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : c2) {
                if (!bVar2.f() && !bVar2.e()) {
                    arrayList.add(bVar2.c());
                }
            }
            throw new v(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<n<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (n<?> nVar : list) {
            b bVar = new b(nVar);
            for (Class<? super Object> cls : nVar.e()) {
                c cVar = new c(cls, !nVar.k());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (set2.isEmpty() || cVar.b) {
                    set2.add(bVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (u uVar : bVar2.c().c()) {
                    if (uVar.e() && (set = (Set) hashMap.get(new c(uVar.c(), uVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
