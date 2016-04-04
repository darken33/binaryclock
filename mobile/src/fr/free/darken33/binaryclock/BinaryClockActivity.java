package fr.free.darken33.binaryclock;

import com.phonegap.*;
import android.os.Bundle;

/**
 * Activité de Montre Binaire
 * 
 * @author philippe bousquet <darken33@free.fr>
 * @version 1.1
 * @license Gnu GPL v3
 */
public class BinaryClockActivity extends DroidGap {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
