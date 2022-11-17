package com.crazecoder.openfile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.crazecoder.openfile.b.b;
import e.a.j;
import h.a.d.a.k;
import h.a.d.a.m;
import h.a.d.a.p;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class a implements k.c, io.flutter.embedding.engine.i.a, io.flutter.embedding.engine.i.c.a, p, m {

    /* renamed from: e  reason: collision with root package name */
    private a.b f903e;

    /* renamed from: f  reason: collision with root package name */
    private Context f904f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f905g;

    /* renamed from: h  reason: collision with root package name */
    private k f906h;

    /* renamed from: i  reason: collision with root package name */
    private k.d f907i;

    /* renamed from: j  reason: collision with root package name */
    private String f908j;

    /* renamed from: k  reason: collision with root package name */
    private String f909k;
    private boolean l = false;

    private boolean b() {
        return Build.VERSION.SDK_INT >= 26 ? this.f905g.getPackageManager().canRequestPackageInstalls() : d("android.permission.REQUEST_INSTALL_PACKAGES");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b7, code lost:
        if (r9.equals("c") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String c(String str) {
        String[] split = str.split("\\.");
        char c = 1;
        String lowerCase = split[split.length - 1].toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1137141488:
                if (lowerCase.equals("torrent")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 99:
                break;
            case 104:
                if (lowerCase.equals("h")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case j.E0 /* 122 */:
                if (lowerCase.equals("z")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3315:
                if (lowerCase.equals("gz")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3401:
                if (lowerCase.equals("js")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (lowerCase.equals("rc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 52316:
                if (lowerCase.equals("3gp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 96796:
                if (lowerCase.equals("apk")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 96884:
                if (lowerCase.equals("asf")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 96980:
                if (lowerCase.equals("avi")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 97543:
                if (lowerCase.equals("bin")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 97669:
                if (lowerCase.equals("bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 98723:
                if (lowerCase.equals("cpp")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 100882:
                if (lowerCase.equals("exe")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 102340:
                if (lowerCase.equals("gif")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 102575:
                if (lowerCase.equals("gpx")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 103649:
                if (lowerCase.equals("htm")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 104987:
                if (lowerCase.equals("jar")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 105441:
                if (lowerCase.equals("jpg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 106314:
                if (lowerCase.equals("kml")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 106447:
                if (lowerCase.equals("m3u")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 106459:
                if (lowerCase.equals("m4b")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 106473:
                if (lowerCase.equals("m4p")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 106478:
                if (lowerCase.equals("m4u")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 106479:
                if (lowerCase.equals("m4v")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (lowerCase.equals("log")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 108271:
                if (lowerCase.equals("mp2")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 108308:
                if (lowerCase.equals("mov")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 108320:
                if (lowerCase.equals("mpc")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 108322:
                if (lowerCase.equals("mpe")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 108324:
                if (lowerCase.equals("mpg")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 108417:
                if (lowerCase.equals("msg")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 109967:
                if (lowerCase.equals("ogg")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 111219:
                if (lowerCase.equals("pps")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 114597:
                if (lowerCase.equals("tar")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 114791:
                if (lowerCase.equals("tgz")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 117856:
                if (lowerCase.equals("wmv")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 117946:
                if (lowerCase.equals("wps")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 118807:
                if (lowerCase.equals("xml")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 120609:
                if (lowerCase.equals("zip")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 3059492:
                if (lowerCase.equals("conf")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 3183070:
                if (lowerCase.equals("gtar")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 3213227:
                if (lowerCase.equals("html")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 3254818:
                if (lowerCase.equals("java")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 3358085:
                if (lowerCase.equals("mpeg")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 3358096:
                if (lowerCase.equals("mpg4")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 3358141:
                if (lowerCase.equals("mpga")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 3449699:
                if (lowerCase.equals("prop")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 3504679:
                if (lowerCase.equals("rmvb")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 94742904:
                if (lowerCase.equals("class")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "application/x-bittorrent";
            case 1:
            case 2:
                return "text/plain";
            case 3:
                return "application/x-compress";
            case 4:
                return "application/x-gzip";
            case 5:
                return "application/x-javascript";
            case 6:
            case 7:
                return "text/plain";
            case '\b':
                return "video/3gpp";
            case '\t':
                return "application/vnd.android.package-archive";
            case '\n':
                return "video/x-ms-asf";
            case 11:
                return "video/x-msvideo";
            case '\f':
            case 17:
            case 'D':
                return "application/octet-stream";
            case '\r':
                return "image/bmp";
            case 14:
                return "text/plain";
            case 15:
            case '4':
                return "application/vnd.ms-excel";
            case 16:
                return "application/msword";
            case 18:
                return "image/gif";
            case 19:
                return "application/gpx+xml";
            case 20:
                return "text/html";
            case 21:
                return "application/java-archive";
            case 22:
                return "image/jpeg";
            case j.b3 /* 23 */:
                return "application/vnd.google-earth.kml+xml";
            case j.c3 /* 24 */:
                return "audio/x-mpegurl";
            case 25:
            case 26:
            case 27:
                return "audio/mp4a-latm";
            case 28:
                return "video/vnd.mpegurl";
            case j.h3 /* 29 */:
                return "video/x-m4v";
            case 30:
                return "text/plain";
            case 31:
            case ' ':
                return "audio/x-mpeg";
            case '!':
                return "video/mp4";
            case '\"':
                return "video/quicktime";
            case '#':
                return "application/vnd.mpohun.certificate";
            case '$':
            case '%':
                return "video/mpeg";
            case '&':
                return "application/vnd.ms-outlook";
            case '\'':
                return "audio/ogg";
            case '(':
                return "application/pdf";
            case ')':
                return "image/png";
            case '*':
            case '+':
                return "application/vnd.ms-powerpoint";
            case ',':
                return "application/rtf";
            case '-':
                return "application/x-tar";
            case '.':
                return "application/x-compressed";
            case '/':
                return "text/plain";
            case '0':
                return "audio/x-wav";
            case '1':
                return "audio/x-ms-wma";
            case '2':
                return "audio/x-ms-wmv";
            case '3':
                return "application/vnd.ms-works";
            case '5':
                return "text/plain";
            case '6':
                return "application/x-zip-compressed";
            case '7':
                return "text/plain";
            case '8':
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case '9':
                return "application/x-gtar";
            case ':':
                return "text/html";
            case ';':
                return "text/plain";
            case '<':
                return "image/jpeg";
            case '=':
                return "video/mpeg";
            case '>':
                return "video/mp4";
            case '?':
                return "audio/mpeg";
            case '@':
                return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
            case 'A':
                return "text/plain";
            case 'B':
                return "audio/x-pn-realaudio";
            case 'C':
                return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            default:
                return "*/*";
        }
    }

    private boolean d(String str) {
        return androidx.core.content.a.a(this.f905g, str) == 0;
    }

    private void e() {
        if (b()) {
            h();
        } else if (Build.VERSION.SDK_INT >= 26) {
            i();
        } else {
            androidx.core.app.a.p(this.f905g, new String[]{"android.permission.REQUEST_INSTALL_PACKAGES"}, 33432);
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            return true ^ new File(this.f908j).getCanonicalPath().startsWith(new File(this.f904f.getApplicationInfo().dataDir).getCanonicalPath());
        } catch (IOException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private void g(int i2, String str) {
        if (this.f907i != null && !this.l) {
            this.f907i.b(com.crazecoder.openfile.b.a.a(b.a(i2, str)));
            this.l = true;
        }
    }

    private void h() {
        Uri uri;
        String str;
        int i2 = -4;
        if (this.f908j == null) {
            g(-4, "the file path cannot be null");
            return;
        }
        File file = new File(this.f908j);
        if (!file.exists()) {
            g(-2, "the " + this.f908j + " file does not exists");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags("application/vnd.android.package-archive".equals(this.f909k) ? 268435456 : 536870912);
        intent.addCategory("android.intent.category.DEFAULT");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            String packageName = this.f904f.getPackageName();
            Context context = this.f904f;
            uri = FileProvider.e(context, packageName + ".fileProvider.com.crazecoder.openfile", new File(this.f908j));
        } else {
            uri = Uri.fromFile(file);
        }
        intent.setDataAndType(uri, this.f909k);
        try {
            this.f905g.startActivity(intent);
            str = "done";
            i2 = 0;
        } catch (ActivityNotFoundException unused) {
            i2 = -1;
            str = "No APP found to open this file。";
        } catch (Exception unused2) {
            str = "File opened incorrectly。";
        }
        g(i2, str);
    }

    private void i() {
        if (this.f905g != null) {
            this.f905g.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.f905g.getPackageName())), 18);
        }
    }

    @Override // h.a.d.a.m
    public boolean a(int i2, int i3, Intent intent) {
        if (i2 != 18) {
            return false;
        }
        if (b()) {
            h();
            return false;
        }
        g(-3, "Permission denied: android.permission.REQUEST_INSTALL_PACKAGES");
        return false;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(c cVar) {
        this.f906h = new k(this.f903e.b(), "open_file");
        this.f904f = this.f903e.a();
        this.f905g = cVar.d();
        this.f906h.e(this);
        cVar.c(this);
        cVar.a(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        this.f903e = bVar;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        k kVar = this.f906h;
        if (kVar != null) {
            kVar.e(null);
            this.f906h = null;
            this.f903e = null;
        }
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
    }

    @Override // h.a.d.a.k.c
    @SuppressLint({"NewApi"})
    public void onMethodCall(h.a.d.a.j jVar, k.d dVar) {
        this.l = false;
        if (jVar.a.equals("open_file")) {
            this.f908j = (String) jVar.a("file_path");
            this.f907i = dVar;
            this.f909k = (!jVar.c("type") || jVar.a("type") == null) ? c(this.f908j) : (String) jVar.a("type");
            if (f()) {
                if (!d("android.permission.READ_EXTERNAL_STORAGE")) {
                    androidx.core.app.a.p(this.f905g, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 33432);
                    return;
                } else if ("application/vnd.android.package-archive".equals(this.f909k)) {
                    e();
                    return;
                }
            }
            h();
            return;
        }
        dVar.c();
        this.l = true;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }

    @Override // h.a.d.a.p
    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 33432) {
            return false;
        }
        if (!d("android.permission.READ_EXTERNAL_STORAGE") || !"application/vnd.android.package-archive".equals(this.f909k)) {
            for (String str : strArr) {
                if (!d(str)) {
                    g(-3, "Permission denied: " + str);
                    return false;
                }
            }
            h();
            return true;
        }
        e();
        return false;
    }
}
