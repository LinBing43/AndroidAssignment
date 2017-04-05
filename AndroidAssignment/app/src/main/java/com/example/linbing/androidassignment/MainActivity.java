package com.example.linbing.androidassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mImageTitleTv;
    TextView mAlertDiaogTv;
    TextView mMenuTv;
    TextView mActionModeTv;


    View.OnClickListener mOnClickListener;
    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageTitleTv = (TextView) findViewById(R.id.image_title_activity);
        mAlertDiaogTv = (TextView) findViewById(R.id.alert_dialog_activity);
        mMenuTv = (TextView) findViewById(R.id.menu_activity);
        mActionModeTv = (TextView) findViewById(R.id.action_mode_activity);

        mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.image_title_activity:
                        mIntent = new Intent(MainActivity.this, ImageTitleActivity.class);
                        startActivity(mIntent);
                        break;
                    case R.id.alert_dialog_activity:
                        mIntent = new Intent(MainActivity.this, AlertDialogActivity.class);
                        startActivity(mIntent);
                        break;
                    case R.id.menu_activity:
                        mIntent = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(mIntent);
                        break;
                    case R.id.action_mode_activity:
                        mIntent = new Intent(MainActivity.this, ActionModeActivity.class);
                        startActivity(mIntent);
                        break;

                    default:
                        break;
                }
            }
        };

        mImageTitleTv.setOnClickListener(mOnClickListener);
        mAlertDiaogTv.setOnClickListener(mOnClickListener);
        mMenuTv.setOnClickListener(mOnClickListener);
        mActionModeTv.setOnClickListener(mOnClickListener);




    }
}
