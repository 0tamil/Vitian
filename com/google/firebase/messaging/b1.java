package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b1 {
    private final SharedPreferences a;
    private final String b;
    private final String c;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f1731e;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f1730d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1732f = false;

    private b1(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.f1731e = executor;
    }

    private boolean b(boolean z) {
        if (z && !this.f1732f) {
            j();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b1 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        b1 b1Var = new b1(sharedPreferences, str, str2, executor);
        b1Var.d();
        return b1Var;
    }

    private void d() {
        synchronized (this.f1730d) {
            this.f1730d.clear();
            String string = this.a.getString(this.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                String[] split = string.split(this.c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f1730d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f1730d) {
            this.a.edit().putString(this.b, h()).commit();
        }
    }

    private void j() {
        this.f1731e.execute(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.i();
            }
        });
    }

    public boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.c)) {
            return false;
        }
        synchronized (this.f1730d) {
            add = this.f1730d.add(str);
            b(add);
        }
        return add;
    }

    public String f() {
        String peek;
        synchronized (this.f1730d) {
            peek = this.f1730d.peek();
        }
        return peek;
    }

    public boolean g(Object obj) {
        boolean remove;
        synchronized (this.f1730d) {
            remove = this.f1730d.remove(obj);
            b(remove);
        }
        return remove;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f1730d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}
