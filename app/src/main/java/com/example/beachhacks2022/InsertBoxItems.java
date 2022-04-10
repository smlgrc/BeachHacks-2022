package com.example.beachhacks2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class InsertBoxItems extends AppCompatActivity {
    private LinearLayout layoutList2;
    Button addItem;

    List<String> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_items);
        Box thisBox = new Box();

        itemList.add("Supplies");
        itemList.add("Entertainment");
        itemList.add("Book");
        itemList.add("Collectible");

//        ArrayList<Box> boxes = getIntent().getParcelableExtra("boxes");

        layoutList2 = findViewById(R.id.layout_list2);

        addItem = findViewById(R.id.button_add_new_item);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View itemView = getLayoutInflater().inflate(R.layout.new_item, null,false);
                ImageView imageClose = (ImageView)itemView.findViewById(R.id.row_remove2);
                /*AppCompatSpinner spinnerItem = (AppCompatSpinner) itemView.findViewById(R.id.spinner_item);

                ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,itemList);
                spinnerItem.setAdapter(arrayAdapter);*/

                layoutList2.addView(itemView);
//                boxes.add(new Box());

                imageClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        layoutList2.removeView(itemView);
                    }
                });
            }
        });

        Button goBackButton = findViewById(R.id.button_go_back);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsertBoxItems.this, InventoryScreen.class);
                intent.putExtra("Box", thisBox);
                startActivity(intent);
            }
        });
    }

    private void addView() {
        View itemView = getLayoutInflater().inflate(R.layout.support_simple_spinner_dropdown_item, null, false);

        AppCompatSpinner spinnerItem = (AppCompatSpinner) itemView.findViewById(R.id.spinner_item);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, itemList);
        spinnerItem.setAdapter(arrayAdapter);

        layoutList2.addView(itemView);
    }
}