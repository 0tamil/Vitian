package io.flutter.embedding.engine.j;

import h.a.d.a.j;
import h.a.d.a.k;
import h.a.d.a.t;
import io.flutter.embedding.engine.f.d;
import java.util.HashMap;
/* loaded from: classes.dex */
public class g {
    public final k a;
    private b b;
    private final k.c c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        @Override // h.a.d.a.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onMethodCall(j jVar, k.d dVar) {
            if (g.this.b != null) {
                String str = jVar.a;
                h.a.b.e("MouseCursorChannel", "Received '" + str + "' message.");
                char c = 65535;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        c = 0;
                    }
                    try {
                        g.this.b.a((String) ((HashMap) jVar.b).get("kind"));
                        dVar.b(Boolean.TRUE);
                    } catch (Exception e2) {
                        dVar.a("error", "Error when setting cursors: " + e2.getMessage(), null);
                    }
                } catch (Exception e3) {
                    dVar.a("error", "Unhandled error: " + e3.getMessage(), null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    public g(d dVar) {
        a aVar = new a();
        this.c = aVar;
        k kVar = new k(dVar, "flutter/mousecursor", t.b);
        this.a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
