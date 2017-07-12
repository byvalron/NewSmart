package com.example.loc_by.newsmart;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Loc_by on 09.04.2017.
 */

public class ScanerView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scaner_view);
        Camera camera = Camera.open();
    }
}
