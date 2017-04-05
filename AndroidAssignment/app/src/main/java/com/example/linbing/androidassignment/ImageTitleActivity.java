package com.example.linbing.androidassignment;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ImageTitleActivity extends ListActivity {
    private String[] mListTitle = {"Cat", "Dog", "Elephant","Lion", "Monkey", "Tiger"};
    ListView mListView = null;
    ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListView = getListView();

        int lengh = mListTitle.length;
        for(int i =0; i < lengh; i++) {
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("image", AppConstants.IMAGE[i]);
            item.put("title", mListTitle[i]);
            mData.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.listview_simple_adpater,
                new String[]{"title", "image"},new int[]{R.id.title,R.id.image});
        setListAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position,
                                    long id) {
                Toast.makeText(ImageTitleActivity.this,"您选择了标题：" + mListTitle[position] , Toast.LENGTH_LONG).show();
            }
        });
    }
}
