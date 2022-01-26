package com.geektech.spotifykg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.spotifykg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container_one, new FragmentUpImage()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_two, new FragmentBottomImage()).commit();

    }
}