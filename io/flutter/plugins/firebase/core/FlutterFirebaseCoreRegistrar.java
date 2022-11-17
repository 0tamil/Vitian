package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.s.h;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements r {
    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        return Collections.singletonList(h.a("flutter-fire-core", "1.17.0"));
    }
}
