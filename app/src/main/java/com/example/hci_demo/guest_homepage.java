package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.hci_demo.utils.Adapter_Guest_Event;
import com.example.hci_demo.utils.Event;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class guest_homepage extends AppCompatActivity {
    private RecyclerView guest_LST_events;
    private MaterialButton org_myEvent_BTN_back, gift_BTN_send, confirm_BTN_yes, confirm_BTN_no, food_BTN_send;
    public static CardView guest_CRD_food;
    public static CardView guest_CRD_confirmation;
    public static CardView guest_CRD_gift;
    private ArrayList<Event> eventList = new ArrayList<>();
    private Adapter_Guest_Event adapter = new Adapter_Guest_Event(eventList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_homepage);
        findViews();
        createFutureEventList();
        initList();
        initViews();
        updateList(eventList);
    }

    private void updateList(ArrayList<Event> eventList) {
        adapter.updateList(eventList);
    }

    private void initViews() {
//        org_myEvent_BTN_back.setOnClickListener(view -> {
//            finish();
//        });
//
        gift_BTN_send.setOnClickListener(view -> {
            guest_CRD_gift.setVisibility(View.INVISIBLE);
        });
        confirm_BTN_yes.setOnClickListener(view -> {
            guest_CRD_confirmation.setVisibility(View.INVISIBLE);
        });
        confirm_BTN_no.setOnClickListener(view -> {
            guest_CRD_confirmation.setVisibility(View.INVISIBLE);
        });
        food_BTN_send.setOnClickListener(view -> {
            guest_CRD_food.setVisibility(View.INVISIBLE);
        });
    }

    public static CardView getGuest_CRD_food() {
        return guest_CRD_food;
    }

    public static CardView getGuest_CRD_confirmation() {
        return guest_CRD_confirmation;
    }

    public static CardView getGuest_CRD_gift() {
        return guest_CRD_gift;
    }

    private void initList() {

        // one item in a row
        guest_LST_events.setLayoutManager(new LinearLayoutManager(this));
        guest_LST_events.setHasFixedSize(true);
        guest_LST_events.setAdapter(adapter);
    }

    private void createFutureEventList() {

        eventList.add(new Event("Michael and Shir's wedding", "Date: 09-10-2023", "12", "Address: Rothschild Blvd 1, Tel Aviv"));
        eventList.add(new Event("John and Emily's engagement party", "Date: 07-15-2023", "8", "Address: Ben Gurion St 5, Jerusalem"));
        eventList.add(new Event("Sarah's birthday celebration", "Date: 11-05-2023", "10", "Address: Dizengoff St 10, Tel Aviv"));
        eventList.add(new Event("David and Lisa's anniversary dinner", "Date: 10-20-2023", "6", "Address: Ibn Gabirol St 20, Tel Aviv"));
        eventList.add(new Event("Jessica's graduation party", "Date: 06-30-2023", "15", "Address: Herzl St 30, Haifa"));
    }

    private void findViews() {
        //   org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        guest_LST_events = findViewById(R.id.guest_LST_events);
        gift_BTN_send = findViewById(R.id.gift_BTN_send);
        confirm_BTN_yes = findViewById(R.id.confirm_BTN_yes);
        confirm_BTN_no = findViewById(R.id.confirm_BTN_no);
        food_BTN_send = findViewById(R.id.food_BTN_send);
        guest_CRD_confirmation= findViewById(R.id.guest_CRD_confirmation);
        guest_CRD_gift = findViewById(R.id.guest_CRD_gift);
        guest_CRD_food= findViewById(R.id.guest_CRD_food);

    }
}