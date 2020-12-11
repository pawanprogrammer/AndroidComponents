package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
RadioButton android, php, java, ios;
Button btn_submit;
String technology;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        btn_submit = findViewById(R.id.btn_submit);
        android = findViewById(R.id.radiobtn_android);
        php = findViewById(R.id.radiobtn_php);
        ios = findViewById(R.id.radiobtn_ios);
        java = findViewById(R.id.radiobtn_java);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*to check the which radiobutton is enable*/
                if (android.isChecked())
                {
                    technology = android.getText().toString();
                }
                else if (php.isChecked())
                {
                    technology = php.getText().toString();
                }
                else if (java.isChecked())
                {
                    technology = java.getText().toString();
                }
                else if (ios.isChecked())
                {
                    technology = ios.getText().toString();
                }

                Toast.makeText(RadioButtonActivity.this, "Select technology : "+ technology, Toast.LENGTH_SHORT).show();
            }
        });
    }
}