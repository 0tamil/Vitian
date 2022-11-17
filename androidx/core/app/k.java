package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.content.b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
class k implements i {
    private final Context a;
    private final Notification.Builder b;
    private final j.e c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f592d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f593e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f594f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f595g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f596h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f597i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j.e eVar) {
        Icon icon;
        List<String> e2;
        String str;
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        this.c = eVar;
        this.a = eVar.a;
        Context context = eVar.a;
        this.b = i2 >= 26 ? new Notification.Builder(context, eVar.L) : new Notification.Builder(context);
        Notification notification = eVar.T;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f579i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f575e).setContentText(eVar.f576f).setContentInfo(eVar.f581k).setContentIntent(eVar.f577g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f578h, (notification.flags & 128) != 0).setLargeIcon(eVar.f580j).setNumber(eVar.l).setProgress(eVar.u, eVar.v, eVar.w);
        if (i2 < 21) {
            this.b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.b.setSubText(eVar.r).setUsesChronometer(eVar.o).setPriority(eVar.m);
            Iterator<j.a> it = eVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.E;
            if (bundle2 != null) {
                this.f595g.putAll(bundle2);
            }
            if (i2 < 20) {
                if (eVar.A) {
                    this.f595g.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.x;
                if (str2 != null) {
                    this.f595g.putString("android.support.groupKey", str2);
                    if (eVar.y) {
                        bundle = this.f595g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f595g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.z;
                if (str3 != null) {
                    this.f595g.putString("android.support.sortKey", str3);
                }
            }
            this.f592d = eVar.I;
            this.f593e = eVar.J;
        }
        if (i2 >= 17) {
            this.b.setShowWhen(eVar.n);
        }
        if (i2 >= 19 && i2 < 21 && (e2 = e(g(eVar.c), eVar.W)) != null && !e2.isEmpty()) {
            this.f595g.putStringArray("android.people", (String[]) e2.toArray(new String[e2.size()]));
        }
        if (i2 >= 20) {
            this.b.setLocalOnly(eVar.A).setGroup(eVar.x).setGroupSummary(eVar.y).setSortKey(eVar.z);
            this.f596h = eVar.Q;
        }
        if (i2 >= 21) {
            this.b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
            List<String> e3 = i2 < 28 ? e(g(eVar.c), eVar.W) : eVar.W;
            if (e3 != null && !e3.isEmpty()) {
                for (String str4 : e3) {
                    this.b.addPerson(str4);
                }
            }
            this.f597i = eVar.K;
            if (eVar.f574d.size() > 0) {
                Bundle bundle3 = eVar.f().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < eVar.f574d.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), l.b(eVar.f574d.get(i3)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.f().putBundle("android.car.EXTENSIONS", bundle3);
                this.f595g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (i2 >= 23 && (icon = eVar.V) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i2 >= 24) {
            this.b.setExtras(eVar.E).setRemoteInputHistory(eVar.t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i2 >= 26) {
            this.b.setBadgeIconType(eVar.M).setSettingsText(eVar.s).setShortcutId(eVar.N).setTimeoutAfter(eVar.P).setGroupAlertBehavior(eVar.Q);
            if (eVar.C) {
                this.b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i2 >= 28) {
            Iterator<n> it2 = eVar.c.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().j());
            }
        }
        if (i2 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.b.setBubbleMetadata(j.d.c(eVar.S));
            b bVar = eVar.O;
            if (bVar != null) {
                bVar.a();
                throw null;
            }
        }
        if (eVar.U) {
            if (this.c.y) {
                this.f596h = 2;
            } else {
                this.f596h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i4 = notification.defaults & (-2);
            notification.defaults = i4;
            int i5 = i4 & (-3);
            notification.defaults = i5;
            this.b.setDefaults(i5);
            if (i2 >= 26) {
                if (TextUtils.isEmpty(this.c.x)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.f596h);
            }
        }
    }

    private void b(j.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            IconCompat f2 = aVar.f();
            Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder(f2 != null ? f2.C() : null, aVar.j(), aVar.a()) : new Notification.Action.Builder(f2 != null ? f2.n() : 0, aVar.j(), aVar.a());
            if (aVar.g() != null) {
                for (RemoteInput remoteInput : o.b(aVar.g())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            builder.addExtras(bundle);
            this.b.addAction(builder.build());
        } else if (i2 >= 16) {
            this.f594f.add(l.f(this.b, aVar));
        }
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        e.c.b bVar = new e.c.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n nVar : list) {
            arrayList.add(nVar.i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }

    @Override // androidx.core.app.i
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle a;
        RemoteViews u;
        RemoteViews s;
        j.i iVar = this.c.q;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews t = iVar != null ? iVar.t(this) : null;
        Notification d2 = d();
        if (!(t == null && (t = this.c.I) == null)) {
            d2.contentView = t;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 < 16 || iVar == null || (s = iVar.s(this)) == null)) {
            d2.bigContentView = s;
        }
        if (!(i2 < 21 || iVar == null || (u = this.c.q.u(this)) == null)) {
            d2.headsUpContentView = u;
        }
        if (!(i2 < 16 || iVar == null || (a = j.a(d2)) == null)) {
            iVar.a(a);
        }
        return d2;
    }

    protected Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.b.build();
        }
        if (i2 >= 24) {
            Notification build = this.b.build();
            if (this.f596h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f596h != 2)) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f596h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i2 >= 21) {
            this.b.setExtras(this.f595g);
            Notification build2 = this.b.build();
            RemoteViews remoteViews = this.f592d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f593e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f597i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f596h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f596h != 2)) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f596h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i2 >= 20) {
            this.b.setExtras(this.f595g);
            Notification build3 = this.b.build();
            RemoteViews remoteViews4 = this.f592d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f593e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f596h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f596h != 2)) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f596h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i2 >= 19) {
            SparseArray<Bundle> a = l.a(this.f594f);
            if (a != null) {
                this.f595g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.b.setExtras(this.f595g);
            Notification build4 = this.b.build();
            RemoteViews remoteViews6 = this.f592d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f593e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i2 < 16) {
            return this.b.getNotification();
        } else {
            Notification build5 = this.b.build();
            Bundle a2 = j.a(build5);
            Bundle bundle = new Bundle(this.f595g);
            for (String str : this.f595g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = l.a(this.f594f);
            if (a3 != null) {
                j.a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f592d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f593e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.a;
    }
}
