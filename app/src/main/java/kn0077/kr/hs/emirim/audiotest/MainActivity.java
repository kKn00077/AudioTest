package kn0077.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch switchMusic;
    MediaPlayer musicPlayer; //음악 재생을 위한 플레이어

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchMusic=(Switch)findViewById(R.id.switch_music);
        musicPlayer=MediaPlayer.create(this, R.raw.dean_admusic);
        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchMusic.isChecked()) {
                    musicPlayer.start();
                }
                else{
                    musicPlayer.pause();
                }
            }
        });
    }

    @Override
    protected void onStop() { // 화면이 사라졌을 때
        super.onStop();
        musicPlayer.stop();
    }

}