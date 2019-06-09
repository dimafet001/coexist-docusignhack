package com.example.coexist;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.coexist.TasksCustomAdapter.Data;

import com.example.coexist.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

public class MainTaskActivity extends AppCompatActivity {

    private TasksCustomAdapter tca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
//        ViewPager viewPager = findViewById(R.id.view_pager);
//        viewPager.setAdapter(sectionsPagerAdapter);
//        TabLayout tabs = findViewById(R.id.tabs);
        ListView lv = findViewById(R.id.lv);
//        tabs.setupWithViewPager(viewPager);


        ArrayList<Data> listMine = new ArrayList<>()
                , listEveryone = new ArrayList<>();

        listMine.add(new com.example.coexist.TasksCustomAdapter.Data("Take the garbage out", "today", false, "Dima"));
        listMine.add(new com.example.coexist.TasksCustomAdapter.Data("Water the plants", "tomorrow", false, "Dima"));
        listMine.add(new com.example.coexist.TasksCustomAdapter.Data("Pay rent", "in a week", false, "Dima"));


        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Take the garbage out", "today", false, "Dima"));
        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Pay utilities", "tomorrow", true, "Ashley"));
        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Water the plants", "tomorrow", false, "Dima"));
        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Clean bathroom", "in 3 days", false, "Ashley"));
        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Check the mailbox", "in 4 days", false, "Nathan"));
        listEveryone.add(new com.example.coexist.TasksCustomAdapter.Data("Pay rent", "in a week", false, "Dima"));


        tca = new com.example.coexist.TasksCustomAdapter(listMine, listEveryone, this);

        lv.setAdapter(tca);

//        FloatingActionButton fab = findViewById(R.id.fab);
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void my(View v) {
        tca.isMy = true;
        tca.notifyDataSetChanged();
        ((TextView)v).setTypeface(null, Typeface.BOLD);
        ((TextView)v.getRootView().findViewById(R.id.buttonEveryone)).setTypeface(null, Typeface.NORMAL);
    }

    public void everyone(View v) {
        tca.isMy = false;
        tca.notifyDataSetChanged();
        ((TextView)v).setTypeface(null, Typeface.BOLD);
        ((TextView)v.getRootView().findViewById(R.id.buttonMy)).setTypeface(null, Typeface.NORMAL);
    }


}