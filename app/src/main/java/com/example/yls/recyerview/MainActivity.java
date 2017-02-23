package com.example.yls.recyerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Img> ImgList=new ArrayList<>();
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initmImgList();
        initViews();
    }


    private void initmImgList() {
        ImgList.add(new Img("img1", R.drawable.t1));
        ImgList.add(new Img("img2", R.drawable.t2));
        ImgList.add(new Img("img3", R.drawable.t3));
        ImgList.add(new Img("img4", R.drawable.t4));
        ImgList.add(new Img("img5", R.drawable.t5));
        ImgList.add(new Img("img6", R.drawable.t6));
        ImgList.add(new Img("img7", R.drawable.t7));
        ImgList.add(new Img("img8", R.drawable.t8));
        ImgList.add(new Img("img9", R.drawable.t9));
        ImgList.add(new Img("img10",R.drawable.t10));


    }
    private void initViews() {
        mRecyclerView=(RecyclerView) findViewById(R.id.recyclerview);
      // LinearLayoutManager manger=new LinearLayoutManager(this);
       // manger.setOrientation(LinearLayoutManager.HORIZONTAL);
       // GridLayoutManager manager = new GridLayoutManager(this, 3);
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mMyAdapter=new MyAdapter(ImgList);
        mRecyclerView.setAdapter(mMyAdapter);
    }

}
