package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.auto.value.AutoValue;
import f.b.a.a.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
@AutoValue
/* loaded from: classes.dex */
public abstract class t {

    /* loaded from: classes.dex */
    public static class a {
        private f.b.a.a.i.c0.a a;
        private Map<d, b> b = new HashMap();

        public a a(d dVar, b bVar) {
            this.b.put(dVar, bVar);
            return this;
        }

        public t b() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            if (this.b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.b;
                this.b = new HashMap();
                return t.d(this.a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(f.b.a.a.i.c0.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j2);

            public abstract a c(Set<c> set);

            public abstract a d(long j2);
        }

        public static a a() {
            r.b bVar = new r.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i2, long j2) {
        int i3;
        return (long) (Math.pow(3.0d, i2 - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * i3)));
    }

    public static a b() {
        return new a();
    }

    static t d(f.b.a.a.i.c0.a aVar, Map<d, b> map) {
        return new q(aVar, map);
    }

    public static t f(f.b.a.a.i.c0.a aVar) {
        a b2 = b();
        d dVar = d.DEFAULT;
        b.a a2 = b.a();
        a2.b(30000L);
        a2.d(86400000L);
        b2.a(dVar, a2.a());
        d dVar2 = d.HIGHEST;
        b.a a3 = b.a();
        a3.b(1000L);
        a3.d(86400000L);
        b2.a(dVar2, a3.a());
        d dVar3 = d.VERY_LOW;
        b.a a4 = b.a();
        a4.b(86400000L);
        a4.d(86400000L);
        a4.c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        b2.a(dVar3, a4.a());
        b2.c(aVar);
        return b2.b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j2, int i2) {
        builder.setMinimumLatency(g(dVar, j2, i2));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract f.b.a.a.i.c0.a e();

    public long g(d dVar, long j2, int i2) {
        long a2 = j2 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i2, bVar.b()), a2), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<d, b> h();
}
