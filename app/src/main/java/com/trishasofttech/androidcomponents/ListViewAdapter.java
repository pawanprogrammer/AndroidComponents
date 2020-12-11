package com.trishasofttech.androidcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    List<CountryName> list= new ArrayList<>();
    ArrayList<CountryName> arrayList;

    public ListViewAdapter(Context context, ArrayList<CountryName> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void filter(String text) {
        text = text.toLowerCase(Locale.getDefault());
        /*clear the list before searching*/
        list.clear();
        if (text.length() == 0) {
        list.addAll(arrayList);
        }
        else {
            for (CountryName countName : arrayList)
            {
                if (countName.getCountryname().toLowerCase(Locale.getDefault()).contains(text))
                {
                    list.add(countName);
                }
            }
        }
        /*to refersh the list automatically*/
        notifyDataSetChanged();
    }

    public class ViewHolder {
        TextView cname;
    }

    /*to attach the design xml file to adapter and also attach the data*/
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search, viewGroup, false);
            /*to initialize the textview*/
            holder.cname = (TextView) view.findViewById(R.id.cname);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.cname.setText(list.get(i).getCountryname());
        return view;
    }
}
