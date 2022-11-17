package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import j.c0.n;
import j.x.d.i;
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        boolean z;
        boolean z2;
        boolean r;
        boolean z3;
        boolean r2;
        boolean z4;
        Object obj;
        int i2;
        String str2;
        boolean z5;
        CharSequence charSequence;
        boolean r3;
        boolean z6;
        boolean r4;
        int A;
        int A2;
        int A3;
        int A4;
        i.d(componentName, "primaryActivityName");
        i.d(componentName2, "secondaryActivityName");
        this.primaryActivityName = componentName;
        this.secondaryActivityName = componentName2;
        this.secondaryActivityIntentAction = str;
        String packageName = componentName.getPackageName();
        i.c(packageName, "primaryActivityName.packageName");
        String className = componentName.getClassName();
        i.c(className, "primaryActivityName.className");
        String packageName2 = componentName2.getPackageName();
        i.c(packageName2, "secondaryActivityName.packageName");
        String className2 = componentName2.getClassName();
        i.c(className2, "secondaryActivityName.className");
        boolean z7 = true;
        if (!(packageName.length() == 0)) {
            if (!(packageName2.length() == 0)) {
                z = true;
                if (!z) {
                    if (!(className.length() == 0)) {
                        if (!(className2.length() == 0)) {
                            z2 = true;
                            if (!z2) {
                                r = n.r(packageName, "*", false, 2, null);
                                if (r) {
                                    A4 = n.A(packageName, "*", 0, false, 6, null);
                                    if (A4 != packageName.length() - 1) {
                                        z3 = false;
                                        if (!z3) {
                                            r2 = n.r(className, "*", false, 2, null);
                                            if (r2) {
                                                obj = null;
                                                i2 = 2;
                                                charSequence = "*";
                                                z5 = false;
                                                str2 = className2;
                                                A3 = n.A(className, "*", 0, false, 6, null);
                                                if (A3 != className.length() - 1) {
                                                    z4 = false;
                                                    if (!z4) {
                                                        r3 = n.r(packageName2, charSequence, z5, i2, obj);
                                                        if (r3) {
                                                            A2 = n.A(packageName2, "*", 0, false, 6, null);
                                                            if (A2 != packageName2.length() - 1) {
                                                                z6 = false;
                                                                if (!z6) {
                                                                    r4 = n.r(str2, charSequence, z5, i2, obj);
                                                                    if (r4) {
                                                                        A = n.A(str2, "*", 0, false, 6, null);
                                                                        if (A != str2.length() - 1) {
                                                                            z7 = false;
                                                                        }
                                                                    }
                                                                    if (!z7) {
                                                                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                                                    }
                                                                    return;
                                                                }
                                                                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                                                            }
                                                        }
                                                        z6 = true;
                                                        if (!z6) {
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                                    }
                                                }
                                            } else {
                                                obj = null;
                                                charSequence = "*";
                                                str2 = className2;
                                                z5 = false;
                                                i2 = 2;
                                            }
                                            z4 = true;
                                            if (!z4) {
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                                        }
                                    }
                                }
                                z3 = true;
                                if (!z3) {
                                }
                            } else {
                                throw new IllegalArgumentException("Activity class name must not be empty.".toString());
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                } else {
                    throw new IllegalArgumentException("Package name must not be empty".toString());
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return i.a(this.primaryActivityName, splitPairFilter.primaryActivityName) && i.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && i.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        i.d(activity, "primaryActivity");
        i.d(intent, "secondaryActivityIntent");
        ComponentName componentName = activity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || i.a(str, intent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (matchesActivityIntentPair(r6, r7) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matchesActivityPair(Activity activity, Activity activity2) {
        i.d(activity, "primaryActivity");
        i.d(activity2, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z = true;
        boolean z2 = matcherUtils.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        if (activity2.getIntent() == null) {
            return z2;
        }
        if (z2) {
            Intent intent = activity2.getIntent();
            i.c(intent, "secondaryActivity.intent");
        }
        z = false;
        return z;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
