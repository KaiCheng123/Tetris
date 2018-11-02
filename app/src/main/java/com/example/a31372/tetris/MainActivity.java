package com.example.a31372.tetris;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private Button battle;
    private Button stars;
    private Button options;
    private Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //请求不显示TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //请求设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        battle = (Button) findViewById(R.id.battle);
        stars = (Button) findViewById(R.id.stars);
        options = (Button) findViewById(R.id.options);
        quit = (Button) findViewById(R.id.quit);
        //设置第三方字体
        Typeface typeface = Typeface.createFromAsset(this.getAssets(),"SFSlapstickComicShaded.ttf");

        start.setTypeface(typeface);
        battle.setTypeface(typeface);
        stars.setTypeface(typeface);
        options.setTypeface(typeface);
        quit.setTypeface(typeface);
    }

    public void onStart(View view) {
        Util.clikeAudioNormal(this);
        Log.d("MyTAG","onStart");
    }

    public void onBattle(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.audio_click);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity.this,BattleActivity.class);
        startActivity(intent);
        Util.clikeAudioNormal(this);
        Log.d("MyTAG","onBattle");
    }

    public void onStars(View view) {
        Util.clikeAudioNormal(this);
        Log.d("MyTAG","onStars");
    }

    public void onOptions(View view) {
        Util.clikeAudioNormal(this);
        Log.d("MyTAG","onOptions");
    }

    public void onQuit(View view) {
        Log.d("MyTAG","onQuit");
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.audio_quit);
        mediaPlayer.start();
        this.finish();
    }
}
