package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.c.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
/* loaded from: classes.dex */
public class b {
    private final Context a;
    private boolean b = true;

    public b(Context context) {
        this.a = context;
    }

    private boolean m(List<String> list) {
        PackageManager packageManager = this.a.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                a.a(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    private String[] p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String[] q() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean a() {
        return new RootBeerNative().a();
    }

    public boolean b(String str) {
        String[] strArr;
        boolean z = false;
        for (String str2 : a.c) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                a.e(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public boolean c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] q = q();
        if (q == null) {
            return false;
        }
        boolean z = false;
        for (String str : q) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        a.e(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean d() {
        return b("magisk");
    }

    public boolean e() {
        String[] strArr;
        String[] p = p();
        if (p == null) {
            return false;
        }
        boolean z = false;
        for (String str : p) {
            String[] split = str.split(" ");
            if (split.length < 4) {
                a.a("Error formatting mount line: " + str);
            } else {
                String str2 = split[1];
                String str3 = split[3];
                for (String str4 : a.f1879d) {
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] split2 = str3.split(",");
                        int length = split2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (split2[i2].equalsIgnoreCase("rw")) {
                                a.e(str4 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean f() {
        if (!a()) {
            a.a("We could not load the native library to test for root");
            return false;
        }
        int length = a.c.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = a.c[i2] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean g() {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public boolean h() {
        return i(null);
    }

    public boolean i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(a.b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m(arrayList);
    }

    public boolean j() {
        return k(null);
    }

    public boolean k(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(a.a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m(arrayList);
    }

    public boolean l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean n() {
        return j() || h() || b("su") || b("busybox") || c() || e() || l() || g() || f() || d();
    }

    public boolean o() {
        return j() || h() || b("su") || c() || e() || l() || g() || f() || d();
    }
}
