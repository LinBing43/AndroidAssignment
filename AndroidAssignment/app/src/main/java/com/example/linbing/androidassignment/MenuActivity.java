package com.example.linbing.androidassignment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends ActionBarActivity {

    TextView mTestText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_text_size_small:
                mTestText = (TextView)findViewById(R.id.text_test);
                mTestText.setTextSize(10);
                break;
            case R.id.menu_text_size_normal:
                mTestText = (TextView)findViewById(R.id.text_test);
                mTestText.setTextSize(16);
                break;
            case R.id.menu_text_size_big:
                mTestText = (TextView)findViewById(R.id.text_test);
                mTestText.setTextSize(20);
                break;
            case R.id.menu_normal:
                Toast.makeText(MenuActivity.this, R.string.menu_normal , Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_text_color_red:
                mTestText = (TextView)findViewById(R.id.text_test);
                mTestText.setTextColor(Color.RED);
                break;
            case R.id.menu_text_color_black:
                mTestText = (TextView)findViewById(R.id.text_test);
                mTestText.setTextColor(Color.BLACK);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
