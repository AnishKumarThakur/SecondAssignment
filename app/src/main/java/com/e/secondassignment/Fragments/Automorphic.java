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
public class Automorphic extends Fragment implements View.OnClickListener{
    private EditText etAutomorphic;
    private Button btnAutomorphic;


    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAutomorphic = view.findViewById(R.id.etAutomorphic);
        btnAutomorphic = view.findViewById(R.id.etAutomorphic);
        btnAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
            int number = Integer.parseInt(etAutomorphic.getText().toString());
            int sq = number * number;
            int c = 0;
            int copy = number;

            while (copy>0){
                c++;
                copy = copy/10;

            }
            int end = sq % (int) Math.pow(10,c);
            if (number == end){
                Toast.makeText(getActivity(), number + " is a Automorphic number." , Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(getActivity(), number + " is not a Automorphic number." , Toast.LENGTH_SHORT).show();

            }


    }
}
