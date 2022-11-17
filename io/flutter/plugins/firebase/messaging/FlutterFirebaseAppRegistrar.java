package io.flutter.plugins.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.s.h;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements r {
    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        return Collections.singletonList(h.a("flutter-fire-fcm", "11.4.0"));
    }
}
