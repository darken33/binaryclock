package fr.free.darken33.binaryclock;

import fr.free.darken33.binaryclock.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

public class BinaryClockActivity extends Activity {
	/** La vue Web */
	WebView mWebView;
	
	/** 
	 * Méthode appelé lors de la création de l'application. 
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new BinaryClockWebClient());        
        mWebView.loadUrl("file:///android_asset/www/index.html");        
    }
    
    /**
     * Evenement sur la touche retour
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
        	this.finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }   
}