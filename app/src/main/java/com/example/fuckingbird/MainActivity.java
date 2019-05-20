package com.example.fuckingbird;

import com.example.fuckingbird.engine.Game;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout findViewById = findViewById(R.id.container);

        Game game = new Game(this);
        findViewById.addView(game);
    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        game.hajime();
//        new Thread(game).start();
//    }

    @Override
    protected void onPause() {
        super.onPause();
        this.game.tomaru();
    }
}

