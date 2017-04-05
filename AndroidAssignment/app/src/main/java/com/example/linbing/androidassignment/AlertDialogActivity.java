package com.example.linbing.androidassignment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class AlertDialogActivity extends AppCompatActivity {

    TextView mShowDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_diaglog);

        mShowDialog = (TextView)findViewById(R.id.show_dialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
    }
    public void Login() {
        LayoutInflater factory=LayoutInflater.from(AlertDialogActivity.this);
        final View dialogView=factory.inflate(R.layout.dialog_login,null);
        //R.layout.login与login.xml文件名对应,把login转化成View类型
        AlertDialog.Builder dialog=new AlertDialog.Builder(AlertDialogActivity.this);
        dialog.setTitle(R.string.login);
        dialog.setView(dialogView);//设置使用View
        //设置控件应该用v1.findViewById 否则出错
        dialog.setPositiveButton(R.string.login, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        dialog.setNegativeButton(R.string.cancel,new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog.show();
    }
}
