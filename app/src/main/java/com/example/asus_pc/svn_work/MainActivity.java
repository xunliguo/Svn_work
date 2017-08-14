package com.example.asus_pc.svn_work;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewpager;

    private List<View> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        getdata();
        MyAdapters adapters=new MyAdapters(list);
        viewpager.setAdapter(adapters);
    }

    public void getdata() {
        View view = View.inflate(MainActivity.this, R.layout.one, null);
        View view1 = View.inflate(MainActivity.this, R.layout.thtree, null);
        View view2= View.inflate(MainActivity.this, R.layout.two,null);
        list.add(view);
        list.add(view1);
        list.add(view2);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }
}
