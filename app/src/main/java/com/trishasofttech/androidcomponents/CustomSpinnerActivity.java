package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
private Spinner custom_spinner;
String [] sname = {"Select Country", "India", "Argentina", "Australia", "Sri Lanka", "Pakistan", "Bhutan", "Nepal"};
int [] simage = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);
        custom_spinner = findViewById(R.id.custom_spinner);
        /*to click on the spinner for select country*/
        custom_spinner.setOnItemSelectedListener(this);
        /*Attach data to the ArrayAdapter for spinner*/
        CustomArrayAdpater customArrayAdpater = new CustomArrayAdpater(getApplicationContext(), sname, simage);
        /*to attach the spinner with adapter*/
        custom_spinner.setAdapter(customArrayAdpater);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, sname[i], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}