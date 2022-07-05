package com.example.playit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.playit.databinding.FragmentMusicBinding;
import com.example.playit.databinding.FragmentVideoBinding;

public class MusicFragment extends Fragment {

    private FragmentMusicBinding binding;

    public MusicFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMusicBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}