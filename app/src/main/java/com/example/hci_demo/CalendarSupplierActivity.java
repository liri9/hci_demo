package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

import com.google.android.material.button.MaterialButton;

import java.nio.file.Files;

public class CalendarSupplierActivity extends AppCompatActivity {
    CalendarView myCalendar;
    MaterialButton pastEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_supplier);
        findViews();

    }

    private void findViews() {
        pastEvents = findViewById(R.id.calendar_BTN_pastEvents);
    }


}