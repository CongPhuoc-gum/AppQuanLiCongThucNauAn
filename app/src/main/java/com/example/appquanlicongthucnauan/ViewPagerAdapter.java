package com.example.appquanlicongthucnauan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.appquanlicongthucnauan.Favourite_recipes.favourite_01;
import com.example.appquanlicongthucnauan.Search_recipes.search_page_1;

/** @noinspection ALL*/
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new home();
            case 1:
                return new library();
            case 2:
                return new messenger();
            case 3:
                return new favourite_01();
            case 4:
                return new profile();
            default:
                return new home();
        }
    }


    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 5;
    }
}
