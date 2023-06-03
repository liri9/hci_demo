package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hci_demo.utils.Adapter_Past_Event;
import com.example.hci_demo.utils.Event;
import com.example.hci_demo.utils.listsDB;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PastEventsActivity extends AppCompatActivity {
 private RecyclerView tasks_LST_tasks;
 private MaterialButton org_myEvent_BTN_back;
 private ArrayList<Event> eventList = new ArrayList<>();
    private Adapter_Past_Event adapter;

    listsDB db = new listsDB();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_events);
        findViews();
        initViews();
        createPastEventList();
        initList();
        updateList(eventList);

    }

    private void createPastEventList() {
        eventList.add(new Event(new Date(2023, 3, 2), "Lior and Liora's Wedding", "A beautiful celebration of love and unity.", 5.0));
        eventList.add(new Event(new Date(2023, 4, 13), "Amir's Bar Mitzvah", "A meaningful coming-of-age ceremony.", 4.6));
        eventList.add(new Event(new Date(2022, 5, 25), "Yuval's Brit", "A joyous occasion celebrating a baby boy's birth.", 3.8));
        eventList.add(new Event(new Date(2022, 2, 31), "Michael and Micha's Wedding", "A grand wedding celebration filled with love and happiness.", 5.0));
        eventList.add(new Event(new Date(2023, 11, 15), "Ron and Rona's Wedding", "A memorable wedding ceremony and reception.", 2.4));
        eventList.add(new Event(new Date(2023, 8, 4), "Shira's Bat Mitzvah", "A significant milestone celebration for a young girl.", 4.7));
        eventList.add(new Event(new Date(2022, 9, 22), "Einat's Birthday Party", "A fun-filled birthday party with friends and family.", 5.0));
        eventList.add(new Event(new Date(2023, 4, 4), "Shmuel's Bar Mitzvah", "A meaningful religious ceremony for a young boy.", 4.9));
        eventList.add(new Event(new Date(2022, 11, 12), "Sarah and David's Wedding", "A romantic wedding celebration filled with joy.", 4.2));
        eventList.add(new Event(new Date(2023, 1, 28), "Company Anniversary Party", "A special event marking the company's successful years.", 4.8));
        eventList.add(new Event(new Date(2022, 7, 6), "Summer Music Festival", "An unforgettable music festival under the summer sun.", 4.5));
        eventList.add(new Event(new Date(2023, 2, 10), "Graduation Ceremony", "A proud moment for graduates celebrating their achievements.", 4.7));
        eventList.add(new Event(new Date(2022, 6, 18), "Family Reunion", "A joyful gathering of extended family members.", 4.3));
        eventList.add(new Event(new Date(2023, 10, 1), "Charity Gala Dinner", "A glamorous fundraising event supporting a worthy cause.", 4.9));
        eventList.add(new Event(new Date(2022, 3, 30), "New Year's Eve Party", "A lively celebration to welcome the new year.", 4.6));

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

//    private void setAdapter() {
//        adapter = new Adapter_Past_Event(eventList);
//        tasks_LST_tasks.setAdapter(adapter);
//    }
    private void updateList(ArrayList<Event> events) {
        adapter.updateList(events);
    }
    private void initList() {
        adapter = new Adapter_Past_Event(eventList);
        // one item in a row
        tasks_LST_tasks.setLayoutManager(new LinearLayoutManager(this));
        tasks_LST_tasks.setHasFixedSize(true);
        tasks_LST_tasks.setAdapter(adapter);

    }
}