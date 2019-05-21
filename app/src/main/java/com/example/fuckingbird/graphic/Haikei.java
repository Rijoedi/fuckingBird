package com.example.fuckingbird.graphic;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;


public class Haikei {

    private DisplayMetrics metrics;

    public Haikei(Context context) {
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        metrics = new DisplayMetrics();
        display.getMetrics(metrics);
    }

    public int getTakasa(){
        return metrics.heightPixels;
    }
}
