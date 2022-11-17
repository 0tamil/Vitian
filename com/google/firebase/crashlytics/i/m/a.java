package com.google.firebase.crashlytics.i.m;

import com.google.firebase.crashlytics.i.f;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes.dex */
public class a {
    private final String a;
    private final Map<String, String> b;
    private final Map<String, String> c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.a = str;
        this.b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r4 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
        r1 = r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
        r2.append(r1);
        r0.append(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r7.hasNext() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
        r1 = r7.next();
        r2 = new java.lang.StringBuilder();
        r2.append("&");
        r2.append(r1.getKey());
        r2.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0035 -> B:6:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0066 -> B:4:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(next.getKey());
        sb2.append("=");
        String value = next.getValue();
        String str = "";
    }

    private String b(String str, Map<String, String> map) {
        String a = a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a = "&" + a;
            }
            return str + a;
        }
        return str + "?" + a;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public c c() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e2 = null;
        inputStream = null;
        try {
            String b = b(this.a, this.b);
            f.f().i("GET Request URL: " + b);
            httpsURLConnection = (HttpsURLConnection) new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e2 = e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new c(responseCode, e2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }
}
