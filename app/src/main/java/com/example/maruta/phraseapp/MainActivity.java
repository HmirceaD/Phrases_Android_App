package com.example.maruta.phraseapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button welcome,
            howareyou,
            goodevening,
            please,
            mynameis,
            doyouspeakenglish,
            hello,
            ilivein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                welcome = findViewById(R.id.welcome);
                howareyou = findViewById(R.id.howareyou);
                goodevening = findViewById(R.id.goodevening);
                please =  findViewById(R.id.please);
                mynameis = findViewById(R.id.mynameis);
                doyouspeakenglish = findViewById(R.id.doyouspeakenglish);
                hello = findViewById(R.id.hello);
                ilivein = findViewById(R.id.ilivein);

                welcome.setOnClickListener((View event) -> addList(event));
                howareyou.setOnClickListener((View event) -> addList(event));
                goodevening.setOnClickListener((View event) -> addList(event));
                please.setOnClickListener((View event) -> addList(event));
                mynameis.setOnClickListener((View event) -> addList(event));
                doyouspeakenglish.setOnClickListener((View event) -> addList(event));
                hello.setOnClickListener((View event) -> addList(event));
                ilivein.setOnClickListener((View event) -> addList(event));

    }

    void addList(View v){

        String actId = getResources().getResourceEntryName(v.getId());

        MediaPlayer mPlay = MediaPlayer.create(this, getResources().getIdentifier(actId, "raw", "com.example.maruta.phraseapp"));
        mPlay.start();
    }
}
