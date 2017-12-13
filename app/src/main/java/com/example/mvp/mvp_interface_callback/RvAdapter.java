package com.example.mvp.mvp_interface_callback;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mc wu on 2017/12/12.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RVViewHolder> {

    private List<Girls> datas;

    public RvAdapter(List<Girls> datas){
        this.datas=datas;
    }

    @Override
    public RVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= View.inflate(parent.getContext(),R.layout.item_layout,null);
        return new RVViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RVViewHolder holder, int position) {
        holder.ivImg.setImageResource(datas.get(position).ids);
        holder.tvText.setText(datas.get(position).name);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    public class RVViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivImg;
        public TextView tvText;
        public RVViewHolder(View itemView) {
            super(itemView);
            ivImg=itemView.findViewById(R.id.iv_img);
            tvText=itemView.findViewById(R.id.tv_text);
        }
    }
}
