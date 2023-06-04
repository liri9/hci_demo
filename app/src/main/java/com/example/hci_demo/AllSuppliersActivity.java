package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hci_demo.utils.Adapter_All_Suppliers;
import com.example.hci_demo.utils.Adapter_Past_Event;
import com.example.hci_demo.utils.User;
import com.example.hci_demo.utils.supplierType;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class AllSuppliersActivity extends AppCompatActivity {
    List<User> supplierList = new ArrayList<>();
    private RecyclerView suppliers_LST;
    private MaterialButton org_myEvent_BTN_back;
    private Adapter_All_Suppliers adapter =new Adapter_All_Suppliers(supplierList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_suppliers);
        findViews();
        createList();
        initList();
        initViews();



        updateList(supplierList);

    }

    private void initList() {
        suppliers_LST.setLayoutManager(new LinearLayoutManager(this));
        suppliers_LST.setHasFixedSize(true);
        suppliers_LST.setAdapter(adapter);
    }

    private void updateList(List<User> supplierList) {
        adapter.updateList(supplierList);
    }


    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });
    }

    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        suppliers_LST = findViewById(R.id.suppliers_LST_suppliers);


    }

    public void createList() {
        supplierList.add(new User("Supplier 1", "Catering service", 1000, 5000, supplierType.Catering, 4.5f));
        supplierList.add(new User("Supplier 2", "Flower arrangements", 500, 3000, supplierType.Flowers, 4.2f));
        supplierList.add(new User("Supplier 3", "Professional DJ services", 1500, 8000, supplierType.DJ, 4.8f));
        supplierList.add(new User("Supplier 4", "Event decoration services", 800, 5000, supplierType.Decoration, 4.3f));
        supplierList.add(new User("Supplier 5", "Candy buffet and treats", 200, 1500, supplierType.Candies, 4.6f));
        supplierList.add(new User("Supplier 6", "Photography services", 2000, 10000, supplierType.Photography, 4.7f));
        supplierList.add(new User("Supplier 7", "Videography services", 2500, 12000, supplierType.Videography, 4.4f));
        supplierList.add(new User("Supplier 8", "Live music and entertainment", 3000, 15000, supplierType.LiveMusic, 4.9f));
        supplierList.add(new User("Supplier 9", "Wedding planning services", 3000, 20000, supplierType.WeddingPlanning, 4.2f));
        supplierList.add(new User("Supplier 10", "Lighting and sound services", 1500, 10000, supplierType.LightingSound, 4.6f));
        supplierList.add(new User("Supplier 11", "Wedding cakes and desserts", 500, 5000, supplierType.WeddingCakes, 4.8f));
        supplierList.add(new User("Supplier 12", "Transportation services", 1000, 8000, supplierType.Transportation, 4.3f));
        supplierList.add(new User("Supplier 13", "Event rentals and furniture", 500, 5000, supplierType.EventRentals, 4.5f));
        supplierList.add(new User("Supplier 14", "Makeup and hair services", 800, 6000, supplierType.MakeupHair, 4.7f));
        supplierList.add(new User("Supplier 15", "Event invitations and stationery", 200, 3000, supplierType.Invitations, 4.1f));
    }
}