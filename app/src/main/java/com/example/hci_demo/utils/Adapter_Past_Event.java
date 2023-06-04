package com.example.hci_demo.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hci_demo.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;
import java.util.Locale;

public class Adapter_Past_Event extends RecyclerView.Adapter<Adapter_Past_Event.EventViewHolder> {

private AppManager appManager;
    private  List<Event> events;

    public Adapter_Past_Event(List<Event> eventList) {
        events = eventList;
    }

    public void updateList(List<Event> eventList) {
        events = eventList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_past_events, viewGroup, false);
        return new EventViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = getItem(position);
        holder.event_LBL_name.setText(event.getName());
        holder.event_LBL_date.setText(event.getDate().toString());
        holder.event_LBL_description.setText(event.getDescription());

        holder.event_RTG_rating.setRating((float) event.getRating());
    }

    @Override
    public int getItemCount() {
        return events == null ? 0 : events.size();
    }

    private Event getItem(int position) {
        return events.get(position);
    }


    public class EventViewHolder extends RecyclerView.ViewHolder {
        private MaterialTextView event_LBL_description;
        private MaterialTextView event_LBL_name;
        private MaterialTextView event_LBL_date;
        private AppCompatRatingBar event_RTG_rating;

        EventViewHolder(View itemView) {
            super(itemView);
            event_LBL_description = itemView.findViewById(R.id.event_LBL_description);
            event_LBL_name = itemView.findViewById(R.id.event_LBL_name);
            event_LBL_date = itemView.findViewById(R.id.event_LBL_date);
            event_RTG_rating = itemView.findViewById(R.id.event_RTG_rating);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onGameClickListener.onClick(v, getItem(getAdapterPosition()), getAdapterPosition());
//                }
//            });
        }
    }

}
