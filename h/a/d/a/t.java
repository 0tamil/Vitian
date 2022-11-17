package h.a.d.a;

import h.a.d.a.s;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class t implements l {
    public static final t b = new t(s.a);
    private final s a;

    public t(s sVar) {
        this.a = sVar;
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // h.a.d.a.l
    public ByteBuffer a(Object obj) {
        s.a aVar = new s.a();
        aVar.write(0);
        this.a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // h.a.d.a.l
    public j b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f2 = this.a.f(byteBuffer);
        Object f3 = this.a.f(byteBuffer);
        if ((f2 instanceof String) && !byteBuffer.hasRemaining()) {
            return new j((String) f2, f3);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L9;
     */
    @Override // h.a.d.a.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object f2 = this.a.f(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return f2;
            }
        }
        Object f3 = this.a.f(byteBuffer);
        Object f4 = this.a.f(byteBuffer);
        Object f5 = this.a.f(byteBuffer);
        if ((f3 instanceof String) && ((f4 == null || (f4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new e((String) f3, (String) f4, f5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // h.a.d.a.l
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        s.a aVar = new s.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, g((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        this.a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // h.a.d.a.l
    public ByteBuffer e(j jVar) {
        s.a aVar = new s.a();
        this.a.p(aVar, jVar.a);
        this.a.p(aVar, jVar.b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // h.a.d.a.l
    public ByteBuffer f(String str, String str2, Object obj) {
        s.a aVar = new s.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, g((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }
}
