package com.santos.alwyn;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITB","BATCH 2019");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB", "PAPASA TAYO");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB", "SICKO MODE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB", "NO TO 5.0");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB", "UNO ALL THE WAY");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITB", "REGULAR ALL THE WAY");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITB", "THANK YOU UST <3");
    }
    public void show(View V){
        Toast.makeText(this, "Toast is displayed", Toast.LENGTH_SHORT).show();
    }
    public void display(View V){
        Snackbar.make(V, "Snackbar is displayed",Snackbar.LENGTH_LONG).show();
    }
}
