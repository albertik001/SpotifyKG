package com.geektech.spotifykg;

import android.view.LayoutInflater;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.spotifykg.databinding.ItemNameMusicBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<Model> musicList;
    private final OnClick onClick;

    public Adapter(ArrayList<Model> musicList, OnClick onClick) {
        this.musicList = musicList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        parent.getContext();
        com.geektech.spotifykg.databinding.ItemNameMusicBinding binding = ItemNameMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(musicList.get(position));
        holder.itemView.setOnClickListener(view -> onClick.onClick(musicList.get(position)));

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemNameMusicBinding binding;

        public ViewHolder(@NonNull ItemNameMusicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Model model) {
            binding.numberMusic.setText(model.getNumber());
            binding.textMusic.setText(model.getMusic());
            binding.musicName.setText(model.getName());
            binding.timeMusic.setText(model.getTime());

        }
    }

}
