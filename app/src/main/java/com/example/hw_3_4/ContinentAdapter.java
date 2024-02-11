package com.example.hw_3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<ContinentModel> continentsList;
    private OnItemClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentsList, OnItemClick onClick) {
        this.continentsList = continentsList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(continentsList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }
}


class ContinentViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(ContinentModel continent) {
        binding.tvContinent.setText(continent.getName());
        Glide.with(binding.imgContinent).load(continent.getImage()).into(binding.imgContinent);
    }
}