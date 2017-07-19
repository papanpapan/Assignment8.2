package com.example.amitroy.assignment82;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.resource;

/**
 * Created by AMIT ROY on 16-May-17.
 */

public class StringAdapter extends ArrayAdapter<String> {
    String[]name={};
    String[]mobile_number={};
    Context context;
    LayoutInflater inflater;
    public StringAdapter( Context context,String[]name,String[]mobile_number) {
        super(context, R.layout.sort_list_item,name);
        this.name=name;
        this.mobile_number=mobile_number;
        this.context=context;
    }
public class ViewHolder{
    TextView tex1;
    TextView tex2;
}
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=new ViewHolder();
        if(convertView==null){
            inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sort_list_item,null);
        }
        holder.tex1=(TextView)convertView.findViewById(R.id.text1);
        holder.tex2=(TextView)convertView.findViewById(R.id.text2);
        holder.tex1.setText(name[position]);
        holder.tex2.setText(mobile_number[position]);
        return convertView;

    }
}




