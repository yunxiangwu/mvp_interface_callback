package com.example.mvp.mvp_interface_callback.model;

import com.example.mvp.mvp_interface_callback.Girls;

import java.util.List;

/**
 * Created by mc wu on 2017/12/13.
 */

public interface IModel {
//hahafasdfasdfa
        void loadGrils(GirlLoadListener girlLoadListener);
        interface GirlLoadListener{
            void onComplete(List<Girls> girls);
    }

}
