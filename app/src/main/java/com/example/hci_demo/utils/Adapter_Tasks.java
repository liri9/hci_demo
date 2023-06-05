package com.example.hci_demo.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hci_demo.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class Adapter_Tasks extends RecyclerView.Adapter<com.example.hci_demo.utils.Adapter_Tasks.TaskViewHolder> {

    private AppManager appManager;
    private List<Task> tasks;

    public Adapter_Tasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void updateList(List<Task> eventList) {
        tasks = eventList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter_Tasks.TaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_task, viewGroup, false);
        return new TaskViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull com.example.hci_demo.utils.Adapter_Tasks.TaskViewHolder holder, int position) {
        Task task = getItem(position);
        holder.checkBox_task.setChecked(task.isComplete());
        holder.task_LBL_description.setText(task.getDescription());
        holder.task_LBL_name.setText(task.getName());
    }

    @Override
    public int getItemCount() {
        return tasks == null ? 0 : tasks.size();
    }

    private Task getItem(int position) {
        return tasks.get(position);
    }


    public class TaskViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox_task;
        MaterialTextView task_LBL_description, task_LBL_name;


        TaskViewHolder(View itemView) {
            super(itemView);
            checkBox_task = itemView.findViewById(R.id.checkBox_task);
            task_LBL_description = itemView.findViewById(R.id.task_LBL_description);
            task_LBL_name = itemView.findViewById(R.id.task_LBL_name);

        }
    }

}
