package com.example.appquanlicongthucnauan.login_register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.example.appquanlicongthucnauan.R;


public class Nhap_mk_moi extends Fragment {

    ImageButton btn_go_home;
    Button btn_xacnhan_pass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nhap_mk_moi, container, false);;

        btn_go_home = view.findViewById(R.id.button_back);
        btn_xacnhan_pass = view.findViewById(R.id.btn_xacnhan_new_pass);
        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quay lại Fragment trước đó
                getParentFragmentManager().popBackStack();
            }
        });

        btn_xacnhan_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment xacnhan_pass = new login_fragment();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.addToBackStack(null);
                fm.replace(R.id.forgetpass_3,xacnhan_pass).commit();
            }
        });


        return view;
    }
}