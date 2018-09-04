package com.example.dell.spanishnumbers;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    void playMusic(View view)
    {
        int id=view.getId();
        String nameId=view.getResources().getResourceEntryName(id);
        int myMusic=getResources().getIdentifier(nameId,"raw","com.example.dell.spanishnumbers");


        MediaPlayer mediaPlayer=MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
