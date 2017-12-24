package com.pavneet.android.boost.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pavneet.android.boost.R;
import com.pavneet.android.boost.adapter.CircleImageAndCardViewAdapter;
import com.pavneet.android.boost.util.Util;

public class MaterialDesign extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CircleImageAndCardViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(MaterialDesign.this));
        adapter = new CircleImageAndCardViewAdapter(Util.getList(),R.layout.circular_list_item,MaterialDesign.this);
        recyclerView.setAdapter(adapter);
    }
}