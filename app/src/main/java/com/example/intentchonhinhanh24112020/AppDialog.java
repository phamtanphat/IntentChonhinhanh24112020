package com.example.intentchonhinhanh24112020;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppDialog {
    private AppDialog(){

    }
    public static void showDialogTotalScore(Context context, OnListenerDialogTotalScore onListenerDialogTotalScore){
        Dialog dialog = new Dialog(context);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dialog_total_score,null, false);
        dialog.setContentView(view);

        Button btnSave = view.findViewById(R.id.buttonSave);
        Button btnExit = view.findViewById(R.id.buttonExit);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerDialogTotalScore.onSave();
                dialog.cancel();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerDialogTotalScore.onExit();
                dialog.cancel();
            }
        });

        dialog.show();
    }
}