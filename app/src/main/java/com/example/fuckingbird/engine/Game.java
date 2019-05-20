package com.example.fuckingbird.engine;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.fuckingbird.R;
import com.example.fuckingbird.element.Tori;

//YousoSyokika = Inicializa Elementos

public class Game extends SurfaceView implements Runnable {

    private boolean isRunning = true;
    private final SurfaceHolder holder = getHolder();

    private Tori tori;
    private Bitmap backgroud;


    public Game(Context context) {
        super(context);
        YousoSyokika();

    }



    private void YousoSyokika() {
        tori = new Tori();

        backgroud = BitmapFactory.decodeResource(getResources(), R.drawable.background);
    }

    @Override
    public void run() {
        while(isRunning) {
            if(!holder.getSurface().isValid()) continue;
            System.out.print("RUNに入りました");

            Canvas canvas = holder.lockCanvas();

            canvas.drawBitmap(backgroud, 0,0, null);
            tori.paint(canvas);
            tori.otiru();

            holder.unlockCanvasAndPost(canvas);

        }

    }

    public void hajime() {
        isRunning = true;
    }

    public void tomaru() {
        isRunning = false;
    }


}
