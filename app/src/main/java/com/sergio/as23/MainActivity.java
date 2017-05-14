package com.sergio.as23;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{





    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        mInfoTextView = (TextView) findViewById(R.id.textViewInfo);

        final Button buttonGreen = (Button) findViewById(R.id.buttonGreen);
        final Button buttonRed = (Button) findViewById(R.id.buttonRed);
        final Button buttonYellow = (Button) findViewById(R.id.buttonYellow);

        // останавливаем обработчик для всех кнопок
        buttonGreen.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);



  /*      Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
            }
        });
 */
    }

    // определяем какая кнопка была нажата
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                break;
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
                break;

        }
    }


 /*   public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
 */



}
