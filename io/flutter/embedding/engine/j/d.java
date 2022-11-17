package io.flutter.embedding.engine.j;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import h.a.d.a.b;
import h.a.d.a.f;
import io.flutter.embedding.engine.j.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    public final h.a.d.a.b<Object> a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public static class b {
        public final KeyEvent a;
        public final Character b;

        public b(KeyEvent keyEvent, Character ch) {
            this.a = keyEvent;
            this.b = ch;
        }
    }

    public d(h.a.d.a.d dVar) {
        this.a = new h.a.d.a.b<>(dVar, "flutter/keyevent", f.a);
    }

    private static b.e<Object> a(final a aVar) {
        return new b.e() { // from class: io.flutter.embedding.engine.j.a
            @Override // h.a.d.a.b.e
            public final void a(Object obj) {
                d.c(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> b(b bVar, boolean z) {
        int i2;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.a.getFlags()));
        int i3 = 0;
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.a.getMetaState()));
        Character ch = bVar.b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.a.getSource()));
        InputDevice device = InputDevice.getDevice(bVar.a.getDeviceId());
        if (device == null || Build.VERSION.SDK_INT < 19) {
            i2 = 0;
        } else {
            i3 = device.getVendorId();
            i2 = device.getProductId();
        }
        hashMap.put("vendorId", Integer.valueOf(i3));
        hashMap.put("productId", Integer.valueOf(i2));
        hashMap.put("deviceId", Integer.valueOf(bVar.a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                h.a.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        aVar.a(z);
    }

    public void d(b bVar, boolean z, a aVar) {
        this.a.d(b(bVar, z), a(aVar));
    }
}
