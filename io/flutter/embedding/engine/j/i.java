package io.flutter.embedding.engine.j;

import h.a.d.a.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i {
    public final h.a.d.a.k a;
    private h b;
    final k.c c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x011f A[Catch: JSONException -> 0x0216, TryCatch #9 {JSONException -> 0x0216, blocks: (B:6:0x002c, B:7:0x0030, B:9:0x0035, B:12:0x0040, B:15:0x004b, B:18:0x0057, B:21:0x0062, B:24:0x006c, B:27:0x0077, B:30:0x0081, B:33:0x008b, B:36:0x0095, B:39:0x009f, B:42:0x00a9, B:45:0x00b4, B:50:0x00c3, B:51:0x00c8, B:52:0x00e1, B:53:0x00f0, B:54:0x00f5, B:56:0x00f9, B:57:0x00fe, B:59:0x0113, B:61:0x011f, B:62:0x012c, B:65:0x014f, B:66:0x0153, B:67:0x0158, B:68:0x0162, B:71:0x0185, B:74:0x01a3, B:77:0x01bf, B:80:0x01dc, B:81:0x01e2, B:83:0x01f6, B:84:0x01fc, B:86:0x0210, B:75:0x01a8), top: B:94:0x002c, inners: #6, #8, #10, #11 }] */
        @Override // h.a.d.a.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onMethodCall(h.a.d.a.j jVar, k.d dVar) {
            String message;
            String str;
            e a;
            CharSequence m;
            if (i.this.b != null) {
                String str2 = jVar.a;
                Object obj = jVar.b;
                h.a.b.e("PlatformChannel", "Received '" + str2 + "' message.");
                char c = 65535;
                try {
                    switch (str2.hashCode()) {
                        case -766342101:
                            if (str2.equals("SystemNavigator.pop")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -720677196:
                            if (str2.equals("Clipboard.setData")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -577225884:
                            if (str2.equals("SystemChrome.setSystemUIChangeListener")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -548468504:
                            if (str2.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -247230243:
                            if (str2.equals("HapticFeedback.vibrate")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -215273374:
                            if (str2.equals("SystemSound.play")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 241845679:
                            if (str2.equals("SystemChrome.restoreSystemUIOverlays")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 875995648:
                            if (str2.equals("Clipboard.hasStrings")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 1128339786:
                            if (str2.equals("SystemChrome.setEnabledSystemUIMode")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1390477857:
                            if (str2.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 1514180520:
                            if (str2.equals("Clipboard.getData")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 1674312266:
                            if (str2.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 2119655719:
                            if (str2.equals("SystemChrome.setPreferredOrientations")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            try {
                                i.this.b.f(EnumC0130i.a((String) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException e2) {
                                message = e2.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 1:
                            try {
                                i.this.b.j(g.a((String) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException e3) {
                                message = e3.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 2:
                            try {
                                i.this.b.h(i.this.h((JSONArray) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e4) {
                                message = e4.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 3:
                            try {
                                i.this.b.i(i.this.g((JSONObject) obj));
                                dVar.b(null);
                                return;
                            } catch (JSONException e5) {
                                message = e5.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 4:
                            try {
                                i.this.b.k(i.this.k((JSONArray) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e6) {
                                message = e6.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 5:
                            try {
                                i.this.b.n(i.this.j((String) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e7) {
                                message = e7.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 6:
                            i.this.b.c();
                            dVar.b(null);
                            return;
                        case 7:
                            i.this.b.d();
                            dVar.b(null);
                            return;
                        case '\b':
                            try {
                                i.this.b.g(i.this.i((JSONObject) obj));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e8) {
                                message = e8.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case '\t':
                            i.this.b.b();
                            dVar.b(null);
                            return;
                        case '\n':
                            String str3 = (String) obj;
                            if (str3 != null) {
                                try {
                                    a = e.a(str3);
                                } catch (NoSuchFieldException unused) {
                                    dVar.a("error", "No such clipboard content format: " + str, null);
                                }
                                m = i.this.b.m(a);
                                if (m != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("text", m);
                                    dVar.b(jSONObject);
                                    return;
                                }
                                dVar.b(null);
                                return;
                            }
                            a = null;
                            m = i.this.b.m(a);
                            if (m != null) {
                            }
                            dVar.b(null);
                            return;
                        case 11:
                            i.this.b.e(((JSONObject) obj).getString("text"));
                            dVar.b(null);
                            return;
                        case '\f':
                            boolean l = i.this.b.l();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("value", l);
                            dVar.b(jSONObject2);
                            return;
                        default:
                            dVar.c();
                            return;
                    }
                } catch (JSONException e9) {
                    dVar.a("error", "JSON error: " + e9.getMessage(), null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[k.values().length];
            c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final String b;

        public c(int i2, String str) {
            this.a = i2;
            this.b = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: e  reason: collision with root package name */
        private String f3044e;

        d(String str) {
            this.f3044e = str;
        }

        static d a(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.f3044e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: e  reason: collision with root package name */
        private String f3047e;

        e(String str) {
            this.f3047e = str;
        }

        static e a(String str) {
            e[] values;
            for (e eVar : values()) {
                if (eVar.f3047e.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: e  reason: collision with root package name */
        private String f3053e;

        f(String str) {
            this.f3053e = str;
        }

        static f a(String str) {
            f[] values;
            for (f fVar : values()) {
                if (fVar.f3053e.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3060e;

        g(String str) {
            this.f3060e = str;
        }

        static g a(String str) {
            g[] values;
            for (g gVar : values()) {
                String str2 = gVar.f3060e;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void b();

        void c();

        void d();

        void e(String str);

        void f(EnumC0130i iVar);

        void g(j jVar);

        void h(int i2);

        void i(c cVar);

        void j(g gVar);

        void k(List<l> list);

        boolean l();

        CharSequence m(e eVar);

        void n(k kVar);
    }

    /* renamed from: io.flutter.embedding.engine.j.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0130i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3064e;

        EnumC0130i(String str) {
            this.f3064e = str;
        }

        static EnumC0130i a(String str) {
            EnumC0130i[] values;
            for (EnumC0130i iVar : values()) {
                if (iVar.f3064e.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public final Integer a;
        public final d b;
        public final Boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f3065d;

        /* renamed from: e  reason: collision with root package name */
        public final d f3066e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f3067f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f3068g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.a = num;
            this.b = dVar;
            this.c = bool;
            this.f3065d = num2;
            this.f3066e = dVar2;
            this.f3067f = num3;
            this.f3068g = bool2;
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: e  reason: collision with root package name */
        private String f3074e;

        k(String str) {
            this.f3074e = str;
        }

        static k a(String str) {
            k[] values;
            for (k kVar : values()) {
                if (kVar.f3074e.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: e  reason: collision with root package name */
        private String f3078e;

        l(String str) {
            this.f3078e = str;
        }

        static l a(String str) {
            l[] values;
            for (l lVar : values()) {
                if (lVar.f3078e.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(io.flutter.embedding.engine.f.d dVar) {
        a aVar = new a();
        this.c = aVar;
        h.a.d.a.k kVar = new h.a.d.a.k(dVar, "flutter/platform", h.a.d.a.g.a);
        this.a = kVar;
        kVar.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new c(i2, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h(JSONArray jSONArray) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = b.a[f.a(jSONArray.getString(i2)).ordinal()];
            if (i3 == 1) {
                z |= true;
            } else if (i3 == 2) {
                z |= true;
            } else if (i3 == 3) {
                z |= true;
            } else if (i3 == 4) {
                z |= true;
            }
            if (!z2) {
                z2 = z;
            }
        }
        if (!z) {
            return -1;
        }
        switch (z) {
            case true:
                return 0;
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                if (!z2) {
                    if (!z2) {
                        return !z2 ? 1 : 8;
                    }
                    return 9;
                }
                return 0;
            case true:
                return 9;
            case true:
                return 12;
            case true:
                return 8;
            case true:
                return 11;
            case true:
                return 2;
            case true:
                return 13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        d a2 = !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d a3 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new j(valueOf, a2, valueOf2, valueOf3, a3, valueOf4, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i2 = b.c[k.a(str).ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = b.b[l.a(jSONArray.getString(i2)).ordinal()];
            if (i3 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i3 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.b = hVar;
    }

    public void m(boolean z) {
        h.a.b.e("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z)));
    }
}
