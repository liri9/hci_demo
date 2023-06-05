package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hci_demo.utils.DataModel;
import com.example.hci_demo.utils.ItemAdapter;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class TableArrangementActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;
    MaterialButton org_myEvent_BTN_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_arrangement);

        recyclerView = findViewById(R.id.tables_RCV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        findViews();
        mList = new ArrayList<>();

        //list1
        List<String> Table1 = new ArrayList<>();
        Table1.add("Alice");
        Table1.add("Bob");
        Table1.add("Charlie");
        Table1.add("David");
        Table1.add("Eve");
        Table1.add("Frank");
        Table1.add("Grace");
        Table1.add("Henry");
        Table1.add("Jack");
        Table1.add("Ivy");

        List<String> Table2 = new ArrayList<>();
        Table2.add("Oliver");
        Table2.add("Sophia");
        Table2.add("Liam");
        Table2.add("Emma");
        Table2.add("Noah");
        Table2.add("Ava");
        Table2.add("William");
        Table2.add("Isabella");
        Table2.add("James");
        Table2.add("Mia");


        List<String> Table3 = new ArrayList<>();
        Table3.add("John");
        Table3.add("Kate");
        Table3.add("Liam");
        Table3.add("Mia");
        Table3.add("Nathan");
        Table3.add("Olivia");
        Table3.add("Patrick");
        Table3.add("Quinn");


        List<String> Table4 = new ArrayList<>();
        Table4.add("Yasmine");
        Table4.add("Zachary");
        Table4.add("Amelia");
        Table4.add("Benjamin");
        Table4.add("Chloe");
        Table4.add("Daniel");
        Table4.add("Emily");
        Table4.add("Felix");


        List<String> Table5 = new ArrayList<>();
        Table5.add("Gabriella");
        Table5.add("Henry");
        Table5.add("Isabelle");
        Table5.add("Jacob");
        Table5.add("Kylie");
        Table5.add("Liam");
        Table5.add("Mia");
        Table5.add("Noah");

        List<String> Table6 = new ArrayList<>();
        Table6.add("Natalie");
        Table6.add("Oscar");
        Table6.add("Penelope");
        Table6.add("Quentin");
        Table6.add("Rachel");
        Table6.add("Samuel");
        Table6.add("Tiffany");
        Table6.add("Ulysses");

        List<String> Table7 = new ArrayList<>();
        Table7.add("Victoria");
        Table7.add("William");
        Table7.add("Xander");
        Table7.add("Yvonne");
        Table7.add("Zara");
        Table7.add("Adam");
        Table7.add("Bella");
        Table7.add("Caleb");

        List<String> Table8 = new ArrayList<>();
        Table8.add("Diana");
        Table8.add("Ethan");
        Table8.add("Fiona");
        Table8.add("Gavin");
        Table8.add("Hannah");
        Table8.add("Ian");
        Table8.add("Jasmine");
        Table8.add("Kevin");


        mList.add(new DataModel(Table1, "Table 1"));
        mList.add(new DataModel(Table2, "Table 2"));
        mList.add(new DataModel(Table3, "Table 3"));
        mList.add(new DataModel(Table4, "Table 4"));
        mList.add(new DataModel(Table5, "Table 5"));
        mList.add(new DataModel(Table6, "Table 6"));
        mList.add(new DataModel(Table7, "Table 7"));
        mList.add(new DataModel(Table8, "Table 8"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }

    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);

            org_myEvent_BTN_back.setOnClickListener(view -> {
                finish();
            });

    }

}