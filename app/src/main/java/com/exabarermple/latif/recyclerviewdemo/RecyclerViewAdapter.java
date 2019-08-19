package com.exabarermple.latif.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    // we need a list of texts
    private List<String>list;
    /**
     We need 3 things for recycler view
     1. layOut manager which we have already made on the main activity
     2.Adapter for the recycler view
     3. View holder
     below we are making the view holder class*/
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // a constructor must be needed
        // each data item is just a string in this case
        public TextView basicColors;
        public MyViewHolder(TextView itemView) {
            super ( itemView );
            basicColors = itemView;
        }
    }
    // Provide a suitable constructor (depends on the kind of dataset)
    public RecyclerViewAdapter(List<String>list) {
        this.list = list;

    }
    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int i) {

        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view, parent, false);
        // create the object of myViewHolder class
        MyViewHolder vh = new MyViewHolder ( v );
        return vh;
    }
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder( MyViewHolder viewHolder, int position) {
        // - get element from your dataSet at this position
        // - replace the contents of the view with that element
        viewHolder.basicColors.setText(list.get (position));

    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return list.size ();
    }

}
