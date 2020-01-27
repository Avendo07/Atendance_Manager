package com.example.attend;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private ArrayList<Subject> subjects;
    private Context context;
    Switch switched;

    public ListAdapter(Context context, ArrayList<Subject> arrayList) {
        this.context = context;
        this.subjects = arrayList;

    }


    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return subjects.size();
    }

    @Override
    public Object getItem(int position) {
        return subjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*TextView tv = new TextView(context);
        tv.setTextSize(25.0f);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        tv.setText(subjects.get(position).getSubject());*/
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listelement, null);
        convertView = view;
        return convertView;
    }


    /*private View createView(int position) {                                                          //TexViews
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setGravity(Gravity.CENTER);

        TextView subject = new TextView(context);
        subject.setText(subjects.get(position).getSubject());
        subject.setBackgroundColor(Color.parseColor("#FFFFFF"));

        TextView attend = new TextView(context);
        attend.setText(Integer.toString(subjects.get(position).getAttended()));
        attend.setBackgroundColor(Color.parseColor("#78C257"));

        TextView total = new TextView(context);
        total.setText(Integer.toString(subjects.get(position).getTotal()));
        total.setBackgroundColor(Color.parseColor("#82AAFF"));

        TextView perc = new TextView(context);
        perc.setText(Float.toString(subjects.get(position).getPerc()));
        perc.setBackgroundColor(Color.parseColor("#A4394E"));


        final Switch switched = new Switch(context);                                                       //Present Switch
        switched.setChecked(false);
        switched.setBackgroundColor(Color.parseColor("#4A888D"));
        switched.setPadding(5,0,20,0);
        switched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switched.setEnabled(false);
            }
        });

//        lin.setPadding(0,0,0,0);
//        layoutParamslin.setMargins(0,0,0,0);


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = 1.0f;

        linearLayout.addView(subject, layoutParams);
        linearLayout.addView(attend, layoutParams);
        linearLayout.addView(total, layoutParams);
        linearLayout.addView(perc, layoutParams);
        linearLayout.addView(switched, layoutParams);

        return linearLayout;
    }

    public void disable(){
        switched.setEnabled(false);
    }

    public void enable(){
        switched.setEnabled(true);
    }*/
}
