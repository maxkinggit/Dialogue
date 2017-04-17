package com.example.mk.alertdialog;


import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class DialogAlert extends Activity {

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Builder dialog = new AlertDialog.Builder(DialogAlert.this);
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("欢迎");
        dialog.setMessage("你帅吗");
        dialog.setPositiveButton("否定", new OnClickListener() {
            public void onClick(DialogInterface a0, int a1) {

            }
        });
        dialog.setNegativeButton("肯定", new OnClickListener() {
            public void onClick(DialogInterface a0, int a1) {


            }
        });
        dialog.create();
        dialog.show();
    }
}
