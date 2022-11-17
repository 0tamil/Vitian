package com.google.android.gms.location;

import android.location.Location;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
@Deprecated
/* loaded from: classes.dex */
public interface a {
    @RecentlyNonNull
    g<Status> a(@RecentlyNonNull f fVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull c cVar);

    @RecentlyNonNull
    Location b(@RecentlyNonNull f fVar);

    @RecentlyNonNull
    g<Status> c(@RecentlyNonNull f fVar, @RecentlyNonNull c cVar);

    @RecentlyNonNull
    LocationAvailability d(@RecentlyNonNull f fVar);
}
