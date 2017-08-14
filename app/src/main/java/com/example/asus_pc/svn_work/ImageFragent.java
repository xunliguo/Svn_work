package com.example.asus_pc.svn_work;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by ASUS-PC on 2017/8/11.
 */

public class ImageFragent extends Fragment {
    private String url="http://baike.baidu.com/api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=%E9%AB%98%E6%99%93%E6%9D%BE&bk_length=600";

    private ImageView image1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.imagefrag, null);
        initView(view);
        getdata();
        return view;
    }

    private void initView(View view) {
        image1 = (ImageView) view.findViewById(R.id.image);


    }

    public void getdata() {
        OkHttpManager.getInstance().getqingqiu(url, new OkHttpManager.Callacks() {
            @Override
            public void show(Bean bean) {
                String image = bean.getImage();
                Glide.with(getActivity()).load(image).into(image1);

            };
        });
    }
}
