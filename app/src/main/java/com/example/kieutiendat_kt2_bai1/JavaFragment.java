package com.example.kieutiendat_kt2_bai1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class JavaFragment extends Fragment {


    private static final String ARG_PARAM1 = "par1";
    private static final String ARG_PARAM2 = "par2";


    private String mPar1;
    private String mPar2;

    public JavaFragment() {

    }


    public static com.example.kieutiendat_kt2_bai1.JavaFragment newInstance(String param1, String param2) {
        com.example.kieutiendat_kt2_bai1.JavaFragment fragment = new com.example.kieutiendat_kt2_bai1.JavaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPar1 = getArguments().getString(ARG_PARAM1);
            mPar2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_java, container, false);
    }
}