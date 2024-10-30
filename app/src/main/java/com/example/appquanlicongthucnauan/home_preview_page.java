package com.example.appquanlicongthucnauan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class home_preview_page extends Fragment {

    ImageButton btn_back;
    CardView cv_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_preview_page, container, false);
        btn_back = view.findViewById(R.id.btn_back);
        cv_view = view.findViewById(R.id.cv_profile);
        // Xử lý sự kiện cho btn_back để quay lại fragment trước đó
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getParentFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.popBackStack();
                }
            }
        });

        cv_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager()
            }
        });

        CardView cardmoreView2 = view.findViewById(R.id.card_view_large);






        return view;
    }

}
