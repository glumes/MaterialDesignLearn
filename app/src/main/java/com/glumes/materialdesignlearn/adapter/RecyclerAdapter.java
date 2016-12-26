package com.glumes.materialdesignlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.glumes.materialdesignlearn.R;

import java.util.ArrayList;

/**
 * Created by zhaoying on 2016/12/26.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context mContext ;
    private ArrayList<String> mArrayList ;

    private static final int TEXTVIEW_TYPE = 0x11;

    public RecyclerAdapter(Context context, ArrayList<String> arrayList) {
        mContext = context;
        mArrayList = arrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TEXTVIEW_TYPE){
            View view =  LayoutInflater.from(mContext).inflate(R.layout.item_text,parent,false);
            return new TextViewHolder(view);
        }
        return null ;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((TextViewHolder)holder).mTextView.setText(mArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    /**
     * 根据位置 position 决定类型
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        return TEXTVIEW_TYPE ;
    }

    static class TextViewHolder extends RecyclerView.ViewHolder{

        TextView mTextView ;

        public TextViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
