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
public class SI extends Fragment implements View.OnClickListener{
    private EditText etPrinciple, etRate, etTime;
    private Button btnSI;


    public SI() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_si, container, false);
        etPrinciple = view.findViewById(R.id.etPrinciple);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);
        btnSI = view.findViewById(R.id.btnSI);
        btnSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principal, time, rate, result;

        principal = Float.parseFloat(etPrinciple.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());
        result = (principal * time * rate)/100;
        Toast.makeText(getActivity(), "simple interest is" + result, Toast.LENGTH_SHORT).show();
    }
}
