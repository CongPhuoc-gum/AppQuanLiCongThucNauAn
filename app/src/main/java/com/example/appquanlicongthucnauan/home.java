package com.example.appquanlicongthucnauan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appquanlicongthucnauan.login_register.Nhap_mk_moi;

public class home extends Fragment {

    Button create_recipe;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home2, container, false);

        create_recipe = view.findViewById(R.id.btn_create_new);
        CardView cardView = view.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                nanavigateToHomePreviewMorePage();
            }
        });

        TextView viewMoreTextView = view.findViewById(R.id.view_more);
        TextView viewMoreTextView1 = view.findViewById(R.id.view_more1);

        create_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment create_new_recipe = new Nhap_mk_moi();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.addToBackStack(null);
                fm.replace(R.id.forgetpass_2, create_new_recipe).commit();

            }
        });




        viewMoreTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                home_preview_page fragmentHomePreviewPage = new home_preview_page();

                fragmentTransaction.replace(R.id.home2, fragmentHomePreviewPage);
                fragmentTransaction.addToBackStack("home"); // Gắn thẻ "home" cho BackStack
                fragmentTransaction.commit();
            }
        });

        viewMoreTextView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                home_preview_page fragmentHomePreviewPage = new home_preview_page();

                fragmentTransaction.replace(R.id.home2, fragmentHomePreviewPage);
                fragmentTransaction.addToBackStack(null); // Để có thể quay lại
                fragmentTransaction.commit();
            }
        });
        return view;
    }

    private void nanavigateToHomePreviewMorePage(){
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        home_preview_more_page fragmentHomePreviewMorePage = new home_preview_more_page();

        fragmentTransaction.replace(R.id.main, fragmentHomePreviewMorePage);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



}