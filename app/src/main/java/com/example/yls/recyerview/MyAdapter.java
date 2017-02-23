package com.example.yls.recyerview;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yls on 2017/2/23.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Img> ImgList;
    public MyAdapter(List<Img> ImgList){
        this.ImgList=ImgList;

    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView imgName;
        public ViewHolder(View itemView){
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.img);
            imgName=(TextView) itemView.findViewById(R.id.imgName);
        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.img_item,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
         Img img=ImgList.get(position);
        holder.img.setImageResource(img.imgId);
        holder.imgName.setText(img.name);
    }

    @Override
    public int getItemCount() {
        return ImgList.size();
    }
}
