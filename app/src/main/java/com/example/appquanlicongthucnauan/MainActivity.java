    package com.example.appquanlicongthucnauan;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentTransaction;

    import com.example.appquanlicongthucnauan.login_register.login_fragment;
    import com.example.appquanlicongthucnauan.login_register.register;

    public class MainActivity extends AppCompatActivity {
        Button btn_login;
        Button btn_register;
        /** @noinspection deprecation*/
        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
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

//            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//
//            bottomNavigationView.setOnNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
//                /**
//                 * Called when an item in the navigation menu is selected.
//                 *
//                 * @param item The selected item
//                 * @return true to display the item as the selected item and false if the item should not be
//                 * selected. Consider setting non-selectable items as disabled preemptively to make them
//                 * appear non-interactive.
//                 */
//
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                    Fragment selectedFragment = null;
//
//                    switch (item.getItemId()) {
//                        case R.id.nav_home:
//                            selectedFragment = new home();
//                            break;
//                        case R.id.nav_library:
//                            selectedFragment = new library();
//                            break;
//    //                        cho em sinh
//    //                    case R.id.search  :
//    //                        selectedFragment = new FragmentFavorites();
//    //                        break;
//    //                    case R.id.favorite:
//    //                        selectedFragment = new FragmentProfile();
//    //                        break;
//    //                    case R.id.user:
//    //                        selectedFragment = new FragmentSettings();
//    //                        break;
//                    }
//
//                    return loadFragment(selectedFragment);
//                }
//            });
//        }
//        private boolean loadFragment(Fragment fragment) {
//            // chuyển đổi giữa các fragment
//            if (fragment != null) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.main, fragment); // Đảm bảo ID đúng
//                fragmentTransaction.commit();
//                return true;
//            }
//            return false;
        }
    }
