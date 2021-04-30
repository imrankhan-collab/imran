package com.example.assingnment4443;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Dialogue extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);
    }
    @Override
    public void onBackPressed() {
        showBackButtonDialog();
    }
    private void showBackButtonDialog() {
        MaterialAlertDialogBuilder backButtonDialog = new MaterialAlertDialogBuilder(Dialogue.this);
        backButtonDialog.setTitle("Close Application");
        backButtonDialog.setMessage("Do You Really Want To Close This Activity?");
        backButtonDialog.setCancelable(false);
        backButtonDialog.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        backButtonDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        backButtonDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        backButtonDialog.create().show();
    }
}
