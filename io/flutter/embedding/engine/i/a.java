package io.flutter.embedding.engine.i;

import android.content.Context;
import h.a.d.a.d;
import io.flutter.view.h;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: io.flutter.embedding.engine.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0128a {
    }

    /* loaded from: classes.dex */
    public static class b {
        private final Context a;
        private final d b;

        public b(Context context, io.flutter.embedding.engine.b bVar, d dVar, h hVar, h.a.d.d.h hVar2, AbstractC0128a aVar) {
            this.a = context;
            this.b = dVar;
        }

        public Context a() {
            return this.a;
        }

        public d b() {
            return this.b;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
