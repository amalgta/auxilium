package com.example.justine.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class search_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);
    }
    public void goToActivity5(View view){
        Intent intent = new Intent (this, search_car.class);
        startActivity(intent);
    }
    public void goToActivity6(View view){
        Intent intent = new Intent (this, activity_landsearch.class);
        startActivity(intent);
    }

}
