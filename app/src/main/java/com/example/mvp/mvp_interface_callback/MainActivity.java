package com.example.mvp.mvp_interface_callback;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.mvp.mvp_interface_callback.presenter.IPresenter;
import com.example.mvp.mvp_interface_callback.view.BaseActivity;
import com.example.mvp.mvp_interface_callback.view.IView;

import java.util.List;

public class MainActivity extends BaseActivity<IView,IPresenter<IView>> implements IView {

    private RecyclerView rvList;
//    private IPresenter<MainActivity> mainActivityIPresenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList=findViewById(R.id.rv_list);
         /*mainActivityIPresenter= new IPresenter();
         mainActivityIPresenter.attachView(this);
         mainActivityIPresenter.fetch();*/
        Log.d("girlpresenter","sadfasdf"+girlPresenter);
         girlPresenter.fetch();
    }

    @Override
    public IPresenter<IView> createPresenter() {
        return new IPresenter<>();
    }


    @Override
    public void showLoading() {
        Toast.makeText(this,"加载成功了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirlds(List<Girls> girls) {
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setAdapter(new RvAdapter(girls));

    }
}
