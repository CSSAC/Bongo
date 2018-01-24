package com.example.prrateekk.drums;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer bongoLow[], bongoMid[], bongoHigh[];
    int low, mid, high;
    public static int MEDIA_COUNT = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bongoLow = new MediaPlayer[MEDIA_COUNT];
        bongoMid = new MediaPlayer[MEDIA_COUNT];
        bongoHigh = new MediaPlayer[MEDIA_COUNT];
        for (int i = 0; i < MEDIA_COUNT; i++) {
            bongoLow[i] = MediaPlayer.create(this, R.raw.bongolow);
            bongoMid[i] = MediaPlayer.create(this, R.raw.bongomid);
            bongoHigh[i] = MediaPlayer.create(this, R.raw.bongohigh);
        }
    }

    public void playLowBeat(View v) {
        bongoLow[low].start();
        low = ( low + 1 ) % MEDIA_COUNT;
    }

    public void playMidBeat(View v) {
        bongoMid[mid].start();
        mid = ( mid + 1 ) % MEDIA_COUNT;
    }

    public void playHighBeat(View v) {
        bongoHigh[high].start();
        high = ( high + 1 ) % MEDIA_COUNT;
    }
}
