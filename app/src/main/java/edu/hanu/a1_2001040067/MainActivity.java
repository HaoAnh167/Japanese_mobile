package edu.hanu.a1_2001040067;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.hellojapan.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView hiraganaScrollView = findViewById(R.id.hiraganaScrollView);
        ScrollView katakanaScrollView = findViewById(R.id.katakanaScrollView);
        Button katakanaBtn = findViewById(R.id.katakanaBtn);
        Button hiraganaBtn = findViewById(R.id.hiraganaBtn);
        TextView katakanaView = findViewById(R.id.katakanaView);
        TextView hiraganaView = findViewById(R.id.hiraganaView);

        //hide katakana at start
        katakanaScrollView.setVisibility(View.GONE);

        //display color at start
        hiraganaBtn.setBackgroundColor(Color.parseColor("#33FFFF"));
        katakanaBtn.setBackgroundColor(Color.parseColor("#33FFFF"));

        //hiragana --> katakana
        katakanaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hide hiragana
                hiraganaScrollView.animate().alpha(0f).setDuration(1000);
                hiraganaScrollView.setVisibility(View.GONE);
                //hide hiragana title
                hiraganaView.animate().alpha(0f).setDuration(1000);
                //show katakana table
                katakanaScrollView.setVisibility(View.VISIBLE);
                katakanaScrollView.animate().alpha(1f).setDuration(1000);
                //show katakana title
                katakanaView.animate().alpha(1f).setDuration(1000);
                //animation
                katakanaScrollView.animate().rotationYBy(360*2).setDuration(1500);

                //display on top of view
                katakanaScrollView.scrollTo(0,0);

                //change color
                katakanaBtn.setBackgroundColor(Color.parseColor("#FF0000"));
                hiraganaBtn.setBackgroundColor(Color.parseColor("#33FFFF"));
            }

        });

        //katakana --> hiragana
        hiraganaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hide katakana
                katakanaScrollView.animate().alpha(0f).setDuration(1000);
                katakanaScrollView.setVisibility(View.GONE);
                //hide katakana title
                katakanaView.animate().alpha(0f).setDuration(1000);

                //show hiragana
                hiraganaScrollView.setVisibility(View.VISIBLE);
                hiraganaScrollView.animate().alpha(1f).setDuration(1000);
                //show hiragana title
                hiraganaView.animate().alpha(1f).setDuration(1000);

                //animation
                hiraganaScrollView.animate().rotationYBy(360*2).setDuration(1500);

                //display on top of view
                hiraganaScrollView.scrollTo(0,0);

                //change color
                hiraganaBtn.setBackgroundColor(Color.parseColor("#FF0000"));
                katakanaBtn.setBackgroundColor(Color.parseColor("#33FFFF"));
            }
        });

        //MAKE SOUND
        //list of sound
        MediaPlayer[] mediaPlayer = new MediaPlayer[55];
        mediaPlayer[0] = MediaPlayer.create(MainActivity.this, R.raw.a);
        mediaPlayer[1] = MediaPlayer.create(MainActivity.this, R.raw.i);
        mediaPlayer[2] = MediaPlayer.create(MainActivity.this, R.raw.u);
        mediaPlayer[3] = MediaPlayer.create(MainActivity.this, R.raw.e);
        mediaPlayer[4] = MediaPlayer.create(MainActivity.this, R.raw.o);
        mediaPlayer[5] = MediaPlayer.create(MainActivity.this, R.raw.ka);
        mediaPlayer[6] = MediaPlayer.create(MainActivity.this, R.raw.ki);
        mediaPlayer[7] = MediaPlayer.create(MainActivity.this, R.raw.ku);
        mediaPlayer[8] = MediaPlayer.create(MainActivity.this, R.raw.ke);
        mediaPlayer[9] = MediaPlayer.create(MainActivity.this, R.raw.ko);
        mediaPlayer[10] = MediaPlayer.create(MainActivity.this, R.raw.sa);
        mediaPlayer[11] = MediaPlayer.create(MainActivity.this, R.raw.shi);
        mediaPlayer[12] = MediaPlayer.create(MainActivity.this, R.raw.su);
        mediaPlayer[13] = MediaPlayer.create(MainActivity.this, R.raw.se);
        mediaPlayer[14] = MediaPlayer.create(MainActivity.this, R.raw.so);
        mediaPlayer[15] = MediaPlayer.create(MainActivity.this, R.raw.ta);
        mediaPlayer[16] = MediaPlayer.create(MainActivity.this, R.raw.chi);
        mediaPlayer[17] = MediaPlayer.create(MainActivity.this, R.raw.tsu);
        mediaPlayer[18] = MediaPlayer.create(MainActivity.this, R.raw.te);
        mediaPlayer[19] = MediaPlayer.create(MainActivity.this, R.raw.to);
        mediaPlayer[20] = MediaPlayer.create(MainActivity.this, R.raw.na);
        mediaPlayer[21] = MediaPlayer.create(MainActivity.this, R.raw.ni);
        mediaPlayer[22] = MediaPlayer.create(MainActivity.this, R.raw.nu);
        mediaPlayer[23] = MediaPlayer.create(MainActivity.this, R.raw.ne);
        mediaPlayer[24] = MediaPlayer.create(MainActivity.this, R.raw.no);
        mediaPlayer[25] = MediaPlayer.create(MainActivity.this, R.raw.ha);
        mediaPlayer[26] = MediaPlayer.create(MainActivity.this, R.raw.hi);
        mediaPlayer[27] = MediaPlayer.create(MainActivity.this, R.raw.fu);
        mediaPlayer[28] = MediaPlayer.create(MainActivity.this, R.raw.he);
        mediaPlayer[29] = MediaPlayer.create(MainActivity.this, R.raw.ho);
        mediaPlayer[30] = MediaPlayer.create(MainActivity.this, R.raw.ma);
        mediaPlayer[31] = MediaPlayer.create(MainActivity.this, R.raw.mi);
        mediaPlayer[32] = MediaPlayer.create(MainActivity.this, R.raw.mu);
        mediaPlayer[33] = MediaPlayer.create(MainActivity.this, R.raw.me);
        mediaPlayer[34] = MediaPlayer.create(MainActivity.this, R.raw.mo);
        mediaPlayer[35] = MediaPlayer.create(MainActivity.this, R.raw.ya);
        mediaPlayer[37] = MediaPlayer.create(MainActivity.this, R.raw.yu);
        mediaPlayer[39] = MediaPlayer.create(MainActivity.this, R.raw.yo);
        mediaPlayer[40] = MediaPlayer.create(MainActivity.this, R.raw.ra);
        mediaPlayer[41] = MediaPlayer.create(MainActivity.this, R.raw.ri);
        mediaPlayer[42] = MediaPlayer.create(MainActivity.this, R.raw.ru);
        mediaPlayer[43] = MediaPlayer.create(MainActivity.this, R.raw.re);
        mediaPlayer[44] = MediaPlayer.create(MainActivity.this, R.raw.ro);
        mediaPlayer[45] = MediaPlayer.create(MainActivity.this, R.raw.wa);
        mediaPlayer[49] = MediaPlayer.create(MainActivity.this, R.raw.wo);
        mediaPlayer[50] = MediaPlayer.create(MainActivity.this, R.raw.n);

        //set letter sound for hiragana table
        TableLayout hiraganaTableLayout = findViewById(R.id.hiraganaTable);
        for (int i = 0; i < hiraganaTableLayout.getChildCount(); i++) {
            TableRow tableRow = (TableRow) hiraganaTableLayout.getChildAt(i);
            for (int j = 0; j<tableRow.getChildCount(); j++) {
                ImageButton imageButton = (ImageButton) tableRow.getChildAt(j);
                int charIndex = i * 5 + j;
                if (charIndex != 36 && charIndex != 38 && charIndex != 46 && charIndex != 47 && charIndex != 48
                        && charIndex != 51 && charIndex != 52 && charIndex != 53 && charIndex != 54){
                        imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mediaPlayer[charIndex].start();
                        }
                    });
                }
            }
        }

        //set letter sound for katakana table
        TableLayout katakanaTableLayout = findViewById(R.id.katakanaTable);
        for (int i = 0; i < katakanaTableLayout.getChildCount(); i++) {
            TableRow tableRow = (TableRow) katakanaTableLayout.getChildAt(i);
            for (int j = 0; j<tableRow.getChildCount(); j++) {
                ImageButton imageButton = (ImageButton) tableRow.getChildAt(j);
                int charIndex = i * 5 + j;
                if (charIndex != 36 && charIndex != 38 && charIndex != 46 && charIndex != 47 && charIndex != 48
                        && charIndex != 51 && charIndex != 52 && charIndex != 53 && charIndex != 54){
                    imageButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mediaPlayer[charIndex].start();
                        }
                    });
                }
            }
        }
    }
}