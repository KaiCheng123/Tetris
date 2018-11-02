package com.example.a31372.tetris;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BattleActivity extends AppCompatActivity {

    private Button campaign;
    private Button marathon;
    private Button quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //请求不显示TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //请求设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_battle);
        //设置第三方字体
        Typeface typeface = Typeface.createFromAsset(this.getAssets(),"KBAStitchInTime.ttf");

        campaign = (Button) findViewById(R.id.campaign);
        marathon = (Button) findViewById(R.id.marathon);
        quit = (Button) findViewById(R.id.quit);

        campaign.setTypeface(typeface);
        marathon.setTypeface(typeface);
        quit.setTypeface(typeface);
    }

    public void onCampaign(View view) {
        Util.clikeAudioNormal(this);
        Log.d("TAG","onCampaign");
    }

    public void onMarathon(View view) {
        Util.clikeAudioNormal(this);
        Log.d("TAG","onMarathon");
    }

    public void onQuit(View view) {
        Util.clikeAudioNormal(this);
        Log.d("TAG","onQuit");
        this.finish();
    }
}
