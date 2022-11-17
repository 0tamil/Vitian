package com.google.firebase.crashlytics.i.n;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class f {
    private final File a;
    private final File b;
    private final File c;

    /* renamed from: d  reason: collision with root package name */
    private final File f1616d;

    /* renamed from: e  reason: collision with root package name */
    private final File f1617e;

    public f(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        p(file);
        this.a = file;
        File file2 = new File(file, "open-sessions");
        p(file2);
        this.b = file2;
        File file3 = new File(file, "reports");
        p(file3);
        this.c = file3;
        File file4 = new File(file, "priority-reports");
        p(file4);
        this.f1616d = file4;
        File file5 = new File(file, "native-reports");
        p(file5);
        this.f1617e = file5;
    }

    private File m(String str) {
        File file = new File(this.b, str);
        q(file);
        return file;
    }

    private static synchronized File p(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
                f2.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                com.google.firebase.crashlytics.i.f f3 = com.google.firebase.crashlytics.i.f.f();
                f3.d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    private static File q(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> s(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void a() {
        File[] fileArr = {new File(this.a.getParent(), ".com.google.firebase.crashlytics"), new File(this.a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i2 = 0; i2 < 2; i2++) {
            File file = fileArr[i2];
            if (file.exists() && r(file)) {
                com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
                f2.b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    public boolean b(String str) {
        return r(new File(this.b, str));
    }

    public List<String> c() {
        return s(this.b.list());
    }

    public File d(String str) {
        return new File(this.a, str);
    }

    public List<File> e(FilenameFilter filenameFilter) {
        return s(this.a.listFiles(filenameFilter));
    }

    public File f(String str) {
        return new File(this.f1617e, str);
    }

    public List<File> g() {
        return s(this.f1617e.listFiles());
    }

    public File h(String str) {
        File file = new File(m(str), "native");
        q(file);
        return file;
    }

    public File i(String str) {
        return new File(this.f1616d, str);
    }

    public List<File> j() {
        return s(this.f1616d.listFiles());
    }

    public File k(String str) {
        return new File(this.c, str);
    }

    public List<File> l() {
        return s(this.c.listFiles());
    }

    public File n(String str, String str2) {
        return new File(m(str), str2);
    }

    public List<File> o(String str, FilenameFilter filenameFilter) {
        return s(m(str).listFiles(filenameFilter));
    }
}
