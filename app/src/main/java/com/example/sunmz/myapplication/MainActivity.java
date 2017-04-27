package com.example.sunmz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    List<cloth> clothList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareData();

        listView = (ListView) findViewById(R.id.list_item);
        ListAdapter adapter = new ListAdapter(MainActivity.this,clothList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Position ="+position,Toast.LENGTH_SHORT).show();

                Intent  intent = new Intent(MainActivity.this,ShowDetail2Activity.class);
                intent.putExtra("image",clothList.get(position).getResId());
                intent.putExtra("breed",clothList.get(position).getBreed());
                intent.putExtra("description",clothList.get(position).getDrescription());
                startActivity(intent);

            }
        });
    }

    private void prepareData() {
        int resId [] = {R.drawable.outcastd , R.drawable.outcasts,R.drawable.outcastd , R.drawable.outcasts,R.drawable.outcastd , R.drawable.outcasts};

        String breed [] = {"norm","7day","norm","7day","norm","7day","norm","7day"};

        String description [] = {getString(R.string.norm1_des),getString(R.string.day7_des),getString(R.string.norm1_des),getString(R.string.day7_des),getString(R.string.norm1_des),getString(R.string.day7_des),getString(R.string.norm1_des),getString(R.string.day7_des),};

        int dataSize = resId.length;
        for (int i=0 ; i<dataSize ; i++){
            cloth cloth = new cloth(resId[i],breed[i],description[i]);
            clothList.add(cloth);

        }
    }
}
