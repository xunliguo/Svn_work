package com.example.asus_pc.svn_work;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button jainshu;
    private Button image;
    private Button conont;
    private FrameLayout fragment;
    private List<Fragment> list=new ArrayList<>();
    private FragmentTransaction transaction;
    private JianjieFragment jianjieFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            initView();
    }

    private void initView() {
        jainshu = (Button) findViewById(R.id.jainshu);
        image = (Button) findViewById(R.id.image);
        conont = (Button) findViewById(R.id.conont);
        fragment = (FrameLayout) findViewById(R.id.fragment);

        jainshu.setOnClickListener(this);
        image.setOnClickListener(this);
        conont.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();


        switch (v.getId()) {
            case R.id.jainshu:
                jianjieFragment = new JianjieFragment();
                transaction.replace(R.id.fragment, jianjieFragment);
                break;
            case R.id.image:
                ImageFragent imageFragent=new ImageFragent();
                transaction.replace(R.id.fragment,imageFragent);

                break;
            case R.id.conont:
                MoreFragment moreFragment=new MoreFragment();
                transaction.replace(R.id.fragment,moreFragment);
                break;
        }
        transaction.commit();
    }
}
