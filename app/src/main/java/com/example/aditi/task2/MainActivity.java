package com.example.aditi.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

 RecyclerView mRecyclerView;

 ArrayList<detail>mDetails = new ArrayList<>();

 RecyAdapter mRecyAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyAdapter = new RecyAdapter(mDetails);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mRecyAdapter);
         prepareData();



    }

    private void prepareData() {
        detail d = new detail("Aditi");
        mDetails.add(d);
         d = new detail("astydfg");
        mDetails.add(d);
         d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        d = new detail("adfsd");
        mDetails.add(d);
        mRecyAdapter.notifyDataSetChanged();

    }
}
