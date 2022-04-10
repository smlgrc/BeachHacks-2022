package com.example.beachhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class InventoryScreen extends AppCompatActivity {
    private LinearLayout layoutList;

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