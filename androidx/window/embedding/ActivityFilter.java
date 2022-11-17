package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import j.c0.n;
import j.x.d.i;
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActivityFilter(ComponentName componentName, String str) {
        boolean r;
        boolean z;
        boolean r2;
        int A;
        int A2;
        i.d(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        i.c(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        i.c(className, "componentName.className");
        boolean z2 = true;
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                r = n.r(packageName, "*", false, 2, null);
                if (r) {
                    A2 = n.A(packageName, "*", 0, false, 6, null);
                    if (A2 != packageName.length() - 1) {
                        z = false;
                        if (!z) {
                            r2 = n.r(className, "*", false, 2, null);
                            if (r2) {
                                A = n.A(className, "*", 0, false, 6, null);
                                if (A != className.length() - 1) {
                                    z2 = false;
                                }
                            }
                            if (!z2) {
                                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                    }
                }
                z = true;
                if (!z) {
                }
            } else {
                throw new IllegalArgumentException("Activity class name must not be empty.".toString());
            }
        } else {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return i.a(this.componentName, activityFilter.componentName) && i.a(this.intentAction, activityFilter.intentAction);
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        i.d(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (i.a(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        i.d(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || i.a(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
