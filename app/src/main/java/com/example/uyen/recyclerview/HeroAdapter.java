package com.example.uyen.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.MyViewHolder> {

    private List<Hero> mHeros;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public HeroAdapter(Context context, List<Hero> mHeros) {
        this.mHeros = mHeros;
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item = mLayoutInflater.inflate(R.layout.hero, viewGroup, false);

        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.bindData(mHeros.get(i));
    }

    @Override
    public int getItemCount() {
        if(mHeros != null) return mHeros.size();
        else return 0;

    }

    public class MyViewHolder extends  RecyclerView.ViewHolder   {
        public TextView mTextName;
        public ImageView mImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextName = itemView.findViewById(R.id.text_name);
            mImage = itemView.findViewById(R.id.image);
        }

        public void bindData(Hero hero) {
            mImage.setImageResource(hero.getmImage());
            mTextName.setText(hero.getmName());
        }
    }

}
