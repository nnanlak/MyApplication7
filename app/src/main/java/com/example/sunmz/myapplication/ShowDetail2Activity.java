package com.example.sunmz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail2Activity extends AppCompatActivity {

    private ImageView image;
    private TextView tvbreed, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail2);

        image = (ImageView) findViewById(R.id.image);
        tvbreed = (TextView) findViewById(R.id.tvbreed);
        tvDescription = (TextView) findViewById(R.id.tvDescription);

        int resTd = getIntent().getIntExtra("image", 0);
        String breed = getIntent().getStringExtra("breed");
        String description = getIntent().getStringExtra("description");

        image.setImageResource(resTd);
        tvbreed.setText(breed);
        tvbreed.setText(description);

        //  Log.d("cloth","resTd ="+resTd);
        //  Log.d("cloth","breed="+breed);
        //  Log.d("cloth","description="+description);
    }
}
