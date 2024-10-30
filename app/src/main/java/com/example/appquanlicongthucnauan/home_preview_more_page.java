package com.example.appquanlicongthucnauan;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class home_preview_more_page extends Fragment {
    ImageButton btn_back;
    CardView cv_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_home_preview_more_page, container, false);

        btn_back = view.findViewById(R.id.btn_back);
        cv_view = view.findViewById(R.id.cv_profile);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().popBackStack();
            }
        });

        cv_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                Fragment createFragment = new fragment_profile_home_view();
                fragmentManager.beginTransaction()
                        .replace(R.id.home_more_page_preview, createFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });






        return view;
    }
}