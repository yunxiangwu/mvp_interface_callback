package com.example.mvp.mvp_interface_callback.presenter;

import com.example.mvp.mvp_interface_callback.Girls;
import com.example.mvp.mvp_interface_callback.model.GirlModelImpl;
import com.example.mvp.mvp_interface_callback.model.IModel;
import com.example.mvp.mvp_interface_callback.view.IView;

import java.util.List;

/**
 * Created by mc wu on 2017/12/13.
 */

public class IPresenter<T extends IView> extends BasePresenter<T> {

    IModel iModel=new GirlModelImpl();




    public void fetch(){
        if(iView.get()!=null){
            iView.get().showLoading();
            if(iModel!=null){
                iModel.loadGrils(new IModel.GirlLoadListener() {
                    @Override
                    public void onComplete(List<Girls> girls) {
                        iView.get().showGirlds(girls);
                    }
                });
            }
        }
    }

}
