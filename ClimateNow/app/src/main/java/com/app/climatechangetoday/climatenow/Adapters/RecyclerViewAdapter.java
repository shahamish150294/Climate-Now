package com.app.climatechangetoday.climatenow.Adapters;


import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.climatechangetoday.climatenow.Common.Model;
import com.app.climatechangetoday.climatenow.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter
        <RecyclerViewAdapter.ListItemViewHolder> {

    private List<Model> items;
    private SparseBooleanArray selectedItems;

    public RecyclerViewAdapter(List<Model> modelData) {
        if (modelData == null) {
            throw new IllegalArgumentException("modelData must not be null");
        }
        items = modelData;
        selectedItems = new SparseBooleanArray();
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                    inflate(R.layout.feed_item, viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder viewHolder, int position) {
        Model model = items.get(position);
        viewHolder.name.setText(String.valueOf(model.name));
        viewHolder.age.setText(String.valueOf(model.age));
        viewHolder.itemView.setActivated(selectedItems.get(position, false));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public final static class ListItemViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.txt_name);
            age = (TextView) itemView.findViewById(R.id.txt_age);
        }
    }
}
