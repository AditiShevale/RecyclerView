package com.example.aditi.task2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aditi on 30/3/18.
 */

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MyViewHolder>{

    List<detail>mDetails;

    public RecyAdapter(List<detail> details) {
        mDetails = details;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        detail detailpojo = mDetails.get(position);
        holder.txtname.setText(detailpojo.getName());
    }

    @Override
    public int getItemCount() {
        return mDetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView txtname;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.name);
        }
    }
}
