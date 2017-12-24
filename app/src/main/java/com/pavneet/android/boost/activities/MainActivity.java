package com.pavneet.android.boost.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.pavneet.android.boost.R;
import com.pavneet.android.boost.util.ActivityUtil;
import com.pavneet.android.boost.util.Util;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // retrieve reference of livtview from xml
        listView = findViewById(R.id.list);
        // add listener to handle click events
        listView.setOnItemClickListener(listener);
        // adapter to create list item views
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                Util.DEMO_LIST_ITEMS
                );
        listView.setAdapter(adapter);
    }

    private AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i){
                case 0:
                    ActivityUtil.startActivity(MainActivity.this,FoatingAndSnakBarActivity.class);
                    break;
                case 1:
                    ActivityUtil.startActivity(MainActivity.this,AnimateActivity.class);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;
                case 2:
                    ActivityUtil.startActivity(MainActivity.this,MaterialDesign.class);
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    break;                 
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    };

}