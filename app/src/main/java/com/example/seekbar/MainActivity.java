package com.example.seekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView ratting = findViewById(R.id.final_rating);
        SeekBar seek = findViewById(R.id.rating);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ratting.setVisibility(View.VISIBLE);
                if(progress >= 0 && progress <= 3){
                    ratting.setText("rating : "+ progress);
                    ratting.setTextColor(Color.parseColor("#FF0000"));
                }
                else if(progress > 3 && progress <= 7){
                    ratting.setText("rating : "+ progress);
                    ratting.setTextColor(Color.parseColor("#FFFF00"));
                }
                else if(progress > 7 && progress <= 10){
                    ratting.setText("rating : "+ progress);
                    ratting.setTextColor(Color.parseColor("#00FF00"));
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}