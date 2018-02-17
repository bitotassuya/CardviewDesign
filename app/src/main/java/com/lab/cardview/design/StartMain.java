package com.lab.cardview.design;
/*
  @author Mr.Jirapong Jareansong
  @version 2018.02.17
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);

    }
    public void toMain(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
}
