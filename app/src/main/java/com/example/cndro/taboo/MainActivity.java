package com.example.cndro.taboo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        new CountDownTimer(30000, 1000) {

            TextView mTextField = (TextView) findViewById(R.id.timer);
            public void onTick(long millisUntilFinished) {
                mTextField.setText(String.valueOf(millisUntilFinished / 1000));
            }

            public void onFinish() {
                mTextField.setText("0");
            }

            public void onStop() {
                
            }


        }.start();

        final Button next =  (Button) findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("something", "Clicked");// Perform action on click
            }
            // }
        });

        final Button prev =  (Button) findViewById(R.id.btnBack);
        prev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("something1", "Clicked");// Perform action on click
            }
            // }
        });

        final Button pause =  (Button) findViewById(R.id.btnPause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("something2", "Clicked");// Perform action on click
            }
            // }
        });

    }

}



