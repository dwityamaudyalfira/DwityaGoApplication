package com.example.dwityagoapplication.ui.developer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dwityagoapplication.R;

public class DeveloperFragment extends Fragment {

    private com.example.dwityagoapplication.ui.developer.DeveloperViewModel developerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        developerViewModel =
                new ViewModelProvider(this).get(com.example.dwityagoapplication.ui.developer.DeveloperViewModel.class);

        View root = inflater.inflate(R.layout.fragment_developer, container, false);

        final TextView textView = root.findViewById(R.id.text_developer);
        developerViewModel.getText().observe(getViewLifecycleOwner(),
                textView::setText);
        return root;
    }

}