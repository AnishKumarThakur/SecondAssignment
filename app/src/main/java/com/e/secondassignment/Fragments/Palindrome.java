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
public class Palindrome extends Fragment implements View.OnClickListener {
    private EditText etPalindrome;
    private Button btnPalindrome;


    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etPalindrome = view.findViewById(R.id.etPalindrome);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);
        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int r, sum = 0, temp;
        int n = Integer.parseInt(etPalindrome.getText().toString());
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            Toast.makeText(getActivity(), temp + " is a palindrome number.", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(getActivity(), temp + " is not a palindrome number.", Toast.LENGTH_SHORT).show();

        }
    }
}
