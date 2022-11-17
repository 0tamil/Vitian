package e.k.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import f.b.b.a.g;
import f.b.b.a.i;
import f.b.b.a.t.f;
import f.b.b.a.v.a.a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a implements SharedPreferences {
    final SharedPreferences a;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> b = new ArrayList();
    final String c;

    /* renamed from: d  reason: collision with root package name */
    final f.b.b.a.a f2170d;

    /* renamed from: e  reason: collision with root package name */
    final f.b.b.a.d f2171e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.k.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0083a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {
        private final a a;
        private final SharedPreferences.Editor b;

        /* renamed from: d  reason: collision with root package name */
        private AtomicBoolean f2172d = new AtomicBoolean(false);
        private final List<String> c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.a = aVar;
            this.b = editor;
        }

        private void a() {
            if (this.f2172d.getAndSet(false)) {
                for (String str : this.a.getAll().keySet()) {
                    if (!this.c.contains(str) && !this.a.g(str)) {
                        this.b.remove(this.a.d(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.a.b) {
                for (String str : this.c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.a, str);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (!this.a.g(str)) {
                this.c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e2 = this.a.e(str, bArr);
                    this.b.putString((String) e2.first, (String) e2.second);
                } catch (GeneralSecurityException e3) {
                    throw new SecurityException("Could not encrypt data: " + e3.getMessage(), e3);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f2172d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                this.c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.c());
            allocate.put(z ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.c());
            allocate.putFloat(f2);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.c());
            allocate.putInt(i2);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.c());
            allocate.putLong(j2);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.c());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new e.c.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.a.g(str)) {
                this.b.remove(this.a.d(str));
                this.c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2179e;

        c(int i2) {
            this.f2179e = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return STRING_SET;
            }
            if (i2 == 2) {
                return INT;
            }
            if (i2 == 3) {
                return LONG;
            }
            if (i2 == 4) {
                return FLOAT;
            }
            if (i2 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.f2179e;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV(f.b.b.a.u.a.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f2182e;

        d(g gVar) {
            this.f2182e = gVar;
        }

        g a() {
            return this.f2182e;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM(f.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f2185e;

        e(g gVar) {
            this.f2185e = gVar;
        }

        g a() {
            return this.f2185e;
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, f.b.b.a.a aVar, f.b.b.a.d dVar) {
        this.c = str;
        this.a = sharedPreferences;
        this.f2170d = aVar;
        this.f2171e = dVar;
    }

    public static SharedPreferences a(Context context, String str, e.k.a.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        f.b.b.a.u.b.b();
        f.b.b.a.t.a.b();
        Context applicationContext = context.getApplicationContext();
        a.b bVar = new a.b();
        bVar.h(dVar.a());
        bVar.j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        bVar.i("android-keystore://" + str2);
        i c2 = bVar.d().c();
        a.b bVar2 = new a.b();
        bVar2.h(eVar.a());
        bVar2.j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        bVar2.i("android-keystore://" + str2);
        i c3 = bVar2.d().c();
        f.b.b.a.d dVar2 = (f.b.b.a.d) c2.h(f.b.b.a.d.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (f.b.b.a.a) c3.h(f.b.b.a.a.class), dVar2);
    }

    private Object f(String str) {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d2 = d(str);
                String string = this.a.getString(d2, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f2170d.b(f.b.b.a.a0.f.a(string, 0), d2.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C0083a.a[c.a(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i2 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i2);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 6:
                        e.c.b bVar = new e.c.b();
                        while (wrap.hasRemaining()) {
                            int i3 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i3);
                            wrap.position(wrap.position() + i3);
                            bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (bVar.size() != 1 || !"__NULL__".equals(bVar.o(0))) {
                            return bVar;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f2171e.b(f.b.b.a.a0.f.a(str, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return f.b.b.a.a0.f.d(this.f2171e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String d2 = d(str);
        return new Pair<>(d2, f.b.b.a.a0.f.d(this.f2170d.a(bArr, d2.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c2 = c(entry.getKey());
                hashMap.put(c2, f(c2));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Boolean)) ? z : ((Boolean) f2).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        Object f3 = f(str);
        return (f3 == null || !(f3 instanceof Float)) ? f2 : ((Float) f3).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Integer)) ? i2 : ((Integer) f2).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Long)) ? j2 : ((Long) f2).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof String)) ? str2 : (String) f2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object f2 = f(str);
        Set<String> bVar = f2 instanceof Set ? (Set) f2 : new e.c.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
