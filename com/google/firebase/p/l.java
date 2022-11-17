package com.google.firebase.p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l {
    private final SharedPreferences a;

    public l(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j2 = this.a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.a.edit().putStringSet(str2, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    private synchronized String d(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e2 = e(str);
        if (e2 != null) {
            HashSet hashSet = new HashSet(this.a.getStringSet(e2, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.a.edit().remove(e2) : this.a.edit().putStringSet(e2, hashSet)).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.a.edit();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<m> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(m.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j2, long j3) {
        return d(j2).equals(d(j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d2 = d(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", d2).commit();
        h(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j2) {
        return j("fire-global", j2);
    }

    synchronized boolean j(String str, long j2) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j2).commit();
            return true;
        } else if (f(this.a.getLong(str, -1L), j2)) {
            return false;
        } else {
            this.a.edit().putLong(str, j2).commit();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j2, String str) {
        String d2 = d(j2);
        if (!this.a.getString("last-used-date", "").equals(d2)) {
            long j3 = this.a.getLong("fire-count", 0L);
            if (j3 + 1 == 30) {
                a();
                j3 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.add(d2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", d2).commit();
        }
    }

    synchronized void l(long j2) {
        this.a.edit().putLong("fire-global", j2).commit();
    }
}
