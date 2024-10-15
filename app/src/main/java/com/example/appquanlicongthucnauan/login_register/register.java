package com.example.appquanlicongthucnauan.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.appquanlicongthucnauan.MainActivity;
import com.example.appquanlicongthucnauan.R;


public class register extends Fragment {

    ImageButton btn_go_home;
    Button btn_go_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_register, container, false);
        btn_go_home = view.findViewById(R.id.button_back);
        btn_go_login = view.findViewById(R.id.button_signup);

        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển về MainActivity
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });



        btn_go_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_go_login.setVisibility(View.GONE);
                Fragment fragment = new login_fragment();
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.register_page, fragment).commit();
            }
        });

        return view;
    }
}