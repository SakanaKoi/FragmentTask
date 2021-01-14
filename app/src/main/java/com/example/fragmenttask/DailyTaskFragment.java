package com.example.fragmenttask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DailyTaskFragment extends Fragment {
    EditText task1, task2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.daily_tasks, null);
        task1 = view.findViewById(R.id.task1);
        task2 = view.findViewById(R.id.task2);
        return view;
    }
}
