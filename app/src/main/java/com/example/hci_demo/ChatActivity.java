package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;


public class ChatActivity extends AppCompatActivity {
    private MaterialButton org_myEvent_BTN_back;
    private LinearLayout chatContainer;
    private TextInputEditText messageInput;
    private ScrollView chat_SCRL_chat;
   // private MessageAdapter messageAdapter;
    private ExtendedFloatingActionButton sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
     //   messageAdapter = new MessageAdapter();

        findViews();
        initViews();
    }

    private void findViews() {
        org_myEvent_BTN_back = findViewById(R.id.org_myEvent_BTN_back);
        chatContainer = findViewById(R.id.chatContainer);
        messageInput = findViewById(R.id.chat_ET_msgInput);
        sendButton = findViewById(R.id.chat_FAB_send);
        chat_SCRL_chat = findViewById(R.id.chat_SCRL_chat);
    }

    private void initViews() {
        org_myEvent_BTN_back.setOnClickListener(view -> {
            finish();
        });
        sendButton.setOnClickListener(view-> {
                String message = messageInput.getText().toString();
                sendMessage(message);
                messageInput.setText(""); // Clear the input field after sending message
        });

    }
    private void sendMessage(String message) {
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextColor(getResources().getColor(android.R.color.white));
        textView.setBackgroundResource(R.drawable.background_chat_input);
        textView.setPadding(8, 8, 8, 8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 0, 0, 8);
        textView.setLayoutParams(layoutParams);

        // Add the TextView to the chat container
        chatContainer.addView(textView);
    }
}