package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        return Boolean.valueOf(str == null || str.isEmpty());
    }
}
