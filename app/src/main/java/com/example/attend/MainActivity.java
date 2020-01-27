package com.example.attend;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
 import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

//import com.android.support.*;

public class MainActivity extends AppCompatActivity {

    boolean editable_view = false;
    Switch mSwitchShowSecure;
    Switch switcher;
    ListAdapter listAdapter;
    ListView listView;

    void editable(Menu menu) {                                                                                           //editable button

        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.listelement, null);
        final Switch switchers = v.findViewById(R.id.switcher);

        listView = findViewById(R.id.list);
        mSwitchShowSecure = menu.findItem(R.id.show_secure).getActionView().findViewById(R.id.switch_show_protected);
        mSwitchShowSecure.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    //Your code when checked
                    Log.i("Hello", "On");
                    editable_view = true;
                    disenable();
                    //listView.getChildAt(0).setActivated(true);
                    //listAdapter.enable();
                } else {
                    //Your code when unchecked
                    editable_view = false;
                    disenable();
                    listView.getChildAt(0).setActivated(false);
                    //listAdapter.disable();
                    Log.i("Hello", "Off");
                }
            }

            private void disenable() {                                                              //Disables the buttons
                switcher.setEnabled(editable_view);
                switchers.setEnabled(editable_view);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        editable(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView = findViewById(R.id.list);
        listView.setEnabled(false);
        ArrayList<Subject> arrayList = new ArrayList<>();
        switcher = findViewById(R.id.switcher);

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean str = switcher.isChecked();
                Toast.makeText(getApplicationContext(), Boolean.toString(str), Toast.LENGTH_SHORT).show();
            }
        });

        Subject subject1 = new Subject("English");
        Subject subject2 = new Subject("Physics");

        arrayList.add(subject1);
        arrayList.add(subject2);

        listAdapter = new ListAdapter(this, arrayList);
        listView.setAdapter(listAdapter);
        //listAdapter.disable();

    }


    public void add_sub(MenuItem item) {
        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
    }

    public void del_sub(MenuItem item) {
        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
    }
}
