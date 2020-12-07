package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
CheckBox tenth, twelth, graduation, postgradution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        tenth = findViewById(R.id.tenth);
        twelth = findViewById(R.id.twelth);
        graduation = findViewById(R.id.graduation);
        postgradution = findViewById(R.id.postgraduation);

        tenth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if user select 10th*/
                if (tenth.isChecked())
                {
                    Toast.makeText(CheckBoxActivity.this, "10th Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        twelth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twelth.isChecked())
                {
                    Toast.makeText(CheckBoxActivity.this, "12th Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        graduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (graduation.isChecked())
                {
                    Toast.makeText(CheckBoxActivity.this, "Graduation Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        postgradution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (postgradution.isChecked())
                {
                    Toast.makeText(CheckBoxActivity.this, "postGraduation Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}