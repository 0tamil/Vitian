package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.embedding.SplitInfo;
import j.x.d.i;
import java.util.List;
import java.util.function.Consumer;
@ExperimentalWindowApi
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingAdapter embeddingAdapter) {
        i.d(embeddingCallbackInterface, "callback");
        i.d(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    public void accept(List<? extends SplitInfo> list) {
        i.d(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}
