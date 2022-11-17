package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t extends Service {

    /* renamed from: k  reason: collision with root package name */
    static final Object f3311k = new Object();
    static final HashMap<e, i> l = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    b f3312e;

    /* renamed from: f  reason: collision with root package name */
    i f3313f;

    /* renamed from: g  reason: collision with root package name */
    a f3314g;

    /* renamed from: h  reason: collision with root package name */
    boolean f3315h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f3316i = false;

    /* renamed from: j  reason: collision with root package name */
    final ArrayList<d> f3317j = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                f a = t.this.a();
                if (a == null) {
                    return null;
                }
                t.this.g(a.getIntent());
                a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void r1) {
            t.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            t.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        f a();

        IBinder b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: d  reason: collision with root package name */
        private final Context f3318d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f3319e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f3320f;

        /* renamed from: g  reason: collision with root package name */
        boolean f3321g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3322h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3318d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3319e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3320f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // io.flutter.plugins.firebase.messaging.t.i
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.f3318d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3321g) {
                        this.f3321g = true;
                        if (!this.f3322h) {
                            this.f3319e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.t.i
        public void c() {
            synchronized (this) {
                if (this.f3322h) {
                    if (this.f3321g) {
                        this.f3319e.acquire(60000L);
                    }
                    this.f3322h = false;
                    this.f3320f.release();
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.t.i
        public void d() {
            synchronized (this) {
                if (!this.f3322h) {
                    this.f3322h = true;
                    this.f3320f.acquire(600000L);
                    this.f3319e.release();
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.t.i
        public void e() {
            synchronized (this) {
                this.f3321g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class d implements f {
        final Intent a;
        final int b;

        d(Intent intent, int i2) {
            this.a = intent;
            this.b = i2;
        }

        @Override // io.flutter.plugins.firebase.messaging.t.f
        public void a() {
            t.this.stopSelf(this.b);
        }

        @Override // io.flutter.plugins.firebase.messaging.t.f
        public Intent getIntent() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        e(ComponentName componentName, boolean z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        Intent getIntent();
    }

    /* loaded from: classes.dex */
    static final class g extends JobServiceEngine implements b {
        final t a;
        final Object b = new Object();
        JobParameters c;

        /* loaded from: classes.dex */
        final class a implements f {
            final JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // io.flutter.plugins.firebase.messaging.t.f
            public void a() {
                String str;
                String str2;
                synchronized (g.this.b) {
                    JobParameters jobParameters = g.this.c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.a);
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            str = "JobServiceEngineImpl";
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        } catch (SecurityException e3) {
                            e = e3;
                            str = "JobServiceEngineImpl";
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        }
                    }
                }
            }

            @Override // io.flutter.plugins.firebase.messaging.t.f
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        g(t tVar) {
            super(tVar);
            this.a = tVar;
        }

        @Override // io.flutter.plugins.firebase.messaging.t.b
        public f a() {
            synchronized (this.b) {
                JobParameters jobParameters = this.c;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                    return new a(dequeueWork);
                } catch (SecurityException e2) {
                    Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e2);
                    return null;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.t.b
        public IBinder b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends i {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f3323d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f3324e;

        h(Context context, ComponentName componentName, int i2) {
            super(componentName);
            b(i2);
            this.f3323d = new JobInfo.Builder(i2, this.a).setOverrideDeadline(0L).build();
            this.f3324e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // io.flutter.plugins.firebase.messaging.t.i
        void a(Intent intent) {
            this.f3324e.enqueue(this.f3323d, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class i {
        final ComponentName a;
        boolean b;
        int c;

        i(ComponentName componentName) {
            this.a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i2) {
            if (!this.b) {
                this.b = true;
                this.c = i2;
            } else if (this.c != i2) {
                throw new IllegalArgumentException("Given job ID " + i2 + " is different than previous " + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i2, Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f3311k) {
                i f2 = f(context, componentName, true, i2, z);
                f2.b(i2);
                try {
                    f2.a(intent);
                } catch (IllegalStateException e2) {
                    if (z) {
                        f(context, componentName, true, i2, false).a(intent);
                    } else {
                        throw e2;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class cls, int i2, Intent intent, boolean z) {
        c(context, new ComponentName(context, cls), i2, intent, z);
    }

    static i f(Context context, ComponentName componentName, boolean z, int i2, boolean z2) {
        i iVar;
        e eVar = new e(componentName, z2);
        HashMap<e, i> hashMap = l;
        i iVar2 = hashMap.get(eVar);
        if (iVar2 != null) {
            return iVar2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            iVar = new c(context, componentName);
        } else if (z) {
            iVar = new h(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        i iVar3 = iVar;
        hashMap.put(eVar, iVar3);
        return iVar3;
    }

    f a() {
        f a2;
        b bVar = this.f3312e;
        if (bVar != null && (a2 = bVar.a()) != null) {
            return a2;
        }
        synchronized (this.f3317j) {
            if (this.f3317j.size() > 0) {
                return this.f3317j.remove(0);
            }
            return null;
        }
    }

    boolean b() {
        a aVar = this.f3314g;
        if (aVar != null) {
            aVar.cancel(this.f3315h);
        }
        return h();
    }

    void e(boolean z) {
        if (this.f3314g == null) {
            this.f3314g = new a();
            i iVar = this.f3313f;
            if (iVar != null && z) {
                iVar.d();
            }
            this.f3314g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList<d> arrayList = this.f3317j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3314g = null;
                ArrayList<d> arrayList2 = this.f3317j;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f3316i) {
                    this.f3313f.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f3312e;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3312e = new g(this);
            this.f3313f = null;
        }
        this.f3313f = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f3317j) {
            this.f3316i = true;
            this.f3313f.c();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        this.f3313f.e();
        synchronized (this.f3317j) {
            ArrayList<d> arrayList = this.f3317j;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            e(true);
        }
        return 3;
    }
}
