package com.google.firebase.n.j;

import com.google.firebase.n.d;
import com.google.firebase.n.e;
import com.google.firebase.n.f;
import com.google.firebase.n.h.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class h {
    private final Map<Class<?>, d<?>> a;
    private final Map<Class<?>, f<?>> b;
    private final d<Object> c;

    /* loaded from: classes.dex */
    public static final class a implements b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final d<Object> f1867d = b.a;
        private final Map<Class<?>, d<?>> a = new HashMap();
        private final Map<Class<?>, f<?>> b = new HashMap();
        private d<Object> c = f1867d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void d(Object obj, e eVar) {
            throw new com.google.firebase.n.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // com.google.firebase.n.h.b
        public /* bridge */ /* synthetic */ a a(Class cls, d dVar) {
            e(cls, dVar);
            return this;
        }

        public h b() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a c(com.google.firebase.n.h.a aVar) {
            aVar.a(this);
            return this;
        }

        public <U> a e(Class<U> cls, d<? super U> dVar) {
            this.a.put(cls, dVar);
            this.b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.a = map;
        this.b = map2;
        this.c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new g(outputStream, this.a, this.b, this.c).r(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
