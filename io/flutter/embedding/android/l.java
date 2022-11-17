package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.embedding.android.m;
import io.flutter.embedding.engine.j.d;
/* loaded from: classes.dex */
public class l implements m.c {
    private final d a;
    private int b;

    public l(d dVar) {
        this.a = dVar;
    }

    @Override // io.flutter.embedding.android.m.c
    public void a(KeyEvent keyEvent, final m.c.a aVar) {
        int action = keyEvent.getAction();
        boolean z = false;
        if (action == 0 || action == 1) {
            d.b bVar = new d.b(keyEvent, b(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z = true;
            }
            this.a.d(bVar, z, new d.a() { // from class: io.flutter.embedding.android.a
                @Override // io.flutter.embedding.engine.j.d.a
                public final void a(boolean z2) {
                    m.c.a.this.a(z2);
                }
            });
            return;
        }
        aVar.a(false);
    }

    Character b(int i2) {
        char c = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = this.b;
            if (i4 != 0) {
                i3 = KeyCharacterMap.getDeadChar(i4, i3);
            }
            this.b = i3;
        } else {
            int i5 = this.b;
            if (i5 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i5, i2);
                if (deadChar > 0) {
                    c = (char) deadChar;
                }
                this.b = 0;
            }
        }
        return Character.valueOf(c);
    }
}
