package com.example.linbing.androidassignment;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.R.attr.mode;

/**
 * Created by linyanhong on 19/3/2017.
 */

public class ActionModeActivity extends ListActivity {
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
        mListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        mListView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                MenuInflater inflater = getMenuInflater();
                inflater.inflate(R.menu.contextmenu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {

            }

            @Override
            public void onItemCheckedStateChanged(ActionMode actionMode, int i, long l, boolean b) {

            }
        });

    }
}
