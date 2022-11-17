package f.b.a.a.i.a0.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import f.b.a.a.i.b0.b;
import f.b.a.a.i.i;
import f.b.a.a.i.j;
import f.b.a.a.i.p;
import f.b.a.a.i.x.a.a;
import f.b.a.a.i.x.a.b;
import f.b.a.a.i.x.a.c;
import f.b.a.a.i.x.a.d;
import f.b.a.a.i.x.a.e;
import f.b.a.a.i.x.a.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class r0 implements j0, f.b.a.a.i.b0.b, i0 {

    /* renamed from: j  reason: collision with root package name */
    private static final f.b.a.a.b f2268j = f.b.a.a.b.b("proto");

    /* renamed from: e  reason: collision with root package name */
    private final t0 f2269e;

    /* renamed from: f  reason: collision with root package name */
    private final f.b.a.a.i.c0.a f2270f;

    /* renamed from: g  reason: collision with root package name */
    private final f.b.a.a.i.c0.a f2271g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f2272h;

    /* renamed from: i  reason: collision with root package name */
    private final f.b.a.a.i.w.a<String> f2273i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2, k0 k0Var, t0 t0Var, f.b.a.a.i.w.a<String> aVar3) {
        this.f2269e = t0Var;
        this.f2270f = aVar;
        this.f2271g = aVar2;
        this.f2272h = k0Var;
        this.f2273i = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ Object B(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            f(i2, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Integer D(long j2, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j2)};
        s0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: f.b.a.a.i.a0.j.j
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.B((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object F(Throwable th) {
        throw new f.b.a.a.i.b0.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SQLiteDatabase G(Throwable th) {
        throw new f.b.a.a.i.b0.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ f I(long j2, Cursor cursor) {
        cursor.moveToNext();
        long j3 = cursor.getLong(0);
        f.a c2 = f.c();
        c2.c(j3);
        c2.b(j2);
        return c2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ f J(final long j2, SQLiteDatabase sQLiteDatabase) {
        return (f) s0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: f.b.a.a.i.a0.j.c
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.I(j2, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long K(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ Boolean M(p pVar, SQLiteDatabase sQLiteDatabase) {
        Long w = w(sQLiteDatabase, pVar);
        return w == null ? Boolean.FALSE : (Boolean) s0(o().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{w.toString()}), e0.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List N(SQLiteDatabase sQLiteDatabase) {
        return (List) s0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), h.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List O(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            p.a a2 = p.a();
            a2.b(cursor.getString(1));
            a2.d(f.b.a.a.i.d0.a.b(cursor.getInt(2)));
            a2.c(m0(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ List Q(p pVar, SQLiteDatabase sQLiteDatabase) {
        List<q0> k0 = k0(sQLiteDatabase, pVar);
        z(k0, l0(sQLiteDatabase, k0));
        return k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ f.b.a.a.i.x.a.a S(Map map, a.C0088a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b h2 = h(cursor.getInt(1));
            long j2 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            c.a c2 = f.b.a.a.i.x.a.c.c();
            c2.c(h2);
            c2.b(j2);
            ((List) map.get(string)).add(c2.a());
        }
        n0(aVar, map);
        aVar.e(t());
        aVar.d(q());
        aVar.c(this.f2273i.a());
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ f.b.a.a.i.x.a.a U(String str, final Map map, final a.C0088a aVar, SQLiteDatabase sQLiteDatabase) {
        return (f.b.a.a.i.x.a.a) s0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: f.b.a.a.i.a0.j.u
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.S(map, aVar, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ Object W(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j2 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            j.a a2 = j.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            a2.h(z ? new i(q0(cursor.getString(4)), cursor.getBlob(5)) : new i(q0(cursor.getString(4)), o0(j2)));
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(q0.a(j2, pVar, a2.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object X(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ Long Z(j jVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (y()) {
            f(1L, c.b.CACHE_FULL, jVar.j());
            return -1L;
        }
        long l = l(sQLiteDatabase, pVar);
        int e2 = this.f2272h.e();
        byte[] a2 = jVar.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(l));
        contentValues.put("transport_name", jVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.k()));
        contentValues.put("payload_encoding", jVar.e().b().a());
        contentValues.put("code", jVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e2);
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i2 - 1) * e2, Math.min(i2 * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : jVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ byte[] a0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ Object c0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            f(i2, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ Object e0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        s0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: f.b.a.a.i.a0.j.v
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.c0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object g0(String str, c.b bVar, long j2, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) s0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())}), y.a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.b()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())});
        }
        return null;
    }

    private c.b h(int i2) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i2 == bVar.b()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i2 == bVar2.b()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i2 == bVar3.b()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i2 == bVar4.b()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i2 == bVar5.b()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i2 == bVar6.b()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i2 == bVar7.b()) {
            return bVar7;
        }
        f.b.a.a.i.y.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object h0(long j2, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(f.b.a.a.i.d0.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(f.b.a.a.i.d0.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private void i(final SQLiteDatabase sQLiteDatabase) {
        p0(new d() { // from class: f.b.a.a.i.a0.j.e
            @Override // f.b.a.a.i.a0.j.r0.d
            public final Object a() {
                return sQLiteDatabase.beginTransaction();
            }
        }, f.b.a.a.i.a0.j.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ Object j0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f2270f.a()).execute();
        return null;
    }

    private List<q0> k0(SQLiteDatabase sQLiteDatabase, final p pVar) {
        final ArrayList arrayList = new ArrayList();
        Long w = w(sQLiteDatabase, pVar);
        if (w == null) {
            return arrayList;
        }
        s0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{w.toString()}, null, null, null, String.valueOf(this.f2272h.d())), new b() { // from class: f.b.a.a.i.a0.j.o
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.W(arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private long l(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long w = w(sQLiteDatabase, pVar);
        if (w != null) {
            return w.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(f.b.a.a.i.d0.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private Map<Long, Set<c>> l0(SQLiteDatabase sQLiteDatabase, List<q0> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        s0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: f.b.a.a.i.a0.j.t
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.X(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    private static byte[] m0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void n0(a.C0088a aVar, Map<String, List<f.b.a.a.i.x.a.c>> map) {
        for (Map.Entry<String, List<f.b.a.a.i.x.a.c>> entry : map.entrySet()) {
            d.a c2 = f.b.a.a.i.x.a.d.c();
            c2.c(entry.getKey());
            c2.b(entry.getValue());
            aVar.a(c2.a());
        }
    }

    private byte[] o0(long j2) {
        return (byte[]) s0(o().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), g.a);
    }

    private <T> T p0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f2271g.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2271g.a() >= this.f2272h.b() + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private f.b.a.a.i.x.a.b q() {
        b.a b2 = f.b.a.a.i.x.a.b.b();
        e.a c2 = e.c();
        c2.b(n());
        c2.c(k0.a.f());
        b2.b(c2.a());
        return b2.a();
    }

    private static f.b.a.a.b q0(String str) {
        return str == null ? f2268j : f.b.a.a.b.b(str);
    }

    private long r() {
        return o().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static String r0(Iterable<q0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<q0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private long s() {
        return o().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    static <T> T s0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private f t() {
        final long a2 = this.f2270f.a();
        return (f) x(new b() { // from class: f.b.a.a.i.a0.j.l
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.J(a2, (SQLiteDatabase) obj);
            }
        });
    }

    private Long w(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(f.b.a.a.i.d0.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) s0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), q.a);
    }

    private boolean y() {
        return r() * s() >= this.f2272h.f();
    }

    private List<q0> z(List<q0> list, Map<Long, Set<c>> map) {
        ListIterator<q0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            q0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                j.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(q0.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    @Override // f.b.a.a.i.a0.j.j0
    public int a() {
        final long a2 = this.f2270f.a() - this.f2272h.c();
        return ((Integer) x(new b() { // from class: f.b.a.a.i.a0.j.w
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.D(a2, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // f.b.a.a.i.a0.j.i0
    public void b() {
        x(new b() { // from class: f.b.a.a.i.a0.j.p
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.j0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // f.b.a.a.i.b0.b
    public <T> T c(b.a<T> aVar) {
        SQLiteDatabase o = o();
        i(o);
        try {
            T a2 = aVar.a();
            o.setTransactionSuccessful();
            return a2;
        } finally {
            o.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2269e.close();
    }

    @Override // f.b.a.a.i.a0.j.i0
    public f.b.a.a.i.x.a.a d() {
        final a.C0088a e2 = f.b.a.a.i.x.a.a.e();
        final HashMap hashMap = new HashMap();
        return (f.b.a.a.i.x.a.a) x(new b() { // from class: f.b.a.a.i.a0.j.n
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.U(r2, hashMap, e2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f.b.a.a.i.a0.j.j0
    public void e(Iterable<q0> iterable) {
        if (iterable.iterator().hasNext()) {
            o().compileStatement("DELETE FROM events WHERE _id in " + r0(iterable)).execute();
        }
    }

    @Override // f.b.a.a.i.a0.j.i0
    public void f(final long j2, final c.b bVar, final String str) {
        x(new b() { // from class: f.b.a.a.i.a0.j.i
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.g0(str, bVar, j2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f.b.a.a.i.a0.j.j0
    public long g(p pVar) {
        return ((Long) s0(o().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(f.b.a.a.i.d0.a.a(pVar.d()))}), m.a)).longValue();
    }

    @Override // f.b.a.a.i.a0.j.j0
    public boolean j(final p pVar) {
        return ((Boolean) x(new b() { // from class: f.b.a.a.i.a0.j.k
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.M(pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // f.b.a.a.i.a0.j.j0
    public Iterable<q0> k(final p pVar) {
        return (Iterable) x(new b() { // from class: f.b.a.a.i.a0.j.d
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.Q(pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f.b.a.a.i.a0.j.j0
    public void m(Iterable<q0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + r0(iterable);
            x(new b() { // from class: f.b.a.a.i.a0.j.r
                @Override // f.b.a.a.i.a0.j.r0.b
                public final Object a(Object obj) {
                    return r0.this.e0(str, r3, (SQLiteDatabase) obj);
                }
            });
        }
    }

    long n() {
        return r() * s();
    }

    SQLiteDatabase o() {
        final t0 t0Var = this.f2269e;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) p0(new d() { // from class: f.b.a.a.i.a0.j.f0
            @Override // f.b.a.a.i.a0.j.r0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, f.b.a.a.i.a0.j.a.a);
    }

    @Override // f.b.a.a.i.a0.j.j0
    public void p(final p pVar, final long j2) {
        x(new b() { // from class: f.b.a.a.i.a0.j.f
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.h0(j2, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f.b.a.a.i.a0.j.j0
    public q0 u(final p pVar, final j jVar) {
        f.b.a.a.i.y.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), jVar.j(), pVar.b());
        long longValue = ((Long) x(new b() { // from class: f.b.a.a.i.a0.j.s
            @Override // f.b.a.a.i.a0.j.r0.b
            public final Object a(Object obj) {
                return r0.this.Z(jVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return q0.a(longValue, pVar, jVar);
    }

    @Override // f.b.a.a.i.a0.j.j0
    public Iterable<p> v() {
        return (Iterable) x(x.a);
    }

    <T> T x(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase o = o();
        o.beginTransaction();
        try {
            T a2 = bVar.a(o);
            o.setTransactionSuccessful();
            return a2;
        } finally {
            o.endTransaction();
        }
    }
}
