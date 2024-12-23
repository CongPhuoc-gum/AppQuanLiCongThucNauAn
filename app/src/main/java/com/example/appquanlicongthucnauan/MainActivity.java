    package com.example.appquanlicongthucnauan;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.os.PersistableBundle;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;

    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentTransaction;
    import androidx.viewpager.widget.ViewPager;

    import com.example.appquanlicongthucnauan.Favourite_recipes.favourite_01;
    import com.example.appquanlicongthucnauan.Search_recipes.search_page_1;
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
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

                btn_login =

                findViewById(R.id.button_login);

                btn_register =

                findViewById(R.id.button_register);

            btn_login.setOnClickListener(new View.OnClickListener()

                {

                    @Override
                    public void onClick (View view){
                    btn_login.setVisibility(View.GONE);
                    Fragment fragment = new login_fragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main, fragment).commit();
                }
                }

            );
            btn_register.setOnClickListener(new View.OnClickListener()

                {
                    @Override
                    public void onClick (View view){
                    btn_register.setVisibility(View.GONE);
                    Fragment fragment = new register();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main, fragment).commit();
                }
                });


            }


        }
