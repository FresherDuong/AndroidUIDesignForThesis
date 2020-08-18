package com.example.uiexplore;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TimeTableAdapter extends RecyclerView.Adapter<TimeTableAdapter.ViewHolder>
{
    private ArrayList<TimeTableData> listdata;


    public TimeTableAdapter(ArrayList<TimeTableData> dataModel) {
        this.listdata = dataModel;
    }

    @NonNull
    @Override
    public TimeTableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.time_table_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TimeTableAdapter.ViewHolder holder, int position) {
        String myListData = listdata.get(position).getNumOfClass() + "";

        holder.txtDay.setText(listdata.get(position).getDay());
        holder.txtNumOfClass.setText(myListData);
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtDay;
        public TextView txtNumOfClass;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.txtDay = itemView.findViewById(R.id.txt_day);
            this.txtNumOfClass = itemView.findViewById(R.id.numOfClass);
        }
    }
}