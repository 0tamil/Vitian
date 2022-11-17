package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class k implements e {
    private final a a;
    private final i b;
    private final Map<String, m> c;

    /* loaded from: classes.dex */
    static class a {
        private final Context a;
        private Map<String, String> b = null;

        a(Context context) {
            this.a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d2 = d(context);
            if (d2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d2.keySet()) {
                Object obj = d2.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2;
            Throwable e2;
            String str3;
            Throwable e3;
            String str4 = c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e4) {
                e2 = e4;
                str2 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str2, e2);
                return null;
            } catch (IllegalAccessException e5) {
                e2 = e5;
                str2 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str2, e2);
                return null;
            } catch (InstantiationException e6) {
                e2 = e6;
                str2 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str2, e2);
                return null;
            } catch (NoSuchMethodException e7) {
                e3 = e7;
                str3 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str3, e3);
                return null;
            } catch (InvocationTargetException e8) {
                e3 = e8;
                str3 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str3, e3);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    k(a aVar, i iVar) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = iVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public synchronized m a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        d b = this.a.b(str);
        if (b == null) {
            return null;
        }
        m create = b.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }
}
