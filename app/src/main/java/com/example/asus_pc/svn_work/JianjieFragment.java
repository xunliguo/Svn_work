package com.example.asus_pc.svn_work;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS-PC on 2017/8/11.
 */

public class JianjieFragment extends Fragment {
    private TextView name;
    private TextView minzu;
    private TextView guoji;
    private TextView xingzuo;
  private String url="http://baike.baidu.com/api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=%E9%AB%98%E6%99%93%E6%9D%BE&bk_length=600";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jinjian, null);
        initView(view);

        getData();
        return view;
    }

    private void initView(View view) {
        name = (TextView) view.findViewById(R.id.name);
        minzu = (TextView) view.findViewById(R.id.minzu);
        guoji = (TextView) view.findViewById(R.id.guoji);
        xingzuo = (TextView) view.findViewById(R.id.xingzuo);


    }

    public void  getData() {
    OkHttpManager.getInstance().getqingqiu(url, new OkHttpManager.Callacks() {
        @Override
        public void show(Bean bean) {
            Bean.CardBean cardBean = bean.getCard().get(0);
            Bean.CardBean cardBean1 = bean.getCard().get(1);
            Bean.CardBean cardBean2 = bean.getCard().get(2);
            Bean.CardBean cardBean3 = bean.getCard().get(3);



            List<String> value = cardBean.getValue();
            String s1 = cardBean1.getValue().get(0);
            String s = value.get(0);
            name.setText(s);
            guoji.setText(s1);
            String s2 = cardBean2.getValue().get(0);
            minzu.setText(s2);
            String s3 = cardBean3.getValue().get(0);
            xingzuo.setText(s3);

        };
    });

    }
}
