package e.d.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.d.c;
import e.d.m.f;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class i extends j {
    @Override // e.d.j.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        try {
            c.C0017c[] a = bVar.a();
            int length = a.length;
            int i3 = 0;
            FontFamily.Builder builder = null;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= length) {
                    break;
                }
                c.C0017c cVar = a[i4];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                    if (!cVar.f()) {
                        i5 = 0;
                    }
                    Font build = weight.setSlant(i5).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i4++;
            }
            if (builder == null) {
                return null;
            }
            int i6 = (i2 & 1) != 0 ? 700 : 400;
            if ((i2 & 2) != 0) {
                i3 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // e.d.j.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            int i3 = 0;
            FontFamily.Builder builder = null;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 < length) {
                    f.b bVar = bVarArr[i4];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor != null) {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.e());
                            if (!bVar.f()) {
                                i5 = 0;
                            }
                            Font build = weight.setSlant(i5).setTtcIndex(bVar.c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                            if (openFileDescriptor == null) {
                                i4++;
                            }
                        } catch (Throwable th) {
                            if (openFileDescriptor != null) {
                                try {
                                    openFileDescriptor.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                            break;
                        }
                    } else if (openFileDescriptor == null) {
                        i4++;
                    }
                    openFileDescriptor.close();
                    i4++;
                } else if (builder == null) {
                    return null;
                } else {
                    int i6 = (i2 & 1) != 0 ? 700 : 400;
                    if ((i2 & 2) != 0) {
                        i3 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e.d.j.j
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // e.d.j.j
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e.d.j.j
    public f.b h(f.b[] bVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
