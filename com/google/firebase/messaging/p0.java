package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class p0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f1820e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Future<?> f1821f;

    /* renamed from: g  reason: collision with root package name */
    private i<Bitmap> f1822g;

    private p0(URL url) {
        this.f1820e = url;
    }

    private byte[] c() {
        URLConnection openConnection = this.f1820e.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d2 = g0.d(g0.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d2.length + " bytes from " + this.f1820e);
                }
                if (d2.length <= 1048576) {
                    return d2;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
    }

    public static p0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new p0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(j jVar) {
        try {
            jVar.c(b());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f1820e);
        }
        byte[] c = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f1820e);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f1820e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1821f.cancel(true);
    }

    public i<Bitmap> f() {
        i<Bitmap> iVar = this.f1822g;
        p.i(iVar);
        return iVar;
    }

    public void l(ExecutorService executorService) {
        final j jVar = new j();
        this.f1821f = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.i(jVar);
            }
        });
        this.f1822g = jVar.a();
    }
}
