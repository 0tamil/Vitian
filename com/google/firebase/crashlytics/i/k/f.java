package com.google.firebase.crashlytics.i.k;

import com.google.firebase.crashlytics.i.j.n;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {
    private static final Charset b = Charset.forName("UTF-8");
    private final com.google.firebase.crashlytics.i.n.f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends JSONObject {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
            put("userId", str);
        }
    }

    public f(com.google.firebase.crashlytics.i.n.f fVar) {
        this.a = fVar;
    }

    private static Map<String, String> d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, j(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    private static String f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String i(String str) {
        return new a(str).toString();
    }

    private static String j(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    public File a(String str) {
        return this.a.n(str, "internal-keys");
    }

    public File b(String str) {
        return this.a.n(str, "keys");
    }

    public File c(String str) {
        return this.a.n(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> g(String str, boolean z) {
        Throwable th;
        Exception e2;
        FileInputStream fileInputStream;
        File a2 = z ? a(str) : b(str);
        if (!a2.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(a2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e2 = e3;
        }
        try {
            Map<String, String> d2 = d(n.C(fileInputStream));
            n.e(fileInputStream, "Failed to close user metadata file.");
            return d2;
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.i.f.f().e("Error deserializing user metadata.", e2);
            n.e(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            n.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String h(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        File c = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists()) {
            com.google.firebase.crashlytics.i.f.f().b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                try {
                    String e3 = e(n.C(fileInputStream));
                    com.google.firebase.crashlytics.i.f.f().b("Loaded userId " + e3 + " for session " + str);
                    n.e(fileInputStream, "Failed to close user metadata file.");
                    return e3;
                } catch (Exception e4) {
                    e2 = e4;
                    com.google.firebase.crashlytics.i.f.f().e("Error deserializing user metadata.", e2);
                    n.e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                n.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e5) {
            e2 = e5;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            n.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void k(String str, Map<String, String> map, boolean z) {
        Throwable th;
        Exception e2;
        String f2;
        BufferedWriter bufferedWriter;
        File a2 = z ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f2 = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), b));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e2 = e3;
        }
        try {
            bufferedWriter.write(f2);
            bufferedWriter.flush();
            n.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e4) {
            e2 = e4;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.i.f.f().e("Error serializing key/value metadata.", e2);
            n.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            n.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void l(String str, String str2) {
        Throwable th;
        Exception e2;
        String i2;
        BufferedWriter bufferedWriter;
        File c = c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                i2 = i(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(i2);
            bufferedWriter.flush();
            n.e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e4) {
            e2 = e4;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.i.f.f().e("Error serializing user metadata.", e2);
            n.e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            n.e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
