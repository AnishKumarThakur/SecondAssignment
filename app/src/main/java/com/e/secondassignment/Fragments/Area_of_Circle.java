package com.e.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Area_of_Circle extends Fragment implements View.OnClickListener{
    private EditText etCircle;
    private Button btnCircle;


    public Area_of_Circle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area_of__circle, container, false);

        etCircle = view.findViewById(R.id.etCircle);
        btnCircle = view.findViewById(R.id.btnCircle);

        btnCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius, result;
        radius = Float.parseFloat(etCircle.getText().toString());
        result = (radius* radius*22)/7;
        Toast.makeText(getActivity(), "radius is:"+result, Toast.LENGTH_SHORT).show();

    }
}
