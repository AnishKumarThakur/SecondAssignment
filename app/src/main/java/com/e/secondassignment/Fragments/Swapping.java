package com.e.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.e.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Swapping extends Fragment implements View.OnClickListener{
    private EditText etSwapping;
    private Button btnSwapping;


    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etSwapping = view.findViewById(R.id.etSwapping);
        btnSwapping = view.findViewById(R.id.btnSwapping);
        btnSwapping.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {


    }
}
