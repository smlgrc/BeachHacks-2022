package com.example.beachhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inventoryButton = findViewById(R.id.button_inventory);
        Button buttonItemPage = findViewById(R.id.buttonItemPage);
        Button cameraButton = findViewById(R.id.button_camera);

        //new session button function
        inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InventoryScreen.class);
                startActivity(intent);
            }
        });

        cameraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(MainActivity.this,DetectorActivity.class);
                startActivity(intent);
            }
        });

        buttonItemPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ItemListPage.class);
                startActivity(intent);
            }
        });

    }
}