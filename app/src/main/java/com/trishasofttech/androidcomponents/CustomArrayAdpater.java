package com.trishasofttech.androidcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdpater extends BaseAdapter {
Context context;
String sname[];
int simage[];


    public CustomArrayAdpater(Context context, String[] sname, int[] simage) {
        this.context = context;
        this.simage = simage;
        this.sname = sname;

    }

    @Override
    public int getCount() {
        return sname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_design, viewGroup, false);
        TextView tv = view.findViewById(R.id.tv);
        ImageView iv = view.findViewById(R.id.iv);
        /*to display the data into textview*/
        tv.setText(sname[i]);
        iv.setImageResource(simage[i]);
        return view;
    }
}
