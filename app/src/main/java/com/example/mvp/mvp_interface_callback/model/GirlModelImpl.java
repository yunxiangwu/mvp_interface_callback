package com.example.mvp.mvp_interface_callback.model;

import com.example.mvp.mvp_interface_callback.Girls;
import com.example.mvp.mvp_interface_callback.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mc wu on 2017/12/13.
 */

public class GirlModelImpl implements IModel {
    @Override
    public void loadGrils(GirlLoadListener girlLoadListener) {
        List<Girls> list=new ArrayList<>();
        list.add(new Girls(R.mipmap.a,"美女1"));
        list.add(new Girls(R.mipmap.b,"美女2"));
        list.add(new Girls(R.mipmap.c,"美女3"));
        list.add(new Girls(R.mipmap.d,"美女4"));
        list.add(new Girls(R.mipmap.e,"美女5"));
        list.add(new Girls(R.mipmap.f,"美女6"));
        list.add(new Girls(R.mipmap.g,"美女7"));
        girlLoadListener.onComplete(list);

    }

}
