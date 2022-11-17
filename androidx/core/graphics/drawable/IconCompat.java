package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.d.f;
import androidx.versionedparcelable.CustomVersionedParcelable;
import e.d.o.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f628k = PorterDuff.Mode.SRC_IN;
    public int a;
    Object b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f629d;

    /* renamed from: e  reason: collision with root package name */
    public int f630e;

    /* renamed from: f  reason: collision with root package name */
    public int f631f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f632g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f633h;

    /* renamed from: i  reason: collision with root package name */
    public String f634i;

    /* renamed from: j  reason: collision with root package name */
    public String f635j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.f629d = null;
        this.f630e = 0;
        this.f631f = 0;
        this.f632g = null;
        this.f633h = f628k;
        this.f634i = null;
    }

    private IconCompat(int i2) {
        this.a = -1;
        this.c = null;
        this.f629d = null;
        this.f630e = 0;
        this.f631f = 0;
        this.f632g = null;
        this.f633h = f628k;
        this.f634i = null;
        this.a = i2;
    }

    private static String E(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat b(Bundle bundle) {
        Object obj;
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.f630e = bundle.getInt("int1");
        iconCompat.f631f = bundle.getInt("int2");
        iconCompat.f635j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f632g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f633h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable("obj");
                iconCompat.b = obj;
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i2);
                return null;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString("obj");
                iconCompat.b = obj;
                break;
            case 3:
                iconCompat.b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static IconCompat c(Icon icon) {
        d.d(icon);
        int t = t(icon);
        if (t == 2) {
            return l(null, q(icon), o(icon));
        }
        if (t == 4) {
            return h(v(icon));
        }
        if (t == 6) {
            return e(v(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.b = icon;
        return iconCompat;
    }

    static Bitmap d(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat e(Uri uri) {
        if (uri != null) {
            return f(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat f(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(6);
            iconCompat.b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat g(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat h(Uri uri) {
        if (uri != null) {
            return i(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat i(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat j(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.b = bArr;
            iconCompat.f630e = i2;
            iconCompat.f631f = i3;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat k(Context context, int i2) {
        if (context != null) {
            return l(context.getResources(), context.getPackageName(), i2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat l(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f630e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.f635j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static int o(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String q(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static Resources r(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    private static int t(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri v(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private Drawable y(Context context) {
        switch (this.a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.b);
            case 2:
                String p = p();
                if (TextUtils.isEmpty(p)) {
                    p = context.getPackageName();
                }
                try {
                    return f.d(r(context, p), this.f630e, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f630e), this.b), e2);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.b, this.f630e, this.f631f));
            case 4:
                InputStream w = w(context);
                if (w != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(w));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), d((Bitmap) this.b, false));
            case 6:
                InputStream w2 = w(context);
                if (w2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(w2))) : new BitmapDrawable(context.getResources(), d(BitmapFactory.decodeStream(w2), false));
                }
                break;
        }
        return null;
    }

    public void A(boolean z) {
        this.f634i = this.f633h.name();
        switch (this.a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f629d = (Parcelable) this.b;
    }

    public Bundle B() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.a) {
            case -1:
                parcelable = (Parcelable) this.b;
                bundle.putParcelable("obj", parcelable);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                parcelable = (Bitmap) this.b;
                bundle.putParcelable("obj", parcelable);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.b);
                break;
        }
        bundle.putInt("type", this.a);
        bundle.putInt("int1", this.f630e);
        bundle.putInt("int2", this.f631f);
        bundle.putString("string1", this.f635j);
        ColorStateList colorStateList = this.f632g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f633h;
        if (mode != f628k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon C() {
        return D(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r0 >= 26) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r0 >= 26) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        r5 = d(r5, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Icon D(Context context) {
        Icon icon;
        Bitmap bitmap;
        int i2 = Build.VERSION.SDK_INT;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                Bitmap bitmap2 = (Bitmap) this.b;
                icon = Icon.createWithBitmap(bitmap2);
                break;
            case 2:
                icon = Icon.createWithResource(p(), this.f630e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.b, this.f630e, this.f631f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                bitmap = (Bitmap) this.b;
                break;
            case 6:
                if (i2 >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(u());
                    break;
                } else if (context != null) {
                    InputStream w = w(context);
                    if (w != null) {
                        bitmap = BitmapFactory.decodeStream(w);
                        break;
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + u());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + u());
                }
        }
        ColorStateList colorStateList = this.f632g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f633h;
        if (mode != f628k) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public void a(Context context) {
        Object obj;
        if (this.a == 2 && (obj = this.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String p = p();
                int identifier = r(context, p).getIdentifier(str4, str3, str5);
                if (this.f630e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + p + " " + str);
                    this.f630e = identifier;
                }
            }
        }
    }

    public Bitmap m() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i2 == 1) {
            return (Bitmap) this.b;
        } else {
            if (i2 == 5) {
                return d((Bitmap) this.b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int n() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return o((Icon) this.b);
        }
        if (i2 == 2) {
            return this.f630e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String p() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return q((Icon) this.b);
        }
        if (i2 == 2) {
            return TextUtils.isEmpty(this.f635j) ? ((String) this.b).split(":", -1)[0] : this.f635j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int s() {
        int i2 = this.a;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : t((Icon) this.b);
    }

    public String toString() {
        int i2;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(E(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                i2 = ((Bitmap) this.b).getHeight();
                sb.append(i2);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f635j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(n())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f630e);
                if (this.f631f != 0) {
                    sb.append(" off=");
                    i2 = this.f631f;
                    sb.append(i2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.f632g != null) {
            sb.append(" tint=");
            sb.append(this.f632g);
        }
        if (this.f633h != f628k) {
            sb.append(" mode=");
            sb.append(this.f633h);
        }
        sb.append(")");
        return sb.toString();
    }

    public Uri u() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return v((Icon) this.b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream w(Context context) {
        StringBuilder sb;
        String str;
        Uri u = u();
        String scheme = u.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(u);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(u);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public Drawable x(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return D(context).loadDrawable(context);
        }
        Drawable y = y(context);
        if (!(y == null || (this.f632g == null && this.f633h == f628k))) {
            y.mutate();
            a.n(y, this.f632g);
            a.o(y, this.f633h);
        }
        return y;
    }

    public void z() {
        Parcelable parcelable;
        this.f633h = PorterDuff.Mode.valueOf(this.f634i);
        switch (this.a) {
            case -1:
                parcelable = this.f629d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f629d;
                if (parcelable == null) {
                    byte[] bArr = this.c;
                    this.b = bArr;
                    this.a = 3;
                    this.f630e = 0;
                    this.f631f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName("UTF-16"));
                this.b = str;
                if (this.a == 2 && this.f635j == null) {
                    this.f635j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.c;
                return;
        }
        this.b = parcelable;
    }
}
