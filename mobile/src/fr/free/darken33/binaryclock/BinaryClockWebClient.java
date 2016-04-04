package fr.free.darken33.binaryclock;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * DarkCityWebClient - Surcharge WebViewClient
 *  
 * @author Philippe Bousquet <darken33@free.fr>
 * @date 20/06/2010
 * @version 1.0
 *
 * Application distribuée sous licence Gnu General Public License v2
 */
public class BinaryClockWebClient extends WebViewClient {

	/**
	 * Surcharge l'override d'url
	 */
	@Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
