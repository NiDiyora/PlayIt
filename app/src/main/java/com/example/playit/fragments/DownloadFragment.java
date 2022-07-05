package com.example.playit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.playit.databinding.FragmentDownloadBinding;
import com.example.playit.databinding.FragmentMusicBinding;

public class DownloadFragment extends Fragment {

    private FragmentDownloadBinding binding;

    public DownloadFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDownloadBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}