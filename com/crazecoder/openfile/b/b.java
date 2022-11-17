package com.crazecoder.openfile.b;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {
    public static Map<String, Object> a(int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(i2));
        hashMap.put("message", str);
        return hashMap;
    }
}
