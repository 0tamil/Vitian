package com.google.firebase.n.i;

import com.google.firebase.n.e;
import com.google.firebase.n.f;
import com.google.firebase.n.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class d implements com.google.firebase.n.h.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final com.google.firebase.n.d<Object> f1847e = com.google.firebase.n.i.a.a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f1848f = com.google.firebase.n.i.b.a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f1849g = c.a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f1850h = new b(null);
    private final Map<Class<?>, com.google.firebase.n.d<?>> a = new HashMap();
    private final Map<Class<?>, f<?>> b = new HashMap();
    private com.google.firebase.n.d<Object> c = f1847e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1851d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements com.google.firebase.n.a {
        a() {
        }

        @Override // com.google.firebase.n.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.n.a
        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.a, d.this.b, d.this.c, d.this.f1851d);
            eVar.i(obj, false);
            eVar.r();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements f<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.a(a.format(date));
        }
    }

    public d() {
        m(String.class, f1848f);
        m(Boolean.class, f1849g);
        m(Date.class, f1850h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(Object obj, e eVar) {
        throw new com.google.firebase.n.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.firebase.n.h.b
    public /* bridge */ /* synthetic */ d a(Class cls, com.google.firebase.n.d dVar) {
        l(cls, dVar);
        return this;
    }

    public com.google.firebase.n.a f() {
        return new a();
    }

    public d g(com.google.firebase.n.h.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.f1851d = z;
        return this;
    }

    public <T> d l(Class<T> cls, com.google.firebase.n.d<? super T> dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, f<? super T> fVar) {
        this.b.put(cls, fVar);
        this.a.remove(cls);
        return this;
    }
}
