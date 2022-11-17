package kotlinx.coroutines;

import kotlinx.coroutines.internal.z;
/* loaded from: classes.dex */
public final class v1 {
    private static final z a = new z("COMPLETING_ALREADY");
    public static final z b = new z("COMPLETING_WAITING_CHILDREN");
    private static final z c = new z("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    private static final z f3933d = new z("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    private static final z f3934e = new z("SEALED");

    /* renamed from: f  reason: collision with root package name */
    private static final x0 f3935f = new x0(false);

    /* renamed from: g  reason: collision with root package name */
    private static final x0 f3936g = new x0(true);

    public static final Object g(Object obj) {
        return obj instanceof i1 ? new j1((i1) obj) : obj;
    }
}
