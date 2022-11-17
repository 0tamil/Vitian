package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import e.c.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, d0> f1223d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1224e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1225f;

    /* renamed from: g  reason: collision with root package name */
    private final f.b.a.b.e.a f1226g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f1227h;

    /* loaded from: classes.dex */
    public static final class a {
        private Account a;
        private b<Scope> b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f1228d;

        /* renamed from: e  reason: collision with root package name */
        private f.b.a.b.e.a f1229e = f.b.a.b.e.a.f2377j;

        public e a() {
            return new e(this.a, this.b, null, 0, null, this.c, this.f1228d, this.f1229e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new b<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.f1228d = str;
            return this;
        }
    }

    public e(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, d0> map, int i2, View view, String str, String str2, f.b.a.b.e.a aVar, boolean z) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f1223d = map;
        this.f1224e = str;
        this.f1225f = str2;
        this.f1226g = aVar == null ? f.b.a.b.e.a.f2377j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (d0 d0Var : map.values()) {
            hashSet.addAll(d0Var.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.c;
    }

    public String d() {
        return this.f1224e;
    }

    public Set<Scope> e() {
        return this.b;
    }

    public final f.b.a.b.e.a f() {
        return this.f1226g;
    }

    public final Integer g() {
        return this.f1227h;
    }

    public final String h() {
        return this.f1225f;
    }

    public final Map<com.google.android.gms.common.api.a<?>, d0> i() {
        return this.f1223d;
    }

    public final void j(Integer num) {
        this.f1227h = num;
    }
}
