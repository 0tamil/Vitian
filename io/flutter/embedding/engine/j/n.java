package io.flutter.embedding.engine.j;

import android.os.Build;
import android.os.Bundle;
import h.a.d.a.j;
import h.a.d.a.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class n {
    public final k a;
    private f b;
    final k.c c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            String message;
            Bundle bundle;
            if (n.this.b != null) {
                String str = jVar.a;
                Object obj = jVar.b;
                h.a.b.e("TextInputChannel", "Received '" + str + "' message.");
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                try {
                    switch (c) {
                        case 0:
                            n.this.b.d(((JSONObject) obj).getInt("platformViewId"));
                            dVar.b(null);
                            return;
                        case 1:
                            n.this.b.j(e.a((JSONObject) obj));
                            dVar.b(null);
                            return;
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                n.this.b.g(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                                dVar.b(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e2) {
                                message = e2.getMessage();
                                dVar.a("error", message, null);
                                return;
                            }
                        case 3:
                            n.this.b.i();
                            break;
                        case 4:
                            n.this.b.a();
                            break;
                        case 5:
                            JSONObject jSONObject = (JSONObject) obj;
                            String string = jSONObject.getString("action");
                            String string2 = jSONObject.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            n.this.b.b(string, bundle);
                            dVar.b(null);
                            return;
                        case 6:
                            JSONObject jSONObject2 = (JSONObject) obj;
                            double d2 = jSONObject2.getDouble("width");
                            double d3 = jSONObject2.getDouble("height");
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i2 = 0; i2 < 16; i2++) {
                                dArr[i2] = jSONArray2.getDouble(i2);
                            }
                            n.this.b.e(d2, d3, dArr);
                            dVar.b(null);
                            return;
                        case 7:
                            n.this.b.h(((Boolean) obj).booleanValue());
                            break;
                        case '\b':
                            n.this.b.c();
                            break;
                        case '\t':
                            n.this.b.f();
                            break;
                        default:
                            dVar.c();
                            return;
                    }
                    dVar.b(null);
                } catch (JSONException e3) {
                    message = e3.getMessage();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3103d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3104e;

        /* renamed from: f  reason: collision with root package name */
        public final d f3105f;

        /* renamed from: g  reason: collision with root package name */
        public final c f3106g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f3107h;

        /* renamed from: i  reason: collision with root package name */
        public final String f3108i;

        /* renamed from: j  reason: collision with root package name */
        public final a f3109j;

        /* renamed from: k  reason: collision with root package name */
        public final b[] f3110k;

        /* loaded from: classes.dex */
        public static class a {
            public final String a;
            public final String[] b;
            public final e c;

            /* renamed from: d  reason: collision with root package name */
            public final String f3111d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.a = str;
                this.b = strArr;
                this.f3111d = str2;
                this.c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = b(jSONArray.getString(i2));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
                if (r16.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String b(String str) {
                char c = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 798554127:
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        return "birthDateYear";
                    case 1:
                        return "smsOTPCode";
                    case 2:
                        return "creditCardExpirationMonth";
                    case 3:
                        return "phoneNational";
                    case 4:
                        return "newPassword";
                    case 5:
                        return "creditCardSecurityCode";
                    case 6:
                        return "creditCardExpirationDay";
                    case 7:
                        return "streetAddress";
                    case '\b':
                        return "phoneNumberDevice";
                    case '\t':
                        return "addressCountry";
                    case '\n':
                        return "personMiddleInitial";
                    case 11:
                        return "addressLocality";
                    case '\f':
                        return "gender";
                    case '\r':
                        return "extendedPostalCode";
                    case 14:
                        return "creditCardNumber";
                    case 15:
                        return "personNamePrefix";
                    case 16:
                        return "personMiddleName";
                    case 17:
                        return "personNameSuffix";
                    case 18:
                        return "creditCardExpirationDate";
                    case 19:
                        return "creditCardExpirationYear";
                    case 20:
                        return "phoneCountryCode";
                    case 21:
                        return "username";
                    case 22:
                        return "personName";
                    case e.a.j.b3 /* 23 */:
                        return "emailAddress";
                    case e.a.j.c3 /* 24 */:
                        return "addressRegion";
                    case 25:
                        return "birthDateMonth";
                    case 26:
                        return "personFamilyName";
                    case 27:
                        return "phoneNumber";
                    case 28:
                        return "newUsername";
                    case e.a.j.h3 /* 29 */:
                        return "birthDateFull";
                    case 30:
                        return "password";
                    case 31:
                        return "personGivenName";
                    case ' ':
                        return "postalAddress";
                    case '!':
                        return "extendedAddress";
                    case '\"':
                        return "postalCode";
                    case '#':
                        return "birthDateDay";
                    default:
                        return str;
                }
            }
        }

        public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, c cVar, Integer num, String str, a aVar, b[] bVarArr) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.f3103d = z4;
            this.f3104e = z5;
            this.f3105f = dVar;
            this.f3106g = cVar;
            this.f3107h = num;
            this.f3108i = str;
            this.f3109j = aVar;
            this.f3110k = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string != null) {
                a aVar = null;
                if (!jSONObject.isNull("fields")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        bVarArr2[i2] = a(jSONArray.getJSONObject(i2));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b = b(string);
                boolean optBoolean = jSONObject.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
                d a2 = d.a(jSONObject.getString("textCapitalization"));
                c a3 = c.a(jSONObject.getJSONObject("inputType"));
                String string2 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                if (!jSONObject.isNull("autofill")) {
                    aVar = a.a(jSONObject.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a2, a3, b, string2, aVar, bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static Integer b(String str) {
            str.hashCode();
            char c = 1;
            switch (str.hashCode()) {
                case -810971940:
                    if (str.equals("TextInputAction.unspecified")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -737377923:
                    break;
                case -737089298:
                    if (str.equals("TextInputAction.next")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -737080013:
                    if (str.equals("TextInputAction.none")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -736940669:
                    if (str.equals("TextInputAction.send")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 469250275:
                    if (str.equals("TextInputAction.search")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1241689507:
                    if (str.equals("TextInputAction.go")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1539450297:
                    if (str.equals("TextInputAction.newline")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2110497650:
                    if (str.equals("TextInputAction.previous")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 0;
                case 1:
                    return 6;
                case 2:
                    return 5;
                case 3:
                    return 1;
                case 4:
                    return 4;
                case 5:
                    return 3;
                case 6:
                    return 2;
                case 7:
                    return 1;
                case '\b':
                    return 7;
                default:
                    return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final g a;
        public final boolean b;
        public final boolean c;

        public c(g gVar, boolean z, boolean z2) {
            this.a = gVar;
            this.b = z;
            this.c = z2;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.a(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3117e;

        d(String str) {
            this.f3117e = str;
        }

        static d a(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.f3117e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final String a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3118d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3119e;

        public e(String str, int i2, int i3, int i4, int i5) {
            if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
            } else if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
            } else if (i5 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
            } else if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
            } else if (i3 <= str.length()) {
                this.a = str;
                this.b = i2;
                this.c = i3;
                this.f3118d = i4;
                this.f3119e = i5;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i2 = this.f3118d;
            return i2 >= 0 && this.f3119e > i2;
        }

        public boolean c() {
            return this.b >= 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b(String str, Bundle bundle);

        void c();

        void d(int i2);

        void e(double d2, double d3, double[] dArr);

        void f();

        void g(int i2, b bVar);

        void h(boolean z);

        void i();

        void j(e eVar);
    }

    /* loaded from: classes.dex */
    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3126e;

        g(String str) {
            this.f3126e = str;
        }

        static g a(String str) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.f3126e.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public n(io.flutter.embedding.engine.f.d dVar) {
        a aVar = new a();
        this.c = aVar;
        k kVar = new k(dVar, "flutter/textinput", h.a.d.a.g.a);
        this.a = kVar;
        kVar.e(aVar);
    }

    private static HashMap<Object, Object> b(ArrayList<io.flutter.plugin.editing.d> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.d> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> c(String str, int i2, int i3, int i4, int i5) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public void d(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'done' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.done"));
    }

    public void e(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'go' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.go"));
    }

    public void f(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'newline' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.newline"));
    }

    public void g(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'next' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.next"));
    }

    public void h(int i2, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i2), hashMap));
    }

    public void i(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'previous' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.previous"));
    }

    public void j() {
        this.a.c("TextInputClient.requestExistingInputState", null);
    }

    public void k(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'search' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.search"));
    }

    public void l(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'send' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.send"));
    }

    public void m(f fVar) {
        this.b = fVar;
    }

    public void n(int i2) {
        h.a.b.e("TextInputChannel", "Sending 'unspecified' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.unspecified"));
    }

    public void o(int i2, String str, int i3, int i4, int i5, int i6) {
        h.a.b.e("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i3 + "\nSelection end: " + i4 + "\nComposing start: " + i5 + "\nComposing end: " + i6);
        this.a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i2), c(str, i3, i4, i5, i6)));
    }

    public void p(int i2, ArrayList<io.flutter.plugin.editing.d> arrayList) {
        h.a.b.e("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), b(arrayList)));
    }

    public void q(int i2, HashMap<String, e> hashMap) {
        h.a.b.e("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, e> entry : hashMap.entrySet()) {
            e value = entry.getValue();
            hashMap2.put(entry.getKey(), c(value.a, value.b, value.c, -1, -1));
        }
        this.a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i2), hashMap2));
    }
}
