package com.google.firebase.crashlytics.i.j;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.k.i;
import com.google.firebase.crashlytics.i.l.a0;
import com.google.firebase.crashlytics.i.l.b0;
import com.google.firebase.crashlytics.i.n.e;
import com.google.firebase.crashlytics.i.o.c;
import com.google.firebase.crashlytics.i.q.d;
import f.b.a.b.g.a;
import f.b.a.b.g.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class g0 {
    private final s a;
    private final e b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.k.e f1379d;

    /* renamed from: e  reason: collision with root package name */
    private final i f1380e;

    g0(s sVar, e eVar, c cVar, com.google.firebase.crashlytics.i.k.e eVar2, i iVar) {
        this.a = sVar;
        this.b = eVar;
        this.c = cVar;
        this.f1379d = eVar2;
        this.f1380e = iVar;
    }

    private a0.e.d a(a0.e.d dVar) {
        return b(dVar, this.f1379d, this.f1380e);
    }

    private a0.e.d b(a0.e.d dVar, com.google.firebase.crashlytics.i.k.e eVar, i iVar) {
        a0.e.d.b g2 = dVar.g();
        String c = eVar.c();
        if (c != null) {
            a0.e.d.AbstractC0047d.a a = a0.e.d.AbstractC0047d.a();
            a.b(c);
            g2.d(a.a());
        } else {
            f.f().i("No log data to include with this event.");
        }
        List<a0.c> i2 = i(iVar.d());
        List<a0.c> i3 = i(iVar.e());
        if (!i2.isEmpty() || !i3.isEmpty()) {
            a0.e.d.a.AbstractC0036a g3 = dVar.b().g();
            g3.c(b0.h(i2));
            g3.e(b0.h(i3));
            g2.b(g3.a());
        }
        return g2.a();
    }

    private static a0.a c(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = d(traceInputStream);
            }
        } catch (IOException e2) {
            f f2 = f.f();
            f2.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e2);
        }
        a0.a.AbstractC0034a a = a0.a.a();
        a.b(applicationExitInfo.getImportance());
        a.d(applicationExitInfo.getProcessName());
        a.f(applicationExitInfo.getReason());
        a.h(applicationExitInfo.getTimestamp());
        a.c(applicationExitInfo.getPid());
        a.e(applicationExitInfo.getPss());
        a.g(applicationExitInfo.getRss());
        a.i(str);
        return a.a();
    }

    public static String d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static g0 e(Context context, a0 a0Var, com.google.firebase.crashlytics.i.n.f fVar, h hVar, com.google.firebase.crashlytics.i.k.e eVar, i iVar, d dVar, com.google.firebase.crashlytics.i.p.i iVar2, f0 f0Var) {
        return new g0(new s(context, a0Var, hVar, dVar), new e(fVar, iVar2), c.a(context, iVar2, f0Var), eVar, iVar);
    }

    private ApplicationExitInfo h(String str, List<ApplicationExitInfo> list) {
        long m = this.b.m(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<a0.c> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a0.c.a a = a0.c.a();
            a.b(entry.getKey());
            a.c(entry.getValue());
            arrayList.add(a.a());
        }
        Collections.sort(arrayList, d.a);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(f.b.a.b.g.i<t> iVar) {
        if (iVar.n()) {
            t j2 = iVar.j();
            f f2 = f.f();
            f2.b("Crashlytics report successfully enqueued to DataTransport: " + j2.d());
            File c = j2.c();
            if (c.delete()) {
                f f3 = f.f();
                f3.b("Deleted report file: " + c.getPath());
                return true;
            }
            f f4 = f.f();
            f4.k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        f.f().l("Crashlytics report could not be enqueued to DataTransport", iVar.i());
        return false;
    }

    private void p(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        this.b.w(a(this.a.c(th, thread, str2, j2, 4, 8, z)), str, str2.equals("crash"));
    }

    public void f(String str, List<d0> list) {
        f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : list) {
            a0.d.b b = d0Var.b();
            if (b != null) {
                arrayList.add(b);
            }
        }
        e eVar = this.b;
        a0.d.a a = a0.d.a();
        a.b(b0.h(arrayList));
        eVar.h(str, a.a());
    }

    public void g(long j2, String str) {
        this.b.g(str, j2);
    }

    public boolean j() {
        return this.b.n();
    }

    public SortedSet<String> m() {
        return this.b.l();
    }

    public void n(String str, long j2) {
        this.b.x(this.a.d(str, j2));
    }

    public void q(Throwable th, Thread thread, String str, long j2) {
        f f2 = f.f();
        f2.i("Persisting fatal event for session " + str);
        p(th, thread, str, "crash", j2, true);
    }

    public void r(Throwable th, Thread thread, String str, long j2) {
        f f2 = f.f();
        f2.i("Persisting non-fatal event for session " + str);
        p(th, thread, str, "error", j2, false);
    }

    public void s(String str, List<ApplicationExitInfo> list, com.google.firebase.crashlytics.i.k.e eVar, i iVar) {
        ApplicationExitInfo h2 = h(str, list);
        if (h2 == null) {
            f f2 = f.f();
            f2.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        a0.e.d b = this.a.b(c(h2));
        f f3 = f.f();
        f3.b("Persisting anr for session " + str);
        this.b.w(b(b, eVar, iVar), str, true);
    }

    public void t() {
        this.b.e();
    }

    public f.b.a.b.g.i<Void> u(Executor executor) {
        return v(executor, null);
    }

    public f.b.a.b.g.i<Void> v(Executor executor, String str) {
        List<t> u = this.b.u();
        ArrayList arrayList = new ArrayList();
        for (t tVar : u) {
            if (str == null || str.equals(tVar.d())) {
                arrayList.add(this.c.b(tVar, str != null).g(executor, new a() { // from class: com.google.firebase.crashlytics.i.j.c
                    @Override // f.b.a.b.g.a
                    public final Object a(f.b.a.b.g.i iVar) {
                        boolean o;
                        o = g0.this.o(iVar);
                        return Boolean.valueOf(o);
                    }
                }));
            }
        }
        return l.f(arrayList);
    }
}
