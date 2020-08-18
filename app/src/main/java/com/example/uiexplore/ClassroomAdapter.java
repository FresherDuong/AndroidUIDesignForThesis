package com.example.uiexplore;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassroomAdapter extends RecyclerView.Adapter<ClassroomAdapter.ViewHolder>
{
    private ArrayList<TimeTableData> listdata;
    private Context context;


    public ClassroomAdapter(ArrayList<TimeTableData> dataModel, Context c) {
        this.listdata = dataModel;
        this.context = c;
    }

    @NonNull
    @Override
    public ClassroomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.classroom_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassroomAdapter.ViewHolder holder, int position) {
        String myListData = listdata.get(position).getNumOfClass() + "";

        holder.txtDay.setText(listdata.get(position).getDay());
        holder.txtNumOfClass.setText(myListData);

        final String className = "LỚP: " + listdata.get(position).getDay();

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Student.class);
                intent.putExtra("className", className);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtDay;
        public TextView txtNumOfClass;
        public Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.txtDay = itemView.findViewById(R.id.txt_class_name);
            this.txtNumOfClass = itemView.findViewById(R.id.numOfStudent);
            this.btnDetail = itemView.findViewById(R.id.btn_classroom_detail);
        }
    }
}