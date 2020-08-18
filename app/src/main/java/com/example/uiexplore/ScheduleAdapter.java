package com.example.uiexplore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder>
{
    private ArrayList<ScheduleData> listdata;


    public ScheduleAdapter(ArrayList<ScheduleData> dataModel) {
        this.listdata = dataModel;
    }

    @NonNull
    @Override
    public ScheduleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.schedule_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleAdapter.ViewHolder holder, int position) {
        holder.txtClassName.setText(listdata.get(position).getDay());
        holder.txtTimeSchedule.setText(listdata.get(position).getNumOfClass());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtClassName;
        public TextView txtTimeSchedule;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.txtClassName = itemView.findViewById(R.id.txtClassNameSchedule);
            this.txtTimeSchedule = itemView.findViewById(R.id.txtTimeSchedule);
        }
    }
}