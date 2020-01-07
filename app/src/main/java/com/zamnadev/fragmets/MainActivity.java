package com.zamnadev.fragmets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zamnadev.fragmets.Fragmetns.BodyFragment;
import com.zamnadev.fragmets.Fragmetns.EjemploFragments;

public class MainActivity extends AppCompatActivity implements EjemploFragments.onEjemplooFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void invocarFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor,new BodyFragment())
                .commit();
    }
}
