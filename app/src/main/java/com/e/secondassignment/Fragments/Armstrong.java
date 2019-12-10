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
public class Armstrong extends Fragment implements View.OnClickListener {
    private EditText etArmstrong;
    private Button btnArmstrong;


    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);
        etArmstrong = view.findViewById(R.id.etArmstrong);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);
        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int c = 0, a, temp;
        int n = Integer.parseInt(etArmstrong.getText().toString());
        temp = n;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            Toast.makeText(getActivity(), temp + " is a Armstrong number.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getActivity(), temp + " is a not Armstrong number.", Toast.LENGTH_SHORT).show();

        }
    }
}
