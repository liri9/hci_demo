package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hci_demo.utils.AppManager;
import com.example.hci_demo.utils.LoginDB;
import com.example.hci_demo.utils.User;
import com.example.hci_demo.utils.UserType;

public class LoginActivity extends AppCompatActivity {
    Button login_btn;
    Button signup_activity_btn;

    EditText email;
    AppManager appManager;
    EditText password;

    LoginDB loginDB = new LoginDB();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginDB.hardCoded();
        //appManager.init();
        signup_activity_btn = findViewById(R.id.login_BTN_signUp);
        login_btn = findViewById(R.id.login_BTN_login);
        email = findViewById(R.id.login_EDT_email);
        password = findViewById(R.id.login_EDT_password);

        signup_activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(SignUpActivity.class);
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = loginDB.get(email.getText().toString(), password.getText().toString());
                appManager.getInstance().setLoggedInUser(user);
                if (user != null){
                    UserType t = user.getType();
                    if(t == UserType.guest){
                        gotoActivity(guest_homepage.class);
                    } else if (t == UserType.orginazer) {
                        gotoActivity(Org_MyEvent.class);
                    } else if (t == UserType.staff) {
                        gotoActivity(worker_main.class);
                    } else if (t == UserType.supplier) {
                        gotoActivity(SupplierActivity.class);
                    }
                }
            }
        });
    }

    private void gotoActivity(Class cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }


}