package com.example.devcash;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.dashboard_drawer_layout);
        navigationView = findViewById(R.id.dashboard_nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.dashboard_drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();
        switch (id){
            case R.id.nav_dashboard:
                Toast.makeText(this,"Dashboard.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_sales:
                Toast.makeText(this,"Sales.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_inventory:
                Toast.makeText(this,"Inventory.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_reports:
                Toast.makeText(this,"Reports.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_notifs:
                Toast.makeText(this,"Notifications.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_helpcenter:
                Toast.makeText(this,"Help Center.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_settings:
                Intent intentsettings = new Intent(DashboardActivity.this, SettingsActivity.class);
                startActivity(intentsettings);
                break;
        }

        DrawerLayout drawer = findViewById(R.id.dashboard_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
