package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class OrgSendInviteActivity extends AppCompatActivity {
    MaterialButton org_myEvent_BTN_back, sendInvitation_BTN_send;
    AutoCompleteTextView autoCompleteTextView_Category;
    public static final int simple_dropdown_item_1line = 17367050;
    EditText sendInvite_EDT_name, sendInvite_EDT_email, sendInvite_EDT_number_of_invitees;
    //  String[] categories = {"Friends", "Work", "School", "Army"};
//            getResources().getStringArray(R.array.guest_options_array);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_send_invite);

        findViews();
        initViews();
        setValues();
        // setContentView(binding.getRoot());

    }

    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        sendInvitation_BTN_send = findViewById(R.id.sendInvetation_BTN_send);
        sendInvite_EDT_name = findViewById(R.id.sendInvite_EDT_name);
        sendInvite_EDT_email = findViewById(R.id.sendInvite_EDT_email);
        sendInvite_EDT_number_of_invitees = findViewById(R.id.sendInvite_EDT_number_of_invitees);
        autoCompleteTextView_Category = findViewById(R.id.autoCompleteTextView_Category);
    }

    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });

        sendInvitation_BTN_send.setOnClickListener(view -> {
            if (sendInvite_EDT_name.getText().toString().equals(""))
            {
                sendInvite_EDT_name.setError("item can't be empty");
            }
            else if(sendInvite_EDT_email.getText().toString().equals("")){
                sendInvite_EDT_email.setError("item can't be empty");

            }
            else if(sendInvite_EDT_number_of_invitees.getText().toString().equals("") ){
                sendInvite_EDT_number_of_invitees.setError("item can't be empty");

            }
            else if( autoCompleteTextView_Category.getText().toString().equals("")){
                autoCompleteTextView_Category.setError("item can't be empty");

            }
            else{
                sendInvite_EDT_name.getText().clear();
            sendInvite_EDT_email.getText().clear();
            sendInvite_EDT_number_of_invitees.getText().clear();
            autoCompleteTextView_Category.setText(""); // Clear the text
            autoCompleteTextView_Category.clearFocus();
            Toast.makeText(OrgSendInviteActivity.this, "Invitation sent",
                    Toast.LENGTH_LONG).show();}
        });

    }

    private void setValues() {
        String[] categories = getResources().getStringArray(R.array.guest_options_array);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.drop_down_menu, categories);
        autoCompleteTextView_Category.setAdapter(arrayAdapter);
    }


}