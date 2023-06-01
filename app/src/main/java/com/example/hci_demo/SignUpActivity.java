package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private  EditText confPass;
    private RadioGroup accountType;
    private Button signUpBtn;
    Class nextClass=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.signup_EDT_email);
        password = findViewById(R.id.signup_EDT_password);
        confPass = findViewById(R.id.signup_EDT_repeatPassword);
        accountType = findViewById(R.id.accounts_radio_btn);

        signUpBtn = findViewById(R.id.signup_BTN_signUp);
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

    private void initViews(int id) {
        signUpBtn.setOnClickListener(v-> {
            switch (id) {
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
            finish();
        });

    }

    public void onRadioButtonClicked(View view) {
        ViewGroup parent = (ViewGroup) view.getParent();
        int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);
            if (child instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) child;
                radioButton.setChecked(child == view);
            }
        }

        initViews(view.getId());
    }


    private void gotoActivity(Class cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}