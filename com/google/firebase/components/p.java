package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class p<T> {
    private final T a;
    private final c<T> b;

    /* loaded from: classes.dex */
    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    interface c<T> {
        List<String> a(T t);
    }

    p(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static p<Context> b(Context context, Class<? extends Service> cls) {
        return new p<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (r.class.isAssignableFrom(cls)) {
                return (r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new y(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new y(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new y(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new y(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new y(String.format("Could not instantiate %s", str), e5);
        }
    }

    public List<com.google.firebase.q.b<r>> a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new com.google.firebase.q.b() { // from class: com.google.firebase.components.c
                @Override // com.google.firebase.q.b
                public final Object a() {
                    r c2;
                    c2 = p.c(str);
                    return c2;
                }
            });
        }
        return arrayList;
    }
}
