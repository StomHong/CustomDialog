package com.stomhong.customdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 自定义Dialog,仿IOS
 * @author StomHong
 * @since 2016-5-11
 */
public class MainActivity extends AppCompatActivity {

    private Button mButton_ShowDialog;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mButton_ShowDialog = (Button) findViewById(R.id.id_btn_show_dialog);
        mButton_ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = LayoutInflater.from(mContext).inflate(R.layout.layout_for_picture_dialog, null);
                TextView cancel = (TextView) view.findViewById(R.id.id_tv_picture_dialog_cancel);
                final AlertDialog dialog = new AlertDialog.Builder(mContext,R.style.DialogStyle).create();
                dialog.show();
                dialog.setCancelable(false);
                dialog.setContentView(view);
                dialog.getWindow().setGravity(Gravity.BOTTOM);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

    }
}
