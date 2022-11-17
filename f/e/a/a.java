package f.e.a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {
    final boolean a;
    final String b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final int f2810d;

    /* renamed from: e  reason: collision with root package name */
    SQLiteDatabase f2811e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2812f;

    /* renamed from: f.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0112a implements DatabaseErrorHandler {
        C0112a(a aVar) {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, int i2, boolean z, int i3) {
        this.b = str;
        this.a = z;
        this.c = i2;
        this.f2810d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void a() {
        this.f2811e.close();
    }

    public SQLiteDatabase c() {
        return this.f2811e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return "[" + e() + "] ";
    }

    String e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase f() {
        return this.f2811e;
    }

    public void g() {
        this.f2811e = SQLiteDatabase.openDatabase(this.b, null, 268435456);
    }

    public void h() {
        this.f2811e = SQLiteDatabase.openDatabase(this.b, null, 1, new C0112a(this));
    }
}
