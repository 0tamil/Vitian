package f.b.c.z.n.o;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i2, char c) {
        return i2 < str.length() && str.charAt(i2) == c;
    }

    private static int b(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:40:0x00b0, B:41:0x00b3, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:60:0x0107, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:75:0x0183, B:77:0x01b4, B:78:0x01bb), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:40:0x00b0, B:41:0x00b3, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:60:0x0107, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:75:0x0183, B:77:0x01b4, B:78:0x01bb), top: B:90:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date c(String str, ParsePosition parsePosition) {
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int d2 = d(str, index, i7);
            if (a(str, i7, '-')) {
                i7++;
            }
            int i8 = i7 + 2;
            int d3 = d(str, i7, i8);
            if (a(str, i8, '-')) {
                i8++;
            }
            int i9 = i8 + 2;
            int d4 = d(str, i8, i9);
            boolean a2 = a(str, i9, 'T');
            if (a2 || str.length() > i9) {
                if (a2) {
                    int i10 = i9 + 1;
                    int i11 = i10 + 2;
                    int d5 = d(str, i10, i11);
                    if (a(str, i11, ':')) {
                        i11++;
                    }
                    int i12 = i11 + 2;
                    int d6 = d(str, i11, i12);
                    if (a(str, i12, ':')) {
                        i12++;
                    }
                    if (str.length() <= i12 || (charAt = str.charAt(i12)) == 'Z' || charAt == '+' || charAt == '-') {
                        i4 = d6;
                        i3 = 0;
                        i5 = d5;
                        i9 = i12;
                    } else {
                        int i13 = i12 + 2;
                        i2 = d(str, i12, i13);
                        if (i2 > 59 && i2 < 63) {
                            i2 = 59;
                        }
                        if (a(str, i13, '.')) {
                            int i14 = i13 + 1;
                            int b = b(str, i14 + 1);
                            int min = Math.min(b, i14 + 3);
                            int d7 = d(str, i14, min);
                            int i15 = min - i14;
                            if (i15 == 1) {
                                d7 *= 100;
                            } else if (i15 == 2) {
                                d7 *= 10;
                            }
                            i4 = d6;
                            i3 = d7;
                            i5 = d5;
                            i9 = b;
                        } else {
                            i4 = d6;
                            i5 = d5;
                            i9 = i13;
                            i3 = 0;
                        }
                        if (str.length() <= i9) {
                            char charAt2 = str.charAt(i9);
                            if (charAt2 == 'Z') {
                                timeZone = a;
                                i6 = i9 + 1;
                            } else {
                                if (!(charAt2 == '+' || charAt2 == '-')) {
                                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                                }
                                String substring = str.substring(i9);
                                if (substring.length() < 5) {
                                    substring = substring + "00";
                                }
                                i6 = i9 + substring.length();
                                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                    String str3 = "GMT" + substring;
                                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                                    String id = timeZone2.getID();
                                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                    }
                                    timeZone = timeZone2;
                                }
                                timeZone = a;
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                            gregorianCalendar.setLenient(false);
                            gregorianCalendar.set(1, d2);
                            gregorianCalendar.set(2, d3 - 1);
                            gregorianCalendar.set(5, d4);
                            gregorianCalendar.set(11, i5);
                            gregorianCalendar.set(12, i4);
                            gregorianCalendar.set(13, i2);
                            gregorianCalendar.set(14, i3);
                            parsePosition.setIndex(i6);
                            return gregorianCalendar.getTime();
                        }
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                } else {
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                }
                i2 = 0;
                if (str.length() <= i9) {
                }
            } else {
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(d2, d3 - 1, d4);
                parsePosition.setIndex(i9);
                return gregorianCalendar2.getTime();
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException e2) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e2.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static int d(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i4 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        } else {
            i5 = i2;
            i4 = 0;
        }
        while (i5 < i3) {
            i5++;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 >= 0) {
                i4 = (i4 * 10) - digit2;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        }
        return -i4;
    }
}
