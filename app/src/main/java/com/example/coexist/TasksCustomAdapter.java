package com.example.coexist;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.coexist.R;

import java.util.ArrayList;

public class TasksCustomAdapter extends BaseAdapter implements ListAdapter {

    private ArrayList<Data> listMine = new ArrayList<>();
    private ArrayList<Data> listEveryone = new ArrayList<>();
    private Context context;
    public boolean isMy = true; // my of everyone's

    public TasksCustomAdapter(ArrayList<Data> listMine, ArrayList<Data> listEveryone, Context context) {
        this.listMine = listMine;
        this.listEveryone = listEveryone;
        this.context = context;
    }

    @Override
    public int getCount() {
        return isMy? listMine.size() : listEveryone.size();
    }

    @Override
    public Object getItem(int pos) {
        return isMy? listMine.get(pos) : listEveryone.size();
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null || true) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//            if (position < list.size() || list.get(list.size()-1) == "New") {
            view = inflater.inflate(R.layout.tasks_custom_list_layout, null);

            TextView name = view.findViewById(R.id.list_item_task_name);
            TextView time = view.findViewById(R.id.list_item_task_time);
            CheckBox done = view.findViewById(R.id.list_item_task_done);
//            Button remind = view.findViewById(R.id.remind_btn);
            TextView who = view.findViewById(R.id.list_item_task_who);

            if (isMy) {
                name.setText(listMine.get(position).name);
                time.setText(listMine.get(position).time);
                done.setChecked(listMine.get(position).done);
                who.setText(listMine.get(position).who);
            } else {
                name.setText(listEveryone.get(position).name);
                time.setText(listEveryone.get(position).time);
                done.setChecked(listEveryone.get(position).done);
                who.setText(listEveryone.get(position).who);
            }

        }

        return view;
    }


    public static class Data {
        public String name;
        public String time;
        public boolean done;
        public String who; // who did the task/ who should do it

        public Data(String name, String time, boolean done, String who) {
            this.name = name;
            this.time = time;
            this.done = done;
            this.who = who;
        }
    }
}
