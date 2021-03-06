package com.example.cndro.taboo;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by Jay on 2/11/2017.
 */

public class Timer {


    private CountDownTimer timer;
    private TextView clock;
    private long timeLeft;
    private boolean red;

    public Timer(TextView toOutput){
        super();
        clock = toOutput;
    }

    public void startTimer(long timeLength) {
        red = false;
        timer = new CountDownTimer(timeLength, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
                if(millisUntilFinished <= 11000 && !red){
                    clock.setTextColor(Color.RED);
                    red = true;
                }
                clock.setText(String.format("%02d",(millisUntilFinished/1000)%60));
            }

            public void onFinish() {
                clock.setText("00");
                timeLeft = 0;
            }



        };
        timer.start();



    }
    public void onPause(){
        timer.cancel();
    }

    public void onResume(){
        startTimer(timeLeft);

    }
}
