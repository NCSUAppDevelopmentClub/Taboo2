package com.example.cndro.taboo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//comment
//my comment

public class MainActivity extends AppCompatActivity {

    private boolean isPlay;
    private TextView clock;
    private static Timer timer;


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        isPlay = false;
        clock = (TextView) findViewById(R.id.timerView);
        timer = new Timer(clock);
        timer.startTimer(30000);




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



