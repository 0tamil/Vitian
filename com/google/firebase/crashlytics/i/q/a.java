package com.google.firebase.crashlytics.i.q;
/* loaded from: classes.dex */
public class a implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int i2, d... dVarArr) {
        this.a = i2;
        this.b = dVarArr;
        this.c = new b(i2);
    }

    @Override // com.google.firebase.crashlytics.i.q.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
