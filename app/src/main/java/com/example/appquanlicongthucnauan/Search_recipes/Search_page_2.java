package com.example.appquanlicongthucnauan.Search_recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.appquanlicongthucnauan.R;


public class Search_page_2 extends Fragment {


    ImageButton btn_go_home;
    Button check;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search_page_2, container, false);
        btn_go_home = view.findViewById(R.id.button_back);
        check = view.findViewById(R.id.button02);
        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quay lại Fragment trước đó
                getParentFragmentManager().popBackStack();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment searchPage3 = new search_page_3();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null); // Thêm trang hiện tại vào back stack
                fragmentTransaction.replace(R.id.search_page2, searchPage3).commit(); // Thay thế Fragment
            }
        });

        return view;
    }
}