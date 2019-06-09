package com.example.coexist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SummaryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.summary_view, container, false);

//        ArrayList<String> list = MainFragment.list;

//        //instantiate custom adapter
//        PaymentListAdapter adapter = new PaymentListAdapter(list, getContext());
//
//        //handle listview and assign adapter
//        ListView lView = (ListView) rootView.findViewById(R.id.lv);
//        lView.setAdapter(adapter);

        return rootView;
    }
}

