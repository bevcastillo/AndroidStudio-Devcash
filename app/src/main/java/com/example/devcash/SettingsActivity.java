package com.example.devcash;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    boolean status = false;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (!status){
                    FirstFragment f1 = new FirstFragment();
                        fragmentTransaction.add(R.id.fragment_container, f1);
                        fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            button.setText("Load Second Fragment");
                            status = true;
                }else{
                    SecondFragment f2 = new SecondFragment();
                    fragmentTransaction.add(R.id.fragment_container, f2);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    button.setText("Load First Fragment");
                    status = false;
                }
            }
        });
    }
}
