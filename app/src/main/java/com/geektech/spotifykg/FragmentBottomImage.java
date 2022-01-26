package com.geektech.spotifykg;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.spotifykg.databinding.FragmentBottomImageBinding;

import java.net.MalformedURLException;
import java.util.ArrayList;


public class FragmentBottomImage extends Fragment implements OnClick {
    private FragmentBottomImageBinding binding;
    private Adapter adapter;
    ArrayList<Model> musicList;
    private static final String KEY = "key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBottomImageBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new Adapter(loadData(), this);
        binding.recycle.setAdapter(adapter);

    }

    private ArrayList<Model> loadData() {
        musicList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            musicList.add(new Model("Aizirek", "5:32", "X", "Жанм"));
            musicList.add(new Model("Osas", "5:32", "X", "Sis"));
            musicList.add(new Model("bakai", "5:32", "X", "java"));
            musicList.add(new Model("beksultan", "5:32", "X", "Kotlin"));
            musicList.add(new Model("Albert", "5:32", "X", "javaScript"));
        }
        return musicList;
    }

    @Override
    public void onClick(Model model) {
        Bundle bundle =  new Bundle();
        Fragment fragment = new FragmentMusicScreen();
        bundle.putString(KEY,model.getMusic());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().add(R.id.container_fourth, fragment).addToBackStack("Назад").commit();

    }
}