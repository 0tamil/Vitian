package com.google.firebase.n.j;

import com.google.firebase.n.j.f;
import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class c {
    private int a;
    private f.a b = f.a.DEFAULT;

    /* loaded from: classes.dex */
    private static final class a implements f {
        private final int a;
        private final f.a b;

        a(int i2, f.a aVar) {
            this.a = i2;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return f.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.tag() && this.b.equals(fVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.n.j.f
        public f.a intEncoding() {
            return this.b;
        }

        @Override // com.google.firebase.n.j.f
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static c b() {
        return new c();
    }

    public f a() {
        return new a(this.a, this.b);
    }

    public c c(int i2) {
        this.a = i2;
        return this;
    }
}
