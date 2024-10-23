package com.example.appquanlicongthucnauan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appquanlicongthucnauan.Favourite_recipes.favourite_01;
import com.example.appquanlicongthucnauan.Search_recipes.search_page_1;
import com.example.appquanlicongthucnauan.login_register.Nhap_mk_moi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class home extends Fragment {
    Button create_recipe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home2, container, false);

        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_navigation);

        // Initialize with the default fragment only if savedInstanceState is null
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().replace(R.id.home2, new home()).commit(); // Replace with the fragment you want as default
        }

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                // Use if-else to handle the item selection
                if (item.getItemId() == R.id.navigation_home) {
                    selectedFragment = new home(); // Consider using an existing instance or a different fragment
                } else if (item.getItemId() == R.id.navigation_library) {
                    selectedFragment = new library();
                } else if (item.getItemId() == R.id.navigation_search) {
                    selectedFragment = new search_page_1();
                } else if (item.getItemId() == R.id.navigation_favorites) {
                    selectedFragment = new favourite_01();
                } else if (item.getItemId() == R.id.navigation_profile) {
                    selectedFragment = new profile();
                }

                // Replace the current fragment if one is selected
                if (selectedFragment != null) {
                    getChildFragmentManager().beginTransaction()
                            .replace(R.id.home2, selectedFragment)
                            .commit();
                    return true;
                }

                return false;
            }
        });

        create_recipe = view.findViewById(R.id.btn_create_new);
        CardView cardView = view.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToHomePreviewMorePage();
            }
        });

        TextView viewMoreTextView = view.findViewById(R.id.view_more);
        TextView viewMoreTextView1 = view.findViewById(R.id.view_more1);

        create_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                Fragment createNewRecipeFragment = new Nhap_mk_moi();
                fragmentManager.beginTransaction()
                        .replace(R.id.forgetpass_2, createNewRecipeFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        viewMoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToHomePreviewPage();
            }
        });

        viewMoreTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToHomePreviewPage();
            }
        });

        return view;
    }

    private void navigateToHomePreviewMorePage() {
        FragmentManager fragmentManager = getParentFragmentManager();
        home_preview_more_page fragmentHomePreviewMorePage = new home_preview_more_page();
        fragmentManager.beginTransaction()
                .replace(R.id.home2, fragmentHomePreviewMorePage)
                .addToBackStack(null)
                .commit();
    }

    private void navigateToHomePreviewPage() {
        FragmentManager fragmentManager = getParentFragmentManager();
        home_preview_page fragmentHomePreviewPage = new home_preview_page();
        fragmentManager.beginTransaction()
                .replace(R.id.home2, fragmentHomePreviewPage)
                .addToBackStack(null)
                .commit();
    }
}
