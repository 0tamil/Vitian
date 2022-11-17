package k.a.a.y;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k.a.a.w.d;
/* loaded from: classes.dex */
public final class c extends i {
    private List<String> c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentNavigableMap<String, a> f3750d = new ConcurrentSkipListMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private final String a;
        private final String[] b;
        private final short[] c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicReferenceArray<Object> f3751d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f3751d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        f b(short s) {
            Object obj = this.f3751d.get(s);
            if (obj instanceof byte[]) {
                obj = k.a.a.y.a.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f3751d.set(s, obj);
            }
            return (f) obj;
        }

        f c(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return b(this.c[binarySearch]);
            } catch (Exception e2) {
                throw new g("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.a, e2);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            h(inputStream);
        } catch (Exception e2) {
            throw new g("Unable to load TZDB time-zone rules", e2);
        }
    }

    private boolean h(InputStream inputStream) {
        boolean z = false;
        for (a aVar : i(inputStream)) {
            a putIfAbsent = this.f3750d.putIfAbsent(aVar.a, aVar);
            if (putIfAbsent == null || putIfAbsent.a.equals(aVar.a)) {
                z = true;
            } else {
                throw new g("Data already loaded for TZDB time-zone rules version: " + aVar.a);
            }
        }
        return z;
    }

    private Iterable<a> i(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        } else if ("TZDB".equals(dataInputStream.readUTF())) {
            int readShort = dataInputStream.readShort();
            String[] strArr = new String[readShort];
            for (int i2 = 0; i2 < readShort; i2++) {
                strArr[i2] = dataInputStream.readUTF();
            }
            int readShort2 = dataInputStream.readShort();
            String[] strArr2 = new String[readShort2];
            for (int i3 = 0; i3 < readShort2; i3++) {
                strArr2[i3] = dataInputStream.readUTF();
            }
            this.c = Arrays.asList(strArr2);
            int readShort3 = dataInputStream.readShort();
            Object[] objArr = new Object[readShort3];
            for (int i4 = 0; i4 < readShort3; i4++) {
                byte[] bArr = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(bArr);
                objArr[i4] = bArr;
            }
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
            HashSet hashSet = new HashSet(readShort);
            for (int i5 = 0; i5 < readShort; i5++) {
                int readShort4 = dataInputStream.readShort();
                String[] strArr3 = new String[readShort4];
                short[] sArr = new short[readShort4];
                for (int i6 = 0; i6 < readShort4; i6++) {
                    strArr3[i6] = strArr2[dataInputStream.readShort()];
                    sArr[i6] = dataInputStream.readShort();
                }
                hashSet.add(new a(strArr[i5], strArr3, sArr, atomicReferenceArray));
            }
            return hashSet;
        } else {
            throw new StreamCorruptedException("File format not recognised");
        }
    }

    @Override // k.a.a.y.i
    protected f d(String str, boolean z) {
        d.i(str, "zoneId");
        f c = this.f3750d.lastEntry().getValue().c(str);
        if (c != null) {
            return c;
        }
        throw new g("Unknown time-zone ID: " + str);
    }

    @Override // k.a.a.y.i
    protected Set<String> e() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }
}
