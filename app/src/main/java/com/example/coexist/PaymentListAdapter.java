package com.example.coexist;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PaymentListAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list = new ArrayList<String>();
    private Context context;
    private int changedPos = 1000; // to update the list if above element is removed


    public PaymentListAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null || position >= changedPos || true) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//            if (position < list.size() || list.get(list.size()-1) == "New") {
                view = inflater.inflate(R.layout.payment_list_layout, null);
        }
//
//        //Handle TextView and display string from your list
        TextView listItemText = view.findViewById(R.id.list_item_string);
//
//
//        //Handle buttons and add onClickListeners
//        Button deleteBtn = (Button)view.findViewById(R.id.delete_btn);
////        Button addBtn = (Button)view.findViewById(R.id.add_btn);
//
//        if (deleteBtn != null && position != list.size()) {
         if (list.size() != 0 && list.size() > position)
             listItemText.setText(list.get(position));

//            listItemText.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                }
//
//                @Override
//                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    list.set(position, charSequence.toString());
//                }
//
//                @Override
//                public void afterTextChanged(Editable editable) {
//                }
//            });
//            deleteBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    list.remove(position);
//                    changedPos = position;
//                    notifyDataSetChanged();
//                }
//
//            });
//        } else {
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    list.add(list.size(),"");
//                    changedPos = position;
//                    notifyDataSetChanged();
//                }
//            });
//        }

        return view;
    }
}
