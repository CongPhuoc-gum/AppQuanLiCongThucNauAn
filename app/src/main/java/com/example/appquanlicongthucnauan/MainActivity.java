    package com.example.appquanlicongthucnauan;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.os.PersistableBundle;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;

    import

    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentTransaction;
    import androidx.viewpager.widget.ViewPager;

    import com.example.appquanlicongthucnauan.login_register.login_fragment;
    import com.example.appquanlicongthucnauan.login_register.register;
    import com.google.android.material.bottomnavigation.BottomNavigationView;
    import com.google.android.material.tabs.TabLayout;

    public class MainActivity extends AppCompatActivity {





        Button btn_login;
        Button btn_register;
        /** @noinspection deprecation*/
        @SuppressLint({"WrongViewCast", "NonConstantResourceId"})
        @Override
        protected void onCreate(Bundle savedInstanceState) {

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
            if(savedInstanceState == null){
                getSupportFragmentManager().beginTransaction().replace(R.id.home2, new home()).commit();
            }

            bottomNavigationView.setOnNavigationItemSelectedListener(this::onNavigationItemSelected);




            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btn_login = findViewById(R.id.button_login);
            btn_register = findViewById(R.id.button_register);

            btn_login.setOnClickListener(new View.OnClickListener() {

                 @Override
                 public void onClick(View view) {
                     btn_login.setVisibility(View.GONE);
                 Fragment fragment = new login_fragment();
                 FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                  fragmentTransaction.replace(R.id.main,fragment).commit();
                 }
            }

            );
            btn_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn_register.setVisibility(View.GONE);
                    Fragment fragment = new register();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main,fragment).commit();
                }
            });


        }

        private boolean onNavigationItemSelected(MenuItem item) {
            Fragment selectFragment = null;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectFragment = new home();
                    break;
                case R.id.nav_library:
                    selectFragment = new home();
                    break;
                case R.id.search:
                    selectFragment = new home();
                    break;
                case R.id.favorite:
                    selectFragment = new home();
                    break;
                case R.id.profile:
                    selectFragment = new home();
                    break;
            }

            if (selectFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.home2, selectFragment).commit();
            }

            return false;
        }
    }
