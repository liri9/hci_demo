package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class NewTaskActivity extends AppCompatActivity {

    MaterialButton org_myEvent_BTN_back, login_BTN_add;
    EditText newTask_EDT_title, newTask_EDT_employee_name, newTask_EDT_description;
    AutoCompleteTextView autoCompleteTextView_Team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        findViews();
        setValues();
        initViews();
    }

    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        login_BTN_add = findViewById(R.id.login_BTN_add);
        autoCompleteTextView_Team = findViewById(R.id.autoCompleteTextView_Team);
        newTask_EDT_title = findViewById(R.id.newTask_EDT_title);
        newTask_EDT_employee_name = findViewById(R.id.newTask_EDT_employee_name);
        newTask_EDT_description = findViewById(R.id.newTask_EDT_description);
    }

    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });

        login_BTN_add.setOnClickListener(view -> {
            if (newTask_EDT_title.getText().toString().equals("")) {
                newTask_EDT_title.setError("item can't be empty");
            } else if (newTask_EDT_employee_name.getText().toString().equals("")) {
                newTask_EDT_employee_name.setError("item can't be empty");

            } else if (newTask_EDT_description.getText().toString().equals("")) {
                newTask_EDT_description.setError("item can't be empty");

            } else if (autoCompleteTextView_Team.getText().toString().equals("")) {
                autoCompleteTextView_Team.setError("item can't be empty");

            } else {
                newTask_EDT_title.getText().clear();
                newTask_EDT_employee_name.getText().clear();
                newTask_EDT_description.getText().clear();
                autoCompleteTextView_Team.setText(""); // Clear the text
                autoCompleteTextView_Team.clearFocus();
                Toast.makeText(NewTaskActivity.this, "Task sent",
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    private void setValues() {
        String[] categories = getResources().getStringArray(R.array.team_options_array);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.drop_down_menu, categories);
        autoCompleteTextView_Team.setAdapter(arrayAdapter);
    }
}