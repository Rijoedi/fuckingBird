package com.example.fuckingbird.element;

import android.graphics.Paint;
import android.graphics.Canvas;
import com.example.fuckingbird.graphic.Iro;


//hankei RAIO
//takasa Altura

public class Tori {

    private static final float X = 100;
    private static final int HANKEI = 50;
    private static final Paint RED = Iro.getToriNoIro();
    private float takasa;

    public Tori() {
        this.takasa = 100;
    }

    public void paint(Canvas canvas) {
        canvas.drawCircle(X,takasa,HANKEI,RED);
    }
}
