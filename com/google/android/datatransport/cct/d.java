package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.cct.f.a;
import com.google.android.datatransport.cct.f.j;
import com.google.android.datatransport.cct.f.k;
import com.google.android.datatransport.cct.f.l;
import com.google.android.datatransport.cct.f.m;
import com.google.android.datatransport.cct.f.n;
import com.google.android.datatransport.cct.f.o;
import com.google.android.datatransport.cct.f.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import f.b.a.a.i.i;
import f.b.a.a.i.j;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements m {
    private final com.google.firebase.n.a a;
    private final ConnectivityManager b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    final URL f917d;

    /* renamed from: e  reason: collision with root package name */
    private final f.b.a.a.i.c0.a f918e;

    /* renamed from: f  reason: collision with root package name */
    private final f.b.a.a.i.c0.a f919f;

    /* renamed from: g  reason: collision with root package name */
    private final int f920g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    d(Context context, f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2, int i2) {
        this.a = j.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f917d = m(c.c);
        this.f918e = aVar2;
        this.f919f = aVar;
        this.f920g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b c(a aVar) {
        Throwable e2;
        Throwable e3;
        f.b.a.a.i.y.a.e("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f920g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.4"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.b(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                f.b.a.a.i.y.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                f.b.a.a.i.y.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                f.b.a.a.i.y.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream l = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(l))).c());
                    if (l != null) {
                        l.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (com.google.firebase.n.b e4) {
            e3 = e4;
            f.b.a.a.i.y.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new b(400, null, 0L);
        } catch (ConnectException e5) {
            e2 = e5;
            f.b.a.a.i.y.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e2 = e6;
            f.b.a.a.i.y.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new b(500, null, 0L);
        } catch (IOException e7) {
            e3 = e7;
            f.b.a.a.i.y.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new b(400, null, 0L);
        }
    }

    private static int d(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = o.b.COMBINED;
            } else if (o.b.a(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.c();
    }

    private static int e(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.c() : networkInfo.getType();
    }

    private static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            f.b.a.a.i.y.a.c("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    private j g(f fVar) {
        l.a j2;
        HashMap hashMap = new HashMap();
        for (f.b.a.a.i.j jVar : fVar.b()) {
            String j3 = jVar.j();
            if (!hashMap.containsKey(j3)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jVar);
                hashMap.put(j3, arrayList);
            } else {
                ((List) hashMap.get(j3)).add(jVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            f.b.a.a.i.j jVar2 = (f.b.a.a.i.j) ((List) entry.getValue()).get(0);
            m.a a2 = com.google.android.datatransport.cct.f.m.a();
            a2.f(p.DEFAULT);
            a2.g(this.f919f.a());
            a2.h(this.f918e.a());
            k.a a3 = k.a();
            a3.c(k.b.ANDROID_FIREBASE);
            a.AbstractC0023a a4 = com.google.android.datatransport.cct.f.a.a();
            a4.m(Integer.valueOf(jVar2.g("sdk-version")));
            a4.j(jVar2.b("model"));
            a4.f(jVar2.b("hardware"));
            a4.d(jVar2.b("device"));
            a4.l(jVar2.b("product"));
            a4.k(jVar2.b("os-uild"));
            a4.h(jVar2.b("manufacturer"));
            a4.e(jVar2.b("fingerprint"));
            a4.c(jVar2.b("country"));
            a4.g(jVar2.b("locale"));
            a4.i(jVar2.b("mcc_mnc"));
            a4.b(jVar2.b("application_build"));
            a3.b(a4.a());
            a2.b(a3.a());
            try {
                a2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (f.b.a.a.i.j jVar3 : (List) entry.getValue()) {
                i e2 = jVar3.e();
                f.b.a.a.b b2 = e2.b();
                if (b2.equals(f.b.a.a.b.b("proto"))) {
                    j2 = l.j(e2.a());
                } else if (b2.equals(f.b.a.a.b.b("json"))) {
                    j2 = l.i(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    f.b.a.a.i.y.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                j2.c(jVar3.f());
                j2.d(jVar3.k());
                j2.h(jVar3.h("tz-offset"));
                o.a a5 = o.a();
                a5.c(o.c.a(jVar3.g("net-type")));
                a5.b(o.b.a(jVar3.g("mobile-subtype")));
                j2.e(a5.a());
                if (jVar3.d() != null) {
                    j2.b(jVar3.d());
                }
                arrayList3.add(j2.a());
            }
            a2.c(arrayList3);
            arrayList2.add(a2.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        f.b.a.a.i.y.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public f.b.a.a.i.j a(f.b.a.a.i.j jVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        j.a l = jVar.l();
        l.a("sdk-version", Build.VERSION.SDK_INT);
        l.c("model", Build.MODEL);
        l.c("hardware", Build.HARDWARE);
        l.c("device", Build.DEVICE);
        l.c("product", Build.PRODUCT);
        l.c("os-uild", Build.ID);
        l.c("manufacturer", Build.MANUFACTURER);
        l.c("fingerprint", Build.FINGERPRINT);
        l.b("tz-offset", i());
        l.a("net-type", e(activeNetworkInfo));
        l.a("mobile-subtype", d(activeNetworkInfo));
        l.c("country", Locale.getDefault().getCountry());
        l.c("locale", Locale.getDefault().getLanguage());
        l.c("mcc_mnc", h(this.c).getSimOperator());
        l.c("application_build", Integer.toString(f(this.c)));
        return l.d();
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public g b(f fVar) {
        com.google.android.datatransport.cct.f.j g2 = g(fVar);
        URL url = this.f917d;
        String str = null;
        if (fVar.c() != null) {
            try {
                c e2 = c.e(fVar.c());
                if (e2.f() != null) {
                    str = e2.f();
                }
                if (e2.g() != null) {
                    url = m(e2.g());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) f.b.a.a.i.z.b.a(5, new a(url, g2, str), new f.b.a.a.i.z.a() { // from class: com.google.android.datatransport.cct.b
                @Override // f.b.a.a.i.z.a
                public final Object a(Object obj) {
                    d.b c;
                    c = d.this.c((d.a) obj);
                    return c;
                }
            }, com.google.android.datatransport.cct.a.a);
            int i2 = bVar.a;
            if (i2 == 200) {
                return g.e(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e3) {
            f.b.a.a.i.y.a.c("CctTransportBackend", "Could not make request to the backend", e3);
            return g.f();
        }
    }
}
