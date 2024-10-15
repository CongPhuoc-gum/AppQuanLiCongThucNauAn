package com.example.appquanlicongthucnauan.Search_recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.appquanlicongthucnauan.R;


public class Search_page_2 extends Fragment {


    ImageButton btn_go_home;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search_page_2, container, false);
        btn_go_home = view.findViewById(R.id.button_back);
        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quay lại Fragment trước đó
                getParentFragmentManager().popBackStack();
            }
        });

        return view;
    }
}