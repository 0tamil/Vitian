package e.d.n;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: e  reason: collision with root package name */
    private final Spannable f2104e;

    /* renamed from: f  reason: collision with root package name */
    private final a f2105f;

    /* renamed from: g  reason: collision with root package name */
    private final PrecomputedText f2106g;

    /* loaded from: classes.dex */
    public static final class a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2107d;

        /* renamed from: e.d.n.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0071a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;

            /* renamed from: d  reason: collision with root package name */
            private int f2108d;

            public C0071a(TextPaint textPaint) {
                this.a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.c = 1;
                    this.f2108d = 1;
                } else {
                    this.f2108d = 0;
                    this.c = 0;
                }
                this.b = i2 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.f2108d);
            }

            public C0071a b(int i2) {
                this.c = i2;
                return this;
            }

            public C0071a c(int i2) {
                this.f2108d = i2;
                return this;
            }

            public C0071a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.f2107d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.f2107d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.c != aVar.b() || this.f2107d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.f2107d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.b == aVar.d();
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return e.d.o.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2107d));
            }
            if (i2 >= 21) {
                return e.d.o.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2107d));
            }
            if (i2 < 18 && i2 < 17) {
                return e.d.o.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2107d));
            }
            return e.d.o.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2107d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.a.getTextSize());
            sb2.append(", textScaleX=" + this.a.getTextScaleX());
            sb2.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                sb2.append(", letterSpacing=" + this.a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i2 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.a.getTextLocales();
            } else {
                if (i2 >= 17) {
                    sb = new StringBuilder();
                    sb.append(", textLocale=");
                    textLocale = this.a.getTextLocale();
                }
                sb2.append(", typeface=" + this.a.getTypeface());
                if (i2 >= 26) {
                    sb2.append(", variationSettings=" + this.a.getFontVariationSettings());
                }
                sb2.append(", textDir=" + this.b);
                sb2.append(", breakStrategy=" + this.c);
                sb2.append(", hyphenationFrequency=" + this.f2107d);
                sb2.append("}");
                return sb2.toString();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.a.getTypeface());
            if (i2 >= 26) {
            }
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.c);
            sb2.append(", hyphenationFrequency=" + this.f2107d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f2105f;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2104e;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f2104e.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2104e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2104e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2104e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2106g.getSpans(i2, i3, cls) : (T[]) this.f2104e.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2104e.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2104e.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2106g.removeSpan(obj);
        } else {
            this.f2104e.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2106g.setSpan(obj, i2, i3, i4);
        } else {
            this.f2104e.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f2104e.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2104e.toString();
    }
}
