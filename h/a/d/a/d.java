package h.a.d.a;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: h.a.d.a.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0120d {
        private boolean a = true;

        public boolean a() {
            return this.a;
        }
    }

    c a(C0120d dVar);

    void b(String str, ByteBuffer byteBuffer, b bVar);

    void d(String str, a aVar);

    c e();

    void g(String str, a aVar, c cVar);
}
