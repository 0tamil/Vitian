package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class a<O extends d> {
    private final AbstractC0026a<?, O> a;
    private final g<?> b;
    private final String c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0026a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T c(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, f.b bVar, f.c cVar) {
            return d(context, looper, eVar, o, bVar, cVar);
        }

        public T d(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, com.google.android.gms.common.api.internal.f fVar, m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface AbstractC0027a extends d {
            Account a();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount b();
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            private c() {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
        public List<Scope> a(O o) {
            return Collections.emptyList();
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        boolean a();

        void b(c.e eVar);

        boolean c();

        com.google.android.gms.common.c[] d();

        String e();

        boolean g();

        String i();

        Set<Scope> j();

        void k(j jVar, Set<Scope> set);

        void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void m(c.AbstractC0029c cVar);

        void n();

        void o(String str);

        Intent p();

        boolean q();

        boolean s();

        int u();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0026a<C, O> aVar, g<C> gVar) {
        p.j(aVar, "Cannot construct an Api with a null ClientBuilder");
        p.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final AbstractC0026a<?, O> a() {
        return this.a;
    }

    public final c<?> b() {
        return this.b;
    }

    public final e<?, O> c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }
}
