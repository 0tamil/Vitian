package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import j.s.q;
import j.x.d.e;
import j.x.d.i;
import java.util.LinkedHashSet;
import java.util.Set;
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, boolean z, boolean z2, boolean z3, int i2, int i3, float f2, int i4) {
        super(i2, i3, f2, i4);
        Set<SplitPairFilter> t;
        i.d(set, "filters");
        this.finishPrimaryWithSecondary = z;
        this.finishSecondaryWithPrimary = z2;
        this.clearTop = z3;
        t = q.t(set);
        this.filters = t;
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z, boolean z2, boolean z3, int i2, int i3, float f2, int i4, int i5, e eVar) {
        this(set, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? true : z2, (i5 & 8) != 0 ? false : z3, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) == 0 ? i3 : 0, (i5 & 64) != 0 ? 0.5f : f2, (i5 & 128) != 0 ? 3 : i4);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return i.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + b.a(this.finishPrimaryWithSecondary)) * 31) + b.a(this.finishSecondaryWithPrimary)) * 31) + b.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        Set t;
        i.d(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        t = q.t(linkedHashSet);
        return new SplitPairRule(t, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
