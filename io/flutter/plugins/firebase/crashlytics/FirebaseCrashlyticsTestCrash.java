package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class FirebaseCrashlyticsTestCrash extends RuntimeException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}
