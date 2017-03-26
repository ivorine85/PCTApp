package com.example.ivorine.pctapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mGoToLogin, Events, Brothers, Jobs, Home;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_login:
                    mTextMessage.setText(R.string.title_login);
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);

                    return true;
            }
            return false;
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Home = (Button) findViewById(R.id.Home);
        Home.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();

        if(i == R.id.Home){
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
        }
//        else if (i== R.id.Events) {
//            Intent intent = new Intent(this, Events.class);
//            startActivity(intent);
//        }
//        else if (i== R.id.Jobs) {
//            Intent intent = new Intent(this, Jobs.class);
//            startActivity(intent);
//        }
//        else if (i== R.id.Brothers) {
//            Intent intent = new Intent(this, Brothers.class);
//            startActivity(intent);
//        }
//        else if (i== R.id.Home) {
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//        }
//        else if(i==R.id.navigation){
//            Intent intent = new Intent(this, LoginActivity.class);
//            startActivity(intent);
//        }
//        else if(i==R.id.navigation_login){
//            Intent intent = new Intent(this, LoginActivity.class);
//            startActivity(intent);
//        }
    }

}