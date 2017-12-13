package com.example.mvp.mvp_interface_callback.view;

import com.example.mvp.mvp_interface_callback.Girls;

import java.util.List;

/**
 * Created by mc wu on 2017/12/13.
 */

public interface IView {

    void showLoading();
    void showGirlds(List<Girls> girls);

}
