package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import h.a.d.d.l;
import io.flutter.embedding.android.m;
import io.flutter.embedding.engine.j.n;
import io.flutter.plugin.editing.c;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class e implements c.b {
    private final View a;
    private final InputMethodManager b;
    private final AutofillManager c;

    /* renamed from: d  reason: collision with root package name */
    private final n f3194d;

    /* renamed from: e  reason: collision with root package name */
    private c f3195e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private n.b f3196f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<n.b> f3197g;

    /* renamed from: h  reason: collision with root package name */
    private io.flutter.plugin.editing.c f3198h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3199i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f3200j;

    /* renamed from: k  reason: collision with root package name */
    private l f3201k;
    private Rect l;
    private ImeSyncDeferringInsetsCallback m;
    private n.e n;

    /* loaded from: classes.dex */
    class a implements n.f {
        a() {
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void a() {
            e eVar = e.this;
            eVar.E(eVar.a);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void b(String str, Bundle bundle) {
            e.this.A(str, bundle);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void c() {
            e.this.m();
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void d(int i2) {
            e.this.B(i2);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void e(double d2, double d3, double[] dArr) {
            e.this.z(d2, d3, dArr);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void f() {
            e.this.w();
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void g(int i2, n.b bVar) {
            e.this.C(i2, bVar);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void h(boolean z) {
            if (Build.VERSION.SDK_INT >= 26 && e.this.c != null) {
                if (z) {
                    e.this.c.commit();
                } else {
                    e.this.c.cancel();
                }
            }
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void i() {
            if (e.this.f3195e.a == c.a.PLATFORM_VIEW) {
                e.this.x();
                return;
            }
            e eVar = e.this;
            eVar.s(eVar.a);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void j(n.e eVar) {
            e eVar2 = e.this;
            eVar2.D(eVar2.a, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d {
        final /* synthetic */ boolean a;
        final /* synthetic */ double[] b;
        final /* synthetic */ double[] c;

        b(e eVar, boolean z, double[] dArr, double[] dArr2) {
            this.a = z;
            this.b = dArr;
            this.c = dArr2;
        }

        @Override // io.flutter.plugin.editing.e.d
        public void a(double d2, double d3) {
            double d4 = 1.0d;
            if (!this.a) {
                double[] dArr = this.b;
                d4 = 1.0d / (((dArr[3] * d2) + (dArr[7] * d3)) + dArr[15]);
            }
            double[] dArr2 = this.b;
            double d5 = ((dArr2[0] * d2) + (dArr2[4] * d3) + dArr2[12]) * d4;
            double d6 = ((dArr2[1] * d2) + (dArr2[5] * d3) + dArr2[13]) * d4;
            double[] dArr3 = this.c;
            if (d5 < dArr3[0]) {
                dArr3[0] = d5;
            } else if (d5 > dArr3[1]) {
                dArr3[1] = d5;
            }
            if (d6 < dArr3[2]) {
                dArr3[2] = d6;
            } else if (d6 > dArr3[3]) {
                dArr3[3] = d6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        a a;
        int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            PLATFORM_VIEW
        }

        public c(a aVar, int i2) {
            this.a = aVar;
            this.b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        void a(double d2, double d3);
    }

    @SuppressLint({"NewApi"})
    public e(View view, n nVar, l lVar) {
        int i2 = 0;
        this.a = view;
        AutofillManager autofillManager = null;
        this.f3198h = new io.flutter.plugin.editing.c(null, view);
        this.b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        this.c = i3 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : autofillManager;
        if (i3 >= 30) {
            i2 = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : i2;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? i2 | WindowInsets.Type.statusBars() : i2, WindowInsets.Type.ime());
            this.m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f3194d = nVar;
        nVar.m(new a());
        nVar.j();
        this.f3201k = lVar;
        lVar.t(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2) {
        this.f3195e = new c(c.a.PLATFORM_VIEW, i2);
        this.f3200j = null;
    }

    private void F(n.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f3109j == null) {
                this.f3197g = null;
                return;
            }
            n.b[] bVarArr = bVar.f3110k;
            SparseArray<n.b> sparseArray = new SparseArray<>();
            this.f3197g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f3109j.a.hashCode(), bVar);
                return;
            }
            for (n.b bVar2 : bVarArr) {
                n.b.a aVar = bVar2.f3109j;
                if (aVar != null) {
                    this.f3197g.put(aVar.a.hashCode(), bVar2);
                    this.c.notifyValueChanged(this.a, aVar.a.hashCode(), AutofillValue.forText(aVar.c.a));
                }
            }
        }
    }

    private boolean k() {
        n.c cVar;
        n.b bVar = this.f3196f;
        return bVar == null || (cVar = bVar.f3106g) == null || cVar.a != n.g.NONE;
    }

    private static boolean n(n.e eVar, n.e eVar2) {
        int i2 = eVar.f3119e - eVar.f3118d;
        if (i2 != eVar2.f3119e - eVar2.f3118d) {
            return true;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (eVar.a.charAt(eVar.f3118d + i3) != eVar2.a.charAt(eVar2.f3118d + i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        x();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(n.c cVar, boolean z, boolean z2, boolean z3, boolean z4, n.d dVar) {
        n.g gVar = cVar.a;
        if (gVar == n.g.DATETIME) {
            return 4;
        }
        if (gVar == n.g.NUMBER) {
            int i2 = 2;
            if (cVar.b) {
                i2 = 4098;
            }
            return cVar.c ? i2 | 8192 : i2;
        } else if (gVar == n.g.PHONE) {
            return 3;
        } else {
            if (gVar == n.g.NONE) {
                return 0;
            }
            int i3 = 1;
            if (gVar == n.g.MULTILINE) {
                i3 = 131073;
            } else if (gVar == n.g.EMAIL_ADDRESS) {
                i3 = 33;
            } else if (gVar == n.g.URL) {
                i3 = 17;
            } else if (gVar == n.g.VISIBLE_PASSWORD) {
                i3 = 145;
            } else if (gVar == n.g.NAME) {
                i3 = 97;
            } else if (gVar == n.g.POSTAL_ADDRESS) {
                i3 = 113;
            }
            if (z) {
                i3 = i3 | 524288 | 128;
            } else {
                if (z2) {
                    i3 |= 32768;
                }
                if (!z3) {
                    i3 |= 524288;
                }
            }
            return dVar == n.d.CHARACTERS ? i3 | 4096 : dVar == n.d.WORDS ? i3 | 8192 : dVar == n.d.SENTENCES ? i3 | 16384 : i3;
        }
    }

    private boolean u() {
        return this.f3197g != null;
    }

    private void v(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && u()) {
            this.c.notifyValueChanged(this.a, this.f3196f.f3109j.a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && u()) {
            String str = this.f3196f.f3109j.a;
            int[] iArr = new int[2];
            this.a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.l);
            rect.offset(iArr[0], iArr[1]);
            this.c.notifyViewEntered(this.a, str.hashCode(), rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        n.b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.c != null && (bVar = this.f3196f) != null && bVar.f3109j != null && u()) {
            this.c.notifyViewExited(this.a, this.f3196f.f3109j.a.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12] / dArr[15];
        dArr2[1] = d4;
        dArr2[0] = d4;
        double d5 = dArr[13] / dArr[15];
        dArr2[3] = d5;
        dArr2[2] = d5;
        b bVar = new b(this, z, dArr, dArr2);
        bVar.a(d2, 0.0d);
        bVar.a(d2, d3);
        bVar.a(0.0d, d3);
        Float valueOf = Float.valueOf(this.a.getContext().getResources().getDisplayMetrics().density);
        this.l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    public void A(String str, Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, str, bundle);
    }

    void C(int i2, n.b bVar) {
        x();
        this.f3196f = bVar;
        this.f3195e = k() ? new c(c.a.FRAMEWORK_CLIENT, i2) : new c(c.a.NO_TARGET, i2);
        this.f3198h.l(this);
        n.b.a aVar = bVar.f3109j;
        this.f3198h = new io.flutter.plugin.editing.c(aVar != null ? aVar.c : null, this.a);
        F(bVar);
        this.f3199i = true;
        this.l = null;
        this.f3198h.a(this);
    }

    void D(View view, n.e eVar) {
        n.e eVar2;
        if (!this.f3199i && (eVar2 = this.n) != null && eVar2.b()) {
            boolean n = n(this.n, eVar);
            this.f3199i = n;
            if (n) {
                h.a.b.d("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = eVar;
        this.f3198h.n(eVar);
        if (this.f3199i) {
            this.b.restartInput(view);
            this.f3199i = false;
        }
    }

    void E(View view) {
        if (k()) {
            view.requestFocus();
            this.b.showSoftInput(view, 0);
            return;
        }
        s(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == r1.f3119e) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (z) {
            v(this.f3198h.toString());
        }
        int i2 = this.f3198h.i();
        int h2 = this.f3198h.h();
        int g2 = this.f3198h.g();
        int f2 = this.f3198h.f();
        ArrayList<io.flutter.plugin.editing.d> e2 = this.f3198h.e();
        if (this.n != null) {
            if (this.f3198h.toString().equals(this.n.a)) {
                n.e eVar = this.n;
                if (i2 == eVar.b) {
                    if (h2 == eVar.c) {
                        if (g2 == eVar.f3118d) {
                        }
                    }
                }
            }
            z4 = false;
            if (z4) {
                h.a.b.e("TextInputPlugin", "send EditingState to flutter: " + this.f3198h.toString());
                if (this.f3196f.f3104e) {
                    this.f3194d.p(this.f3195e.b, e2);
                    this.f3198h.c();
                } else {
                    this.f3194d.o(this.f3195e.b, this.f3198h.toString(), i2, h2, g2, f2);
                }
                this.n = new n.e(this.f3198h.toString(), i2, h2, g2, f2);
                return;
            }
            this.f3198h.c();
            return;
        }
        z4 = true;
        if (z4) {
        }
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        n.b.a aVar;
        n.b.a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (aVar = this.f3196f.f3109j) != null) {
            HashMap<String, n.e> hashMap = new HashMap<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                n.b bVar = this.f3197g.get(sparseArray.keyAt(i2));
                if (!(bVar == null || (aVar2 = bVar.f3109j) == null)) {
                    String charSequence = sparseArray.valueAt(i2).getTextValue().toString();
                    n.e eVar = new n.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.a.equals(aVar.a)) {
                        this.f3198h.n(eVar);
                    } else {
                        hashMap.put(aVar2.a, eVar);
                    }
                }
            }
            this.f3194d.q(this.f3195e.b, hashMap);
        }
    }

    public void l(int i2) {
        c cVar = this.f3195e;
        if (cVar.a == c.a.PLATFORM_VIEW && cVar.b == i2) {
            this.f3195e = new c(c.a.NO_TARGET, 0);
            x();
            this.b.hideSoftInputFromWindow(this.a.getApplicationWindowToken(), 0);
            this.b.restartInput(this.a);
            this.f3199i = false;
        }
    }

    void m() {
        this.f3198h.l(this);
        x();
        F(null);
        this.f3195e = new c(c.a.NO_TARGET, 0);
        this.l = null;
    }

    public InputConnection o(View view, m mVar, EditorInfo editorInfo) {
        c.a aVar = this.f3195e.a;
        if (aVar == c.a.NO_TARGET) {
            this.f3200j = null;
            return null;
        } else if (aVar == c.a.PLATFORM_VIEW) {
            return null;
        } else {
            n.b bVar = this.f3196f;
            int t = t(bVar.f3106g, bVar.a, bVar.b, bVar.c, bVar.f3103d, bVar.f3105f);
            editorInfo.inputType = t;
            editorInfo.imeOptions = 33554432;
            if (Build.VERSION.SDK_INT >= 26 && !this.f3196f.f3103d) {
                editorInfo.imeOptions = 33554432 | 16777216;
            }
            Integer num = this.f3196f.f3107h;
            int intValue = num == null ? (t & 131072) != 0 ? 1 : 6 : num.intValue();
            String str = this.f3196f.f3108i;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            io.flutter.plugin.editing.b bVar2 = new io.flutter.plugin.editing.b(view, this.f3195e.b, this.f3194d, mVar, this.f3198h, editorInfo);
            editorInfo.initialSelStart = this.f3198h.i();
            editorInfo.initialSelEnd = this.f3198h.h();
            this.f3200j = bVar2;
            return bVar2;
        }
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f3201k.B();
        this.f3194d.m(null);
        x();
        this.f3198h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f3200j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void y(ViewStructure viewStructure, int i2) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT >= 26 && u()) {
            String str = this.f3196f.f3109j.a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < this.f3197g.size(); i3++) {
                int keyAt = this.f3197g.keyAt(i3);
                n.b.a aVar = this.f3197g.valueAt(i3).f3109j;
                if (aVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    newChild.setAutofillHints(aVar.b);
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f3111d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.l) == null) {
                        viewStructure2 = newChild;
                        viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                        charSequence = aVar.c.a;
                    } else {
                        viewStructure2 = newChild;
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.l.height());
                        charSequence = this.f3198h;
                    }
                    viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
                }
            }
        }
    }
}
