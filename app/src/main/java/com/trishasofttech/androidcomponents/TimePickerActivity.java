package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity {
Button btntime;
TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timePicker = findViewById(R.id.timerpicker);
        btntime = findViewById(R.id.btntime);
        /*to enable the am/pm for time*/
        timePicker.setIs24HourView(false);

                /*to get the timer changed*/
                timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                        /*display the selected timer*/
                        Toast.makeText(TimePickerActivity.this,
                                "Hour : " +i + "Minute : " + i1, Toast.LENGTH_SHORT).show();
                    }
                });


    }
}