package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OrgSendInviteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_send_invite);
        setValues();
    }

    private void setValues() {
        Spinner spinner = findViewById(R.id.send_SPN_categories); // Replace 'R.id.spinner' with your actual spinner ID

        String[] spinnerValues = {"family", "friends", "work", "military"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerValues);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


}