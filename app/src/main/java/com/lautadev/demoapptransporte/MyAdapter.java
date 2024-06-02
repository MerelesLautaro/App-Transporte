package com.lautadev.demoapptransporte;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MyData> mData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView operationTextView;
        public TextView balanceTextView;
        public TextView dateTextView;

        public ViewHolder(View view) {
            super(view);
            operationTextView = view.findViewById(R.id.operation);
            balanceTextView = view.findViewById(R.id.balance);
            dateTextView = view.findViewById(R.id.date);
        }
    }

    public MyAdapter(List<MyData> data) {
        mData = data;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyData data = mData.get(position);
        holder.operationTextView.setText(data.getOperation());
        holder.balanceTextView.setText(data.getBalance());
        holder.dateTextView.setText(data.getDate());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
