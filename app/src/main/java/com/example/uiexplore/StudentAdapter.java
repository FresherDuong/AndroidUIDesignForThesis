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

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>
{
    private ArrayList<TimeTableData> listdata;
    private Context context;


    public StudentAdapter(ArrayList<TimeTableData> dataModel, Context c) {
        this.listdata = dataModel;
        this.context = c;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.student_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        String myListData = listdata.get(position).getNumOfClass() + "";
        final String studentName = listdata.get(position).getDay();

        holder.txtStudentName.setText(studentName);
        holder.txtNumOfTime.setText(myListData);
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, StudentProfile.class);
                intent.putExtra("studentName", studentName);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtStudentName;
        public TextView txtNumOfTime;
        public Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.txtStudentName = itemView.findViewById(R.id.txt_student_name);
            this.txtNumOfTime = itemView.findViewById(R.id.txtNumOfTime);
            this.btnDetail = itemView.findViewById(R.id.btn_student_detail);
        }
    }
}