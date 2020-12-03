package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends AppCompatActivity {
Button btn_progress;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progressBar = findViewById(R.id.progressbar);
        btn_progress = findViewById(R.id.btn_progress);

        /*to click on the button to display the progressbar*/
        btn_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*turn on the progressbar visiblity on*/
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        btn_progress.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                /*to dismiss the progressbar*/
                progressBar.setVisibility(View.GONE);
                return true;
            }
        });
    }
}