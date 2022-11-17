package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.m;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.j.n;
import io.flutter.plugin.editing.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends BaseInputConnection implements c.b {
    private final View a;
    private final int b;
    private final n c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3174d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f3175e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f3176f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3177g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f3178h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f3179i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f3180j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f3181k;
    private a l;
    private final m m;
    private int n;

    public b(View view, int i2, n nVar, m mVar, c cVar, EditorInfo editorInfo) {
        this(view, i2, nVar, mVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i2, n nVar, m mVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f3177g = false;
        this.f3179i = new ExtractedText();
        this.n = 0;
        this.a = view;
        this.b = i2;
        this.c = nVar;
        this.f3174d = cVar;
        cVar.a(this);
        this.f3175e = editorInfo;
        this.m = mVar;
        this.l = new a(flutterJNI);
        this.f3181k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3180j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i2) {
        if (i2 == 16908319) {
            setSelection(0, this.f3174d.length());
            return true;
        } else if (i2 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f3174d);
            int selectionEnd = Selection.getSelectionEnd(this.f3174d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f3174d.subSequence(min, max)));
                this.f3174d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i2 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f3174d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f3174d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f3174d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i2 != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f3174d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f3174d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f3174d.delete(min2, max4);
                }
                this.f3174d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    private CursorAnchorInfo c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f3178h;
        if (builder == null) {
            this.f3178h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f3178h.setSelectionRange(this.f3174d.i(), this.f3174d.h());
        int g2 = this.f3174d.g();
        int f2 = this.f3174d.f();
        if (g2 < 0 || f2 <= g2) {
            this.f3178h.setComposingText(-1, "");
        } else {
            this.f3178h.setComposingText(g2, this.f3174d.toString().subSequence(g2, f2));
        }
        return this.f3178h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f3179i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f3174d.i();
        this.f3179i.selectionEnd = this.f3174d.h();
        this.f3179i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f3174d.toString() : this.f3174d;
        return this.f3179i;
    }

    private boolean e(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.f3174d);
        int selectionEnd = Selection.getSelectionEnd(this.f3174d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z ? Math.max(this.l.b(this.f3174d, selectionEnd), 0) : Math.min(this.l.a(this.f3174d, selectionEnd), this.f3174d.length());
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        if (z3) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.f3174d);
        int selectionEnd = Selection.getSelectionEnd(this.f3174d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            if (z) {
                Selection.moveUp(this.f3174d, this.f3181k);
            } else {
                Selection.moveDown(this.f3174d, this.f3181k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f3174d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(this.f3174d, this.f3181k);
            } else {
                Selection.extendDown(this.f3174d, this.f3181k);
            }
            setSelection(Selection.getSelectionStart(this.f3174d), Selection.getSelectionEnd(this.f3174d));
        }
        endBatchEdit();
        return true;
    }

    @Override // io.flutter.plugin.editing.c.b
    public void a(boolean z, boolean z2, boolean z3) {
        this.f3180j.updateSelection(this.a, this.f3174d.i(), this.f3174d.h(), this.f3174d.g(), this.f3174d.f());
        if (Build.VERSION.SDK_INT >= 21) {
            ExtractedTextRequest extractedTextRequest = this.f3176f;
            if (extractedTextRequest != null) {
                this.f3180j.updateExtractedText(this.a, extractedTextRequest.token, d(extractedTextRequest));
            }
            if (this.f3177g) {
                this.f3180j.updateCursorAnchorInfo(this.a, c());
            }
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f3174d.b();
        this.n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        return super.clearMetaKeyStates(i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f3174d.l(this);
        while (this.n > 0) {
            endBatchEdit();
            this.n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        return super.commitText(charSequence, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        if (this.f3174d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return super.deleteSurroundingTextInCodePoints(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.n--;
        this.f3174d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f3175e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f3174d);
            int selectionEnd = Selection.getSelectionEnd(this.f3174d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd);
            int max = Math.max(selectionStart, selectionEnd);
            beginBatchEdit();
            if (min != max) {
                this.f3174d.delete(min, max);
            }
            this.f3174d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
            int i2 = min + 1;
            setSelection(i2, i2);
            endBatchEdit();
            return true;
        } else if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        } else {
            int selectionEnd2 = Selection.getSelectionEnd(this.f3174d);
            setSelection(selectionEnd2, selectionEnd2);
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f3174d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z = true;
        boolean z2 = (i2 & 1) != 0;
        if (this.f3176f != null) {
            z = false;
        }
        if (z2 == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z2 ? "on" : "off");
            h.a.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f3176f = z2 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        beginBatchEdit();
        boolean b = b(i2);
        endBatchEdit();
        return b;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        if (i2 == 0) {
            this.c.n(this.b);
        } else if (i2 == 1) {
            this.c.f(this.b);
        } else if (i2 == 2) {
            this.c.e(this.b);
        } else if (i2 == 3) {
            this.c.k(this.b);
        } else if (i2 == 4) {
            this.c.l(this.b);
        } else if (i2 == 5) {
            this.c.g(this.b);
        } else if (i2 != 7) {
            this.c.d(this.b);
        } else {
            this.c.i(this.b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.c.h(this.b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i2 & 1) != 0) {
            this.f3180j.updateCursorAnchorInfo(this.a, c());
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (z != this.f3177g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            h.a.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f3177g = z;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.c(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        return super.setComposingRegion(i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i2) : super.setComposingText(charSequence, i2);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        beginBatchEdit();
        boolean selection = super.setSelection(i2, i3);
        endBatchEdit();
        return selection;
    }
}
