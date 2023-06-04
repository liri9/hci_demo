package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class Org_MyEvent extends AppCompatActivity {
    TextView tvYes, tvNo, tvNA;
    PieChart pieChart;

    Button seatingBtn, sendInviteBtn, suppliersBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_my_event);
        findViews();
        initViews();
        updateUI();

        sendInviteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(OrgSendInviteActivity.class);
            }
        });

        seatingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(TableArrangementActivity.class);
            }
        });

        suppliersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    gotoActivity(AllSuppliersActivity.class);
                }
            });

    }

    private void updateUI() {
        pieChart.addPieSlice(
                new PieModel(
                        "Yes",
                        Integer.parseInt(tvYes.getText().toString()),
                        Color.parseColor("#fabad9")));
        pieChart.addPieSlice(
                new PieModel(
                        "No",
                        Integer.parseInt(tvNo.getText().toString()),
                        Color.parseColor("#b4def3")));
        pieChart.addPieSlice(
                new PieModel(
                        "No Response Yet",
                        Integer.parseInt(tvNA.getText().toString()),
                        Color.parseColor("#edd9bd")));

    }

    private void initViews() {
        tvYes.setText(Integer.toString(180));
        tvNA.setText(Integer.toString(60));
        tvNo.setText(Integer.toString(16));
    }

    private void findViews() {
        tvYes = findViewById(R.id.org_my_event_tvYes);
        tvNo = findViewById(R.id.org_my_event_tvNo);
        tvNA = findViewById(R.id.org_my_event_tvNA);
        pieChart = findViewById(R.id.org_my_event_PCT_attendees);

        seatingBtn = findViewById(R.id.org_my_event_BTN_seatingArrangment);
        sendInviteBtn = findViewById(R.id.org_my_event_BTN_sendInvatations);
        suppliersBtn = findViewById(R.id.org_my_event_BTN_supplierse);
    }


    private void gotoActivity(Class cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

}