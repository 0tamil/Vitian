package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class j {

    /* loaded from: classes.dex */
    public static class a {
        final Bundle a;
        private IconCompat b;
        private final o[] c;

        /* renamed from: d  reason: collision with root package name */
        private final o[] f562d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f563e;

        /* renamed from: f  reason: collision with root package name */
        boolean f564f;

        /* renamed from: g  reason: collision with root package name */
        private final int f565g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f566h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f567i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f568j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f569k;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.l(null, "", i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o[] oVarArr, o[] oVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f564f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.s() == 2) {
                this.f567i = iconCompat.n();
            }
            this.f568j = e.j(charSequence);
            this.f569k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = oVarArr;
            this.f562d = oVarArr2;
            this.f563e = z;
            this.f565g = i2;
            this.f564f = z2;
            this.f566h = z3;
        }

        public PendingIntent a() {
            return this.f569k;
        }

        public boolean b() {
            return this.f563e;
        }

        public o[] c() {
            return this.f562d;
        }

        public Bundle d() {
            return this.a;
        }

        @Deprecated
        public int e() {
            return this.f567i;
        }

        public IconCompat f() {
            int i2;
            if (this.b == null && (i2 = this.f567i) != 0) {
                this.b = IconCompat.l(null, "", i2);
            }
            return this.b;
        }

        public o[] g() {
            return this.c;
        }

        public int h() {
            return this.f565g;
        }

        public boolean i() {
            return this.f564f;
        }

        public CharSequence j() {
            return this.f568j;
        }

        public boolean k() {
            return this.f566h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f570e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f571f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f572g;

        /* loaded from: classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0015b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static IconCompat x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.g((Bitmap) parcelable);
            }
            return null;
        }

        public b A(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public b B(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f591d = true;
            return this;
        }

        @Override // androidx.core.app.j.i
        public void b(androidx.core.app.i iVar) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.b).bigPicture(this.f570e);
                if (this.f572g) {
                    IconCompat iconCompat = this.f571f;
                    Context context = null;
                    if (iconCompat != null) {
                        if (i2 >= 23) {
                            if (iVar instanceof k) {
                                context = ((k) iVar).f();
                            }
                            C0015b.a(bigPicture, this.f571f.D(context));
                        } else if (iconCompat.s() == 1) {
                            a.a(bigPicture, this.f571f.m());
                        }
                    }
                    a.a(bigPicture, null);
                }
                if (this.f591d) {
                    a.b(bigPicture, this.c);
                }
            }
        }

        @Override // androidx.core.app.j.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.j.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f571f = x(bundle.getParcelable("android.largeIcon.big"));
                this.f572g = true;
            }
            this.f570e = (Bitmap) bundle.getParcelable("android.picture");
        }

        public b y(Bitmap bitmap) {
            this.f571f = bitmap == null ? null : IconCompat.g(bitmap);
            this.f572g = true;
            return this;
        }

        public b z(Bitmap bitmap) {
            this.f570e = bitmap;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f573e;

        @Override // androidx.core.app.j.i
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f573e);
            }
        }

        @Override // androidx.core.app.j.i
        public void b(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.b).bigText(this.f573e);
                if (this.f591d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        @Override // androidx.core.app.j.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.j.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            this.f573e = bundle.getCharSequence("android.bigText");
        }

        public c x(CharSequence charSequence) {
            this.f573e = e.j(charSequence);
            return this;
        }

        public c y(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public c z(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f591d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.a();
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class b {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.b();
                throw null;
            }
        }

        public static Notification.BubbleMetadata c(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(dVar);
            }
            if (i2 == 29) {
                return a.a(dVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent a() {
            throw null;
        }

        public String b() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.b O;
        long P;
        int Q;
        boolean R;
        d S;
        Notification T;
        boolean U;
        Icon V;
        @Deprecated
        public ArrayList<String> W;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<n> c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f574d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f575e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f576f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f577g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f578h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f579i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f580j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f581k;
        int l;
        int m;
        boolean n;
        boolean o;
        boolean p;
        i q;
        CharSequence r;
        CharSequence s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.f574d = new ArrayList<>();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence j(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap k(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(e.d.c.b_res_0x7f060057);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(e.d.c.a_res_0x7f060056);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        private void v(int i2, boolean z) {
            Notification notification;
            int i3;
            if (z) {
                notification = this.T;
                i3 = i2 | notification.flags;
            } else {
                notification = this.T;
                i3 = (~i2) & notification.flags;
            }
            notification.flags = i3;
        }

        public e A(Bitmap bitmap) {
            this.f580j = k(bitmap);
            return this;
        }

        public e B(int i2, int i3, int i4) {
            Notification notification = this.T;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e C(boolean z) {
            this.A = z;
            return this;
        }

        public e D(int i2) {
            this.l = i2;
            return this;
        }

        public e E(boolean z) {
            v(2, z);
            return this;
        }

        public e F(boolean z) {
            v(8, z);
            return this;
        }

        public e G(int i2) {
            this.m = i2;
            return this;
        }

        public e H(int i2, int i3, boolean z) {
            this.u = i2;
            this.v = i3;
            this.w = z;
            return this;
        }

        public e I(String str) {
            this.N = str;
            return this;
        }

        public e J(boolean z) {
            this.n = z;
            return this;
        }

        public e K(int i2) {
            this.T.icon = i2;
            return this;
        }

        public e L(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e M(i iVar) {
            if (this.q != iVar) {
                this.q = iVar;
                if (iVar != null) {
                    iVar.w(this);
                }
            }
            return this;
        }

        public e N(CharSequence charSequence) {
            this.r = j(charSequence);
            return this;
        }

        public e O(CharSequence charSequence) {
            this.T.tickerText = j(charSequence);
            return this;
        }

        public e P(long j2) {
            this.P = j2;
            return this;
        }

        public e Q(boolean z) {
            this.o = z;
            return this;
        }

        public e R(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e S(int i2) {
            this.G = i2;
            return this;
        }

        public e T(long j2) {
            this.T.when = j2;
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public RemoteViews c() {
            return this.J;
        }

        public int d() {
            return this.F;
        }

        public RemoteViews e() {
            return this.I;
        }

        public Bundle f() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews g() {
            return this.K;
        }

        public int h() {
            return this.m;
        }

        public long i() {
            if (this.n) {
                return this.T.when;
            }
            return 0L;
        }

        public e l(boolean z) {
            v(16, z);
            return this;
        }

        public e m(String str) {
            this.D = str;
            return this;
        }

        public e n(String str) {
            this.L = str;
            return this;
        }

        public e o(int i2) {
            this.F = i2;
            return this;
        }

        public e p(boolean z) {
            this.B = z;
            this.C = true;
            return this;
        }

        public e q(PendingIntent pendingIntent) {
            this.f577g = pendingIntent;
            return this;
        }

        public e r(CharSequence charSequence) {
            this.f576f = j(charSequence);
            return this;
        }

        public e s(CharSequence charSequence) {
            this.f575e = j(charSequence);
            return this;
        }

        public e t(int i2) {
            Notification notification = this.T;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e u(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public e w(PendingIntent pendingIntent, boolean z) {
            this.f578h = pendingIntent;
            v(128, z);
            return this;
        }

        public e x(String str) {
            this.x = str;
            return this;
        }

        public e y(int i2) {
            this.Q = i2;
            return this;
        }

        public e z(boolean z) {
            this.y = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends i {
        private RemoteViews x(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i2 = 0;
            RemoteViews c = c(true, e.d.g.c_res_0x7f0b0025, false);
            c.removeAllViews(e.d.e.f_res_0x7f080039);
            List<a> z3 = z(this.a.b);
            if (!z || z3 == null || (min = Math.min(z3.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i3 = 0; i3 < min; i3++) {
                    c.addView(e.d.e.f_res_0x7f080039, y(z3.get(i3)));
                }
            }
            if (!z2) {
                i2 = 8;
            }
            c.setViewVisibility(e.d.e.f_res_0x7f080039, i2);
            c.setViewVisibility(e.d.e.c_res_0x7f080031, i2);
            d(c, remoteViews);
            return c;
        }

        private RemoteViews y(a aVar) {
            boolean z = aVar.f569k == null;
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), z ? e.d.g.b_res_0x7f0b001e : e.d.g.a_res_0x7f0b001d);
            IconCompat f2 = aVar.f();
            if (f2 != null) {
                remoteViews.setImageViewBitmap(e.d.e.d_res_0x7f080032, m(f2, this.a.a.getResources().getColor(e.d.b.a_res_0x7f05004a)));
            }
            remoteViews.setTextViewText(e.d.e.e_res_0x7f080038, aVar.f568j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(e.d.e.b_res_0x7f08002f, aVar.f569k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(e.d.e.b_res_0x7f08002f, aVar.f568j);
            }
            return remoteViews;
        }

        private static List<a> z(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                if (!aVar.k()) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.j.i
        public void b(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                iVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.j.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.j.i
        public RemoteViews s(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews c = this.a.c();
            if (c == null) {
                c = this.a.e();
            }
            if (c == null) {
                return null;
            }
            return x(c, true);
        }

        @Override // androidx.core.app.j.i
        public RemoteViews t(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT < 24 && this.a.e() != null) {
                return x(this.a.e(), false);
            }
            return null;
        }

        @Override // androidx.core.app.j.i
        public RemoteViews u(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews g2 = this.a.g();
            RemoteViews e2 = g2 != null ? g2 : this.a.e();
            if (g2 == null) {
                return null;
            }
            return x(e2, true);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends i {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f582e = new ArrayList<>();

        @Override // androidx.core.app.j.i
        public void b(androidx.core.app.i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(iVar.a()).setBigContentTitle(this.b);
                if (this.f591d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                Iterator<CharSequence> it = this.f582e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override // androidx.core.app.j.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.j.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            this.f582e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f582e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public g x(CharSequence charSequence) {
            if (charSequence != null) {
                this.f582e.add(e.j(charSequence));
            }
            return this;
        }

        public g y(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public g z(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f591d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private final List<a> f583e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<a> f584f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private n f585g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f586h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f587i;

        /* loaded from: classes.dex */
        public static final class a {
            private final CharSequence a;
            private final long b;
            private final n c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f588d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f589e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f590f;

            public a(CharSequence charSequence, long j2, n nVar) {
                this.a = charSequence;
                this.b = j2;
                this.c = nVar;
            }

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = list.get(i2).l();
                }
                return bundleArr;
            }

            static a e(Bundle bundle) {
                n nVar;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            nVar = n.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            nVar = n.a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            n.a aVar = new n.a();
                            aVar.f(bundle.getCharSequence("sender"));
                            nVar = aVar.a();
                        } else {
                            nVar = null;
                        }
                        a aVar2 = new a(bundle.getCharSequence("text"), bundle.getLong("time"), nVar);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            aVar2.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            aVar2.d().putAll(bundle.getBundle("extras"));
                        }
                        return aVar2;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<a> f(Parcelable[] parcelableArr) {
                a e2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                    if ((parcelableArr[i2] instanceof Bundle) && (e2 = e((Bundle) parcelableArr[i2])) != null) {
                        arrayList.add(e2);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.b);
                n nVar = this.c;
                if (nVar != null) {
                    bundle.putCharSequence("sender", nVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.c.j());
                    } else {
                        bundle.putBundle("person", this.c.k());
                    }
                }
                String str = this.f589e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f590f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f588d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f589e;
            }

            public Uri c() {
                return this.f590f;
            }

            public Bundle d() {
                return this.f588d;
            }

            public n g() {
                return this.c;
            }

            public CharSequence h() {
                return this.a;
            }

            public long i() {
                return this.b;
            }

            public a j(String str, Uri uri) {
                this.f589e = str;
                this.f590f = uri;
                return this;
            }

            Notification.MessagingStyle.Message k() {
                Notification.MessagingStyle.Message message;
                n g2 = g();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence h2 = h();
                    long i2 = i();
                    if (g2 != null) {
                        person = g2.j();
                    }
                    message = new Notification.MessagingStyle.Message(h2, i2, person);
                } else {
                    CharSequence h3 = h();
                    long i3 = i();
                    if (g2 != null) {
                        charSequence = g2.e();
                    }
                    message = new Notification.MessagingStyle.Message(h3, i3, charSequence);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }
        }

        h() {
        }

        public h(n nVar) {
            if (!TextUtils.isEmpty(nVar.e())) {
                this.f585g = nVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        private boolean D() {
            for (int size = this.f583e.size() - 1; size >= 0; size--) {
                a aVar = this.f583e.get(size);
                if (aVar.g() != null && aVar.g().e() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan F(int i2) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null);
        }

        private CharSequence G(a aVar) {
            e.d.n.a c = e.d.n.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i2 = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence e2 = aVar.g() == null ? charSequence : aVar.g().e();
            if (TextUtils.isEmpty(e2)) {
                e2 = this.f585g.e();
                if (z && this.a.d() != 0) {
                    i2 = this.a.d();
                }
            }
            CharSequence h2 = c.h(e2);
            spannableStringBuilder.append(h2);
            spannableStringBuilder.setSpan(F(i2), spannableStringBuilder.length() - h2.length(), spannableStringBuilder.length(), 33);
            if (aVar.h() != null) {
                charSequence = aVar.h();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c.h(charSequence));
            return spannableStringBuilder;
        }

        public static h y(Notification notification) {
            i p = i.p(notification);
            if (p instanceof h) {
                return (h) p;
            }
            return null;
        }

        private a z() {
            List<a> list;
            for (int size = this.f583e.size() - 1; size >= 0; size--) {
                a aVar = this.f583e.get(size);
                if (!(aVar.g() == null || TextUtils.isEmpty(aVar.g().e()))) {
                    return aVar;
                }
            }
            if (this.f583e.isEmpty()) {
                return null;
            }
            return this.f583e.get(list.size() - 1);
        }

        public CharSequence A() {
            return this.f586h;
        }

        public List<a> B() {
            return this.f583e;
        }

        public n C() {
            return this.f585g;
        }

        public boolean E() {
            e eVar = this.a;
            if (eVar != null && eVar.a.getApplicationInfo().targetSdkVersion < 28 && this.f587i == null) {
                return this.f586h != null;
            }
            Boolean bool = this.f587i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public h H(CharSequence charSequence) {
            this.f586h = charSequence;
            return this;
        }

        public h I(boolean z) {
            this.f587i = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.core.app.j.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f585g.e());
            bundle.putBundle("android.messagingStyleUser", this.f585g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f586h);
            if (this.f586h != null && this.f587i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f586h);
            }
            if (!this.f583e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f583e));
            }
            if (!this.f584f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f584f));
            }
            Boolean bool = this.f587i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
        @Override // androidx.core.app.j.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void b(androidx.core.app.i iVar) {
            Notification.Builder a2;
            CharSequence e2;
            int i2 = Build.VERSION.SDK_INT;
            I(E());
            if (i2 >= 24) {
                n nVar = this.f585g;
                Notification.MessagingStyle messagingStyle = i2 >= 28 ? new Notification.MessagingStyle(nVar.j()) : new Notification.MessagingStyle(nVar.e());
                for (a aVar : this.f583e) {
                    messagingStyle.addMessage(aVar.k());
                }
                if (i2 >= 26) {
                    for (a aVar2 : this.f584f) {
                        messagingStyle.addHistoricMessage(aVar2.k());
                    }
                }
                if (this.f587i.booleanValue() || i2 >= 28) {
                    messagingStyle.setConversationTitle(this.f586h);
                }
                if (i2 >= 28) {
                    messagingStyle.setGroupConversation(this.f587i.booleanValue());
                }
                messagingStyle.setBuilder(iVar.a());
                return;
            }
            a z = z();
            if (this.f586h == null || !this.f587i.booleanValue()) {
                if (z != null) {
                    iVar.a().setContentTitle("");
                    if (z.g() != null) {
                        a2 = iVar.a();
                        e2 = z.g().e();
                    }
                }
                if (z != null) {
                    iVar.a().setContentText(this.f586h != null ? G(z) : z.h());
                }
                if (i2 < 16) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    boolean z2 = this.f586h != null || D();
                    for (int size = this.f583e.size() - 1; size >= 0; size--) {
                        a aVar3 = this.f583e.get(size);
                        CharSequence G = z2 ? G(aVar3) : aVar3.h();
                        if (size != this.f583e.size() - 1) {
                            spannableStringBuilder.insert(0, (CharSequence) "\n");
                        }
                        spannableStringBuilder.insert(0, G);
                    }
                    new Notification.BigTextStyle(iVar.a()).setBigContentTitle(null).bigText(spannableStringBuilder);
                    return;
                }
                return;
            }
            a2 = iVar.a();
            e2 = this.f586h;
            a2.setContentTitle(e2);
            if (z != null) {
            }
            if (i2 < 16) {
            }
        }

        @Override // androidx.core.app.j.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.j.i
        protected void v(Bundle bundle) {
            n nVar;
            super.v(bundle);
            this.f583e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                nVar = n.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                n.a aVar = new n.a();
                aVar.f(bundle.getString("android.selfDisplayName"));
                nVar = aVar.a();
            }
            this.f585g = nVar;
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f586h = charSequence;
            if (charSequence == null) {
                this.f586h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f583e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f584f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f587i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public h x(a aVar) {
            if (aVar != null) {
                this.f583e.add(aVar);
                if (this.f583e.size() > 25) {
                    this.f583e.remove(0);
                }
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        protected e a;
        CharSequence b;
        CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        boolean f591d = false;

        private int e() {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(e.d.c.i_res_0x7f06006e);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(e.d.c.j_res_0x7f06006f);
            float f2 = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f2) * dimensionPixelSize) + (f2 * dimensionPixelSize2));
        }

        private static float f(float f2, float f3, float f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }

        static i g(String str) {
            if (str == null) {
                return null;
            }
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new f();
                case 1:
                    return new b();
                case 2:
                    return new g();
                case 3:
                    return new c();
                case 4:
                    return new h();
                default:
                    return null;
            }
        }

        private static i h(String str) {
            int i2;
            if (str != null && (i2 = Build.VERSION.SDK_INT) >= 16) {
                if (str.equals(Notification.BigPictureStyle.class.getName())) {
                    return new b();
                }
                if (str.equals(Notification.BigTextStyle.class.getName())) {
                    return new c();
                }
                if (str.equals(Notification.InboxStyle.class.getName())) {
                    return new g();
                }
                if (i2 >= 24) {
                    if (str.equals(Notification.MessagingStyle.class.getName())) {
                        return new h();
                    }
                    if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        return new f();
                    }
                }
            }
            return null;
        }

        static i i(Bundle bundle) {
            i g2 = g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return g2 != null ? g2 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new h() : bundle.containsKey("android.picture") ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new g() : h(bundle.getString("android.template"));
        }

        static i j(Bundle bundle) {
            i i2 = i(bundle);
            if (i2 == null) {
                return null;
            }
            try {
                i2.v(bundle);
                return i2;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap l(int i2, int i3, int i4) {
            return n(IconCompat.k(this.a.a, i2), i3, i4);
        }

        private Bitmap n(IconCompat iconCompat, int i2, int i3) {
            Drawable x = iconCompat.x(this.a.a);
            int intrinsicWidth = i3 == 0 ? x.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = x.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            x.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                x.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            x.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap o(int i2, int i3, int i4, int i5) {
            int i6 = e.d.d.c_res_0x7f070075;
            if (i5 == 0) {
                i5 = 0;
            }
            Bitmap l = l(i6, i5, i3);
            Canvas canvas = new Canvas(l);
            Drawable mutate = this.a.a.getResources().getDrawable(i2).mutate();
            mutate.setFilterBitmap(true);
            int i7 = (i3 - i4) / 2;
            int i8 = i4 + i7;
            mutate.setBounds(i7, i7, i8, i8);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l;
        }

        public static i p(Notification notification) {
            Bundle a = j.a(notification);
            if (a == null) {
                return null;
            }
            return j(a);
        }

        private void r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(e.d.e.G, 8);
            remoteViews.setViewVisibility(e.d.e.E_res_0x7f0800b8, 8);
            remoteViews.setViewVisibility(e.d.e.D_res_0x7f0800b7, 8);
        }

        public void a(Bundle bundle) {
            if (this.f591d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q = q();
            if (q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q);
            }
        }

        public abstract void b(androidx.core.app.i iVar);

        /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews c(boolean z, int i2, boolean z2) {
            boolean z3;
            boolean z4;
            boolean z5;
            CharSequence charSequence;
            boolean z6;
            CharSequence charSequence2;
            int i3;
            Bitmap bitmap;
            int i4;
            int i5;
            Resources resources = this.a.a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), i2);
            boolean z7 = true;
            int i6 = 0;
            boolean z8 = this.a.h() < -1;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 16 && i7 < 21) {
                if (z8) {
                    remoteViews.setInt(e.d.e.l_res_0x7f08007e, "setBackgroundResource", e.d.d.b_res_0x7f070070);
                    i5 = e.d.e.h_res_0x7f080068;
                    i4 = e.d.d.e_res_0x7f070077;
                } else {
                    remoteViews.setInt(e.d.e.l_res_0x7f08007e, "setBackgroundResource", e.d.d.a_res_0x7f07006f);
                    i5 = e.d.e.h_res_0x7f080068;
                    i4 = e.d.d.d_res_0x7f070076;
                }
                remoteViews.setInt(i5, "setBackgroundResource", i4);
            }
            e eVar = this.a;
            if (eVar.f580j != null) {
                int i8 = e.d.e.h_res_0x7f080068;
                if (i7 >= 16) {
                    remoteViews.setViewVisibility(i8, 0);
                    remoteViews.setImageViewBitmap(i8, this.a.f580j);
                } else {
                    remoteViews.setViewVisibility(i8, 8);
                }
                if (z && this.a.T.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(e.d.c.e_res_0x7f060069);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(e.d.c.f_res_0x7f06006b) * 2);
                    if (i7 >= 21) {
                        e eVar2 = this.a;
                        remoteViews.setImageViewBitmap(e.d.e.o_res_0x7f080088, o(eVar2.T.icon, dimensionPixelSize, dimensionPixelSize2, eVar2.d()));
                    } else {
                        remoteViews.setImageViewBitmap(e.d.e.o_res_0x7f080088, k(this.a.T.icon, -1));
                    }
                    remoteViews.setViewVisibility(e.d.e.o_res_0x7f080088, 0);
                }
            } else if (z && eVar.T.icon != 0) {
                int i9 = e.d.e.h_res_0x7f080068;
                remoteViews.setViewVisibility(i9, 0);
                if (i7 >= 21) {
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(e.d.c.d_res_0x7f060066) - resources.getDimensionPixelSize(e.d.c.c_res_0x7f060063);
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(e.d.c.g_res_0x7f06006c);
                    e eVar3 = this.a;
                    bitmap = o(eVar3.T.icon, dimensionPixelSize3, dimensionPixelSize4, eVar3.d());
                } else {
                    bitmap = k(this.a.T.icon, -1);
                }
                remoteViews.setImageViewBitmap(i9, bitmap);
            }
            CharSequence charSequence3 = this.a.f575e;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(e.d.e.G, charSequence3);
            }
            CharSequence charSequence4 = this.a.f576f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(e.d.e.D_res_0x7f0800b7, charSequence4);
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = i7 < 21 && this.a.f580j != null;
            e eVar4 = this.a;
            CharSequence charSequence5 = eVar4.f581k;
            if (charSequence5 != null) {
                i3 = e.d.e.i_res_0x7f08006d;
                remoteViews.setTextViewText(i3, charSequence5);
            } else if (eVar4.l > 0) {
                if (this.a.l > resources.getInteger(e.d.f.a_res_0x7f090005)) {
                    remoteViews.setTextViewText(e.d.e.i_res_0x7f08006d, resources.getString(e.d.h.a_res_0x7f0e003a));
                } else {
                    remoteViews.setTextViewText(e.d.e.i_res_0x7f08006d, NumberFormat.getIntegerInstance().format(this.a.l));
                }
                i3 = e.d.e.i_res_0x7f08006d;
            } else {
                remoteViews.setViewVisibility(e.d.e.i_res_0x7f08006d, 8);
                z5 = z3;
                z4 = z9;
                charSequence = this.a.r;
                if (charSequence != null && i7 >= 16) {
                    remoteViews.setTextViewText(e.d.e.D_res_0x7f0800b7, charSequence);
                    charSequence2 = this.a.f576f;
                    if (charSequence2 == null) {
                        int i10 = e.d.e.E_res_0x7f0800b8;
                        remoteViews.setTextViewText(i10, charSequence2);
                        remoteViews.setViewVisibility(i10, 0);
                        z6 = true;
                        if (z6 && i7 >= 16) {
                            if (z2) {
                                remoteViews.setTextViewTextSize(e.d.e.D_res_0x7f0800b7, 0, resources.getDimensionPixelSize(e.d.c.h_res_0x7f06006d));
                            }
                            remoteViews.setViewPadding(e.d.e.j_res_0x7f080071, 0, 0, 0, 0);
                        }
                        if (this.a.i() == 0) {
                            z7 = z4;
                        } else if (!this.a.o || i7 < 16) {
                            int i11 = e.d.e.F_res_0x7f0800bb;
                            remoteViews.setViewVisibility(i11, 0);
                            remoteViews.setLong(i11, "setTime", this.a.i());
                        } else {
                            int i12 = e.d.e.g_res_0x7f08004e;
                            remoteViews.setViewVisibility(i12, 0);
                            remoteViews.setLong(i12, "setBase", this.a.i() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                            remoteViews.setBoolean(i12, "setStarted", true);
                            boolean z10 = this.a.p;
                            if (z10 && i7 >= 24) {
                                remoteViews.setChronometerCountDown(i12, z10);
                            }
                        }
                        remoteViews.setViewVisibility(e.d.e.p_res_0x7f080089, z7 ? 0 : 8);
                        int i13 = e.d.e.k_res_0x7f080072;
                        if (!z5) {
                            i6 = 8;
                        }
                        remoteViews.setViewVisibility(i13, i6);
                        return remoteViews;
                    }
                    remoteViews.setViewVisibility(e.d.e.E_res_0x7f0800b8, 8);
                }
                z6 = false;
                if (z6) {
                    if (z2) {
                    }
                    remoteViews.setViewPadding(e.d.e.j_res_0x7f080071, 0, 0, 0, 0);
                }
                if (this.a.i() == 0) {
                }
                remoteViews.setViewVisibility(e.d.e.p_res_0x7f080089, z7 ? 0 : 8);
                int i132 = e.d.e.k_res_0x7f080072;
                if (!z5) {
                }
                remoteViews.setViewVisibility(i132, i6);
                return remoteViews;
            }
            remoteViews.setViewVisibility(i3, 0);
            z5 = true;
            z4 = true;
            charSequence = this.a.r;
            if (charSequence != null) {
                remoteViews.setTextViewText(e.d.e.D_res_0x7f0800b7, charSequence);
                charSequence2 = this.a.f576f;
                if (charSequence2 == null) {
                }
            }
            z6 = false;
            if (z6) {
            }
            if (this.a.i() == 0) {
            }
            remoteViews.setViewVisibility(e.d.e.p_res_0x7f080089, z7 ? 0 : 8);
            int i1322 = e.d.e.k_res_0x7f080072;
            if (!z5) {
            }
            remoteViews.setViewVisibility(i1322, i6);
            return remoteViews;
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            r(remoteViews);
            int i2 = e.d.e.m_res_0x7f08007f;
            remoteViews.removeAllViews(i2);
            remoteViews.addView(i2, remoteViews2.clone());
            remoteViews.setViewVisibility(i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(e.d.e.n_res_0x7f080080, 0, e(), 0, 0);
            }
        }

        public Bitmap k(int i2, int i3) {
            return l(i2, i3, 0);
        }

        Bitmap m(IconCompat iconCompat, int i2) {
            return n(iconCompat, i2, 0);
        }

        protected String q() {
            return null;
        }

        public RemoteViews s(androidx.core.app.i iVar) {
            return null;
        }

        public RemoteViews t(androidx.core.app.i iVar) {
            return null;
        }

        public RemoteViews u(androidx.core.app.i iVar) {
            return null;
        }

        protected void v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.c = bundle.getCharSequence("android.summaryText");
                this.f591d = true;
            }
            this.b = bundle.getCharSequence("android.title.big");
        }

        public void w(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.M(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return l.c(notification);
        }
        return null;
    }
}
