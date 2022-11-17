package h.a.d.a;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final Object b;

    public j(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.b;
    }

    public boolean c(String str) {
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
