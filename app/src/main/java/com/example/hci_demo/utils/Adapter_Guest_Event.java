package com.example.hci_demo.utils;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hci_demo.ChatActivity;
import com.example.hci_demo.R;
import com.example.hci_demo.utils.Event;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Guest_Event extends RecyclerView.Adapter<Adapter_Guest_Event.EventViewHolder> {

    private List<Event> events;
    public Adapter_Guest_Event(ArrayList<Event> eventList){
        events = eventList;
    }
    public class EventViewHolder extends RecyclerView.ViewHolder {
        private MaterialTextView guest_main_LBL_eventName;
        private MaterialTextView guest_main_LBL_eventAddress;
        private MaterialTextView guest_main_LBL_eventDate;
        private MaterialTextView guest_main_LBL_tblNumber;
        private MaterialButton      guest_main_BTN_confirmation
                                  ,guest_main_BTN_foodRequest,
                                  guest_main_BTN_gift;


        EventViewHolder(View itemView) {
            super(itemView);
            guest_main_LBL_eventName = itemView.findViewById(R.id. guest_main_LBL_eventName );
            guest_main_LBL_eventAddress = itemView.findViewById(R.id. guest_main_LBL_eventAddress);
            guest_main_LBL_eventDate = itemView.findViewById(R.id. guest_main_LBL_eventDate );
            guest_main_LBL_tblNumber = itemView.findViewById(R.id. guest_main_LBL_tblNumber );
            guest_main_BTN_confirmation  = itemView.findViewById(R.id. guest_main_BTN_confirmation);
            guest_main_BTN_foodRequest  = itemView.findViewById(R.id. guest_main_BTN_foodRequest );
            guest_main_BTN_gift = itemView.findViewById(R.id. guest_main_BTN_gift );

//            events_BTN_chat.setOnClickListener(view -> {
//                Intent intent = new Intent(view.getContext(), ChatActivity.class);
//                view.getContext().startActivity(intent);
//            });
        }
    }
    public void updateList(List<Event> eventList) {
        events = eventList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public Adapter_Guest_Event.EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_guest_events, viewGroup, false);
        return new Adapter_Guest_Event.EventViewHolder(view);
    }

    public int getItemCount() {
        return events == null ? 0 : events.size();
    }

    private Event getItem(int position) {
        return events.get(position);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter_Guest_Event.EventViewHolder holder, int position) {
        Event event = getItem(position);
        holder.guest_main_LBL_eventName .setText(event.getName());
        holder.guest_main_LBL_eventAddress.setText(event.getAddress());
        holder.guest_main_LBL_eventDate .setText(event.getsDate());
        holder.guest_main_LBL_tblNumber.setText(event.getTableNum());
    }

}
