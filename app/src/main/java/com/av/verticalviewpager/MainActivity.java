package com.av.verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.os.Bundle;

import com.av.verticalviewpager.transforms.DefaultTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> stringList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VerticalViewPager viewPager =  (VerticalViewPager) findViewById(R.id.vertical_viewpager);
        addData();
        MyAdapter madapter=new MyAdapter(this,stringList);
        viewPager.setAdapter(madapter);
        viewPager.setPageTransformer(false, new DefaultTransformer());

//viewPager.setPageTransformer(false, new ZoomOutTransformer());
//viewPager.setPageTransformer(true, new StackTransformer());
    }

    private void addData() {
        for (int i = 0; i < 8; i++) {
            stringList.add(String.valueOf(i));
        }
    }
}