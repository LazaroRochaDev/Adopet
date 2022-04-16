package com.example.adopet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout dog_list_button = (RelativeLayout) findViewById(R.id.btn_dogs);
        RelativeLayout cats_list_button = (RelativeLayout) findViewById(R.id.btn_cats);
        RelativeLayout know_more_button = (RelativeLayout) findViewById(R.id.btn_know_more);

        dog_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), act_dogs.class);
                startActivity(intent);
            }
        });

        cats_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), act_cats.class);
                startActivity(intent);
            }
        });

        know_more_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), act_know_more.class);
                startActivity(intent);
            }
        });


    }
}