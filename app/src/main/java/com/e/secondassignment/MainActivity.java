package com.e.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.e.secondassignment.Fragments.Area_of_Circle;
import com.e.secondassignment.Fragments.Armstrong;
import com.e.secondassignment.Fragments.Automorphic;
import com.e.secondassignment.Fragments.Palindrome;
import com.e.secondassignment.Fragments.SI;
import com.e.secondassignment.Fragments.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCircle, btnPalindrome, btnSI, btnArmstrong,btnAutomorphic, btnSwapping;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle =findViewById(R.id.btnCircle);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnSwapping = findViewById(R.id.btnSwapping);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()){

            case R.id.btnCircle:
                Area_of_Circle circle = new Area_of_Circle();
                fragmentTransaction.replace(R.id.fragmentContainer,circle);
                fragmentTransaction.commit();

            case R.id.btnArmstrong:
                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrong);
                fragmentTransaction.commit();

            case R.id.btnAutomorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
                fragmentTransaction.commit();

            case R.id.btnPalindrome:
                Palindrome palindrome = new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();

            case R.id.btnSI:
                SI si = new SI();
                fragmentTransaction.replace(R.id.fragmentContainer,si);
                fragmentTransaction.commit();

            case R.id.btnSwapping:
                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer,swapping);
                fragmentTransaction.commit();


        }
        }
    }

