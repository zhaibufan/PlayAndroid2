package com.study.playandroid2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.addItemDecoration(new GridItemDecoration((int) getResources().getDimension(R.dimen.swipe_grid_item_vertical_span), (int) getResources().getDimension(R.dimen.swipe_grid_item_vertical_span),getResources().getColor(R.color.colorPrimaryDark), false));
        rv.setAdapter(new GirdViewAdapter(this));
    }
}
