package com.example.hci_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class Org_MyEvent extends AppCompatActivity {
    TextView tvYes, tvNo, tvNA;
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_my_event);
        findViews();
        initViews();
        updateUI();
    }

    private void updateUI() {
        pieChart.addPieSlice(
                new PieModel(
                        "Yes",
                        Integer.parseInt(tvYes.getText().toString()),
                        Color.parseColor("#FFA726")));
        pieChart.addPieSlice(
                new PieModel(
                        "No",
                        Integer.parseInt(tvNo.getText().toString()),
                        Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(
                new PieModel(
                        "No Response Yet",
                        Integer.parseInt(tvNA.getText().toString()),
                        Color.parseColor("#EF5350")));

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
    }


}