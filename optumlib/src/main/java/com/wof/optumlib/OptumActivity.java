package com.wof.optumlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class OptumActivity extends AppCompatActivity {

    public static void startOptum(Context context){
        context.startActivity(new Intent(context,OptumActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optum);
    }
}