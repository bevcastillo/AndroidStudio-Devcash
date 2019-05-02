package com.example.devcash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AddServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_services);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate SAVE menu
        getMenuInflater().inflate(R.menu.addservice_savemenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //menu item click handling
        if(id == R.id.save_addservice){
            Toast.makeText(this, "Services successfully added!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
