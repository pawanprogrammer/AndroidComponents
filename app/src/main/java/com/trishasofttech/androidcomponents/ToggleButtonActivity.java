package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
ToggleButton  btntoggle;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        btnSubmit = findViewById(R.id.btnSubmit);
        btntoggle = findViewById(R.id.togglebtn);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "ToggleButton Output :"+ btntoggle.getText();
                Toast.makeText(ToggleButtonActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        btntoggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntoggle.setText("ON");
                /*if (!btntoggle.isChecked())
                {
                    btntoggle.setChecked(true);

                }
                else {
                    btntoggle.setChecked(false);
                    btntoggle.setText("Off");
                }*/
            }
        });
    }
}