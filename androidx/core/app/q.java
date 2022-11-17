package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class q implements Iterable<Intent> {

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<Intent> f614e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final Context f615f;

    /* loaded from: classes.dex */
    public interface a {
        Intent e();
    }

    private q(Context context) {
        this.f615f = context;
    }

    public static q k(Context context) {
        return new q(context);
    }

    public q h(Intent intent) {
        this.f614e.add(intent);
        return this;
    }

    public q i(Activity activity) {
        Intent e2 = activity instanceof a ? ((a) activity).e() : null;
        if (e2 == null) {
            e2 = h.a(activity);
        }
        if (e2 != null) {
            ComponentName component = e2.getComponent();
            if (component == null) {
                component = e2.resolveActivity(this.f615f.getPackageManager());
            }
            j(component);
            h(e2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f614e.iterator();
    }

    public q j(ComponentName componentName) {
        int size = this.f614e.size();
        try {
            Context context = this.f615f;
            while (true) {
                Intent b = h.b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f614e.add(size, b);
                context = this.f615f;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void l() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (!this.f614e.isEmpty()) {
            ArrayList<Intent> arrayList = this.f614e;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.k(this.f615f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f615f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
