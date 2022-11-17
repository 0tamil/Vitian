package f.b.b.a.z.a;

import java.io.IOException;
/* loaded from: classes.dex */
public class c0 extends IOException {

    /* renamed from: e  reason: collision with root package name */
    private s0 f2498e;

    /* loaded from: classes.dex */
    public static class a extends c0 {
        public a(String str) {
            super(str);
        }
    }

    public c0(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 a() {
        return new c0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 b() {
        return new c0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 c() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 e() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 f() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 g() {
        return new c0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 h() {
        return new c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 j() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public c0 i(s0 s0Var) {
        this.f2498e = s0Var;
        return this;
    }
}
