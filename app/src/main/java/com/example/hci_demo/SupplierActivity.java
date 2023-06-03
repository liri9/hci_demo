package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hci_demo.utils.AppManager;
import com.google.android.material.button.MaterialButton;

public class SupplierActivity extends AppCompatActivity {
    private TextView supplier_name, desceription;
    private AppManager appManager;
    private MaterialButton sup_my_event_BTN_Calendar, sup_my_event_BTN_events, sup_my_event_BTN_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        findView();
        initView();
    }

    private void initView() {
        sup_my_event_BTN_Calendar.setOnClickListener(view -> {

        });
        sup_my_event_BTN_events.setOnClickListener(view -> {

            Intent intent = new Intent(this, PastEventsActivity.class);
            startActivity(intent);
        });
        sup_my_event_BTN_chat.setOnClickListener(view -> {

        });
    }

    private void findView() {
        supplier_name = findViewById(R.id.Supplier_name);
        desceription = findViewById(R.id.supplier_LBL_desceription);
        sup_my_event_BTN_Calendar = findViewById(R.id.sup_my_event_BTN_Calendar);
        sup_my_event_BTN_events = findViewById(R.id.sup_my_event_BTN_events);
        sup_my_event_BTN_chat = findViewById(R.id.sup_my_event_BTN_chat);
//
//        supplier_name.setText(appManager.getLoggedInUser().getSupType().toString());
//        desceription.setText(appManager.getLoggedInUser().getDescription());
//
        supplier_name.setText("Catering");
        desceription.setText("Dsecription: Hello, I am Avi. I do Catering");
    }
}