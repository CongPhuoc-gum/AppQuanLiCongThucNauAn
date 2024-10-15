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



public class forgetpass extends Fragment {

    ImageButton btn_go_home;
    Button btn_xacnhan_email;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forgetpass, container, false);
        btn_go_home = view.findViewById(R.id.button_back);
        btn_xacnhan_email = view.findViewById(R.id.btn_xacnhan_email);


        btn_go_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển về MainActivity
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        btn_xacnhan_email.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Fragment xacnhan_email = new Xacnhan_quenmk();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.addToBackStack(null);
                fm.replace(R.id.forgetpass_1,xacnhan_email).commit();
            }
        });





        return view;
    }
}