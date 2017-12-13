package com.example.mvp.mvp_interface_callback.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by mc wu on 2017/12/13.
 */

public class BasePresenter<T> {
//fasdfasdfasdfasdf
    protected WeakReference<T> iView;

    public void attachView(T view){
        iView=new WeakReference<T>(view);
    }
    public void detachView(){
        iView.clear();
    }

}
