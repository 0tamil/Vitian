package io.flutter.plugins.firebase.messaging;

import android.content.SharedPreferences;
import com.google.firebase.messaging.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class r {
    private static r b;
    private SharedPreferences a;

    public static r b() {
        if (b == null) {
            b = new r();
        }
        return b;
    }

    private SharedPreferences c() {
        if (this.a == null) {
            this.a = o.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.a;
    }

    private Map<String, Object> f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public w0 a(String str) {
        String d2 = d(str, null);
        if (d2 != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map<String, Object> f2 = f(new JSONObject(d2));
                f2.put("to", str);
                hashMap.put("message", f2);
                return s.b(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str, String str2) {
        return c().getString(str, str2);
    }

    public List<Object> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public void g(String str) {
        c().edit().remove(str).apply();
        String d2 = d("notification_ids", "");
        if (!d2.isEmpty()) {
            h("notification_ids", d2.replace(str + ",", ""));
        }
    }

    public void h(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }

    public void i(w0 w0Var) {
        h(w0Var.e(), new JSONObject(s.e(w0Var)).toString());
        String str = d("notification_ids", "") + w0Var.e() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 20) {
            String str2 = (String) arrayList.get(0);
            c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", "");
        }
        h("notification_ids", str);
    }
}
