package com.sunnewable.www.solpowpow;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView pvRecyclerView;
    private powReaderAdapter pvAdapter;
    private ArrayList<PowReader> powerArrayList;
    private RecyclerView.LayoutManager pvLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        pvRecyclerView = findViewById(R.id.bigRecycler);
        //pvRecyclerView.setHasFixedSize(true);
        pvLayoutManager = new LinearLayoutManager(this);
        powerArrayList = new ArrayList<>();
        pvAdapter = new powReaderAdapter(this, powerArrayList);
        pvRecyclerView.setAdapter(pvAdapter);
        //pvRecyclerView.setLayoutManager(pvLayoutManager);
        //pvAdapter = new MyAdapter(myDataset);
       // pvRecyclerView.setAdapter(pvAdapter);
        CreateListData();
    }

    public void CreateListData(){

        PowReader pow = new PowReader("Monday", 11, 50,100, 50, 100);
        powerArrayList.add(pow);

        pow = new PowReader("Tuesday", 9, 59,00, 140,40);
        powerArrayList.add(pow);

        pow = new PowReader("Thursday", 23, 00,125, 15,50);
        powerArrayList.add(pow);

        pow = new PowReader("Friday", 4, 200,00, 215,20);
        powerArrayList.add(pow);

        pvAdapter.notifyDataSetChanged();
    }


}


