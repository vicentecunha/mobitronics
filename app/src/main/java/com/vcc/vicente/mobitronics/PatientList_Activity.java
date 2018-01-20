package com.vcc.vicente.mobitronics;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class PatientList_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.list_view);
        PatientAdapter patientAdapter = new PatientAdapter(getApplicationContext());
        listView.setAdapter(patientAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the options menu from XML
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.patientlist_menu, menu);

        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search_item).getActionView();
        // Assumes current activity is the searchable activity
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default

        return true;
    }

    public void goto_newPatient(MenuItem menuItem) {
        Intent intent = new Intent(this,NewPatient_Activity.class);
        startActivity(intent);
    }

    @SuppressLint("SetTextI18n")
    public void debug_historyClicked(View view) {
        TextView id_tv = ((View) view.getParent()).findViewById(R.id.id_tv);
        id_tv.setText("1234");
    }

    @SuppressLint("SetTextI18n")
    public void debug_therapyClicked(View view) {
        TextView id_tv = ((View) view.getParent()).findViewById(R.id.id_tv);
        id_tv.setText("5678");
    }
}
