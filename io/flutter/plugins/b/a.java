package io.flutter.plugins.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import h.a.d.a.j;
import h.a.d.a.k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class a implements k.c {

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f3209e;

    /* renamed from: f  reason: collision with root package name */
    private final ExecutorService f3210f = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: g  reason: collision with root package name */
    private final Handler f3211g = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0135a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f3212e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k.d f3213f;

        /* renamed from: io.flutter.plugins.b.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0136a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f3215e;

            RunnableC0136a(boolean z) {
                this.f3215e = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0135a.this.f3213f.b(Boolean.valueOf(this.f3215e));
            }
        }

        RunnableC0135a(SharedPreferences.Editor editor, k.d dVar) {
            this.f3212e = editor;
            this.f3213f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f3211g.post(new RunnableC0136a(this.f3212e.commit()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f3209e = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    private void b(SharedPreferences.Editor editor, k.d dVar) {
        this.f3210f.execute(new RunnableC0135a(editor, dVar));
    }

    private List<String> c(String str) {
        Throwable th;
        ClassNotFoundException e2;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (ClassNotFoundException e3) {
            e2 = e3;
        }
        try {
            List<String> list = (List) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        } catch (ClassNotFoundException e4) {
            e2 = e4;
            throw new IOException(e2);
        } catch (Throwable th3) {
            th = th3;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    private String d(List<String> list) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            objectOutputStream.close();
            return encodeToString;
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw th;
        }
    }

    private Map<String, Object> e() {
        Object obj;
        Map<String, ?> all = this.f3209e.getAll();
        HashMap hashMap = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj2 = all.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj2 = c(str2.substring(40));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str2.substring(44), 36);
                        obj2 = obj;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(str, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        SharedPreferences.Editor remove = this.f3209e.edit().remove(str);
                        obj = arrayList;
                        if (!remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        obj2 = obj;
                    }
                    hashMap.put(str, obj2);
                }
            }
        }
        return hashMap;
    }

    public void f() {
        this.f3211g.removeCallbacksAndMessages(null);
        this.f3210f.shutdown();
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        SharedPreferences.Editor putBoolean;
        String str = (String) jVar.a("key");
        try {
            String str2 = jVar.a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    putBoolean = this.f3209e.edit().putBoolean(str, ((Boolean) jVar.a("value")).booleanValue());
                    break;
                case 1:
                    String d2 = Double.toString(((Number) jVar.a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f3209e.edit();
                    putBoolean = edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2);
                    break;
                case 2:
                    Number number = (Number) jVar.a("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.f3209e.edit();
                        putBoolean = edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    } else {
                        putBoolean = this.f3209e.edit().putLong(str, number.longValue());
                        break;
                    }
                case 3:
                    String str3 = (String) jVar.a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        putBoolean = this.f3209e.edit().putString(str, str3);
                        break;
                    }
                    dVar.a("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f3209e.edit();
                    putBoolean = edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d((List) jVar.a("value")));
                    break;
                case 5:
                    dVar.b(Boolean.TRUE);
                    return;
                case 6:
                    dVar.b(e());
                    return;
                case 7:
                    putBoolean = this.f3209e.edit().remove(str);
                    break;
                case '\b':
                    Set<String> keySet = e().keySet();
                    SharedPreferences.Editor edit4 = this.f3209e.edit();
                    for (String str4 : keySet) {
                        edit4.remove(str4);
                    }
                    b(edit4, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            b(putBoolean, dVar);
        } catch (IOException e2) {
            dVar.a("IOException encountered", jVar.a, e2);
        }
    }
}
