package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePickerActivity extends AppCompatActivity {
Button btndate;
DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        btndate = findViewById(R.id.btndate);
        datePicker =findViewById(R.id.datepicker);

        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DatePickerActivity.this,
                        datePicker.getDayOfMonth()+" : Day\n"+
                                (datePicker.getMonth()+1) +" : Month\n"+
                        datePicker.getYear()+ " : Year", Toast.LENGTH_SHORT).show();
            }
        });
    }
}