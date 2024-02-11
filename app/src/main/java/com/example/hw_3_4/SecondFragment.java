package com.example.hw_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3_4.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private CountryAdapter adapter;
    private ArrayList<String> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            int position = getArguments().getInt("key");
            checkPosition(position);
        }
        adapter = new CountryAdapter(countryList);
        binding.rvCountries.setAdapter(adapter);
    }

    public void checkPosition(int position) {
        switch (position) {
            case 0:
                loadDataAsia();
                break;
            case 1:
                loadDataAfrica();
                break;
            case 2:
                loadDataEurope();
                break;
            case 3:
                loadDataNorthAmerica();
                break;
            case 4:
                loadDataSouthAmerica();
                break;
            case 5:
                loadDataAustralia();
                break;
            default:
                System.out.println("...");
        }
    }

    private void loadDataAsia() {
        countryList.add("Kyrgyzstan");
        countryList.add("Japan");
        countryList.add("Korea");
        countryList.add("China");
        countryList.add("Uzbekistan");
    }

    private void loadDataAfrica() {
        countryList.add("Algeria");
        countryList.add("Egypt");
        countryList.add("UAR");
        countryList.add("Angola");
        countryList.add("Kenia");
    }

    private void loadDataEurope() {
        countryList.add("France");
        countryList.add("Ukraine");
        countryList.add("Spain");
        countryList.add("Netherlands");
        countryList.add("Scotland");
    }

    private void loadDataNorthAmerica() {
        countryList.add("USA");
        countryList.add("Canada");
        countryList.add("Mexico");
        countryList.add("Greenland");
        countryList.add("Kosta-Rika");
    }

    private void loadDataSouthAmerica() {
        countryList.add("Brazil");
        countryList.add("Columbia");
        countryList.add("Peru");
        countryList.add("Chili");
        countryList.add("Argentine");
    }

    private void loadDataAustralia() {
        countryList.add("Australia");
        countryList.add("New Zealand");
        countryList.add("Papua New Guinea");
        countryList.add("Fiji");
        countryList.add("Solomon Islands");
    }
}