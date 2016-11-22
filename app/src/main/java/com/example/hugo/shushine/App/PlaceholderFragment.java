package com.example.hugo.shushine.App;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HUGO on 22/11/2016.
 */

public class PlaceholderFragment extends android.support.v4.app.Fragment {
    ArrayAdapter<String> mForecastAdapter;

    public PlaceholderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_placeholder, container, false);
        String[] forecastArray={
                "Hoy - Sol - 13/4ºC",
                "Mañana - Sol - 12/3ºC",
                "Jueves - Lluvia - 15/7ºC",
                "Viernes - Nublado - 14/8ºC",
                "Sábado - Nublado - 15/7ºC",
                "Domingo - Nublado -14/7ºC"
        };
        List<String> weekForecast=new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter= new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);
        ListView mListView=(ListView) rootView.findViewById(R.id.listview_forecast);
        mListView.setAdapter(mForecastAdapter);

        return rootView;
    }

}