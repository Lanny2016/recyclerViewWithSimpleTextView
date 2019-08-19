package com.exabarermple.latif.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    // LayoutManager is a must for the recycler view
    private RecyclerView.LayoutManager layoutManager;
    // create list
    private List<String> list;
    // initialize adapter object from RecyclerViewAdapter class
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        // casting for the recycler view
        recyclerView = findViewById ( R.id.recyclerView_id );
        // casting for layoutManager
        layoutManager = new LinearLayoutManager ( this );
        // setting the layoutManager for the recyclerView
        recyclerView.setLayoutManager ( layoutManager );
        // divider for the recyvler view
        RecyclerView.ItemDecoration divider = new DividerItemDecoration ( this,DividerItemDecoration.VERTICAL );
        recyclerView.addItemDecoration ( divider);
        // add the array to the list
        list = Arrays.asList ( getResources ().getStringArray ( R.array.basic_colors ));
        // create adapter object from RecyclerViewAdapter class and pass the list
        adapter = new RecyclerViewAdapter (list);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // set the adapter to the recycler view
        recyclerView.setAdapter ( adapter );
    }
}
