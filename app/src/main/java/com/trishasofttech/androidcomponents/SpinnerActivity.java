package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
private Spinner spinner;
String [] sname = {"Select Name","pawan", "raman", "chaman", "naman", "hasann", "tasan"};

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        /*to select the item from spinner*/
        spinner.setOnItemSelectedListener(SpinnerActivity.this);
        /*to attach the data from array to spinner by using ArrayAdapter*/
    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sname );
    /*attach the arrayadapter to spinner*/
    spinner.setAdapter(arrayAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, sname[i], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}