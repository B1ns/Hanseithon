package com.example.trends;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private TextView textView;
    private List<Data> dataList;
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setBottomNavigationView();
        setRecyclerView();

    }

    private void init(){
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        dataList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void setRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), R.layout.item_default_data, dataList);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void setBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.list_action:
                        return true;
                    case R.id.home_action:
                        Intent h = new Intent(getBaseContext(), homeActivity.class);
                        return true;
                    case R.id.tag_action:
                        Intent t = new Intent(getBaseContext(), SearchActivity.class);
                        return true;
                }
                return false;
            }
        });
    }

}
