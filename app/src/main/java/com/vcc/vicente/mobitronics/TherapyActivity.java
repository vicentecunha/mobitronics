package com.vcc.vicente.mobitronics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TherapyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapy);

        ListView listView = findViewById(R.id.isopower_points);
        IsopowerAdapter isopowerAdapter = new IsopowerAdapter(getApplicationContext());
        listView.setAdapter(isopowerAdapter);
    }
}
