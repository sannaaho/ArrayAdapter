package com.example.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



public class TimeAdapter extends ArrayAdapter<Times> {
    Context context;
    int layoutResourceId;
    ArrayList<Times> dates;

    public TimeAdapter(Context context, int layoutResourceId, ArrayList<Times> dates) {
        super(context, layoutResourceId);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.dates = dates;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inf = LayoutInflater.from(context);
        View row = inf.inflate(layoutResourceId, parent, false);

        TextView tv = row.findViewById(R.id.textViewTime);

        String date = getItem(position).toString();
        tv.setText(date);

        return row;
    }

}