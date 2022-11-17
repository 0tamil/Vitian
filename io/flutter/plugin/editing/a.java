package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
class a {
    private final FlutterJNI a;

    public a(FlutterJNI flutterJNI) {
        this.a = flutterJNI;
    }

    public int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = length - 1;
        if (i2 >= i3) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i2);
        int charCount = Character.charCount(codePointAt);
        int i4 = i2 + charCount;
        int i5 = 0;
        if (i4 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i4) == 13) {
                charCount++;
            }
            return i2 + charCount;
        } else if (!g(codePointAt)) {
            if (f(codePointAt)) {
                charCount += Character.charCount(codePointAt);
            }
            if (codePointAt == 8419) {
                int codePointBefore = Character.codePointBefore(charSequence, i4);
                int charCount2 = i4 + Character.charCount(codePointBefore);
                if (charCount2 < length && i(codePointBefore)) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                    if (f(codePointAt2)) {
                        charCount += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                    }
                } else if (f(codePointBefore)) {
                    charCount += Character.charCount(codePointBefore);
                }
                return i2 + charCount;
            }
            if (c(codePointAt)) {
                boolean z = false;
                int i6 = 0;
                do {
                    if (z) {
                        charCount += Character.charCount(codePointAt) + i6 + 1;
                        z = false;
                    }
                    if (d(codePointAt)) {
                        break;
                    }
                    if (i4 < length) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                        i4 += Character.charCount(codePointAt);
                        if (codePointAt != 8419) {
                            if (!d(codePointAt) && !i(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = Character.codePointAt(charSequence, i4);
                                    i4 += Character.charCount(codePointAt);
                                    if (i4 < length && i(codePointAt)) {
                                        codePointAt = Character.codePointAt(charSequence, i4);
                                        i6 = Character.charCount(codePointAt);
                                        i4 += Character.charCount(codePointAt);
                                        z = true;
                                        if (i4 < length || !z) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                            } else {
                                charCount += Character.charCount(codePointAt) + 0;
                                break;
                            }
                        } else {
                            int codePointBefore2 = Character.codePointBefore(charSequence, i4);
                            int charCount3 = i4 + Character.charCount(codePointBefore2);
                            if (charCount3 < length && i(codePointBefore2)) {
                                int codePointAt3 = Character.codePointAt(charSequence, charCount3);
                                if (f(codePointAt3)) {
                                    charCount += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                                }
                            } else if (f(codePointBefore2)) {
                                charCount += Character.charCount(codePointBefore2);
                            }
                            return i2 + charCount;
                        }
                    }
                    i6 = 0;
                    if (i4 < length) {
                        break;
                    }
                } while (c(codePointAt));
            }
            return i2 + charCount;
        } else if (i4 >= i3 || !g(Character.codePointAt(charSequence, i4))) {
            return i4;
        } else {
            int i7 = i2;
            while (i7 > 0 && g(Character.codePointBefore(charSequence, i2))) {
                i7 -= Character.charCount(Character.codePointBefore(charSequence, i2));
                i5++;
            }
            if (i5 % 2 == 0) {
                charCount += 2;
            }
            return i2 + charCount;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c A[EDGE_INSN: B:99:0x014c->B:93:0x014c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(CharSequence charSequence, int i2) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i3 = 0;
        int i4 = 1;
        if (i2 <= 1 || (charCount2 = i2 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i2))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i2 - charCount;
        } else if (g(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && g(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                i4++;
            }
            if (i4 % 2 == 0) {
                charCount += 2;
            }
            return i2 - charCount;
        } else if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && i(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (f(codePointBefore4)) {
                    charCount += Character.charCount(codePointBefore3) + Character.charCount(codePointBefore4);
                }
            } else if (f(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return i2 - charCount;
        } else {
            if (codePointBefore == 917631) {
                while (true) {
                    codePointBefore = Character.codePointBefore(charSequence, charCount2);
                    charCount2 -= Character.charCount(codePointBefore);
                    if (charCount2 <= 0 || !h(codePointBefore)) {
                        break;
                    }
                    charCount += Character.charCount(codePointBefore);
                }
                if (!c(codePointBefore)) {
                    return i2 - 2;
                }
                charCount += Character.charCount(codePointBefore);
            }
            if (i(codePointBefore)) {
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                if (!c(codePointBefore)) {
                    return i2 - charCount;
                }
                charCount += Character.charCount(codePointBefore);
                charCount2 -= charCount;
            }
            if (c(codePointBefore)) {
                boolean z = false;
                int i5 = 0;
                while (true) {
                    if (z) {
                        charCount += Character.charCount(codePointBefore) + i5 + 1;
                        z = false;
                    }
                    if (d(codePointBefore)) {
                        int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                        int charCount5 = charCount2 - Character.charCount(codePointBefore5);
                        if (charCount5 > 0 && i(codePointBefore5)) {
                            codePointBefore5 = Character.codePointBefore(charSequence, charCount5);
                            if (!c(codePointBefore5)) {
                                return i2 - charCount;
                            }
                            i3 = Character.charCount(codePointBefore5);
                            Character.charCount(codePointBefore5);
                        }
                        if (e(codePointBefore5)) {
                            charCount += i3 + Character.charCount(codePointBefore5);
                        }
                    } else {
                        if (charCount2 > 0) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (codePointBefore == 8205) {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                charCount2 -= Character.charCount(codePointBefore);
                                if (charCount2 > 0 && i(codePointBefore)) {
                                    codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                    i5 = Character.charCount(codePointBefore);
                                    charCount2 -= Character.charCount(codePointBefore);
                                    z = true;
                                    if (charCount2 != 0) {
                                        if (z) {
                                            if (c(codePointBefore)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                        i5 = 0;
                        if (charCount2 != 0) {
                        }
                    }
                }
            }
            return i2 - charCount;
        }
    }

    public boolean c(int i2) {
        return this.a.isCodePointEmoji(i2);
    }

    public boolean d(int i2) {
        return this.a.isCodePointEmojiModifier(i2);
    }

    public boolean e(int i2) {
        return this.a.isCodePointEmojiModifierBase(i2);
    }

    public boolean f(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public boolean g(int i2) {
        return this.a.isCodePointRegionalIndicator(i2);
    }

    public boolean h(int i2) {
        return 917536 <= i2 && i2 <= 917630;
    }

    public boolean i(int i2) {
        return this.a.isCodePointVariantSelector(i2);
    }
}
