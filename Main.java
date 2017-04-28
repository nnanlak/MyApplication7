package com.example.sunmz.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by USER on 29/4/2560.
 */

public class Main extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToken = (Button)findViewById(R.id.button_show_token);
        btnShowToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG, "Token: "+token);
                Toast.makeText(Main.this, token, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
