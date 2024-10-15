package com.example.appquanlicongthucnauan.Search_recipes;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.appquanlicongthucnauan.R;


public class search_page_1 extends Fragment {

    private Button go_page2,go_page3;;

    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search_page_1, container, false);

        go_page2 = view.findViewById(R.id.goto_page2);
        go_page3 = view.findViewById(R.id.goto_Page3);


        go_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang Search_page_2
                Fragment searchPage2 = new Search_page_2();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null); // Thêm trang hiện tại vào back stack
                fragmentTransaction.replace(R.id.search_page1, searchPage2).commit(); // Thay thế Fragment
            }
        });
        go_page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment searchPage3 = new search_page_3();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null); // Thêm trang hiện tại vào back stack
                fragmentTransaction.replace(R.id.search_page1, searchPage3).commit(); // Thay thế Fragment
            }
        });
        return view;
    }
}
