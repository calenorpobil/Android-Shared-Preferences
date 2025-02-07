package com.merlita.sharedpreferences2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


















    }

    public void onClick1(View view) {
        Intent i = new Intent(MainActivity.this, OpcionesActivity.class);

        startActivity(i);
    }

    public void onClick2(View view) {
        SharedPreferences preferencias = PreferenceManager.
                getDefaultSharedPreferences(MainActivity.this);
        boolean preferencia1 = preferencias.getBoolean("opcion1",  false);
        String preferencia2 = preferencias.getString("opcion2",  "xxxxx");
        String preferencia3 = preferencias.getString("opcion3",  "xxxxx");

        Log.i("PREFERIDO", String.valueOf(preferencia1));
        Log.i("PREFERIDO", preferencia2);
        Log.i("PREFERIDO", preferencia3);






    }
}












