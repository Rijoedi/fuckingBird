package com.example.fuckingbird.engine;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

import com.example.fuckingbird.R;
import com.example.fuckingbird.element.Tori;
import com.example.fuckingbird.graphic.Haikei;

//YousoSyokika = Inicializa Elementos

public class Game extends SurfaceView implements Runnable, OnTouchListener{

    private boolean isRunning = true;
    private final SurfaceHolder holder = getHolder();

    private Tori tori;
    private Bitmap background;

    int touchCount = 1;


    private Haikei haikei;


    public Game(Context context) {
        super(context);

        haikei = new Haikei(context);

        YousoSyokika();

        setOnTouchListener(this);


    }


    private void YousoSyokika() {
        tori = new Tori();

        Bitmap back = BitmapFactory.decodeResource(getResources(), R.drawable.back);

        background = Bitmap.createScaledBitmap(back, back.getWidth(), haikei.getTakasa(),false);
    }

    @Override
    public void run() {


        while(isRunning) {
            if(!holder.getSurface().isValid()) continue;

            Canvas canvas = holder.lockCanvas();

            canvas.drawBitmap(background, 0,0, null);
            tori.paint(canvas);


            if(touchCount % 2==0){
                tori.otiru();
            }else{
                tori.tobu();
            }


            holder.unlockCanvasAndPost(canvas);

        }

    }
    @Override
    public boolean onTouch(View v, MotionEvent event){
        touchCount++;
        return false;
    }

    public void hajime() {
        isRunning = true;
    }

    public void tomaru() {
        isRunning = false;
    }


}
