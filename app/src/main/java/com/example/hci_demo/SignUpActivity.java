package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.hci_demo.utils.UserType;

public class SignUpActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private  EditText confPass;
    private RadioGroup accountType;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.signup_EDT_email);
        password = findViewById(R.id.signup_EDT_password);
        confPass = findViewById(R.id.signup_EDT_repeatPassword);
        accountType = findViewById(R.id.accounts_radio_btn);

        signUpBtn = findViewById(R.id.signup_BTN_login);
        accountType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (password.getText().toString() == confPass.getText().toString()) {
                    RadioButton radioButton = findViewById(checkedId);
                    onRadioButtonClicked(radioButton);
                }
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        for (int i = 0; i < accountType.getChildCount(); i++) {
            View child = accountType.getChildAt(i);
            if (child instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) child;
                radioButton.setChecked(child.getId() == view.getId());
            }
        }

        switch (view.getId()) {
            case R.id.radio_attendee:
                gotoActivity(guest_homepage.class);
                break;
            case R.id.radio_service_staff:
                gotoActivity(SupplierActivity.class);
                break;
            case R.id.radio_venue_staff:
                gotoActivity(worker_main.class);
                break;
            case R.id.radio_organizer:
                gotoActivity(Org_MyEvent.class);
                break;
        }
    }

    private void gotoActivity(Class cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}