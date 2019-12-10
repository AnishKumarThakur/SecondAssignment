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
public class Swapping extends Fragment implements View.OnClickListener{
    private EditText etfirstNumber, etsecondSwapping;
    private Button btnSwapping;


    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etfirstNumber = view.findViewById(R.id.etfirstNumber);
        etsecondSwapping = view.findViewById(R.id.etsecondSwapping);
        btnSwapping = view.findViewById(R.id.btnSwipping);
        btnSwapping.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first, second, temp, bfirst, bsecond;
        first = Integer.parseInt(etfirstNumber.getText().toString());
        second = Integer.parseInt(etsecondSwapping.getText().toString());
        bfirst = first;
        bsecond = second;

        temp = first;
        first = second;
        second = temp;

        Toast.makeText(getActivity(), "The first number is "+bfirst+ "\n second no "
                +bsecond+ "After swipping: \n First Number is "+first+ "Second Number "+second+".\n", Toast.LENGTH_SHORT).show();



    }
}
