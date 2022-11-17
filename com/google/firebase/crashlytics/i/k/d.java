package com.google.firebase.crashlytics.i.k;

import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class d {
    private final Map<String, String> a = new HashMap();
    private final int b;
    private final int c;

    public d(int i2, int i3) {
        this.b = i2;
        this.c = i3;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i2) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i2 ? trim.substring(0, i2) : trim;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public synchronized boolean d(String str, String str2) {
        String b = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(b)) {
            f f2 = f.f();
            f2.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String c = c(str2, this.c);
        if (n.A(this.a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        int i2 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b = b(entry.getKey());
            if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                i2++;
            }
            String value = entry.getValue();
            this.a.put(b, value == null ? "" : c(value, this.c));
        }
        if (i2 > 0) {
            f f2 = f.f();
            f2.k("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.b);
        }
    }
}
