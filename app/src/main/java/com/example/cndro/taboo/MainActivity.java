package com.example.cndro.taboo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

//comment
//my comment

public class MainActivity extends AppCompatActivity {

    private boolean isPlay;
    private TextView clock;
    private static Timer timer;
    private WordList words;


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        isPlay = false;
        clock = (TextView) findViewById(R.id.timerView);
        timer = new Timer(clock);
        timer.startTimer(20000);
        words = new WordList();
        LinearLayout layout = (LinearLayout) findViewById(R.id.wordList);
        for(int i = 0; i< words.size(); i++){
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));

            textView.setText(words.get(i));
            textView.setGravity(Gravity.CENTER);
            textView.setPadding(50 ,0,20,0);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            layout.addView(textView);

        }





        final Button next =  (Button) findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Next", "Clicked");// Perform action on click
            }
            // }
        });

        final Button prev =  (Button) findViewById(R.id.btnBack);
        prev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Previous", "Clicked");// Perform action on click
            }
            // }
        });

        final Button pause =  (Button) findViewById(R.id.btnPause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isPlay){
                    timer.onResume();
                    pause.setText("||");
                    Log.d("Play", "Clicked");
                } else
                {
                    timer.onPause();
                    pause.setText("|>");
                    Log.d("Pause", "Clicked");
                }

                isPlay = !isPlay;

                // Perform action on click


            }
            // }




        });
    }





}



