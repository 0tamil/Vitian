package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    public static String f3325i = "close action";

    /* renamed from: j  reason: collision with root package name */
    private static String f3326j = "url";

    /* renamed from: k  reason: collision with root package name */
    private static String f3327k = "enableJavaScript";
    private static String l = "enableDomStorage";

    /* renamed from: g  reason: collision with root package name */
    private WebView f3330g;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f3328e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final WebViewClient f3329f = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private IntentFilter f3331h = new IntentFilter(f3325i);

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f3325i.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends WebViewClient {
        b(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class c extends WebChromeClient {

        /* loaded from: classes.dex */
        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f3330g.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f3330g.loadUrl(str);
                return true;
            }
        }

        private c() {
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f3330g.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f3326j, str).putExtra(f3327k, z).putExtra(l, z2).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f3330g = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f3326j);
        boolean booleanExtra = intent.getBooleanExtra(f3327k, false);
        boolean booleanExtra2 = intent.getBooleanExtra(l, false);
        this.f3330g.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f3330g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f3330g.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f3330g.setWebViewClient(this.f3329f);
        this.f3330g.getSettings().setSupportMultipleWindows(true);
        this.f3330g.setWebChromeClient(new c(this, null));
        registerReceiver(this.f3328e, this.f3331h);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3328e);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !this.f3330g.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f3330g.goBack();
        return true;
    }
}
