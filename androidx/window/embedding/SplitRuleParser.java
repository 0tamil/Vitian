package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import androidx.window.core.ExperimentalWindowApi;
import j.c0.n;
import j.s.d0;
import j.x.d.i;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        int z;
        int z2;
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, i.i(str, obj));
                }
                z = n.z(obj, '/', 0, false, 6, null);
                if (z > 0) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj.substring(0, z);
                    i.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(z + 1);
                    i.c(obj, "(this as java.lang.String).substring(startIndex)");
                    str = substring;
                }
                if (!i.a(obj, "*")) {
                    z2 = n.z(obj, '.', 0, false, 6, null);
                    if (z2 < 0) {
                        return new ComponentName(str, str + '.' + obj);
                    }
                }
                return new ComponentName(str, obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        i.c(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        Set b;
        boolean z = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false);
        b = d0.b();
        return new ActivityRule(b, z);
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        i.c(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        Set b;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i2 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false);
        b = d0.b();
        return new SplitPairRule(b, z, z2, z3, dimension, dimension2, f2, i2);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        Set b;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i2 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        i.c(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        b = d0.b();
        Intent component = new Intent().setComponent(buildClassName);
        i.c(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(b, component, dimension, dimension2, f2, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Set<EmbeddingRule> parseSplitXml(Context context, int i2) {
        String name;
        SplitPlaceholderRule plus$window_release;
        ActivityRule plus$window_release2;
        SplitPairRule splitPairRule;
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            i.c(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            ActivityRule activityRule = null;
            SplitPairRule splitPairRule2 = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            for (int next = xml.next(); next != 1 && (next != 3 || xml.getDepth() > depth); next = xml.next()) {
                if (xml.getEventType() == 2 && !i.a("split-config", xml.getName()) && (name = xml.getName()) != null) {
                    switch (name.hashCode()) {
                        case 511422343:
                            if (!name.equals("ActivityFilter")) {
                                continue;
                            } else if (activityRule != null || splitPlaceholderRule != null) {
                                ActivityFilter parseActivityFilter = parseActivityFilter(context, xml);
                                if (activityRule == null) {
                                    if (splitPlaceholderRule != null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        plus$window_release = splitPlaceholderRule.plus$window_release(parseActivityFilter);
                                        hashSet.add(plus$window_release);
                                        splitPlaceholderRule = plus$window_release;
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    hashSet.remove(activityRule);
                                    plus$window_release2 = activityRule.plus$window_release(parseActivityFilter);
                                    hashSet.add(plus$window_release2);
                                    activityRule = plus$window_release2;
                                    break;
                                }
                            } else {
                                throw new IllegalArgumentException("Found orphaned ActivityFilter");
                            }
                        case 520447504:
                            if (!name.equals("SplitPairRule")) {
                                break;
                            } else {
                                splitPairRule = parseSplitPairRule(context, xml);
                                hashSet.add(splitPairRule);
                                activityRule = null;
                                splitPlaceholderRule = null;
                                splitPairRule2 = splitPairRule;
                                break;
                            }
                        case 1579230604:
                            if (!name.equals("SplitPairFilter")) {
                                continue;
                            } else if (splitPairRule2 != null) {
                                SplitPairFilter parseSplitPairFilter = parseSplitPairFilter(context, xml);
                                hashSet.remove(splitPairRule2);
                                splitPairRule = splitPairRule2.plus$window_release(parseSplitPairFilter);
                                hashSet.add(splitPairRule);
                                splitPairRule2 = splitPairRule;
                                break;
                            } else {
                                throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                            }
                        case 1793077963:
                            if (!name.equals("ActivityRule")) {
                                break;
                            } else {
                                plus$window_release2 = parseSplitActivityRule(context, xml);
                                hashSet.add(plus$window_release2);
                                splitPairRule2 = null;
                                splitPlaceholderRule = null;
                                activityRule = plus$window_release2;
                                break;
                            }
                        case 2050988213:
                            if (!name.equals("SplitPlaceholderRule")) {
                                break;
                            } else {
                                plus$window_release = parseSplitPlaceholderRule(context, xml);
                                hashSet.add(plus$window_release);
                                activityRule = null;
                                splitPairRule2 = null;
                                splitPlaceholderRule = plus$window_release;
                                break;
                            }
                    }
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i2) {
        i.d(context, "context");
        return parseSplitXml(context, i2);
    }
}
