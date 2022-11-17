package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import e.a.j;
import io.flutter.embedding.engine.renderer.c;
import java.nio.ByteBuffer;
import java.util.Locale;
@TargetApi(19)
/* loaded from: classes.dex */
public class h extends View implements c {

    /* renamed from: e  reason: collision with root package name */
    private ImageReader f2932e;

    /* renamed from: f  reason: collision with root package name */
    private Image f2933f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f2934g;

    /* renamed from: h  reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2935h;

    /* renamed from: i  reason: collision with root package name */
    private b f2936i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2937j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public h(Context context, int i2, int i3, b bVar) {
        this(context, g(i2, i3), bVar);
    }

    h(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f2937j = false;
        this.f2932e = imageReader;
        this.f2936i = bVar;
        h();
    }

    private void e() {
        Image image = this.f2933f;
        if (image != null) {
            image.close();
            this.f2933f = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader g(int i2, int i3) {
        int i4;
        int i5;
        if (i2 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (i3 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i3));
            i5 = 1;
        } else {
            i5 = i3;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i4, i5, 1, 3, 768L) : ImageReader.newInstance(i4, i5, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        h.a.b.f("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(j.h3)
    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f2933f.getHardwareBuffer();
            this.f2934g = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f2933f.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f2933f.getHeight();
            Bitmap bitmap = this.f2934g;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f2934g.getHeight() == height)) {
                this.f2934g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f2934g.copyPixelsFromBuffer(buffer);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        if (a.a[this.f2936i.ordinal()] == 1) {
            aVar.s(this.f2932e.getSurface());
        }
        setAlpha(1.0f);
        this.f2935h = aVar;
        this.f2937j = true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f2937j) {
            setAlpha(0.0f);
            d();
            this.f2934g = null;
            e();
            invalidate();
            this.f2937j = false;
        }
    }

    @TargetApi(19)
    public boolean d() {
        if (!this.f2937j) {
            return false;
        }
        Image acquireLatestImage = this.f2932e.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f2933f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void f() {
        this.f2932e.close();
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2935h;
    }

    public ImageReader getImageReader() {
        return this.f2932e;
    }

    public Surface getSurface() {
        return this.f2932e.getSurface();
    }

    public void j(int i2, int i3) {
        if (this.f2935h != null) {
            if (i2 != this.f2932e.getWidth() || i3 != this.f2932e.getHeight()) {
                e();
                f();
                this.f2932e = g(i2, i3);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2933f != null) {
            k();
        }
        Bitmap bitmap = this.f2934g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f2932e.getWidth() && i3 == this.f2932e.getHeight()) && this.f2936i == b.background && this.f2937j) {
            j(i2, i3);
            this.f2935h.s(this.f2932e.getSurface());
        }
    }
}
