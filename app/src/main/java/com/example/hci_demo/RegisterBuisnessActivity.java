package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hci_demo.utils.AppManager;
import com.example.hci_demo.utils.User;
import com.google.android.material.button.MaterialButton;

public class RegisterBuisnessActivity extends AppCompatActivity {
    private MaterialButton btn_submit;
    private EditText minPrice, maxPrice, description;
    private AutoCompleteTextView category;
    private AppManager appManager;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_buisness);
        findViews();
        initViews();
    }

    private void findViews() {
        category = findViewById(R.id.autoCompleteTextView_Category);
        minPrice = findViewById(R.id.buisnessReg_EDT_minPrice);
        maxPrice = findViewById(R.id.buisnessReg_EDT_maxPrice);
        description = findViewById(R.id.buisnessReg_EDT_description);
        btn_submit = findViewById(R.id.buisReg_BTN_submit);
    }

    private void initViews() {

        btn_submit.setOnClickListener(view -> {
            if (minPrice.equals("") || maxPrice.equals("") || description.equals("")) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
                return;
            } else {
                appManager.getLoggedInUser().setDescription(description.getText().toString());
                appManager.getLoggedInUser().setMinPrice(Integer.valueOf(minPrice.getText().toString()));
                appManager.getLoggedInUser().setTopPrice(Integer.valueOf(maxPrice.getText().toString()));
                appManager.getLoggedInUser().setSupType(category.getText().toString());
                Intent intent = new Intent(this, SupplierActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}