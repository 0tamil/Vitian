package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f2915d = new Matrix();
    private final a a;
    private final n b = n.a();
    private final boolean c;

    public b(a aVar, boolean z) {
        this.a = aVar;
        this.c = z;
    }

    private void a(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer) {
        float[] fArr;
        long j2;
        double d2;
        double d3;
        double d4;
        double d5;
        InputDevice.MotionRange motionRange;
        if (i3 != -1) {
            long d6 = this.c ? this.b.c(motionEvent).d() : 0L;
            int c = c(motionEvent.getToolType(i2));
            int i5 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer.putLong(d6);
            byteBuffer.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer.putLong(i3);
            byteBuffer.putLong(c);
            byteBuffer.putLong(i5);
            byteBuffer.putLong(motionEvent.getPointerId(i2));
            byteBuffer.putLong(0L);
            matrix.mapPoints(new float[]{motionEvent.getX(i2), motionEvent.getY(i2)});
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
            if (c == 1) {
                j2 = motionEvent.getButtonState() & 31;
                if (j2 == 0 && motionEvent.getSource() == 8194 && (i3 == 4 || i3 == 5)) {
                    j2 = 1;
                }
            } else {
                j2 = c == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
            }
            byteBuffer.putLong(j2);
            byteBuffer.putLong(0L);
            byteBuffer.putLong(0L);
            byteBuffer.putDouble(motionEvent.getPressure(i2));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d2 = 1.0d;
                d3 = 0.0d;
            } else {
                d3 = motionRange.getMin();
                d2 = motionRange.getMax();
            }
            byteBuffer.putDouble(d3);
            byteBuffer.putDouble(d2);
            if (c == 2) {
                byteBuffer.putDouble(motionEvent.getAxisValue(24, i2));
                d4 = 0.0d;
            } else {
                d4 = 0.0d;
                byteBuffer.putDouble(0.0d);
            }
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(motionEvent.getSize(i2));
            byteBuffer.putDouble(motionEvent.getToolMajor(i2));
            byteBuffer.putDouble(motionEvent.getToolMinor(i2));
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(motionEvent.getAxisValue(8, i2));
            if (c == 2) {
                byteBuffer.putDouble(motionEvent.getAxisValue(25, i2));
            } else {
                byteBuffer.putDouble(d4);
            }
            byteBuffer.putLong(i4);
            if (i5 == 1) {
                byteBuffer.putDouble(-motionEvent.getAxisValue(10));
                byteBuffer.putDouble(-motionEvent.getAxisValue(9));
                d5 = 0.0d;
            } else {
                d5 = 0.0d;
                byteBuffer.putDouble(0.0d);
                byteBuffer.putDouble(0.0d);
            }
            byteBuffer.putDouble(d5);
            byteBuffer.putDouble(d5);
            byteBuffer.putDouble(d5);
            byteBuffer.putDouble(d5);
            byteBuffer.putDouble(1.0d);
            byteBuffer.putDouble(d5);
        }
    }

    private int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    private int c(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return i2 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean d(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int b = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b, 0, f2915d, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.a.g(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean e(MotionEvent motionEvent) {
        return f(motionEvent, f2915d);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b = b(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (!z) {
            int i2 = 0;
            if (z2) {
                while (i2 < pointerCount) {
                    if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
                        a(motionEvent, i2, 5, 1, matrix, allocateDirect);
                    }
                    i2++;
                }
            } else {
                while (i2 < pointerCount) {
                    a(motionEvent, i2, b, 0, matrix, allocateDirect);
                    i2++;
                }
                if (allocateDirect.position() % 280 != 0) {
                    this.a.g(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary");
            }
        }
        a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        if (allocateDirect.position() % 280 != 0) {
        }
    }
}
