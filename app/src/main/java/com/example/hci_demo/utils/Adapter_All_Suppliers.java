package com.example.hci_demo.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hci_demo.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class Adapter_All_Suppliers extends RecyclerView.Adapter<Adapter_All_Suppliers.EventViewHolder> {

    private AppManager appManager;
    private List<User> suppliers;

    public Adapter_All_Suppliers(List<User> allSup) {
        suppliers = allSup;
    }

    public void updateList(List<User> allSup) {
        suppliers = allSup;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter_All_Suppliers.EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_suppliers, viewGroup, false);
        return new Adapter_All_Suppliers.EventViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter_All_Suppliers.EventViewHolder holder, int position) {
        User user = getItem(position);
        holder.supplier_LBL_name.setText(user.getName());
        holder.sup_LBL_category.setText(user.getSupType().toString());
        holder.sup_LBL_description.setText(user.getDescription());
        holder.sup_LBL_range.setText(user.getMinPrice() + " - " + user.getTopPrice());
        holder.sup_RTG_rating.setRating((float) user.getSupplierRating());
    }

    @Override
    public int getItemCount() {
        return suppliers == null ? 0 : suppliers.size();
    }

    private User getItem(int position) {
        return suppliers.get(position);
    }


    public class EventViewHolder extends RecyclerView.ViewHolder {
        private MaterialTextView event_LBL_description, sup_LBL_category, sup_LBL_description, sup_LBL_range;
        private MaterialTextView supplier_LBL_name;
        private AppCompatRatingBar sup_RTG_rating;

        EventViewHolder(View itemView) {
            super(itemView);
            sup_RTG_rating = itemView.findViewById(R.id.sup_RTG_rating);
            supplier_LBL_name = itemView.findViewById(R.id.supplier_LBL_name);
            event_LBL_description = itemView.findViewById(R.id.event_LBL_description);
            sup_LBL_category = itemView.findViewById(R.id.sup_LBL_category);
            sup_LBL_description = itemView.findViewById(R.id.sup_LBL_description);
            sup_LBL_range = itemView.findViewById(R.id.sup_LBL_range);


//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onGameClickListener.onClick(v, getItem(getAdapterPosition()), getAdapterPosition());
//                }
//            });
        }
    }

}
