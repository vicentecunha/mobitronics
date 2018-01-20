package com.vcc.vicente.mobitronics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class IsopowerAdapter extends BaseAdapter {

    private IsopowerPoint[] isopowerPoints = new IsopowerPoint[4];
    private Context context;

    IsopowerAdapter(Context context){
        this.context = context;
        isopowerPoints[0] = new IsopowerPoint(3,15);
        isopowerPoints[1] = new IsopowerPoint(3,20);
        isopowerPoints[2] = new IsopowerPoint(3,25);
        isopowerPoints[3] = new IsopowerPoint(3,30);
    }

    @Override
    public int getCount() {
        return isopowerPoints.length;
    }

    @Override
    public Object getItem(int i) {
        return isopowerPoints[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(R.layout.isopower_view,viewGroup,false);
        }

        TextView point_tv = v.findViewById(R.id.point_tv);
        point_tv.setText(String.format("P%d",i+1));
        EditText time_et = v.findViewById(R.id.time_et);
        time_et.setText(String.format("%d",isopowerPoints[i].getTime()));
        EditText intensity_et = v.findViewById(R.id.intensity_et);
        intensity_et.setText(String.format("%d",isopowerPoints[i].getIntensity()));

        return v;
    }
}
