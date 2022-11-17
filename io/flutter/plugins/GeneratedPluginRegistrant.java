package io.flutter.plugins;

import androidx.annotation.Keep;
import com.crazecoder.openfile.a;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.wongpiwat.trust_location.TrustLocationPlugin;
import f.c.a.d;
import f.e.a.c;
import f.f.a.e;
import io.flutter.embedding.engine.b;
import io.flutter.plugins.firebase.core.k;
import io.flutter.plugins.firebase.crashlytics.n;
import io.flutter.plugins.firebase.messaging.q;
@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(b bVar) {
        try {
            bVar.p().f(new k());
        } catch (Exception e2) {
            h.a.b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e2);
        }
        try {
            bVar.p().f(new n());
        } catch (Exception e3) {
            h.a.b.c(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e3);
        }
        try {
            bVar.p().f(new q());
        } catch (Exception e4) {
            h.a.b.c(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e4);
        }
        try {
            bVar.p().f(new FlutterLocalNotificationsPlugin());
        } catch (Exception e5) {
            h.a.b.c(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e5);
        }
        try {
            bVar.p().f(new d());
        } catch (Exception e6) {
            h.a.b.c(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e6);
        }
        try {
            bVar.p().f(new a());
        } catch (Exception e7) {
            h.a.b.c(TAG, "Error registering plugin open_file, com.crazecoder.openfile.OpenFilePlugin", e7);
        }
        try {
            bVar.p().f(new g.a.a.a.a());
        } catch (Exception e8) {
            h.a.b.c(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e8);
        }
        try {
            bVar.p().f(new io.flutter.plugins.a.a());
        } catch (Exception e9) {
            h.a.b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e9);
        }
        try {
            bVar.p().f(new e());
        } catch (Exception e10) {
            h.a.b.c(TAG, "Error registering plugin safe_device, com.xamdesign.safe_device.SafeDevicePlugin", e10);
        }
        try {
            bVar.p().f(new io.flutter.plugins.b.b());
        } catch (Exception e11) {
            h.a.b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e11);
        }
        try {
            bVar.p().f(new c());
        } catch (Exception e12) {
            h.a.b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e12);
        }
        try {
            bVar.p().f(new f.a.a.a());
        } catch (Exception e13) {
            h.a.b.c(TAG, "Error registering plugin store_redirect, com.danieldallos.storeredirect.StoreRedirectPlugin", e13);
        }
        try {
            bVar.p().f(new TrustLocationPlugin());
        } catch (Exception e14) {
            h.a.b.c(TAG, "Error registering plugin trust_location, com.wongpiwat.trust_location.TrustLocationPlugin", e14);
        }
        try {
            bVar.p().f(new io.flutter.plugins.urllauncher.c());
        } catch (Exception e15) {
            h.a.b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e15);
        }
    }
}
