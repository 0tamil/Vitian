package com.google.firebase.crashlytics.i.p;

import com.google.firebase.crashlytics.i.j.n;
import com.google.firebase.crashlytics.i.n.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private final File a;

    public a(f fVar) {
        this.a = fVar.d("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.i.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a = a();
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                    try {
                        jSONObject = new JSONObject(n.C(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e3) {
                        e2 = e3;
                        com.google.firebase.crashlytics.i.f.f().e("Failed to fetch cached settings", e2);
                        n.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    com.google.firebase.crashlytics.i.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                n.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                n.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            n.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j2, JSONObject jSONObject) {
        Throwable th;
        Exception e2;
        FileWriter fileWriter;
        com.google.firebase.crashlytics.i.f.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j2);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e2 = e3;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                n.e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e4) {
                e2 = e4;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.i.f.f().e("Failed to cache settings", e2);
                n.e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                n.e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
