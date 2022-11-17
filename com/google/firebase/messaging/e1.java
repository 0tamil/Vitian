package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.o;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class e1 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f1741d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String a;
    private final String b;
    private final String c;

    private e1(@TopicOperation.TopicOperations String str, String str2) {
        this.a = d(str2, str);
        this.b = str;
        this.c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new e1(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f1741d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public static e1 f(String str) {
        return new e1("S", str);
    }

    public static e1 g(String str) {
        return new e1("U", str);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.a.equals(e1Var.a) && this.b.equals(e1Var.b);
    }

    public int hashCode() {
        return o.b(this.b, this.a);
    }
}
