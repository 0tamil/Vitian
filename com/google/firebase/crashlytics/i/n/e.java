package com.google.firebase.crashlytics.i.n;

import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.t;
import com.google.firebase.crashlytics.i.l.a0;
import com.google.firebase.crashlytics.i.l.b0;
import com.google.firebase.crashlytics.i.l.d0.g;
import com.google.firebase.crashlytics.i.p.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f1611d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    private static final int f1612e = 15;

    /* renamed from: f  reason: collision with root package name */
    private static final g f1613f = new g();

    /* renamed from: g  reason: collision with root package name */
    private static final Comparator<? super File> f1614g = a.a;

    /* renamed from: h  reason: collision with root package name */
    private static final FilenameFilter f1615h = d.a;
    private final AtomicInteger a = new AtomicInteger(0);
    private final f b;
    private final i c;

    public e(f fVar, i iVar) {
        this.b = fVar;
        this.c = iVar;
    }

    private void A(String str, long j2) {
        boolean z;
        List<File> o = this.b.o(str, f1615h);
        if (o.isEmpty()) {
            f f2 = f.f();
            f2.i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : o) {
                try {
                    arrayList.add(f1613f.a(y(file)));
                } catch (IOException e2) {
                    f f3 = f.f();
                    f3.l("Could not add event to report for " + file, e2);
                }
                if (z || o(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            f f4 = f.f();
            f4.k("Could not parse event files for session " + str);
            return;
        }
        B(this.b.n(str, "report"), arrayList, j2, z, com.google.firebase.crashlytics.i.k.i.j(str, this.b));
    }

    private void B(File file, List<a0.e.d> list, long j2, boolean z, String str) {
        try {
            g gVar = f1613f;
            a0 l = gVar.D(y(file)).n(j2, z, str).l(b0.h(list));
            a0.e j3 = l.j();
            if (j3 != null) {
                D(z ? this.b.i(j3.h()) : this.b.k(j3.h()), gVar.E(l));
            }
        } catch (IOException e2) {
            f f2 = f.f();
            f2.l("Could not synthesize final report file for " + file, e2);
        }
    }

    private int C(String str, int i2) {
        List<File> o = this.b.o(str, b.a);
        Collections.sort(o, c.a);
        return b(o, i2);
    }

    private static void D(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f1611d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void E(File file, String str, long j2) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f1611d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(d(j2));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> a(String str) {
        this.b.a();
        SortedSet<String> l = l();
        if (str != null) {
            l.remove(str);
        }
        if (l.size() <= 8) {
            return l;
        }
        while (l.size() > 8) {
            String last = l.last();
            f f2 = f.f();
            f2.b("Removing session over cap: " + last);
            this.b.b(last);
            l.remove(last);
        }
        return l;
    }

    private static int b(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            f.r(file);
            size--;
        }
        return size;
    }

    private void c() {
        int i2 = this.c.b().a.b;
        List<File> j2 = j();
        int size = j2.size();
        if (size > i2) {
            for (File file : j2.subList(i2, size)) {
                file.delete();
            }
        }
    }

    private static long d(long j2) {
        return j2 * 1000;
    }

    private void f(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    private static String i(int i2, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i2));
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    private List<File> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.j());
        arrayList.addAll(this.b.g());
        Comparator<? super File> comparator = f1614g;
        Collections.sort(arrayList, comparator);
        List<File> l = this.b.l();
        Collections.sort(l, comparator);
        arrayList.addAll(l);
        return arrayList;
    }

    private static String k(String str) {
        return str.substring(0, f1612e);
    }

    private static boolean o(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(File file, File file2) {
        return k(file.getName()).compareTo(k(file2.getName()));
    }

    private static String y(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f1611d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void z(File file, a0.d dVar, String str) {
        try {
            g gVar = f1613f;
            D(this.b.f(str), gVar.E(gVar.D(y(file)).m(dVar)));
        } catch (IOException e2) {
            f f2 = f.f();
            f2.l("Could not synthesize final native report file for " + file, e2);
        }
    }

    public void e() {
        f(this.b.l());
        f(this.b.j());
        f(this.b.g());
    }

    public void g(String str, long j2) {
        for (String str2 : a(str)) {
            f f2 = f.f();
            f2.i("Finalizing report for session " + str2);
            A(str2, j2);
            this.b.b(str2);
        }
        c();
    }

    public void h(String str, a0.d dVar) {
        File n = this.b.n(str, "report");
        f f2 = f.f();
        f2.b("Writing native session report for " + str + " to file: " + n);
        z(n, dVar, str);
    }

    public SortedSet<String> l() {
        return new TreeSet(this.b.c()).descendingSet();
    }

    public long m(String str) {
        return this.b.n(str, "start-time").lastModified();
    }

    public boolean n() {
        return !this.b.l().isEmpty() || !this.b.j().isEmpty() || !this.b.g().isEmpty();
    }

    public List<t> u() {
        List<File> j2 = j();
        ArrayList arrayList = new ArrayList();
        for (File file : j2) {
            try {
                arrayList.add(t.a(f1613f.D(y(file)), file.getName(), file));
            } catch (IOException e2) {
                f f2 = f.f();
                f2.l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(a0.e.d dVar, String str, boolean z) {
        int i2 = this.c.b().a.a;
        try {
            D(this.b.n(str, i(this.a.getAndIncrement(), z)), f1613f.b(dVar));
        } catch (IOException e2) {
            f f2 = f.f();
            f2.l("Could not persist event for session " + str, e2);
        }
        C(str, i2);
    }

    public void x(a0 a0Var) {
        a0.e j2 = a0Var.j();
        if (j2 == null) {
            f.f().b("Could not get session for report");
            return;
        }
        String h2 = j2.h();
        try {
            D(this.b.n(h2, "report"), f1613f.E(a0Var));
            E(this.b.n(h2, "start-time"), "", j2.k());
        } catch (IOException e2) {
            f f2 = f.f();
            f2.c("Could not persist report for session " + h2, e2);
        }
    }
}
