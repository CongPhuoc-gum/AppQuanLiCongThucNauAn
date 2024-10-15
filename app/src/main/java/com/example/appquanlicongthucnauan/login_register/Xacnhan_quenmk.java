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

public class Xacnhan_quenmk extends Fragment {
    ImageButton btn_go_home;
    Button btn_xacnhan_code;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_xacnhan_quenmk, container, false);

        btn_go_home = view.findViewById(R.id.button_back);
        btn_xacnhan_code = view.findViewById(R.id.btn_xacnhan);
        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getParentFragmentManager().popBackStack();
            }
        });
        btn_xacnhan_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment xacnhan_code = new Nhap_mk_moi();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.addToBackStack(null);
                fm.replace(R.id.forgetpass_2,xacnhan_code).commit();
            }
        });


        return view;
    }
}