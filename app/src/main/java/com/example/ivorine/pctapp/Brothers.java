package com.example.ivorine.pctapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Brothers extends AppCompatActivity implements View.OnClickListener {

    private Button Events, Brothers, Jobs, Home,mGoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brothers);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        mGoToLogin= (Button) findViewById(R.id.Login);
        mGoToLogin.setOnClickListener(this);

        Events = (Button) findViewById(R.id.Events);
        Events.setOnClickListener(this);

        Brothers = (Button) findViewById(R.id.Brothers);
        Brothers.setOnClickListener(this);

        Jobs = (Button) findViewById(R.id.Jobs);
        Jobs.setOnClickListener(this);

        Home = (Button) findViewById(R.id.Home);
        Home.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if(i == R.id.Login){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        else if (i== R.id.Events) {
            Intent intent = new Intent(this, Events.class);
            startActivity(intent);
        }
        else if (i== R.id.Jobs) {
            Intent intent = new Intent(this, Jobs.class);
            startActivity(intent);
        }
        else if (i== R.id.Brothers) {
            Intent intent = new Intent(this, Brothers.class);
            startActivity(intent);
        }
        else if (i== R.id.Home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

}
