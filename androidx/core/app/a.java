package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a extends androidx.core.content.a {

    /* renamed from: d  reason: collision with root package name */
    private static d f540d;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0013a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String[] f541e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f542f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f543g;

        RunnableC0013a(String[] strArr, Activity activity, int i2) {
            this.f541e = strArr;
            this.f542f = activity;
            this.f543g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f541e.length];
            PackageManager packageManager = this.f542f.getPackageManager();
            String packageName = this.f542f.getPackageName();
            int length = this.f541e.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f541e[i2], packageName);
            }
            ((c) this.f542f).onRequestPermissionsResult(this.f543g, this.f541e, iArr);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Activity f544e;

        b(Activity activity) {
            this.f544e = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f544e.isFinishing() && !androidx.core.app.c.i(this.f544e)) {
                this.f544e.recreate();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    /* loaded from: classes.dex */
    public interface e {
        void b(int i2);
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void o(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 <= 23) {
                new Handler(activity.getMainLooper()).post(new b(activity));
                return;
            } else if (androidx.core.app.c.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    public static void p(Activity activity, String[] strArr, int i2) {
        d dVar = f540d;
        if (dVar == null || !dVar.a(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).b(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0013a(strArr, activity, i2));
            }
        }
    }

    public static boolean q(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void r(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void s(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }
}
