package f.b.a.b.g;

import com.google.android.gms.common.internal.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class l {
    public static <TResult> TResult a(i<TResult> iVar) {
        p.g();
        p.j(iVar, "Task must not be null");
        if (iVar.m()) {
            return (TResult) h(iVar);
        }
        n nVar = new n(null);
        i(iVar, nVar);
        nVar.c();
        return (TResult) h(iVar);
    }

    public static <TResult> TResult b(i<TResult> iVar, long j2, TimeUnit timeUnit) {
        p.g();
        p.j(iVar, "Task must not be null");
        p.j(timeUnit, "TimeUnit must not be null");
        if (iVar.m()) {
            return (TResult) h(iVar);
        }
        n nVar = new n(null);
        i(iVar, nVar);
        if (nVar.e(j2, timeUnit)) {
            return (TResult) h(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> i<TResult> c(Executor executor, Callable<TResult> callable) {
        p.j(executor, "Executor must not be null");
        p.j(callable, "Callback must not be null");
        i0 i0Var = new i0();
        executor.execute(new j0(i0Var, callable));
        return i0Var;
    }

    public static <TResult> i<TResult> d(Exception exc) {
        i0 i0Var = new i0();
        i0Var.q(exc);
        return i0Var;
    }

    public static <TResult> i<TResult> e(TResult tresult) {
        i0 i0Var = new i0();
        i0Var.r(tresult);
        return i0Var;
    }

    public static i<Void> f(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        for (i<?> iVar : collection) {
            Objects.requireNonNull(iVar, "null tasks are not accepted");
        }
        i0 i0Var = new i0();
        p pVar = new p(collection.size(), i0Var);
        for (i<?> iVar2 : collection) {
            i(iVar2, pVar);
        }
        return i0Var;
    }

    public static i<Void> g(i<?>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? e(null) : f(Arrays.asList(iVarArr));
    }

    private static <TResult> TResult h(i<TResult> iVar) {
        if (iVar.n()) {
            return iVar.j();
        }
        if (iVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.i());
    }

    private static <T> void i(i<T> iVar, o<? super T> oVar) {
        Executor executor = k.b;
        iVar.e(executor, oVar);
        iVar.d(executor, oVar);
        iVar.a(executor, oVar);
    }
}
