package com.example.kieutiendat_kt2_bai1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    com.example.kieutiendat_kt2_bai1.FragmentBottomAdapter adapter;
    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        bottomNavigationView=findViewById(R.id.bottomnavig);
        adapter=new com.example.kieutiendat_kt2_bai1.FragmentBottomAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.c: viewPager.setCurrentItem(0);
                        break;
                    case R.id.java:viewPager.setCurrentItem(1);
                        break;
                    case R.id.python:viewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent=new Intent(com.example.kieutiendat_kt2_bai1.MainActivity.this, com.example.kieutiendat_kt2_bai1.ProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.exit:
                finish();
        }
        return true;
    }
}