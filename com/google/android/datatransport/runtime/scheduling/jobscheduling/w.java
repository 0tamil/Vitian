package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.b0.b;
import f.b.a.a.i.p;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class w {
    private final Executor a;
    private final j0 b;
    private final y c;

    /* renamed from: d  reason: collision with root package name */
    private final b f1028d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Executor executor, j0 j0Var, y yVar, b bVar) {
        this.a = executor;
        this.b = j0Var;
        this.c = yVar;
        this.f1028d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c() {
        for (p pVar : this.b.v()) {
            this.c.a(pVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        this.f1028d.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
            @Override // f.b.a.a.i.b0.b.a
            public final Object a() {
                return w.this.c();
            }
        });
    }

    public void a() {
        this.a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
