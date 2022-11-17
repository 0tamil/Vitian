package io.flutter.embedding.engine.j;

import h.a.d.a.b;
import h.a.d.a.s;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.f.d;
import io.flutter.view.c;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {
    public final h.a.d.a.b<Object> a;
    public final FlutterJNI b;
    private AbstractC0129b c;

    /* renamed from: d  reason: collision with root package name */
    final b.d<Object> f3035d;

    /* loaded from: classes.dex */
    class a implements b.d<Object> {
        a() {
        }

        @Override // h.a.d.a.b.d
        public void a(Object obj, b.e<Object> eVar) {
            if (b.this.c == null) {
                eVar.a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            h.a.b.e("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        b.this.c.c(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        b.this.c.e(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        b.this.c.f(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        b.this.c.d(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* renamed from: io.flutter.embedding.engine.j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0129b extends FlutterJNI.a {
        void c(String str);

        void d(int i2);

        void e(String str);

        void f(int i2);
    }

    public b(d dVar, FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f3035d = aVar;
        h.a.d.a.b<Object> bVar = new h.a.d.a.b<>(dVar, "flutter/accessibility", s.a);
        this.a = bVar;
        bVar.e(aVar);
        this.b = flutterJNI;
    }

    public void b(int i2, c.g gVar) {
        this.b.dispatchSemanticsAction(i2, gVar);
    }

    public void c(int i2, c.g gVar, Object obj) {
        this.b.dispatchSemanticsAction(i2, gVar, obj);
    }

    public void d() {
        this.b.setSemanticsEnabled(false);
    }

    public void e() {
        this.b.setSemanticsEnabled(true);
    }

    public void f(int i2) {
        this.b.setAccessibilityFeatures(i2);
    }

    public void g(AbstractC0129b bVar) {
        this.c = bVar;
        this.b.setAccessibilityDelegate(bVar);
    }
}
