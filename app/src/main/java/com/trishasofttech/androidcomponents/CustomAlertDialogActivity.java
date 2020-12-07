package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomAlertDialogActivity extends AppCompatActivity {
Button btn_custom_alert_dialog;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);
        btn_custom_alert_dialog = findViewById(R.id.btn_custom_alertdialog);
        context = this;
        btn_custom_alert_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog  dialog = new Dialog(context);
                /*to attach the custom xml layout to dialog*/
                dialog.setContentView(R.layout.customdialog);
                Button btnsave = dialog.findViewById(R.id.btnsave);
                btnsave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        finish();
                    }
                });
                dialog.show();
            }
        });
    }
}