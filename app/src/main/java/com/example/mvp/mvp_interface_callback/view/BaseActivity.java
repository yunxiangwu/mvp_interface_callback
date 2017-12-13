package com.example.mvp.mvp_interface_callback.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.mvp.mvp_interface_callback.presenter.BasePresenter;

/**
 * Created by mc wu on 2017/12/13.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {

    public T girlPresenter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter=createPresenter();
        Log.d("base girlpresenter","sadfasdf"+girlPresenter);
        girlPresenter.attachView((V) this);
    }
    public abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();
    }
}
