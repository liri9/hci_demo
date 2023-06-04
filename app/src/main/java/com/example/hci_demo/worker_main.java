package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class worker_main extends AppCompatActivity {
    private Button calendarBtn;
    private Button tasksBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_main);

        calendarBtn = findViewById(R.id.worker_my_events_BTN_calendar);
        tasksBtn = findViewById(R.id.worker_my_events_BTN_tasks);

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(NextEventsSupplierActivity.class);
            }
        });

        tasksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(TasksActivity.class);
            }
        });

    }

    private void gotoActivity(Class cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}