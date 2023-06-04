package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hci_demo.utils.Adapter_Past_Event;
import com.example.hci_demo.utils.Event;
import com.google.android.material.button.MaterialButton;

import java.sql.Date;
import java.util.ArrayList;

public class NextEventsSupplierActivity extends AppCompatActivity {
    private RecyclerView tasks_LST_tasks;
    private MaterialButton org_myEvent_BTN_back;
    private ArrayList<Event> eventList = new ArrayList<>();

    private Adapter_Past_Event adapter =new Adapter_Past_Event(eventList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_supplier);
        findViews();
        createFutureEventList();
        initList();
        initViews();
        updateList(eventList);

    }

    private void updateList(ArrayList<Event> eventList)
    {
        adapter.updateList(eventList);
    }

    private void createFutureEventList() {
        eventList.add(new Event(new Date(2023 - 1900, 3, 2), "Lior and Liora's Wedding", "A beautiful celebration of love and unity."));
        eventList.add(new Event(new Date(2023 - 1900, 6, 15), "John and Emily's Anniversary", "A special occasion to commemorate their love."));
        eventList.add(new Event(new Date(2023 - 1900, 9, 28), "Sarah's Birthday Party", "Join us for a fun-filled celebration!"));
        eventList.add(new Event(new Date(2023 - 1900, 11, 25), "Christmas Gala", "Experience the magic of Christmas with us."));
        eventList.add(new Event(new Date(2024 - 1900, 1, 14), "Valentine's Day Dinner", "Celebrate love on this romantic evening."));
        eventList.add(new Event(new Date(2024 - 1900, 3, 10), "Company Conference", "A gathering of industry experts and professionals."));
        eventList.add(new Event(new Date(2024 - 1900, 6, 5), "Summer Music Festival", "Enjoy live music performances under the sun."));
        eventList.add(new Event(new Date(2024 - 1900, 8, 22), "Product Launch Party", "Be the first to witness our latest innovation."));
        eventList.add(new Event(new Date(2024 - 1900, 10, 18), "Thanksgiving Charity Dinner", "Support a good cause while enjoying a delicious meal."));
        eventList.add(new Event(new Date(2024 - 1900, 12, 31), "New Year's Eve Party", "Countdown to the new year with us!"));
        eventList.add(new Event(new Date(2025 - 1900, 2, 9), "International Women's Day Celebration", "Empowering women and promoting equality."));
        eventList.add(new Event(new Date(2025 - 1900, 4, 27), "Spring Fashion Show", "Witness the latest trends on the runway."));
        eventList.add(new Event(new Date(2025 - 1900, 7, 14), "Family Picnic Day", "Spend quality time with your loved ones in the park."));
        eventList.add(new Event(new Date(2025 - 1900, 9, 6), "Halloween Costume Party", "Dress up and have a spooktacular time!"));
        eventList.add(new Event(new Date(2025 - 1900, 11, 24), "Annual Gala Dinner", "A glamorous evening of entertainment and fundraising."));
    }
    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        tasks_LST_tasks = findViewById(R.id.tasks_LST_tasks);

    }
    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });

    }
    private void initList() {
        // one item in a row
        tasks_LST_tasks.setLayoutManager(new LinearLayoutManager(this));
        tasks_LST_tasks.setHasFixedSize(true);
        tasks_LST_tasks.setAdapter(adapter);

    }



}