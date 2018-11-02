package com.example.a31372.tetris;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;

public class Util {
    private static MediaPlayer mediaPlayer = null;

    public static void clikeAudioNormal(Context context){
        if (mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(context,R.raw.audio_click);
        }
        mediaPlayer.start();
    }
}
