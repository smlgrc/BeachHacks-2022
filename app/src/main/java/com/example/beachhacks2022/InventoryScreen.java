package com.example.beachhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class InventoryScreen extends AppCompatActivity {
    private LinearLayout layoutList;
    private ArrayList<Box> boxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_screen);


        layoutList = findViewById(R.id.layout_list);

        Button addBox = findViewById(R.id.button_add_box);
        addBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View boxView = getLayoutInflater().inflate(R.layout.add_box, null,false);
                ImageView imageClose = (ImageView)boxView.findViewById(R.id.row_remove);
                layoutList.addView(boxView);
//                boxes.add(new Box());

                Button thisButton = boxView.findViewById(R.id.button_box);
                thisButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(InventoryScreen.this, InsertBoxItems.class);
                        intent.putExtra("Boxes", boxes);
                        startActivity(intent);
                    }
                });

                imageClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        layoutList.removeView(boxView);
                    }
                });
            }
        });
    }
}