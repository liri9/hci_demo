package com.example.hci_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ListFragment() {
    }

    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listView = view.findViewById(R.id.sup_CRD_list); // Replace with your actual ID

        // Create a list of hardcoded data
        List<String> dataList = new ArrayList<>();
        setDataPastEvents(dataList);
        setDataNextTasks(dataList);



        // Create an ArrayAdapter to populate the ListView with the data
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, dataList);

        // Set the adapter on the ListView
        listView.setAdapter(adapter);
    }

    private void setDataPastEvents(List dataList) {
        dataList.add("Lior and Liora's wedding\nDate:02/04/2023\nRating given=5");
        dataList.add("Amir's Bar Mitzva\nDate:13/05/2023\nRating given=4.6");
        dataList.add("Yuval's Brit\nDate:25/06/2022\nRating given=3.8");
        dataList.add("Michael and Micha's wedding\nDate:31/03/2022\nRating given=5");
        dataList.add("Ron and Rona's wedding\nDate:15/12/2023\nRating given=2.4");
        dataList.add("Shira's Bat Mitzvah\nDate:04/09/2023\nRating given=4.7");
        dataList.add("Einat's birthday party\nDate:22/10/2022\nRating given=5");
        dataList.add("Shmuel's Bar Mitzvah\nDate:04/05/2023\nRating given=4.9");
    }

    private void setDataNextTasks(List dataList) {

    }
    private void setDataDoneTasks(List dataList) {

    }
}