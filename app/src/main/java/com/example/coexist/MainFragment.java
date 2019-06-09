package com.example.coexist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.coexist.ui.main.MyCustomAdapter;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    public static ArrayList<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.main_view, container, false);

        //generate list
        list = new ArrayList<String>();
        list.add("Dmitry");
        list.add("Silvia");
        list.add("Deidre");

        //instantiate custom adapter
        com.example.coexist.ui.main.MyCustomAdapter adapter = new MyCustomAdapter(list, getContext());

        //handle listview and assign adapter
        ListView lView = (ListView)rootView.findViewById(R.id.lv);
        lView.setAdapter(adapter);

        return rootView;
    }
}
