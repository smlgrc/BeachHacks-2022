package com.example.beachhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class InsertBoxItems extends AppCompatActivity {
    private LinearLayout layoutList2;
    Button addItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_items);
        Box thisBox = new Box();

//        ArrayList<Box> boxes = getIntent().getParcelableExtra("boxes");



        layoutList2 = findViewById(R.id.layout_list2);

        addItem = findViewById(R.id.button_add_new_item);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View itemView = getLayoutInflater().inflate(R.layout.new_item, null,false);
                ImageView imageClose = (ImageView)itemView.findViewById(R.id.row_remove2);
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
}