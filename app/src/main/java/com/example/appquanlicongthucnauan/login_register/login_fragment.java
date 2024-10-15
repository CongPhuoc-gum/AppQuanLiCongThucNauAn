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
import com.example.appquanlicongthucnauan.home;

public class login_fragment extends Fragment {

    ImageButton btn_go_home;
    Button btn_quenmk, btn_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login, container, false);

        btn_go_home = view.findViewById(R.id.button_back);
        btn_quenmk = view.findViewById(R.id.button_quenmatkhau);
        btn_login = view.findViewById(R.id.button_login_page);

        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển về MainActivity
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        btn_quenmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_quenmk.setVisibility(View.GONE);
                Fragment fragment = new forgetpass();
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.login_page, fragment).commit();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_login.setVisibility(View.GONE);
                /////////////////chỗ này để trang chủ của Phước
                Fragment fragment = new home();
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.login_page, fragment).commit();
            }
        });
        return view;
    }


}
