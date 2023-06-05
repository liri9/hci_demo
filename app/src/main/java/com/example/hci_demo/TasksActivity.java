package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hci_demo.utils.Adapter_Tasks;
import com.example.hci_demo.utils.Task;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class TasksActivity extends AppCompatActivity {
    RecyclerView tasks_LST_tasks;
    private MaterialButton org_myEvent_BTN_back,newTask;
    private ArrayList<Task> tasksList = new ArrayList<>();
    private Adapter_Tasks adapter = new Adapter_Tasks(tasksList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        findViews();
        createTaskList();
        initList();
        initViews();
        updateList(tasksList);
    }

    private void initList() {
        tasks_LST_tasks.setLayoutManager(new LinearLayoutManager(this));
        tasks_LST_tasks.setHasFixedSize(true);
        tasks_LST_tasks.setAdapter(adapter);
    }

    private void updateList(ArrayList<Task> tasksList) {
        adapter.updateList(tasksList);


    }

    private void createTaskList() {
        tasksList.add(new Task(false, "Clean the dining area", "Ensure the tables are clean and ready for guests.", Task.TeamType.Cleaning));
        tasksList.add(new Task(true, "Prepare the appetizers", "Prepare a variety of appetizers for the guests.", Task.TeamType.Kitchen));
        tasksList.add(new Task(false, "Mix and serve drinks", "Prepare and serve a selection of cocktails and beverages.", Task.TeamType.Bartenders));
        tasksList.add(new Task(true, "Serve the main course", "Serve the main course dishes to the guests.", Task.TeamType.Waiters));
        tasksList.add(new Task(false, "Clean the kitchen", "Thoroughly clean and sanitize the kitchen area.", Task.TeamType.Cleaning));
        tasksList.add(new Task(true, "Bake desserts", "Prepare and bake a variety of delicious desserts.", Task.TeamType.Kitchen));
        tasksList.add(new Task(false, "Set up the bar", "Organize and set up the bar area with all the necessary supplies.", Task.TeamType.Bartenders));
        tasksList.add(new Task(true, "Take orders from guests", "Interact with guests and take their food and beverage orders.", Task.TeamType.Waiters));
        tasksList.add(new Task(false, "Clean the restrooms", "Ensure the restrooms are clean and well-stocked throughout the event.", Task.TeamType.Cleaning));
        tasksList.add(new Task(true, "Decorate the venue", "Set up decorations and create an inviting atmosphere for the event.", Task.TeamType.Kitchen));
    }

    private void findViews() {
        tasks_LST_tasks = findViewById(R.id.tasks_LST_tasks);
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        newTask=findViewById(R.id.task_BTN_newTask);
    }

    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });

        newTask.setOnClickListener(view -> {
            Intent intent = new Intent (TasksActivity.this,NewTaskActivity.class);
            startActivity(intent);
        });

    }
}